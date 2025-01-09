package com.chris.bxdl.domain.Impl;

import com.chris.bxdl.domain.IFileLinkService;
import com.chris.bxdl.infrastructure.entity.FileLink;
import com.chris.bxdl.infrastructure.mapper.FileLinkMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class FileLinkServiceImpl implements IFileLinkService {

    @Autowired
    private FileLinkMapper fileLinkMapper;

    @Override
    public String getFileUrl(String token) {
        log.info("g");
        FileLink fileLink = fileLinkMapper.selectByPath(token);
        return fileLink.getPath();
    }

    @Override
    public String saveFileUrl(String path) {
        log.info("s");
        FileLink fileLink = new FileLink();
        fileLink.setPath(path);
        String token = UUID.randomUUID().toString().substring(0, 6);
        fileLink.setToken(token);
        fileLinkMapper.insert(fileLink);
        return token;
    }
}
