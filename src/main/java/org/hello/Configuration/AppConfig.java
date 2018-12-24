package org.hello.Configuration;

import org.hello.bean.TestJavaConfigBean;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springboot-demo
 * @description:
 * @author: Ya
 * @create: 2018-12-24 18:09
 **/
@Configuration
@EnableApolloConfig
public class AppConfig {


    @Bean
    public TestJavaConfigBean javaConfigBean() {
        return new TestJavaConfigBean();
    }
}
