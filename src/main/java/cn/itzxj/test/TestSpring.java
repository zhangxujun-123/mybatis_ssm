package cn.itzxj.test;

import cn.itzxj.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 爱编程的小张
 * @version csdn博客:https://blog.csdn.net/qq_45621392
 * @date : 创建日期：2020/8/26  创建时间： 15:57
 * 测试一下spring框架能否单独运行
 */
public class TestSpring {
    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        //运行方法
        as.findAll();
    }
}
