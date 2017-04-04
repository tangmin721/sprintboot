package com.cachexic.springboot;

import com.cachexic.springboot.common.conf.GirlProperties;
import com.cachexic.springboot.system.entity.Role;
import com.cachexic.springboot.system.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author tangmin
 * @version V1.0
 * @Title: HelloController.java
 * @Package com.cachexic.springboot
 * @Description: RestController 等价于@Controller and @ResponseBody
 * @date 2017-04-03 19:13:01
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @Value("${girl.cupsize}")
    private String cupsize;

    @Value("${girl.age}")
    private int age;

    //@RequestMapping(value = {"test","test1","test2"},method = RequestMethod.GET)
    @PutMapping("putTest")
    public String  test(){
        return "hello spring boot;GirlProperties.getCupsize:"+girlProperties.getCupsize()+",cupsize="+cupsize
                +",age="+age+",GirlProperties.getCommon:"+girlProperties.getCommon();
    }


    /**
     * 不加任何配置，就能返回json，这是因为spring boot默认json依赖包是jackson。
     * 如果想用fastjson，直接加依赖就可以替换
     * @return
     */
    @RequestMapping(value = "getUser",method = RequestMethod.PUT)
    public User getUser() {
        User user = new User();
        user.setId(1l);
        user.setName("占山an3414333");
        user.setCreateTime(new Date());
        user.setRemark("备注信息");
        user.setSex("男");
        return user;
    }

    @RequestMapping(value = "getRole",method = RequestMethod.PUT)
    public Role getRole() {
        Role role = new Role();
        role.setId(1l);
        role.setName("角色1");
        return role;
    }
}
