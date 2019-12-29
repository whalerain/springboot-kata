package com.github.whalerain.springbootkata.support;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author ZhangXi
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QueryRequest extends BaseRequest {

    private QueryParams queryParams;

    private PagedParams pagedParams;

    private OrderParams orderParams;

}
