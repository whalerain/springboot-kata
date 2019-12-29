package com.github.whalerain.springbootkata.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.whalerain.springbootkata.model.User;
import com.github.whalerain.springbootkata.pojo.modelVo.UserVO;
import com.github.whalerain.springbootkata.support.AbstractModelRequest;
import com.github.whalerain.springbootkata.support.BaseRequest;
import com.github.whalerain.springbootkata.support.BaseResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author ZhangXi
 */
@Tag(name = "/user", description = "用户接口")
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Operation(
            summary = "新增用户，很惆怅", description = "详细说明下是如何新增用户的哈哈"
    )
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public BaseResponse addUser(@RequestBody @Validated UserAddRequest userAddRequest) {
        BaseResponse response = new BaseResponse();
        response.success("success", userAddRequest.getData());
        return response;
    }

    @Schema(name = "新增", title = "新增用户")
    @EqualsAndHashCode(callSuper = true)
    @Data
    private static class UserAddRequest extends AbstractModelRequest<User> {

        @Valid
        @JsonIgnoreProperties(value = {"password", "age" })
        private UserVO data;

        @Override
        protected void checkAndHandleData() {

        }

        @Override
        protected User buildModel() {
            return data;
        }
    }


}
