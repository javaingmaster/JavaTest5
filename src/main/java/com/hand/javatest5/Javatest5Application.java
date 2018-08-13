package com.hand.javatest5;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.hand.javatest5.infra.mapper")
@ComponentScan(basePackages = {"com.hand.javatest5.infra.config","com.hand.javatest5.api"})
public class Javatest5Application {

    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(Javatest5Application.class);
//        app.addListeners(new MyListener());
        app.run(args);
    }
}

//curl -X POST -H "Content-type:application/json" -d '{"title":"testone","description":"tttt","languageId":"5"}' http://192.168.99.100:8081/films
//curl http://192.168.99.100:8081/films/all?pageNum=2&pageSize=30