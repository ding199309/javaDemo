package com.demo.test.money;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/10/27 11:25
 * @parameter
 * @return
 *
 *
 *    等额本金=========================等额本金
 *
 *    等额本金，是在还款期内把贷款数总额等分，每月偿还同等数额的本金和剩余贷款在该月所产生的利息，
 *    这样由于每月的还款本金额固定，而利息越来越少，借款人起初还款压力较大，但是随时间的推移每月还款数也越来越少。
 */
public class TestA {

    /**
     * 总的借款金额(元)
     */
    public    static  final BigDecimal TOTALMONEY= BigDecimal.valueOf(500000.00);
    /**
     * 借款年数
     */
    public    static  final  int  YEAR=10;
    /**
     * 年利率
     */
    public     static  final   BigDecimal  YEAR_RATE= BigDecimal.valueOf(0.07);
    /**
     * 月利率
     */
    public   static   final   BigDecimal  MONTH_RATE= BigDecimal.valueOf(0.005833);






    public  static void  test(BigDecimal sum,  int  month){
        if(month==0){
            return;
        }
        /* 总钱除以总月    每月还款本金*/
        BigDecimal  ave=TOTALMONEY.divide(new BigDecimal(YEAR*12),2,BigDecimal.ROUND_HALF_EVEN);
        /*本月利息*/
        BigDecimal  rate=sum.multiply(MONTH_RATE).setScale(2,BigDecimal.ROUND_HALF_EVEN);
        /*第几个月*/
        int m=YEAR*12-month+1;
        /*还款额*/
        BigDecimal mon=ave.add(rate).setScale(2,BigDecimal.ROUND_HALF_EVEN);
        /*期末余额*/
        BigDecimal  residue=sum.subtract(ave);
        if(sum.compareTo(ave)<=0){
            residue=new BigDecimal(0);
        }
        System.out.println("第"+m+"月,"+"期初余额:"+sum+","+"还款额："+mon+",本金："+ave+",利息："+rate+",期末余额:"+residue);
        test(residue,--month);
    }

    public static void main(String[] args) {
        test(TOTALMONEY,YEAR*12);
    }
}
