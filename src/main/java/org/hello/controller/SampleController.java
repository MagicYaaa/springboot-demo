package org.hello.controller;

import org.hello.bean.TestJavaConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: springboot-demo
 * @description: apollo配置中心 搭配springboot
 * @author: Ya
 * @create: 2018-12-18 10:32
 **/
@Controller
public class SampleController {

    @Autowired
    private TestJavaConfigBean testJavaConfigBean;

    @RequestMapping("/")
    @ResponseBody
    String home(TestJavaConfigBean testJavaConfigBean) {
        return this.testJavaConfigBean.toString();
    }
}
