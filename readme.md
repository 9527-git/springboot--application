springboot 设置读取自定义配置文件：
第一种：无需写配置类，
配置文件的命名规则：
以application-{spring:profiles:active: oop}.yml。
即就是以application开头主配置文件里spring的active的值做为后缀。
无需写额外的配置类获取配置文件。
 第二种：
 写配置类的方式：
//在spring boot（版本1.5.1.RELEASE）项目中，当准备映射自定义的配置文件属性到类中的时候，
// 发现原本的@ConfigurationProperties注解已将location属性移除，
//解决办法：
//1.在main方法即springboot启动类上加注解@EnableConfigurationProperties取消激活自定义的配置类（重要）
//2.在配置类中采用@Component的方式注册为组件，然后使用@PropertySource来指定自定义的资源目录                  
                      