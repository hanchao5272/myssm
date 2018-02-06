package pers.hanchao.myssm.test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>测试Spring 和 Spring MVC的整合</p>
 * @author hanchao 2018/2/5 23:01
 **/
@Controller
public class SpringMVCDemoController {
    @GetMapping("/mvc/test")
    public String mvcTest(Model model){
        model.addAttribute("mvc","Spring + Spring MVC is OK!");
        return "/mvc";
    }
}
