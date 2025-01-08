package com.chris.bxdl.domain;

public interface IFileLinkService {

    String getFileUrl(String token);

    String saveFileUrl(String path);
}
