package com.gupao.designpattern.factoryInterface;

import com.gupao.designpattern.product.IProduct;

/**
 * @ClassName IFactory
 * @Auther: LG
 * @Description
 * @Date 2019/3/8
 **/
public interface IFactory {
    public IProduct createProduct();
}
