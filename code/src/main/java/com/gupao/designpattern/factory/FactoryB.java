package com.gupao.designpattern.factory;

import com.gupao.designpattern.factoryInterface.IFactory;
import com.gupao.designpattern.product.IProduct;
import com.gupao.designpattern.product.ProductB;

/**
 * @ClassName FacotryB
 * @Auther: LG
 * @Description
 * @Date 2019/3/8
 **/
public class FactoryB implements IFactory {
    @Override
    public IProduct createProduct() {
        return new ProductB();
    }
}
