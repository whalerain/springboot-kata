package com.github.whalerain.springbootkata.demo.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

/**
 * @author ZhangXi
 */
@Tag("fast")
@Tags(value = {
        @Tag("model"),
        @Tag("dao")
})
public class TagTest {

    @Test
    @Tag("test")
    void testTag() {}

}
