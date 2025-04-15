package com.chris.bxdl.domain;

public interface ICacheService {

    Object getIfPresent(Object key);

    void put(Object key, Object value);

    void remove(Object key);
}
