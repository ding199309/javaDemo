package com.demo.ali.app;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayObject;
import com.alipay.api.request.AlipayTradeFastpayRefundQueryRequest;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.alipay.api.response.AlipayTradeFastpayRefundQueryResponse;
import com.alipay.api.response.AlipayTradeRefundResponse;

/** 
* @author   dfz
* 作者 E-mail:  dfz@jkinvest.cn
* @date 创建时间：2017年4月25日 下午4:20:14 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class RefundTest {
	public static final String appid="2017020305502581";
	public static final String private_key="MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQC8xxElzxRc8Sv52h30ZnWnZizRMlqYwlVf7CvBor5X7oGLwb2scQ+GMbLEAdiYPQBv3zLFtlby2GWdVXt5yq39NXuQlTNLUtpLddQ1zLULDHTlcMwsH6jKLAwnqk9DVy3srsnCO8W1i2LvOMw0IkkkRYSqSlFJcSSI8VsQXuPHYy9Y/cQ65qOrxEYrmnwD1vAWqKxBYowEWL8y7OEsTvYfaO+erP8p7R2zcECpo99nxqUb0ZwF5AZ7bZES8fURj5vTO5teEYqSRbKTfX+ZLXECMAcfbEeyYwaZunp3HqZEocLDJoJQzn72hdICc9bOIKhYVGqhDsAFszOIiLL9rHEnAgMBAAECggEBAJvWJWS11tSGzsu58GJyNovTQAoN7FYQjtPZraFyzHjgThbl/8MbrjoUSsOd1oSOTw8LDOnEBXEBjJjeGUlINGtDvFZ1pFt48PW8NkuXSpjtVo6VmCaQmBEVXY9c+4PWsvWgsLNkDmk4wJpEo+Yhq4mCzeqZ4RKkkQlvXMJd4uETp+0vigq1+jW+PUmaZQwBnchfmadYXzWF5avwXxpnHkPychQGgS1dvFrPANyl0V+Y4yA532N0tmCRse2nwm0ogjp3sndVW+UXpvsWnFxyzDMS8QAsEATJVlWVB8IYgcqM0eDfYS8ejs38WbWptMNC4I9aGobCoYOvrUhQTGRA70ECgYEA3FAMMr6Whevzw21M1aCF09KragTtNk8aixYAgd5h7vLAkzj3HVdhxZbX3loKToYpkO1uDwMuS0WY7162ScSO0YrPHjwEuuGdYNpQyICTTwFJ4xwsT6Jty/mvNjiOKGZYEMU5WKgosZFDhvrFa75x59LkmK7VNl51A4hP41Cm4GECgYEA21tRo4gm7OwWst4QtafnBvQEvpS+7pdT1QWNZMGwx0eIC/ZgNJ8lnVYwrAkSkxDCyxZQIgo4Cynn6DK1YeejB9mCNV+t07SPCBsWwJyVTaCeWRvTt3VjmFTIFOMU3x9hsEyhd2bAqTB0fsJLr2/uVJ+jjLlYwLA7jBkCcXYY3ocCgYEA0J7wXiEB0oEzjGx05JokAAivDy7pHZNclDZadqAJ5sZyuzanMl6rk/qaIdDrj54VwEpE/OxLKzYVcx4hycraXuxt4rh81iaM68jv1F2EoLycpfXos+QgypV+Z/64BuObIw5PlnduSW9AHZJb3gIyRI78ruRnvBtH/PdYhu25iCECgYB+QTRfFKma6lQyRYCGngpqRR9J9mFjAHS/AoAcgyNVwAU9JWTARO2ofohrLJmlThtgOwqKXSleu5MAYddmb6W1ierY/6YUWTOOLdFNsZJ56L3behnE2WsmrX2wD/feaLiYebLh/6FagEo8/2YCp0EdMfk3sSK1XXoYq/htB9VOlwKBgQDZzydw0++VOCeyESoNIgjlgIBiQLLR03jBMF6q6g+B5w57lQpB3RXdBypyBqUnNG2LM7UiPINEjvojlGYOJmtJHQhNEPu+9OEl61q07TDlT4n2buHb8BUfw0rFRWVxBMkemHlo5pr7GsRqevDZAlLrnY2mEqPuLe5VGhHv4Wix6Q==";
	public static final String public_key="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnEhwaZn030TVxEk5e5nghKN+4y93GDPpdoM6Sy2C9jbDqlZbs30o/k6m3KTAXd6wuc4AbN8pn7bT1iuUYytnzSHUwwVhCPKyl97TMrIdEulc6w769XSVvW9ft/gHTl0QD1USekV9xbAt3NaA/uhiRmLuQfBEp01Joi8/UHG7z9RgxgBeCJXiAvE8XD+L1NL1VYWoaKilQXsB1JKdQLK9YXjtN792LlKBixVeEXLKAvq6bWsp3o2J6LG1APSWvOzYXQf0QYNLU8oXyyta4zJPgalLPlK6ANOA7VDtpnnzSY+jPLL1UMJxdhKM3/gxeJrsEYbZklk94ikaJZx74yuglQIDAQAB";
	
	
	
	//{"alipay_trade_refund_response":{"code":"40004","msg":"Business Failed","sub_code":"ACQ.TRADE_STATUS_ERROR","sub_msg":"交易状态不合法","refund_fee":"0.00","send_back_fee":"0.00"},"sign":"hxYDh07BGWNDnbinh4o9KzQjTGFzaQ/MFYnS1FECIUPB1pfx/UtVXpPb06VNvX10EfeAwhKvYKGa/4x5DRcdtaAFfEVO+jpjvLfYjbq8YXGgHvVLAXC1u6ZXxnpI9vgQXK0tlYwvURM9WcidXFfWqERQNNwKa6vyupdy7SFdEE3GzLXxNnYubKRWKv1vD/zWHBGhwWtd6f2UmEt/Zg/eYbRx3IQB3y20YUV+RK3nvlhM1ZuzqPX0v5kW7a7VlrKAx5bQCGAjzowAPyD83q77LAADUKJorFCRTvCPn7htd8a0WhPHgoTHQduwnSbRFw2JXZzPbtsVskrFT79CQEp6gw=="}		
	public static void test1() throws AlipayApiException{
		AlipayTradeRefundRequest request = new AlipayTradeRefundRequest();
		Map<String,Object> paramsMap=new HashMap<>();
		paramsMap.put("out_trade_no", "");//商户订单号
		paramsMap.put("trade_no","2017042721001004550212480946");//支付宝交易号
		paramsMap.put("refund_amount",0.03);//退款钱
		request.setBizContent(JSON.toJSONString(paramsMap));
		AlipayTradeRefundResponse response = AlipayUtil.getAlipayClient(appid, private_key, public_key).execute(request);
		JSONObject  obj=JSONObject.parseObject(response.getBody());
		System.out.println(obj.get("alipay_trade_refund_response").toString());
		obj=JSONObject.parseObject(obj.get("alipay_trade_refund_response").toString());
		if(response.isSuccess()){
		System.out.println("调用成功");
		} else {
		System.out.println("调用失败");
		}		
	}
	public static void test2() throws AlipayApiException{
//		AlipayTradeFastpayRefundQueryRequest request = new AlipayTradeFastpayRefundQueryRequest();		
		Map<String,Object> paramsMap=new HashMap<>();
		paramsMap.put("trade_no", "2017042621001004550211401028");
		paramsMap.put("out_request_no", "2017042621001004550211401028");
//		request.setBizContent(JSONObject.toJSONString(paramsMap));
//		AlipayTradeFastpayRefundQueryResponse response = AlipayUtil.getAlipayClient(appid, private_key, public_key).execute(request);
//		JSONObject  obj=JSONObject.parseObject(response.getBody());
//		System.out.println(obj.get("alipay_trade_fastpay_refund_query_response").toString());
//		
//		obj=JSONObject.parseObject(obj.get("alipay_trade_fastpay_refund_query_response").toString());
//		System.out.println(obj.get("sub_code").toString());
//		if(response.isSuccess()){
//		System.out.println("调用成功");
//		} else {
//		System.out.println("调用失败");
//		}				
		AlipayTradeFastpayRefundQueryRequest request = new AlipayTradeFastpayRefundQueryRequest();
//		request.setBizContent("{" +
//		"    \"trade_no\":\"20150320010101001\"," +
//		"    \"out_trade_no\":\"2014112611001004680073956707\"," +
//		"    \"out_request_no\":\"2014112611001004680073956707\"" +
//		"  }");
		request.setBizContent(JSONObject.toJSONString(paramsMap));
		AlipayTradeFastpayRefundQueryResponse response = AlipayUtil.getAlipayClient(appid, private_key, public_key).execute(request);
		JSONObject  obj=JSONObject.parseObject(response.getBody());
		System.out.println(response.getBody());
		System.out.println(obj.get("alipay_trade_fastpay_refund_query_response").toString());
		if(response.isSuccess()){
		System.out.println("调用成功");
		} else {
		System.out.println("调用失败");
		}
		
		
		
		
	}
	public static void main(String[] args) throws AlipayApiException {
//		 try {
//			test2();
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("重新调用==============");
//			test2();
//		}
		test1();
	}

}
