package org.beebiome.dataportal.api.core.model;

import java.io.InputStream;

public class FileInfo {

    private final String name;
    private final InputStream inputStream;

    public FileInfo(String name, InputStream inputStream) {
        this.name = name;
        this.inputStream = inputStream;
    }

    public String getName() {
        return this.name;
    }

    public InputStream getInputStream() {
        return inputStream;
    }
}
