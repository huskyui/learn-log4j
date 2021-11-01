package com.example.mdclearn;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class HelloController {
    @Resource
    HelloService helloService;


    @RequestMapping("/hello")
    public String hello(@RequestParam("traceId") String traceId) {
        MDC.put("traceId", traceId);
        log.info("enter helloController");
        helloService.hello();
        return "hello world";
    }
}
