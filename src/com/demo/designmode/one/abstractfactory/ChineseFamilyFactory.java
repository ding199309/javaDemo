package com.demo.designmode.one.abstractfactory;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author dfz
 * @email dfz@jkinvest.cn
 * @create 2017-12-13 11:55
 * @see [相关类/方法]（可选）
 * @since 1.0
 */
public class ChineseFamilyFactory implements IFamilyFactory{

    @Override
    public IFather createFather(String name) {
        return new ChineseFather(name);
    }

    @Override
    public IMother createMother(String name) {
        return new ChineseMother(name);
    }

}
