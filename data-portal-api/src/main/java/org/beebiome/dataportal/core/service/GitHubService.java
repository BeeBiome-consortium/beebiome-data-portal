package org.beebiome.dataportal.core.service;

import org.kohsuke.github.GHTree;

public interface GitHubService {

    public String getPage(String folder, String page);

    public GHTree getTree(String gitHubBranch);
}
