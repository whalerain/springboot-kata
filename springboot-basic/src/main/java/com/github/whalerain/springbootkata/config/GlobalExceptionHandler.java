package com.github.whalerain.springbootkata.config;

import com.github.whalerain.springbootkata.constant.SysErrorCode;
import com.github.whalerain.springbootkata.pojo.responseVo.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * 全局异常处理
 *
 * 如果是纯API服务，可以使用 {@link RestControllerAdvice}注释
 * @author ZhangXi
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    private static String MSG_ERROR_CODE = "error.code.";

    private final MessageSource messageSource;

    @Autowired
    public GlobalExceptionHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public BaseResponse handleException(Exception e) {
        log.error("处理未知异常", e);
        BaseResponse response = new BaseResponse();
        response.fail(SysErrorCode.INNER_ERROR);
        String message = messageSource.getMessage(
                MSG_ERROR_CODE+SysErrorCode.INNER_ERROR.takeValue(), null, LocaleContextHolder.getLocale());
        response.setMessage(message);
        return response;
    }

}
