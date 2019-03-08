package com.gupao.designpattern.abstractfactory;

import com.gupao.designpattern.factoryInterface.IAbstractFactory;
import com.gupao.designpattern.product.IProduct;

/**
 * @ClassName AbstractFactoryTest
 * @Auther: LG
 * @Description
 * @Date 2019/3/8
 **/
public class AbstractFactoryTest {

    public static void main(String[] args) {
        IAbstractFactory factory = new FactoryVarietyAB();
        System.out.println("----------------原始代产品");
        IProduct iProduct = factory.createProductA();
        iProduct.show();
        iProduct = factory.createProductB();
        iProduct.show();

        System.out.println("----------------第一代产品");
        factory = new FactoryVarietyAB1();
        iProduct = factory.createProductA();
        iProduct.show();
        iProduct = factory.createProductB();
        iProduct.show();

        System.out.println("----------------第二代产品");
        factory = new FactoryVarietyAB2();
        iProduct = factory.createProductA();
        iProduct.show();
        iProduct = factory.createProductB();
        iProduct.show();
    }
}
