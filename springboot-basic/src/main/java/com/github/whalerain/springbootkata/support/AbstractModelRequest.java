package com.github.whalerain.springbootkata.support;

/**
 * 抽象实体数据请求VO
 *
 * @author ZhangXi
 */
public abstract class AbstractModelRequest<T> extends BaseRequest {

    /**
     * 校验请求参数，并处理数据后，获取实体类
     *
     * @return T
     */
    public T obtainCheckedModel() {
        checkAndHandleData();
        return buildModel();
    }

    protected abstract void checkAndHandleData();

    protected abstract T buildModel();

}
