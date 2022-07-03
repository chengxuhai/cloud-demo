package demo.cloud.zuul.config;

import demo.cloud.zuul.filter.MyErrorFilter;
import demo.cloud.zuul.filter.MyPostFilter;
import demo.cloud.zuul.filter.MyPreFilter;
import demo.cloud.zuul.filter.MyRouteFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public MyPreFilter myPreFilter() {
        return new MyPreFilter();
    }

    @Bean
    public MyRouteFilter myRouteFilter() {
        return new MyRouteFilter();
    }

    @Bean
    public MyPostFilter myPostFilter() {
        return new MyPostFilter();
    }

    @Bean
    public MyErrorFilter myErrorFilter() {
        return new MyErrorFilter();
    }
}
