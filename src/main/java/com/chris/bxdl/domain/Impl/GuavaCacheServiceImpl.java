package com.chris.bxdl.domain.Impl;

import com.chris.bxdl.common.CacheFactory;
import com.chris.bxdl.domain.ICacheService;
import com.google.common.cache.Cache;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "cache.type", havingValue = "guava")
public class GuavaCacheServiceImpl implements ICacheService {


    private final Cache<Object, Object> cache = CacheFactory.getLocalCache();

    @Override
    public Object getIfPresent(Object key) {
        return cache.getIfPresent(key);
    }

    @Override
    public void put(Object key, Object value) {
        cache.put(key, value);
    }

    @Override
    public void remove(Object key) {
        cache.invalidate(key);
    }
}
