package com.gupao.designpattern.factory;

import com.gupao.designpattern.factoryInterface.IFactory;
import com.gupao.designpattern.product.IProduct;
import com.gupao.designpattern.product.ProductA;

/**
 * @ClassName FactoryA
 * @Auther: LG
 * @Description
 * @Date 2019/3/8
 **/
public class FactoryA implements IFactory {
    @Override
    public IProduct createProduct() {
        return new ProductA();
    }
}
