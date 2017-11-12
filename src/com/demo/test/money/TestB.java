package com.demo.test.money;

import java.math.BigDecimal;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/10/30 9:30
 * @parameter
 * @return
 *
 * 等额本息:
 *
 *指将收益和本息加起来后平均到每个月，每月偿还同等数额的资金，
 *这种还款方式由于本金归还速度相对较慢，占用资金时间较长，还款总利息较相同期限的等额本金还款法高.
 *
 *
 *          每月应还款额＝借款本金×月利率×（1＋月利率）^还款月数/[（1＋月利率）^还款月数－1]
 *
 *
 *          每月的利息：   本金*月利率
 */
public class TestB {

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


    public  static   void  test(BigDecimal totalMoney,int  month,BigDecimal monthRate){
        if(month==0){
            System.out.println("结束了");
            return;
        }
        BigDecimal   aveMoney=TOTALMONEY.multiply(monthRate)
                .multiply(new BigDecimal(Math.pow(new BigDecimal(1).add(monthRate).doubleValue(),YEAR*12)))
                .divide(new BigDecimal(Math.pow(new BigDecimal(1).add(monthRate).doubleValue(),YEAR*12)-1),2,BigDecimal.ROUND_HALF_DOWN);

        System.out.print("---当前月数===="+(YEAR*12-month+1));
        System.out.print(",期初余额===="+totalMoney);
        System.out.print(",每月还款======="+aveMoney);
        BigDecimal   currentRate=totalMoney.multiply(monthRate);
        System.out.print(",当月还款本金======"+aveMoney.subtract(currentRate));
        System.out.print(",当月利息======"+currentRate);
        System.out.println(",期末余额======"+totalMoney.subtract(aveMoney.subtract(currentRate)).setScale(2,BigDecimal.ROUND_UP));

        test(totalMoney.subtract(aveMoney.subtract(currentRate)).setScale(4,BigDecimal.ROUND_UP),--month,monthRate);

    }

    public static void main(String[] args) {
        test(TOTALMONEY,YEAR*12,MONTH_RATE);
    }

}
