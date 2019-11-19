package org.beebiome.dataportal.core.service.impl;

import org.apache.commons.io.IOUtils;
import org.beebiome.dataportal.core.exception.BeebiomeException;
import org.beebiome.dataportal.core.service.GitHubService;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GHTree;
import org.kohsuke.github.GitHub;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
public class GitHubServiceImpl implements GitHubService {

    
    private final String GITHUB_REPOSITORY = "BeeBiome-consortium/beebiome-data-portal";

    // FIXME: anonymous calls are limited to 60 calls per hour
    /**
     * Connects anonymously if token is not defined
     */
    private GitHub getGitHubConnection() throws IOException {
        return GitHub.connectAnonymously();
    }

    @Override
    public String getPage(String gitHubBranch, String folder, String page) {

        try {
            GHRepository repo = getGitHubConnection().getRepository(GITHUB_REPOSITORY);

            String filename =  "beebiome-docs/" + folder + "/" + page + ".md";

            return IOUtils.toString(repo.getFileContent(filename, gitHubBranch).read(), StandardCharsets.UTF_8);

        } catch (IOException e) {
            throw new BeebiomeException("GitHub page not available, sorry for the inconvenience", e);
        }
    }

    @Override
    public GHTree getTree(String gitHubBranch) {

        try {
            GHRepository repo = getGitHubConnection().getRepository(GITHUB_REPOSITORY);
            return repo.getTreeRecursive(gitHubBranch, 1);

        } catch (IOException e) {
            throw new BeebiomeException("GitHub tree not available, sorry for the inconvenience", e);
        }

    }
}
