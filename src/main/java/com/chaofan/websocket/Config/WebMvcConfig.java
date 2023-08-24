package com.chaofan.websocket.Config;

import org.springframework.boot.system.ApplicationHome;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Chaofan at 2018/7/18 17:55
 * email:chaofan2685@qq.com
 * 此类为SpringBoot内置Tomcat设置虚拟路径，使访问：localhost:port/img/****时映射到指定文件目录
 **/

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private String imgPath = new ApplicationHome(getClass()).getSource().getParentFile().toString()+"/img/";

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/**").addResourceLocations("file:"+imgPath);
    }

}
