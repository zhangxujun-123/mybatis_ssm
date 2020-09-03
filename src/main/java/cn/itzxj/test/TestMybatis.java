package cn.itzxj.test;

import cn.itzxj.dao.IAccountDao;
import cn.itzxj.domain.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 爱编程的小张
 * @version csdn博客:https://blog.csdn.net/qq_45621392
 * @date : 创建日期：2020/8/27  创建时间： 12:42
 */
public class TestMybatis {
    /**
     * 测试查询所有
     * @throws Exception
     */

    @Test
    public void  run1() throws Exception {
        //1.加载配置文件
        InputStream in = Resources.class.getResourceAsStream("/SqlMapConfig.xml");
        //2.创建sqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.创建SqlSession对象
        SqlSession session = factory.openSession();
        //4.获取代理对象
        IAccountDao dao = session.getMapper(IAccountDao.class);
        //查询所有数据
        List<Account> acc = dao.findAll();
        for (Account account : acc) {
            System.out.println(account);
        }
        //6.释放资源
        session.close();
        in.close();

    }

    /**
     * 测试保存
     * 增删改需要提交事务，查询不需要提交事务
     * @throws Exception
     */
    @Test
    public void  run() throws Exception {
        //1.加载配置文件
        InputStream in = Resources.class.getResourceAsStream("/SqlMapConfig.xml");
        //2.创建sqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.创建SqlSession对象
        SqlSession session = factory.openSession();
        //4.获取代理对象
        IAccountDao dao = session.getMapper(IAccountDao.class);
        //保存数据
        Account account =  new Account();
        account.setName("涛涛");
        account.setMoney(1200D);
        dao.saveAccount(account);

        //提交事务
        session.commit();
        //6.释放资源
        session.close();
        in.close();

    }
}
