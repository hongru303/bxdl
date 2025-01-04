package com.chris.trigger;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("easy")
public class EasyController {


    @GetMapping("sign")
    public void getOssSign(){

        return;
    }


    @PostMapping("save")
    public String saveFileData(){

        String token = new String();
        return token;
    }


    @GetMapping("get-by-token/{token}")
    public String getFileUrl(@PathVariable String token){

        String path = new String();
        return path;
    }
}
