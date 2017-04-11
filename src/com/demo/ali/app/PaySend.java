/** 
 * Project Name:javaDemo 
 * File Name:PaySend.java 
 * Package Name:com.demo.ali 
 * Date:2017��4��11������10:23:13 
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
 * Function: app֧�������� <br/> 
 * Date:     2017��4��11�� ����10:23:13 <br/> 
 * @author   dfz
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class PaySend {
	public static void main(String[] args) {
		//ʵ��������API��Ӧ��request��,�����ƺͽӿ����ƶ�Ӧ,��ǰ���ýӿ����ƣ�alipay.trade.app.pay
				AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
				AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
				//����
				model.setBody("���ǲ�������");//��������
				model.setSubject("App֧������Java");//��Ʒ�ı���/
				model.setOutTradeNo("123321");//�̻���վΨһ������
				model.setTotalAmount("0.01");//���
				model.setProductCode("QUICK_MSECURITY_PAY");//���۲�Ʒ�룬�̼Һ�֧����ǩԼ�Ĳ�Ʒ�룬Ϊ�̶�ֵ
				request.setBizModel(model);
				request.setNotifyUrl("notify_url");	
				try {
			        //�������ͨ�Ľӿڵ��ò�ͬ��ʹ�õ���sdkExecute
			        AlipayTradeAppPayResponse response = AlipayUtil.getAlipayClient("appid","private_key", "public_key").sdkExecute(request);
			        System.out.println(response.getBody());//����orderString ����ֱ�Ӹ��ͻ�������������������
			    } catch (AlipayApiException e) {
			        e.printStackTrace();
			    }
	}

}
  