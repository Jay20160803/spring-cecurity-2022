package example.hellosecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Andy
 * @Date: 2022/05/13/ 10:26
 * @Description
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "notLogin";
    }

}
