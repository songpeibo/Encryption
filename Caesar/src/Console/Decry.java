package Console;

import java.util.Scanner;

public class Decry {
	
	/*
	 * ���ҵ���֪�У����ܺͽ�����һ�����㷨3
	 * �����㷨����ʹ�ü���ʵ��
	 * �����㷨Ҳ����ʹ�üӣ��ƶ����������ڵ���������ʵ��
	 * �����������ַ���������������ϵĿ�����������
	 * ��Թ����ϵĿ���������ܣ�һ����Բ��ü�������Ϊ�ӷ����ڹ��󣨱����ж�����ھ��ж��
	 */
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int vector = sc.nextInt();
		Decry(input,vector);
		//ConvertToASCII(input,vector);
	}
	
	/* 
	 * �����ϵĿ�����������㷨
	 * ����ʵ��a-z�Լ�A-Z֮��Ľ���
	 * �㷨��25Ϊ�ƶ����ڣ�����25��Ҫ��26������27Ϊ1���е�����ѭ������
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
	 * �����ϵĿ�����������㷨
	 * �����Ͽ���ʵ�������ַ����������ƶ�ֵ�Ľ���
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
