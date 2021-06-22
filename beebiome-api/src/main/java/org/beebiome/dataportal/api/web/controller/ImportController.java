package org.beebiome.dataportal.api.web.controller;

import org.beebiome.dataportal.api.core.model.ImportResult;
import org.beebiome.dataportal.api.core.model.BeeBiomeVersion;
import org.beebiome.dataportal.api.core.service.ImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ImportController {

    @Autowired
    private ImportService importService;

    @PostMapping("/import")
    @ResponseBody
    public ImportResult importData(@RequestParam("files") MultipartFile[] files) {
        return importService.importData(files);
    }

    @CrossOrigin
    @GetMapping("/import/new-version")
    @ResponseBody
    public BeeBiomeVersion addBeeBiomeVersion() {
        return importService.addNewBeeBiomeVersion();
    }
}
