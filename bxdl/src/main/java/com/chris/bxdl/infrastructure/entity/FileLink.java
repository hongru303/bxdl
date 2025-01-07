package com.chris.bxdl.infrastructure.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("system_dept")
public class FileLink {

    @TableId
    private Long id;
}
