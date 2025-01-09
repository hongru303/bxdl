package com.chris.bxdl.infrastructure.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName("file_link")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileLink {

    private Long id;

    private String path;

    private String token;

    public String getPath(){
        return this.path;
    }

    public void setPath(String path){
        this.path = path;
    }

    public String getToken(){
        return this.token;
    }

    public void setToken(String token){
        this.token = token;
    }
}
