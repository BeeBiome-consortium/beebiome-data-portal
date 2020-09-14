package org.beebiome.dataportal.api.core.service;

import org.beebiome.dataportal.api.core.model.ImportResult;
import org.springframework.web.multipart.MultipartFile;

public interface ImportService {

    public ImportResult importData(MultipartFile[] files);
}
