/** 
 * Project Name:javaDemo 
 * File Name:Pay.java 
 * Package Name:com.demo.ali 
 * Date:2017年3月27日下午6:57:19 
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package com.demo.ali.app;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.AlipayConstants;
import com.alipay.api.internal.util.AlipaySignature;

/** 
 * ClassName:Pay <br/> 
 * Function: app验签. <br/> 
 * Date:     2017年3月27日 下午6:57:19 <br/> 
 * @author   dfz
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class Pay {
	
	

	public static void main(String[] args) throws Exception{
		String public_key="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnEhwaZn030TVxEk5e5nghKN+4y93GDPpdoM6Sy2C9jbDqlZbs30o/k6m3KTAXd6wuc4AbN8pn7bT1iuUYytnzSHUwwVhCPKyl97TMrIdEulc6w769XSVvW9ft/gHTl0QD1USekV9xbAt3NaA/uhiRmLuQfBEp01Joi8/UHG7z9RgxgBeCJXiAvE8XD+L1NL1VYWoaKilQXsB1JKdQLK9YXjtN792LlKBixVeEXLKAvq6bWsp3o2J6LG1APSWvOzYXQf0QYNLU8oXyyta4zJPgalLPlK6ANOA7VDtpnnzSY+jPLL1UMJxdhKM3/gxeJrsEYbZklk94ikaJZx74yuglQIDAQAB"; 
		Map<String,String> map=new HashMap<String,String>();
		String resultInfo="gmt_create=2017-03-28 10:38:45&charset=UTF-8&seller_email=qtrip@jkinvest.cn&subject=爱趣旅行景点门票订购&buyer_id=2088702386568616&body=爱趣旅行景点门票订购&invoice_amount=0.01&notify_id=782bf3ce20d2a8802e53b01bbce5b08kpi&fund_bill_list=[{\"amount\":\"0.01\",\"fundChannel\":\"ALIPAYACCOUNT\"}]&notify_type=trade_status_sync&trade_status=TRADE_SUCCESS&receipt_amount=0.01&sign_type=RSA2&buyer_pay_amount=0.01&app_id=2017020305502581&seller_id=2088221484077045&notify_time=2017-03-28 10:38:46&gmt_payment=2017-03-28 10:38:45&version=1.0&out_trade_no=201703288546828&total_amount=0.01&trade_no=2017032821001004610211078519&auth_app_id=2017020305502581&buyer_logon_id=158****9534&point_amount=0.00&";
		String[] arr=resultInfo.split("&");
		for (int i = 0; i < arr.length; i++) {
			String[] test=arr[i].split("=");
			map.put(test[0], test[1]);
		}
		map.put("sign", "iByhkW2R67CyA7K/VPVo0a7teqAcv69TgqtjaeLysvbETbjDB7TY9KgUFDpZSVt3e/pOK062Mj2ZTMV6iUTpk3/Bd5eaiSic+bRQGm48Jx9n8WacKlg6uaAZwxHzlYNc3akCmUbn0440vGJ8Ssso/V/gaHWQ/fAK5eiWhCg1c0HHyDFRNa3F7VnAc+OOol5Xv0PYrcRiAO6bR4z5MGf1Yg+seANWUvH+S/cyWw2NZouuQHG8hCxQWJcRgK+tzbdqu77LaQIUmj8LjhfpSSsqEMVqp/21MB7ftKFAb5bpdvcIff+N/9Wd/clPYFjzUAj17YYAXAODLHFIcAVqlkBA9w==");
		boolean flag = AlipaySignature.rsaCheckV1(map,  public_key, AlipayConstants.CHARSET_UTF8,"RSA2");
		if(flag){
			System.out.println("success");
		}else{
			System.out.println("fail");
		}
	}

}
  