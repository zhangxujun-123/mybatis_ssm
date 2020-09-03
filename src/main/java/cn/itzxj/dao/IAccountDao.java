package cn.itzxj.dao;

import cn.itzxj.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 爱编程的小张
 * @version csdn博客:https://blog.csdn.net/qq_45621392
 * @date : 创建日期：2020/8/26  创建时间： 15:38
 * 持久层接口
 */
@Repository
public interface IAccountDao {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from account")
    List<Account> findAll();

    /**
     * 保存用户
     * @param user
     */
    @Insert("insert into account (name,money) values(#{name},#{money})")
    void  saveAccount(Account user);
}
