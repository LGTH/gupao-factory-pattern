package com.gupao.designpattern.simplefactory;

import com.gupao.designpattern.product.IProduct;

/**
 * @ClassName SimpleFactoryTest
 * @Auther: guanliao
 * @Description
 * @Date 2019/3/8
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Factory factory = new Factory();

        IProduct iProduct = factory.createProduct("A");
        iProduct.show();

        iProduct = factory.createProduct("B");
        iProduct.show();
    }
}
