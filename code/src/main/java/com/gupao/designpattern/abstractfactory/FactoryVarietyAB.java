package com.gupao.designpattern.abstractfactory;

import com.gupao.designpattern.factoryInterface.IAbstractFactory;
import com.gupao.designpattern.product.IProduct;
import com.gupao.designpattern.product.ProductA;
import com.gupao.designpattern.product.ProductB;

/**
 * @ClassName IFactoryVarietyA
 * @Auther: LG
 * @Description
 * @Date 2019/3/8
 **/
public class FactoryVarietyAB implements IAbstractFactory {


    @Override
    public IProduct createProductA() {
        return new ProductA();
    }

    @Override
    public IProduct createProductB() {
        return new ProductB();
    }
}
