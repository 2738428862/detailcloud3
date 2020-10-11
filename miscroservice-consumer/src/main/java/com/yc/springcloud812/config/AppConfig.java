package com.yc.springcloud812.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
 (就是Spring一扫描就会到这个类  就会看这里面有什么方法 @Bean   如果写了就会将这个方法激活返回一个对象   然后将这个方法交给spring托管)
 */
//系统用的配置类
@SpringBootConfiguration
public class AppConfig {

    @Bean
   // @LoadBalanced   //启动ribbon客户端 负载均衡     ngix  服务器端的负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();//用 来给客户端访问服务   就相当于Socket这种去找服务器   输入输出io
    }

}
