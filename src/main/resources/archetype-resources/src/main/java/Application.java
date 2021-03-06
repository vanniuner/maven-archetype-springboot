package ${package};

import ${package}.util.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot 启动类
 *
 * @author trang
 */
@SpringBootApplication
@MapperScan("${package}.mapper")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableCaching(proxyTargetClass = true)
@Slf4j
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        // 设置 dubbo 使用 slf4j 记录日志
        // dubbo使用日志顺序 log4j->slf4j->common logging->jdk log
        System.setProperty("dubbo.application.logger", "slf4j");
        // 设置 druid 使用 slf4j 记录日志
        System.setProperty("druid.logType", "slf4j");
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("application is running...");
    }

    @RestController
    public static class WelcomeController {

        @GetMapping("/")
        public ResponseEntity<String> welcome() {
            return ResponseEntity.ok("Welcome!");
        }

    }

}
