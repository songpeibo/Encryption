package Console;

import java.util.Scanner;

public class Decry {
	
	/*
	 * 在我的认知中，加密和解密是一样的算法3
	 * 解密算法可以使用减法实现
	 * 解密算法也可以使用加（移动量基于周期的余量）来实现
	 * 不过上述两种方法仅针对于狭义上的凯撒密码有用
	 * 针对广义上的凯撒密码加密，一般而言采用减法，因为加法周期过大（编码有多大周期就有多大）
	 */
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int vector = sc.nextInt();
		Decry(input,vector);
		//ConvertToASCII(input,vector);
	}
	
	/* 
	 * 狭义上的凯撒密码解密算法
	 * 可以实现a-z以及A-Z之间的解密
	 * 算法以25为移动周期，超过25需要减26，例如27为1，有点类似循环加密
	 */
	public static void Decry(String string,int vector) {
		StringBuilder stringBuilder = new StringBuilder();
		char plains[] = string.toCharArray();
		for(int i = 0;i < plains.length;i++) {
			int asc = Integer.valueOf(plains[i]);
			if((asc >= 65) && (asc <= 90)) {
				asc -= vector;
				if((asc >= 65) && (asc <= 90)) {
					char result = (char)(asc);
					stringBuilder.append(result);
				}else {
					asc += 26;
					char result = (char)(asc);
					stringBuilder.append(result);
				}
			}
			if((asc >= 97) && (asc <= 122)) {
				asc -= vector;
				if((asc >= 97) && (asc <= 122)) {
					char result = (char)(asc);
					stringBuilder.append(result);
				}else {
					asc += 26;
					char result = (char)(asc);
					stringBuilder.append(result);
				}
			}
		}
		System.out.println(stringBuilder.toString());
	}
	
	/*
	 * 广义上的凯撒密码解密算法
	 * 理论上可以实现任意字符关于任意移动值的解密
	 */
	public static void ConvertToASCII(String string,int vector) {
		StringBuilder stringBuilder = new StringBuilder();
		char plains[] = string.toCharArray();
		for(int i = 0;i < plains.length;i++) {
			stringBuilder.append((char)(Integer.valueOf(plains[i]).intValue() - vector));
		}
		System.out.println(stringBuilder.toString());
	}
}
