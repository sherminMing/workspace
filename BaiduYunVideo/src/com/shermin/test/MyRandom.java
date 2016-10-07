package com.shermin.test;

import java.util.Random;

public class MyRandom {

	public static void main(String[] args) {
    char[] arr={'A','B','C','D','E','F','G','H','0','1','2','3','4','5','6','7','8','9'
    		,'a','b','c','d','e','f','g','h','i','j','k','m','l','n','o','p','q','r',
    		's','t','u','v','w','x','y','z'};
    StringBuilder stringBuilder=new StringBuilder();
    Random random=new Random();
    for(int i=0;i<4;i++){
    	int index=random.nextInt(arr.length);
    	stringBuilder.append(arr[index]);
    }
    System.out.println("ÑéÖ¤Âë£º"+stringBuilder);

	}

}
