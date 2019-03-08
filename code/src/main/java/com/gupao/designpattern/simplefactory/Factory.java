package com.gupao.designpattern.simplefactory;

import com.gupao.designpattern.product.IProduct;
import com.gupao.designpattern.product.ProductA;
import com.gupao.designpattern.product.ProductB;

/**
 * @ClassName Factory
 * @Auther: LG
 * @Description
 * @Date 2019/3/8
 **/
public class Factory {

    public IProduct createProduct(String name) {
        if (name.equalsIgnoreCase("A")) {
            return new ProductA();
        } else if (name.equalsIgnoreCase("B")) {
            return new ProductB();
        }
        return  null;
    }

}
