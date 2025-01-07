package com.chris.bxdl.trigger;


import com.chris.bxdl.domain.IFileLinkService;
import com.chris.bxdl.infrastructure.mapper.FileLinkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("easy")
public class EasyController {

    @Autowired
    private FileLinkMapper fileLinkMapper;


    @GetMapping("fileLink")
    public String getFileLink(){
        fileLinkMapper.selectList(null);
        return "a";
//        return iFileLinkService.getFileLink();
    }
}
