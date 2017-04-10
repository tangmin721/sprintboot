package com.cachexic.springboot.system.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import java.util.Date;


@Entity
@Table(name = "s_system_user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "name不能为空")
    private String name;

    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date createTime;

    @JSONField(serialize = false)
    private String remark;


    private String sex;

    @Min(value = 18, message = "未成年人不允许注册")
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
