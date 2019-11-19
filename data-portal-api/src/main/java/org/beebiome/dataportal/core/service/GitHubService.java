package org.beebiome.dataportal.core.service;

import org.kohsuke.github.GHTree;

public interface GitHubService {

    public String getPage(String gitHubBranch, String folder, String page);

    public GHTree getTree(String gitHubBranch);
}
