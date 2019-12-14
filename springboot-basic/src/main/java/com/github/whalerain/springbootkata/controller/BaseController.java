package com.github.whalerain.springbootkata.controller;

import com.github.whalerain.springbootkata.pojo.modelVo.UserVO;
import com.github.whalerain.springbootkata.pojo.responseVo.BaseResponse;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ZhangXi
 */
@Controller
public class BaseController {

    @ResponseBody
    @RequestMapping(value = "/test/1", method = RequestMethod.GET)
    public BaseResponse testGlobalExceptionHandler() throws Exception {
        throw new Exception("test");
    }


    @RequestMapping(value = "/test/validator", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse testValidator(@RequestBody @Validated UserVO user) {
        return new BaseResponse();
    }


}
