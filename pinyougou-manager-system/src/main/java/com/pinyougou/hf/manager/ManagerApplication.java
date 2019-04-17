package com.pinyougou.hf.manager;

/**
 * @author NQ
 * @create 2019-02-20 23:54
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Administrator
 * @version 1.0
 **/
//@EnableFeignClients //开始feignClient
//@EnableDiscoveryClient
@SpringBootApplication
@EntityScan("com.pinyougou.hf.framework.model")//扫描实体类
@ComponentScan(basePackages={"com.pinyougou.hf.api"})//扫描接口
@ComponentScan(basePackages={"com.pinyougou.hf.manager"})
@ComponentScan(basePackages={"com.pinyougou.hf.framework"})//扫描common下的所有类
public class ManagerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ManagerApplication.class, args);
    }

//    @Bean
//    @LoadBalanced//开始客户端负载均衡
//    public RestTemplate restTemplate(){
//        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
//    }

}
