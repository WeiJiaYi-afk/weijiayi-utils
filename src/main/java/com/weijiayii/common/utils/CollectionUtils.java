package com.weijiayii.common.utils;

import java.util.Collection;

public class CollectionUtils {

	
	//判断集合是否为空
	public static boolean isEmpty(Collection<?> collection) {
		
		return collection == null || collection.size()==0;
		
	}
}
