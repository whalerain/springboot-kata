package com.github.whalerain.springbootkata.support.sub;

import com.github.whalerain.springbootkata.menum.SortOrder;
import lombok.Data;

/**
 * 复杂查询中的排序参数项
 *
 * @author ZhangXi
 */
@Data
public class OrderItem {

    private String name;

    private SortOrder order;

}
