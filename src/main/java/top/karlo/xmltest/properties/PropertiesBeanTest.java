package top.karlo.xmltest.properties;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 功能描述:
 *
 * @author karlo
 * @date 2018/10/29 22:50
 * @since 1.0.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {PropertiesBeanApplication.class})
public class PropertiesBeanTest {

    @Test
    public void testProperties(){
        Woman woman = ApplicationContextUtils.getBean(Woman.class);
        Assert.assertEquals("properties 注入失败"+woman.getAge(),30,woman.getAge());
    }

}
