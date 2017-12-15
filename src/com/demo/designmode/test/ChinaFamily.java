package com.demo.designmode.test;

/**
 * Created with IntelliJ IDEA.
 * User: woting
 * Date: 2017/12/13
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ChinaFamily implements IFamily {
    @Override
    public IFather getTestFather() {
        return new ChinaFather();
    }

    @Override
    public IMother getTestMother() {
        return new ChinaMonther();
    }
}
