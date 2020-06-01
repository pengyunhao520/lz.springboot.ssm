package hospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * @SpringBootApplication
 * 来标注主程序，说明是一个springboot应用
 */
@SpringBootApplication
@Controller
@MapperScan("hospital/dao")
public class MainApplication /*extends SpringBootServletInitializer*/ {


    public static void main(String[] args) {
        //启动springboot应用
        SpringApplication.run(MainApplication.class, args);
    }
/*    @Override//为了打包springboot项目
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }*/
}
