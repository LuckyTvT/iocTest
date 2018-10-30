package top.karlo.xmltest.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 功能描述:
 *
 * @author karlo
 * @date 2018/10/29 22:43
 * @since 1.0.0
 */

/**
 * 表明properties文件中前缀为什么的属性值要注入到这个类对象中
 */
@ConfigurationProperties(prefix = "spring.bean.woman")
public class Woman {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
