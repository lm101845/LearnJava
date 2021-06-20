package day03;

import java.util.StringTokenizer;
/*
 * 这个类位于util包中，它将一个字符串划分为一系列叫做标记（token）的字符串
 */
 class TokenTester {
	 public static void main(String[] args) {
		 
		StringTokenizer st1;
		StringTokenizer st2;   //变量的类型还可以是类
		
		String quote1 = "GOOG 604.43 -0.42";
		st1 = new StringTokenizer(quote1);
		System.out.println("Token 1:" + st1.nextToken());
		System.out.println("Token 2:" + st1.nextToken());
		System.out.println("Token 3:" + st1.nextToken());
		
		String quote2 = "RHT@60.39@0.78";
		st2 = new StringTokenizer(quote2,"@");
		System.out.println("\nToken 1:" + st2.nextToken());
		System.out.println("Token 2:" + st2.nextToken());
		System.out.println("Token 3:" + st2.nextToken());
	}

}
