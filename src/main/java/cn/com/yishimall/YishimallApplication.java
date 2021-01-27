package cn.com.yishimall;

import org.apache.tomcat.util.http.LegacyCookieProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author qinghua.zhang
 */
@MapperScan(value = "cn.com.yishimall.mapper")
@SpringBootApplication
public class YishimallApplication {

    public static void main(String[] args) {
        SpringApplication.run(YishimallApplication.class, args);
    }

    // Tomcat Cookie 处理配置 Bean
    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> cookieProcessorCustomizer() {
        return (factory) -> factory.addContextCustomizers(
                (context) -> context.setCookieProcessor(new LegacyCookieProcessor()));
    }
}
