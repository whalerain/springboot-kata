package com.github.whalerain.springbootkata.support;

import com.github.whalerain.springbootkata.support.base.BaseRequest;
import com.github.whalerain.springbootkata.support.sub.OrderParams;
import com.github.whalerain.springbootkata.support.sub.PagedParams;
import com.github.whalerain.springbootkata.support.sub.QueryParams;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.Valid;

/**
 * @author ZhangXi
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QueryRequest extends BaseRequest {

    /**
     * 查询参数
     */
    @Schema(description = "查询参数")
    private QueryParams queryParams;

    /**
     * 分页参数
     */
    @Valid
    @Schema(description = "分页参数", required = true)
    private PagedParams pagedParams;

    /**
     * 排序参数
     */
    @Schema(description = "排序参数")
    private OrderParams orderParams;

}
