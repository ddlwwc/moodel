package com.limit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author fxl
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 注册中心启动类
 * @date 2018-05-0415:45
 */
@EnableEurekaServer
@SpringBootApplication
public class ResgiterApp {
    public static void main(String[] args){
        //启动注册中心
        SpringApplication.run(ResgiterApp.class,args);
    }

}
