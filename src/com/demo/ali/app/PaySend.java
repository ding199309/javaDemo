/** 
 * Project Name:javaDemo 
 * File Name:PaySend.java 
 * Package Name:com.demo.ali 
 * Date:2017年4月11日上午10:23:13 
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package com.demo.ali.app;

import com.alipay.api.AlipayApiException;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.demo.ali.AlipayUtil;

/** 
 * ClassName:PaySend <br/> 
 * Function: app支付宝发送 <br/> 
 * Date:     2017年4月11日 上午10:23:13 <br/> 
 * @author   dfz
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class PaySend {
	public static void main(String[] args) {
		//实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.trade.app.pay
				AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
				AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
				//测试
				model.setBody("我是测试数据");//交易描述
				model.setSubject("App支付测试Java");//商品的标题/
				model.setOutTradeNo("123321");//商户网站唯一订单号
				model.setTotalAmount("0.01");//金额
				model.setProductCode("QUICK_MSECURITY_PAY");//销售产品码，商家和支付宝签约的产品码，为固定值
				request.setBizModel(model);
				request.setNotifyUrl("notify_url");	
				try {
			        //这里和普通的接口调用不同，使用的是sdkExecute
			        AlipayTradeAppPayResponse response = AlipayUtil.getAlipayClient("appid","private_key", "public_key").sdkExecute(request);
			        System.out.println(response.getBody());//就是orderString 可以直接给客户端请求，无需再做处理。
			    } catch (AlipayApiException e) {
			        e.printStackTrace();
			    }
	}

}
  