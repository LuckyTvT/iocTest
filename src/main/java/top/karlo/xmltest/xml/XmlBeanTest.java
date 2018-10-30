package top.karlo.xmltest.xml;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 功能描述:
 *
 * @author karlo
 * @date 2018/10/29 22:04
 * @since 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:xml-bean.xml"})
public class XmlBeanTest implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Test
    public void testXmlBean(){
        User user = applicationContext.getBean(User.class);
        Assert.assertEquals("Spring xml依赖注入失败"+user.getName(),"karlo",user.getName());
        Assert.assertEquals("Spring xml依赖注入失败"+user.getCar().getPrice(),"red",user.getCar().getColor());
    }



    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
