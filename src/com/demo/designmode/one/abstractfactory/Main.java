package com.demo.designmode.one.abstractfactory;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author dfz
 * @email dfz@jkinvest.cn
 * @create 2017-12-13 11:56
 * @see [相关类/方法]（可选）
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        IFamilyFactory cnFamilyFactory = new ChineseFamilyFactory();
        IFamilyFactory usFamilyFactory = new AmericanFamilyFactory();

        IFather cnFather = cnFamilyFactory.createFather("cn father-test");
        IMother cnMother = cnFamilyFactory.createMother("cn mother-test");

        IFather usFather = usFamilyFactory.createFather("us father-test");
        IMother usMother = usFamilyFactory.createMother("us mother-test");

        cnFather.printName();
        cnMother.printName();
        usFather.printName();
        usMother.printName();
    }
}
