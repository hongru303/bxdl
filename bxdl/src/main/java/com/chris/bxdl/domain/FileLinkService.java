package com.chris.bxdl.domain;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chris.bxdl.infrastructure.entity.FileLink;
import com.chris.bxdl.infrastructure.mapper.FileLinkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileLinkService implements IFileLinkService{

    @Autowired
    private FileLinkMapper fileLinkMapper;

    @Override
    public String getFileLink() {
        List<FileLink> fileLinks = fileLinkMapper.selectList(new QueryWrapper<>());
        return "";
    }
}
