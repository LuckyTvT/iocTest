package top.karlo.xmltest.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 功能描述:
 *
 * @author karlo
 * @date 2018/10/29 22:41
 * @since 1.0.0
 */


/**
 * @EnableConfigurationProperties(Woman.class) 表明了哪个类需要使用properties中配置的属性来创建对象
 *
 */

@SpringBootApplication
@EnableConfigurationProperties(Woman.class)
public class PropertiesBeanApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PropertiesBeanApplication.class, args);
        Woman woman = context.getBean(Woman.class);
        System.out.println(woman.getAge());
        System.out.println(woman.getName());
    }

}
