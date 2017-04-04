package com.cachexic.springboot.common.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author tangmin
 * @version V1.0
 * @Title: GirlProperties.java
 * @Package com.cachexic.springboot.conf
 * @Description:  配置文件映射
 * @date 2017-04-04 10:09:09
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

    private String cupsize;
    private int age;

    /**公共属性*/
    private String common;

    public String getCupsize() {
        return cupsize;
    }

    public void setCupsize(String cupsize) {
        this.cupsize = cupsize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }
}
