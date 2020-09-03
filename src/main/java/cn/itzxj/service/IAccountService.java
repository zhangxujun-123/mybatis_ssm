package cn.itzxj.service;

import cn.itzxj.domain.Account;

import java.util.List;

/**
 * @author 爱编程的小张
 * @version csdn博客:https://blog.csdn.net/qq_45621392
 * @date : 创建日期：2020/8/26  创建时间： 15:39
 */
public interface IAccountService {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();

    /**
     * 保存用户
     * @param user
     */
    void  saveAccount(Account user);
}
