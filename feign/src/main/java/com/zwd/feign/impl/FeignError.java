package com.zwd.feign.impl;

import com.zwd.entity.Student;
import com.zwd.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中....";
    }

    @Override
    public String zheng() {
        return null;
    }
}
