package cn.itzxj.controller;

import cn.itzxj.domain.Account;
import cn.itzxj.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author 爱编程的小张
 * @version csdn博客:https://blog.csdn.net/qq_45621392
 * @date : 创建日期：2020/8/26  创建时间： 15:40
 * 账户web层控制器
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    //依赖注入业务层
    @Autowired
    private IAccountService accountService;

    /**
     * 查询所有
     * @param model
     * @return
     */
    @RequestMapping("findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户。。。。");
        //调用service的方法
        List<Account> accounts = accountService.findAll();
        model.addAttribute("success",accounts);
        return "success";
    }
    /**
     * 保存账户
     * @param account
     */
    @RequestMapping("save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws  Exception{
        System.out.println("表现层：保存账户。。。。");
        //调用service的方法
        accountService.saveAccount(account);
        //转发到页面
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }
}
