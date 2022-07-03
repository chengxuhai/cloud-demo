package demo.cloud.zuul;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class);
    }

    public void run(String... args) throws Exception {
        System.out.println("zuul 启动成功");
    }
}
