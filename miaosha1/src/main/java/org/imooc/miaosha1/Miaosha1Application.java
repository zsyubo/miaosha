package org.imooc.miaosha1;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.imooc.miaosha1.mapper")
public class Miaosha1Application {

    public static void main(String[] args) {
        SpringApplication.run(Miaosha1Application.class, args);
    }

}
