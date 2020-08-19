package com.github.whalerain.springbootkata.support.resource;

import com.github.whalerain.springbootkata.config.ApplicationContextProvider;
import com.github.whalerain.springbootkata.config.PropKata;

/**
 * @author ZhangXi
 */
public class ResourcePrefix {

    public static String URI_IMAGE =
            ApplicationContextProvider.getBean(PropKata.class).getResourcePrefixImage();

    public static String URI_ASSERTS = "";



}
