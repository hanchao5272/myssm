package pers.hanchao.myssm.test.curd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pers.hanchao.myssm.test.curd.service.TopicService;
import pers.hanchao.myssm.test.curd.service.impl.TopicServiceImpl;

/**
 * <p>简单实例测试Mybatis的事务控制和增删改查</p>
 * @author hanchao 2018/2/8 23:55
 **/
@Controller
public class TopicController {

    @Autowired
    private TopicService topicService;
    /**
     * <p>简单测试增删改查</p>
     * @author hanchao 2018/2/8 23:41
     **/

    @GetMapping("mybatis/curd")
    public String  curdTest(){
        this.topicService.curdTest();
        return "test/curd";
    }
}
