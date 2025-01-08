package com.chris.bxdl.trigger;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chris.bxdl.domain.IFileLinkService;
import com.chris.bxdl.infrastructure.entity.FileLink;
import com.chris.bxdl.infrastructure.mapper.FileLinkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("easy")
public class EasyController {

    @Autowired
    private IFileLinkService iFileLinkService;

    @GetMapping("sign")
    public void getOssSign(){

        return;
    }


    @GetMapping("save/{path}")
    public String saveFileData(@PathVariable String path){
        return iFileLinkService.saveFileUrl(path);
    }


    @GetMapping("get/{token}")
    public String getFileUrl(@PathVariable String token){
        return iFileLinkService.getFileUrl(token);
    }
}
