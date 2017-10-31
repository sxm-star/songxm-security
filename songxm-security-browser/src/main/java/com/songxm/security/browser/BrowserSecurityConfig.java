package com.songxm.security.browser;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author: sxm
 * @date: 2017/10/30 23:35
 * @version: v1.0.0
 */
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter{

    /**
     * 实现表单登录的安全验证
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()            //表单认证方式
                .and()
                .authorizeRequests()  //授权
                .anyRequest()
                .authenticated();
    }
}
