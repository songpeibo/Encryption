package Console;

import java.util.Scanner;

public class Encry {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int vector = sc.nextInt();
		Encry(input,vector);
		//ConvertToASCII(input,vector);
	}
	
	/*
	 * 狭义上的凯撒密码加密算法
	 * 可以实现a-z以及A-Z之间的加密
	 * 算法以25为移动周期，超过25需要减26，例如27为1，有点类似循环加密
	 */
	public static void Encry(String string,int vector) {
		StringBuilder stringBuilder = new StringBuilder();
		char plains[] = string.toCharArray();
		for(int i = 0;i < plains.length;i++) {
			int asc = Integer.valueOf(plains[i]);
			if((asc >= 65) && (asc <= 90)) {
				asc += vector;
				if((asc >= 65) && (asc <= 90)) {
					char result = (char)(asc);
					stringBuilder.append(result);
				}else {
					asc -= 26;
					char result = (char)(asc);
					stringBuilder.append(result);
				}
			}
			if((asc >= 97) && (asc <= 122)) {
				asc += vector;
				if((asc >= 97) && (asc <= 122)) {
					char result = (char)(asc);
					stringBuilder.append(result);
				}else {
					asc -= 26;
					char result = (char)(asc);
					stringBuilder.append(result);
				}
			}
		}
		System.out.println(stringBuilder.toString());
	}
	
	/*
	 * 广义上的凯撒密码加密算法
	 * 理论上可以实现任意字符关于任意移动值的加密
	 */
	public static void ConvertToASCII(String string,int vector) {
		StringBuilder stringBuilder = new StringBuilder();
		char plains[] = string.toCharArray();
		for(int i = 0;i < plains.length;i++) {
			stringBuilder.append((char)(Integer.valueOf(plains[i]).intValue() + vector));
		}
		System.out.println(stringBuilder.toString());
	}

}