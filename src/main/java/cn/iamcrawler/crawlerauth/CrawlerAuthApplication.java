package cn.iamcrawler.crawlerauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("cn.iamcrawler.crawlerauth.mapper")
public class CrawlerAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrawlerAuthApplication.class, args);
    }

}
