package com.gupao.designpattern.abstractfactory;


import com.gupao.designpattern.factoryInterface.IAbstractFactory;
import com.gupao.designpattern.product.IProduct;
import com.gupao.designpattern.product.ProductA;
import com.gupao.designpattern.product.ProductA1;
import com.gupao.designpattern.product.ProductB1;

/**
 * @ClassName FactoryVarietyAB1
 * @Auther: LG
 * @Description
 * @Date 2019/3/8
 **/
public class FactoryVarietyAB1 implements IAbstractFactory {
    @Override
    public IProduct createProductA() {
        return new ProductA1();
    }

    @Override
    public IProduct createProductB() {
        return new ProductB1();
    }
}
