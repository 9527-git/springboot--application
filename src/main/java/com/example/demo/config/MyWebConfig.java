package com.example.demo.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
//在spring boot（版本1.5.1.RELEASE）项目中，当准备映射自定义的配置文件属性到类中的时候，
// 发现原本的@ConfigurationProperties注解已将location属性移除，
//解决办法：
//1.在main方法即springboot启动类上加注解@EnableConfigurationProperties取消激活自定义的配置类（重要）
//2.在配置类中采用@Component的方式注册为组件，然后使用@PropertySource来指定自定义的资源目录
@Configuration
@ConfigurationProperties(prefix = "web")
@PropertySource("classpath:config/my-web.properties")
@Component
public class MyWebConfig {
    private String name;

    private String version;

    private String author;

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}