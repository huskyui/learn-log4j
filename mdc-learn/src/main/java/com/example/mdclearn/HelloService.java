package com.example.mdclearn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.ThreadPoolExecutor;

@Service
@Slf4j
public class HelloService {

    @Resource
    private ThreadPoolExecutor threadPoolExecutor;


    public void hello() {
        log.info("enter hello service");

    }
}
