package com.github.whalerain.springbootkata.support;

/**
 *
 *
 * @author ZhangXi
 */
abstract class AbstractModelRequest<T> extends BaseRequest {

    /**
     * 将请求参数校验
     *
     * @return T
     */
    public T obtainCheckedModel() {
        checkAndHandleData();
        return buildModel();
    }

    abstract void checkAndHandleData();

    abstract T buildModel();

}
