package com.github.whalerain.springbootkata.bean;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 *
 *
 * @author ZhangXi
 */
@Component
public class TimestampConverter implements Converter<String, Timestamp> {

    @Override
    public Timestamp convert(String stringTime) {
        //todo 主要将字符串转为时间戳


        return null;
    }
}
