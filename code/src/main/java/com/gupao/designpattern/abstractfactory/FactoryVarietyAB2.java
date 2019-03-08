package com.gupao.designpattern.abstractfactory;

import com.gupao.designpattern.factoryInterface.IAbstractFactory;
import com.gupao.designpattern.product.IProduct;
import com.gupao.designpattern.product.ProductA2;
import com.gupao.designpattern.product.ProductB2;

/**
 * @ClassName FactoryVarietyAB2
 * @Auther: LG
 * @Description
 * @Date 2019/3/8
 **/
public class FactoryVarietyAB2 implements IAbstractFactory {
    @Override
    public IProduct createProductA() {
        return new ProductA2();
    }

    @Override
    public IProduct createProductB() {
        return new ProductB2();
    }
}
