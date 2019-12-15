package com.github.whalerain.springbootkata.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 系统自定义配置
 * regexp: 自定义正则表达式
 *
 * @author ZhangXi
 */
@Data
@Component
@ConfigurationProperties(prefix = "kata")
public class PropKata {

    private Regexp regexp;

    @SuppressWarnings("WeakerAccess")
    @Data
    public static class Regexp {

        private String mobile;

        private String telephone;

    }

}
