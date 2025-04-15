package com.chris.bxdl.common;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

public class CacheFactory {

    public static Cache<Object, Object> getLocalCache(){
        return CacheBuilder.newBuilder()
                .maximumSize(500)
                .build();
    }

}
