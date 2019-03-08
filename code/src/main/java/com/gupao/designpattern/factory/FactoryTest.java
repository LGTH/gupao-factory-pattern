package com.gupao.designpattern.factory;


import com.gupao.designpattern.factoryInterface.IFactory;
import com.gupao.designpattern.product.IProduct;

/**
 * @ClassName FactoryTest
 * @Auther: LG
 * @Description  工厂方法模式测试
 * @Date 2019/3/8
 **/
public class FactoryTest {
    public static void main(String[] args) {

        IFactory factory = new FactoryA();
        IProduct iProduct = factory.createProduct();
        iProduct.show();

        factory = new FactoryB();
        iProduct = factory.createProduct();
        iProduct.show();
    }
}
