package Window;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Caesar {
	
	public static void main(String []args) {
		
		JFrame jframe = new JFrame("Caesar");
		JPanel jpanel1 = new JPanel();
		JPanel jpanel2 = new JPanel();
		JPanel jpanel3 = new JPanel();
		
		JTextArea jtextarea1 = new JTextArea(5,20);
		JTextArea jtextarea2 = new JTextArea(5,20);
		
		JLabel jlabel = new JLabel("λ��");
		
		JComboBox<String> jcombobox = new JComboBox<String>();
		jcombobox.addItem("--λ��--");
		for(int i = 1;i <= 25;i++) {
			jcombobox.addItem(i+"");
		}
		
		JButton jbutton1 = new JButton("����");
		JButton jbutton2 = new JButton("����");
		
		jbutton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String plain = jtextarea1.getText().toString();
				int vector = Integer.valueOf(jcombobox.getSelectedItem().toString());
				String result = Encry(plain,vector);
				jtextarea2.setText(result);
			}
		});
		
		jbutton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String plain = jtextarea1.getText().toString();
				int vector = Integer.valueOf(jcombobox.getSelectedItem().toString());
				String result = Decry(plain,vector);
				jtextarea2.setText(result);
			}
			
		});
		
		jframe.add(jpanel1,BorderLayout.NORTH);
		jframe.add(jpanel2,BorderLayout.CENTER);
		jframe.add(jpanel3,BorderLayout.SOUTH);
		
		jpanel1.add(jtextarea1);
		jpanel3.add(jtextarea2);
		
		jpanel2.add(jlabel);
		jpanel2.add(jcombobox);
		jpanel2.add(jbutton1);
		jpanel2.add(jbutton2);
		
		jframe.setBounds(200, 200, 500, 500);//���ý����С��λ��
		jframe.setDefaultLookAndFeelDecorated(true);//�������۽���
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);//���ùرմ����˳�����
		jframe.pack();//���ô�����ʾ
		jframe.setVisible(true);//���ô��ڿ��ӻ�
	}
	
	//��������ļ����㷨
	public static String Encry(String string,int vector) {
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
		return stringBuilder.toString();
	}
	
	//��������Ľ����㷨
	public static String Decry(String string,int vector) {
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
		return stringBuilder.toString();
	}

}
