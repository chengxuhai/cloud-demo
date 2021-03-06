package demo.cloud.consumer;

import demo.cloud.ribbon.MyRibbonConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class, scanBasePackages = "demo.cloud")
@EnableFeignClients(basePackages = "demo.cloud.feign")
@RibbonClient(name = "provider", configuration = MyRibbonConfig.class)
@EnableEurekaClient
@EnableHystrix
public class ConsumerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }

    public void run(String... args) throws Exception {
        System.out.println("consumer 启动成功");
    }
}
