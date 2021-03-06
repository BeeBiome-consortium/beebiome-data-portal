package org.beebiome.dataportal.api.core.service.impl;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.beebiome.dataportal.api.core.exception.BeebiomeException;
import org.beebiome.dataportal.api.core.service.GitHubService;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GHTree;
import org.kohsuke.github.GitHub;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
public class GitHubServiceImpl implements GitHubService {

    // GitHub properties default values.
    // They can be overrided by using application.properties file (see @Value of each setter method).
    private String githubRepository = "BeeBiome-consortium/beebiome-data-portal";
    private String githubBranch = "master";
    private String githubDocsDirectory = "beebiome-docs";
    private String githubToken = null;

    /**
     * Connects anonymously if token is not defined
     */
    private GitHub getGitHubConnection() throws IOException {
        if (StringUtils.isEmpty(githubToken) || "undefined".equalsIgnoreCase(githubToken)) {
            return GitHub.connectAnonymously();
        } else {
            return GitHub.connectUsingOAuth(githubToken);
        }
    }

    @Value("${github.repository}")
    public void setGithubRepository(String githubRepository) {
        this.githubRepository = githubRepository;
    }

    @Value("${github.branch}")
    public void setGithubBranch(String githubBranch) {
        this.githubBranch = githubBranch;
    }

    @Value("${github.docs.directory}")
    public void setGithubDocsDirectory(String githubDocsDirectory) {
        this.githubDocsDirectory = githubDocsDirectory;
    }

    @Value("${github.token}")
    public void setGithubToken(String githubToken) {
        this.githubToken = githubToken;
    }

    @Override
    public String getPage(String folder, String page) {
        try {
            GHRepository repo = getGitHubConnection().getRepository(this.githubRepository);

            String filename =  githubDocsDirectory + "/" + folder + "/" + page + ".md";

            String branch = StringUtils.isNotBlank(this.githubBranch) ? this.githubBranch : "master";
            
            String fileContent = IOUtils.toString(repo.getFileContent(filename, branch).read(), StandardCharsets.UTF_8);
            
            return fileContent.replaceAll("\\$\\{GITHUB_BRANCH\\}", githubBranch);

        } catch (IOException e) {
            throw new BeebiomeException("GitHub page not available, sorry for the inconvenience", e);
        }
    }

    @Override
    public GHTree getTree(String gitHubBranch) {
        try {
            GHRepository repo = getGitHubConnection().getRepository(githubRepository);
            return repo.getTreeRecursive(gitHubBranch, 1);

        } catch (IOException e) {
            throw new BeebiomeException("GitHub tree not available, sorry for the inconvenience", e);
        }
    }
}
