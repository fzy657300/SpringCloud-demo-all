package com.zongyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients  //注册+远程调用
//@EnableDiscoveryClient和@EnableEurekaClient共同点就是：都是能够让注册中心能够发现，扫描到改服务
//不同点：@EnableEurekaClient只适用于Eureka作为注册中心，@EnableDiscoveryClient 可以是其他注册中心。
@EnableDiscoveryClient
@EnableHystrixDashboard
@EnableCircuitBreaker//开启断路功能
/*服务的提供者也可能会调用其他服务 所以两个同时写也没关系*/
public class WebbaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebbaseApplication.class, args);
    }
}
