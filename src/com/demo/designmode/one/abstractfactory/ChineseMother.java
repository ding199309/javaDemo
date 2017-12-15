package com.demo.designmode.one.abstractfactory;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author dfz
 * @email dfz@jkinvest.cn
 * @create 2017-12-13 11:53
 * @see [相关类/方法]（可选）
 * @since 1.0
 */
public class ChineseMother implements IMother{

    private String name;
    public ChineseMother(String name) {
        this.name = name;
        System.out.println("create a cn mother.");
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println(this.getClass().getName() + ":" + this.name);

    }
}