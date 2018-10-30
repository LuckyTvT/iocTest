package top.karlo.xmltest.properties;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 功能描述:
 *
 * @author karlo
 * @date 2018/10/29 22:54
 * @since 1.0.0
 */

@Component
public class ApplicationContextUtils implements ApplicationContextAware {

    private static ApplicationContext context;

    public static Object getBean(String name) {
        if (context == null) {
            throw new RuntimeException("context is null;");
        } else {
            return context.getBean(name);
        }
    }

    public static <T> T getBean(Class<T> requiredType){
        if (context == null) {
            throw new RuntimeException("context is null;");
        } else {
            return context.getBean(requiredType);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
