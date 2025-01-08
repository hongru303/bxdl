package com.chris.bxdl.infrastructure.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("file_link")
public class FileLink {

    private Long id;

    private String path;

    private String token;
}
