package readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class ReadingListApplication extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(ReadingListApplication.class, args);
    }
    //那么通过下面的配置，不用添加LoginController或者处理“readingList”的方法
    // 就可以直接通过“http://localhost:8080/”重定向访问“http://localhost:8080/readingList”！
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/", "/readingList");
    }

}
