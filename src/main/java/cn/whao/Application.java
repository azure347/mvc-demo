package cn.whao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: Application
 * Package: cn.whao
 * Description: 启动入口
 *
 * @Author wanghao
 * @Create 2024-06-24 14:40
 * @Version 1.0
 */
@SpringBootApplication
@Configuration
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class);
    }
}
