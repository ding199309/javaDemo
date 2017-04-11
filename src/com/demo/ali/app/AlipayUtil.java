package com.demo.ali.app;

import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayConstants;
import com.alipay.api.DefaultAlipayClient;


public class AlipayUtil {
	// 统一收单交易创建接口
	private static AlipayClient alipayClient = null;

	
	
	public static AlipayClient getAlipayClient(String appid,String private_key,String public_key) {	
		System.out.println("appid==="+appid);
		System.out.println("private_key==="+private_key);
		System.out.println("public_key===="+public_key);
		if (alipayClient == null) {
			synchronized (AlipayUtil.class) {
				if (null == alipayClient) {
					alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", appid,
							private_key, AlipayConstants.FORMAT_JSON, AlipayConstants.CHARSET_UTF8,
							public_key,AlipayConstants.SIGN_TYPE_RSA2);
				}
			}
		}
		return alipayClient;
	}
}
