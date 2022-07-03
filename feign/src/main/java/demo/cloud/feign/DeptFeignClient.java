package demo.cloud.feign;

import demo.cloud.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "provider", /*fallback = DeptFeignClientFallback.class,*/
        fallbackFactory = DeptFeignClientFallbackFactory.class)
public interface DeptFeignClient {

    @GetMapping("/dept/list")
    List<Dept> list();
}
