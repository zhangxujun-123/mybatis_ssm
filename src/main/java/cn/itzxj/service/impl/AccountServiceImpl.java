package cn.itzxj.service.impl;

import cn.itzxj.dao.IAccountDao;
import cn.itzxj.domain.Account;
import cn.itzxj.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 爱编程的小张
 * @version csdn博客:https://blog.csdn.net/qq_45621392
 * @date : 创建日期：2020/8/26  创建时间： 15:39
 * 业务层接口实现类
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有方法执行了....");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存方法执行了......");
        accountDao.saveAccount(account);
    }
}
