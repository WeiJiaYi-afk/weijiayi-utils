package com.weijiayii.common.utils;

import java.util.HashSet;
import java.util.Random;

/**
 * @ClassName:  RandomUtil   
 * @Description:随机数工具类   
 * @date:   2020年1月3日 上午9:07:35
 */
public class RandomUtil {
	/**
	 * @Title: random   
	 * @Description: 获得指定区间的随机数   
	 * @param: @param min
	 * @param: @param max
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	public static int random(int min,int max) {
		Random random = new Random();
		int nextInt = random.nextInt(max-min+1);
		if(nextInt<min) {
			return random(min,max);
		}
		return nextInt;
	}
	
	/**
	 * @Title: random   
	 * @Description: 获得最小数和最大数之间的多个随机数
	 * @param: @param min
	 * @param: @param max
	 * @param: @param num
	 * @param: @return      
	 * @return: int[]      
	 * @throws
	 */
	public static int[] random(int min,int max,int num) {
		int[] intArray = new int[num];
		for (int i = 0; i < num; i++) {
			intArray[i] = random(min, max);
		}
		return intArray;
	}
	
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			System.out.println(random(1,2));
		}
	}
	
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
		int[] x =new int[subs];//声明数组用来存放结果值
		
		HashSet<Integer> set = new HashSet<Integer>();
		while(set.size()!=subs) {
			set.add(random(min, max));
		}
		
	
		int i=0;
		for (Integer integer : set) {	//把set集合放入数组中
			x[i]=integer;
			i++;
		}
		return x;
		
		
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return str.charAt(random(0, str.length()-1));
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		String str="";
		 for(int i =0 ;i<length; i++) {
			str+= randomCharacter();
		 }
		return str;
	}

}
