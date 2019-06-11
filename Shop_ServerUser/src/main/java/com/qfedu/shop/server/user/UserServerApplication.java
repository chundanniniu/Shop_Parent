package com.qfedu.shop.server.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//打包成war包  就需要让开关类继承SpringBootServletInitializer 并重新
public class UserServerApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(UserServerApplication.class,args);
    }
   @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return  builder.sources(UserServerApplication.class);
    }

}
