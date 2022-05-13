package example.hellosecurity.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Author Andy
 * @Date: 2022/05/13/ 10:48
 * @Description
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {

       http.authorizeRequests()
               .antMatchers("logout").permitAll()
               .anyRequest().authenticated()
           .and()
               .csrf().disable()
               .formLogin()
                    .loginPage("/login").permitAll();

    }
}
