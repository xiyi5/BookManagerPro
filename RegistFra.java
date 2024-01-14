import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class RegistFra {
	public RegistFra(){
		DBconnect db=new DBconnect();
		JFrame frame=new JFrame("用户注册");
		JPanel p1=new JPanel();
		JLabel l1=new JLabel("用户注册");
		l1.setFont(new Font("微软雅黑", 0, 35));
		p1.add(l1);

		JPanel p2=new JPanel();
		JLabel l2=new JLabel("用户名：");
		JTextField f2=new JTextField(15);

		p2.add(l2);
		p2.add(f2);

		JPanel p3=new JPanel();
		JLabel l3=new JLabel("密码：");
		JTextField f3=new JTextField(15);
		p3.add(l3);
		p3.add(f3);

		JPanel p4=new JPanel();
		JLabel l4=new JLabel("手机号");
		JTextField f4=new JTextField(15);
		p4.add(l4);
		p4.add(f4);

		JPanel p5=new JPanel();
		JLabel l5=new JLabel("验证码：");
		JTextField f5=new JTextField(5);
		p5.add(l5);
		p5.add(f5);

		JPanel p6=new JPanel();
		JButton b1=new JButton("注册");
		JButton b2=new JButton("前往登录页面");
		
		
		JPanel p7=new JPanel();
		JLabel l7=new JLabel("你的密保问题：");
		JTextField f7=new JTextField(15);
		p7.add(l7);
		p7.add(f7);

		JPanel p8=new JPanel();
		JLabel l8=new JLabel("答案：");
		JTextField f8=new JTextField(15);
		p8.add(l8);
		p8.add(f8);

		JPanel p9=new JPanel();
		JLabel l9=new JLabel("姓名：");
		JTextField f9=new JTextField(15);
		p9.add(l9);
		p9.add(f9);

		JPanel p10=new JPanel();
		JLabel l10=new JLabel("性别：");
		ButtonGroup bGroup=new ButtonGroup();
		JRadioButton b10=new JRadioButton("男");
		JRadioButton b11=new JRadioButton("女");
		bGroup.add(b10);bGroup.add(b11);
		p10.add(l10);
		p10.add(b10);p10.add(b11);


		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				String sex;
				if (b10.isSelected()) {
					sex="男";
				}else sex="女";
				db.regist(f2.getText(), f9.getText(), sex, f3.getText(), f4.getText(), f7.getText(), f8.getText());
				JOptionPane.showMessageDialog(null,"注册成功");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				frame.dispose();
				new LoginFra();
			}
		});
		p6.add(b1);
		p6.add(b2);


		frame.add(p1);
		frame.add(p2);
		frame.add(p9);
		frame.add(p10);
		frame.add(p3);
		frame.add(p4);
		frame.add(p7);
		frame.add(p8);
		frame.add(p5);
		frame.add(p6);
		frame.setBounds(650,200,700,600);
		frame.setLayout(new GridLayout(10,1));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
	}
}