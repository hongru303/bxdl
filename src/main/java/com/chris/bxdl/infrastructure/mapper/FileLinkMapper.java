package com.chris.bxdl.infrastructure.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chris.bxdl.infrastructure.entity.FileLink;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FileLinkMapper extends BaseMapper<FileLink> {

    default FileLink selectByPath(String token){
        QueryWrapper<FileLink> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("token", token);
        List<FileLink> fileLinks = selectList(queryWrapper);
        return fileLinks.get(0);
    }
}
