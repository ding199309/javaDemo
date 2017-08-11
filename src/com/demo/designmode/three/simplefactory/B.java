package com.demo.designmode.three.simplefactory;

import com.alipay.api.domain.AlipayEbppPdeductSignValidateModel;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 16:10  2017/6/26
 * @return
 */
public class B  implements  A{
    @Override
    public void msg() {
        System.out.println("this is b  product ");
    }
}
