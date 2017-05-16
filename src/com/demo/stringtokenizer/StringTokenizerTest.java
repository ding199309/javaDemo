package com.demo.stringtokenizer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

/** 
* @author   dfz
* 作者 E-mail:  dfz@jkinvest.cn
* @date 创建时间：2017年5月15日 下午5:02:24 
* @version 1.0    学习SpringTokenizer
* @parameter  
* @since  
* @return  
*/
//StringTokenizer 是出于兼容性的原因而被保留的遗留类
public class StringTokenizerTest {
	public static void main(String[] args) {
		test1();
//		test1();
	}	
//	为指定字符串构造一个 string tokenizer。  delim 参数中的所有字符都是分隔标记的分隔符。	
//	如果 returnDelims 标志为 true，则分隔符字符也作为标记返回。每个分隔符都作为一个长度为 1 的字符串返回。如果标志为 false，则跳过分隔符，只是用作标记之间的分隔符。	
//	注意，如果 delim 为 null，则此构造方法不抛出异常。但是，尝试对得到的 StringTokenizer 调用其他方法则可能抛出 NullPointerException。
//	public StringTokenizer(String str,String delim,boolean returnDelims)

//  为指定字符串构造一个 string tokenizer。 delim 参数中的字符都是分隔标记的分隔符。分隔符字符本身不作为标记。	
//	注意，如果 delim 为 null，则此构造方法不抛出异常。但是，尝试对得到的 StringTokenizer 调用其他方法则可能抛出 NullPointerException。
//	public StringTokenizer(String str,String delim)	
		
//  使用默认的分隔符集 " \t\n\r\f"，即：空白字符、制表符、换行符、回车符和换页符。分隔符字符本身不作为标记。
//  public StringTokenizer(String str)	
	

	
//	测试此 tokenizer 的字符串中是否还有更多的可用标记。如果此方法返回 true，那么后续调用无参数的 nextToken 方法将成功地返回一个标记。	
//	public boolean hasMoreTokens()	
//	返回:当且仅当该字符串中当前位置后至少有一个标记时才为 true；否则为 false。	

//	返回此 string tokenizer 的下一个标记。	
//	public String nextToken()	

//	返回此 string tokenizer 的字符串中的下一个标记。首先，字符集被更改为字符串 delim 中的字符，该字符集被认为是 StringTokenizer 对象的分隔符。
//	接着返回字符串中当前位置之后的下一个标记。当前位置被提前到所识别的标记前。进行此调用后新的分隔符集仍然保持默认值。	
//	public String nextToken(String delim)	delim: 新的分隔符
//  返回:转换到新的分隔符集后的下一个标记。
	
	
//	计算在生成异常之前可以调用此 tokenizer 的 nextToken 方法的次数。当前位置没有提前。	
//	public int countTokens()	
//	返回：使用当前分隔符集的字符串中剩余的标记数。	
	
	
	public static void test1(){
		StringTokenizer st=new StringTokenizer("this &is &a te&st","&");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}	
	}
	
	
	public static void test2(){
		Map<String,Object> map=new HashMap<>();
		StringTokenizer st=new StringTokenizer("channel_id=1000001&order_no_channel=2017050278965&pay_price=900&pay_type=0&product_name=test&sign=8165bc29f855e174f70a9fbd74887044","&");
		while(st.hasMoreTokens()){
			StringTokenizer tt=new StringTokenizer(st.nextToken(),"=");
			int i=0;
			String key="";
			String value="";
			while(tt.hasMoreTokens()){
				if(i==0){
					key=tt.nextToken();
				}else{
					value=tt.nextToken();
				}
				i++;
				map.put(key, value);
			}
		}
		
		for(Entry<String,Object> entry:map.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	
	}
	

}
