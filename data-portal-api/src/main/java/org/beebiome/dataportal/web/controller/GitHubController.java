package org.beebiome.dataportal.web.controller;

import org.beebiome.dataportal.core.service.GitHubService;
import org.kohsuke.github.GHTree;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class GitHubController {

    @Resource
    private GitHubService githubService;

    @CrossOrigin
    @ResponseBody
    @GetMapping(value = "/git/trees/{branch}")
    public GHTree accessFirstPage(@PathVariable("branch") String branch) {
        return githubService.getTree(branch);
    }

    @CrossOrigin
    @ResponseBody
    @GetMapping(value = "/contents/{folder}/{page}")
    public String accessPage(@PathVariable("folder") String folder, @PathVariable("page") String page) {
        return githubService.getPage(folder, page);
    }
}
