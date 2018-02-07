package pers.hanchao.myssm.test.mvc;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>测试Spring 和 Spring MVC的整合</p>
 * @author hanchao 2018/2/5 23:01
 **/
@Controller
public class SpringMVCDemoController {
    private static final Logger LOGGER = Logger.getLogger(SpringMVCDemoController.class);
    /**
     * <p>简单测试MVC</p>
     * @author hanchao 2018/2/7 23:06
     **/
    @GetMapping("/mvc/test")
    public String mvcTest(Model model){
        model.addAttribute("mvc","Spring + Spring MVC is OK!");
        return "test/mvc";
    }

    /**
     * <p>简单测试注解、校验和JsonResult</p>
     * @author hanchao 2018/2/7 23:27
     **/
    @PostMapping("/mvc/login")
    @ResponseBody
    public JsonResult<User> loginTest(@Valid @RequestBody User user, BindingResult bindingResult){
        LOGGER.info(user.toString());
        //定义返回值
        JsonResult<User> jsonResult = new JsonResult<User>();
        //表单校验
        if (ValidationUtils.validateAndSetJsonResult(bindingResult,jsonResult)){//如果没错误
            List list = new ArrayList();
            list.add(user);
            jsonResult.setList(list);
        }
        //返回结果
        return jsonResult;
    }

}
