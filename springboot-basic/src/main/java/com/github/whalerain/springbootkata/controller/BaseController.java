package com.github.whalerain.springbootkata.controller;

import com.github.whalerain.springbootkata.config.PropKata;
import com.github.whalerain.springbootkata.pojo.modelVo.UserVO;
import com.github.whalerain.springbootkata.support.BaseResponse;
import com.github.whalerain.springbootkata.validator.GUpd;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.groups.Default;

/**
 * @author ZhangXi
 */
@Slf4j
@Controller
public class BaseController {

    private final PropKata propKata;

    @Autowired
    public BaseController(PropKata propKata) {
        this.propKata = propKata;
    }

    @ResponseBody
    @RequestMapping(value = "/test/1", method = RequestMethod.GET)
    public BaseResponse testGlobalExceptionHandler() throws Exception {
        throw new Exception("test");
    }


    @RequestMapping(value = "/test/validator", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse testValidator(@RequestBody @Validated({GUpd.class, Default.class}) UserVO user) {
        return new BaseResponse();
    }

    @RequestMapping(value = "/test/prop", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse testProperties() {
        log.info(">>>>>>>>>>>>>>>>> 正则表达式配置: mobile={}", propKata.getRegexp().getMobile());
        return new BaseResponse();
    }


}
