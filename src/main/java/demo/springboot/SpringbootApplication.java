package demo.springboot;


//import demo.shujuyuan.Jta.DBConfig1;
//import demo.shujuyuan.Jta.DBConfig2;
//import org.mybatis.spring.annotation.MapperScan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories
@EnableAutoConfiguration
//@SpringBootApplication//默认扫单前包 同一个包
@ComponentScan(basePackages = {"demo.springboot", "demo.feng"})//"demo.feng",demo.shujuyuan
@MapperScan(basePackages = "demo.feng") //mybatis  //"demo.feng",
//@EntityScan("demo.jpajta")

//@EnableAutoConfiguration//启动config
//@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })

//@EnableCaching//启用缓存
//@EnableScheduling//启用定时任务
//@EnableAsync//异步 指同时启动
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
