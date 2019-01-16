package xsyu.math1601.syj18;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	// 声明界面组件
	private JTabbedPane showPane;
	private JPanel panel, IDCardPanel, studentNumberPanel, helloPanel, phoneNumberPanel;
	private JLabel lblHello, lblIDNum, lblIDMsg, lblStMsg, lblPhMsg, lblAddress, lblDate, lblAge, lblZodiac, lblConstellation, lblSex,
			lblBackground, lblStudentNumber, lblName, lblEnrollmentYear, lblCollege, lblMajor, lblClass, lblPhoneNumber,
			lblCommunicationOperator, lblQCellCore;
	private JTextField txtIDNum, txtStudentNumber, txtPhoneNumber;
	private JButton btnQuery;
	private CardLayout card;

	public MainFrame() {

		// 标题
		super("多功能信息查询系统");

		// 设置窗体的icon
		ImageIcon icon = new ImageIcon("image/logo.png");
		this.setIconImage(icon.getImage());

		// 设置主面板为CardLayout卡片布局
		card = new CardLayout();
		panel = new JPanel();
		panel.setLayout(card);

		// 信息查询的选项卡面板
		showPane = new JTabbedPane(JTabbedPane.TOP);

		// 将选项卡面板添加到卡片面板中
		panel.add(showPane);

		// 将主面板添加到窗体中
		this.add(panel, BorderLayout.CENTER);

		// 初始化欢迎界面
		initHelloGUI();

		// 初始化身份证号码信息查询界面
		initIDCardQueryGUI();

		// 初始化西石大学号信息查询界面
		initStudentNumberQueryGUI();

		// 初始化手机号码信息查询界面
		initPhoneNumberQueryGUI();

		// 设定窗口大小
		this.setSize(800, 600);
		// 设置窗口大小不可变
		this.setResizable(false);
		// 设置窗口初始化居中
		this.setLocationRelativeTo(null);
		// 设定窗口默认关闭方式为退出程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视
		this.setVisible(true);
	}

	private void initHelloGUI() {
		helloPanel = new JPanel();
		showPane.addTab("<html><font size=5>首页</font></html>", helloPanel);
		helloPanel.setLayout(new GridLayout(1, 1));

		lblHello = new JLabel(new ImageIcon("image/hello.png"));

		lblHello.setBounds(0, 0, 800, 600);
		helloPanel.add(lblHello);
	}

	private void initIDCardQueryGUI() {
		IDCardPanel = new JPanel();
		showPane.addTab("<html><font size=5>身份证号码信息查询</font></html>", IDCardPanel);
		IDCardPanel.setLayout(null);

		lblIDNum = new JLabel("身份证号码：");
		lblIDMsg = new JLabel();
		lblAge = new JLabel();
		lblSex = new JLabel();
		lblZodiac = new JLabel();
		lblConstellation = new JLabel();
		lblDate = new JLabel();
		lblAddress = new JLabel();
		lblBackground = new JLabel(new ImageIcon("image/background.png"));
		// 设置标签的文字颜色
		lblIDNum.setForeground(Color.white);
		lblIDMsg.setForeground(Color.red);
		// 设置标签的文字的字体
		lblIDNum.setFont(new Font("楷体", Font.PLAIN, 20));
		lblIDMsg.setFont(new Font("楷体", Font.PLAIN, 40));
		lblAge.setFont(new Font("楷体", Font.PLAIN, 25));
		lblSex.setFont(new Font("楷体", Font.PLAIN, 25));
		lblZodiac.setFont(new Font("楷体", Font.PLAIN, 25));
		lblConstellation.setFont(new Font("楷体", Font.PLAIN, 25));
		lblDate.setFont(new Font("楷体", Font.PLAIN, 25));
		lblAddress.setFont(new Font("楷体", Font.PLAIN, 25));
		// 创建一个长度为20的文本框
		txtIDNum = new JTextField(20);
		txtIDNum.setFont(new Font("宋体", Font.PLAIN, 20));
		// 创建按钮
		btnQuery = new JButton("查询");
		btnQuery.setFont(new Font("宋体", Font.PLAIN, 20));
		btnQuery.addActionListener(new IDCardQueryListener());

		lblIDNum.setBounds(100, 50, 120, 35);
		txtIDNum.setBounds(230, 50, 300, 35);
		btnQuery.setBounds(550, 50, 120, 35);

		lblIDMsg.setBounds(150, 200, 500, 50);

		lblAge.setBounds(150, 150, 200, 50);
		lblSex.setBounds(400, 150, 200, 50);
		lblZodiac.setBounds(150, 200, 200, 50);
		lblConstellation.setBounds(400, 200, 200, 50);
		lblDate.setBounds(150, 250, 500, 50);
		lblAddress.setBounds(150, 300, 500, 50);

		lblBackground.setBounds(0, 0, 800, 535);

		IDCardPanel.add(lblIDNum);
		IDCardPanel.add(txtIDNum);
		IDCardPanel.add(lblIDMsg);
		IDCardPanel.add(lblAge);
		IDCardPanel.add(lblSex);
		IDCardPanel.add(lblZodiac);
		IDCardPanel.add(lblConstellation);
		IDCardPanel.add(lblDate);
		IDCardPanel.add(lblAddress);
		IDCardPanel.add(btnQuery);
		IDCardPanel.add(lblBackground);
	}

	private void initStudentNumberQueryGUI() {
		studentNumberPanel = new JPanel();
		showPane.addTab("<html><font size=5>西石大学号信息查询</font></html>", studentNumberPanel);
		studentNumberPanel.setLayout(null);

		lblStudentNumber = new JLabel("学生学号：");
		lblStMsg = new JLabel();
		lblName = new JLabel();
		lblEnrollmentYear = new JLabel();
		lblCollege = new JLabel();
		lblMajor = new JLabel();
		lblClass = new JLabel();
		lblBackground = new JLabel(new ImageIcon("image/background.png"));

		// 设置标签的文字颜色
		lblStudentNumber.setForeground(Color.white);
		lblStMsg.setForeground(Color.red);

		// 设置标签的文字的字体
		lblStudentNumber.setFont(new Font("楷体", Font.PLAIN, 20));
		lblStMsg.setFont(new Font("楷体", Font.PLAIN, 40));
		lblName.setFont(new Font("楷体", Font.PLAIN, 25));
		lblEnrollmentYear.setFont(new Font("楷体", Font.PLAIN, 25));
		lblCollege.setFont(new Font("楷体", Font.PLAIN, 25));
		lblMajor.setFont(new Font("楷体", Font.PLAIN, 25));
		lblClass.setFont(new Font("楷体", Font.PLAIN, 25));

		// 创建一个长度为20的文本框
		txtStudentNumber = new JTextField(20);
		txtStudentNumber.setFont(new Font("宋体", Font.PLAIN, 20));
		// 创建按钮
		btnQuery = new JButton("查询");
		btnQuery.setFont(new Font("宋体", Font.PLAIN, 20));
		btnQuery.addActionListener(new StudentNumberQueryListener());

		lblStudentNumber.setBounds(100, 50, 120, 35);
		txtStudentNumber.setBounds(230, 50, 300, 35);
		btnQuery.setBounds(550, 50, 120, 35);
		lblStMsg.setBounds(150, 200, 500, 50);
		lblName.setBounds(150, 150, 500, 50);
		lblEnrollmentYear.setBounds(150, 200, 500, 50);
		lblCollege.setBounds(150, 250, 500, 50);
		lblMajor.setBounds(150, 300, 500, 50);
		lblClass.setBounds(150, 350, 500, 50);
		lblBackground.setBounds(0, 0, 800, 535);

		studentNumberPanel.add(lblStudentNumber);
		studentNumberPanel.add(txtStudentNumber);
		studentNumberPanel.add(lblStMsg);
		studentNumberPanel.add(lblName);
		studentNumberPanel.add(lblEnrollmentYear);
		studentNumberPanel.add(lblCollege);
		studentNumberPanel.add(lblMajor);
		studentNumberPanel.add(lblClass);
		studentNumberPanel.add(btnQuery);
		studentNumberPanel.add(lblBackground);
	}

	private void initPhoneNumberQueryGUI() {
		phoneNumberPanel = new JPanel();
		showPane.addTab("<html><font size=5>手机号码信息查询</font></html>", phoneNumberPanel);
		phoneNumberPanel.setLayout(null);

		lblPhoneNumber = new JLabel("手机号：");
		lblPhMsg = new JLabel();
		lblCommunicationOperator = new JLabel();
		lblQCellCore = new JLabel();
		lblBackground = new JLabel(new ImageIcon("image/background.png"));

		// 设置标签的文字颜色
		lblPhoneNumber.setForeground(Color.white);
		lblPhMsg.setForeground(Color.red);

		// 设置标签的文字的字体
		lblPhoneNumber.setFont(new Font("楷体", Font.PLAIN, 20));
		lblPhMsg.setFont(new Font("楷体", Font.PLAIN, 40));
		lblCommunicationOperator.setFont(new Font("楷体", Font.PLAIN, 25));
		lblQCellCore.setFont(new Font("楷体", Font.PLAIN, 25));

		// 创建一个长度为20的文本框
		txtPhoneNumber = new JTextField(20);
		txtPhoneNumber.setFont(new Font("宋体", Font.PLAIN, 20));
		// 创建按钮
		btnQuery = new JButton("查询");
		btnQuery.setFont(new Font("宋体", Font.PLAIN, 20));
		btnQuery.addActionListener(new PhoneNumberQueryListener());

		lblPhoneNumber.setBounds(100, 50, 120, 35);
		txtPhoneNumber.setBounds(230, 50, 300, 35);
		btnQuery.setBounds(550, 50, 120, 35);
		lblPhMsg.setBounds(150, 200, 500, 50);
		lblCommunicationOperator.setBounds(150, 150, 500, 50);
		lblQCellCore.setBounds(150, 200, 500, 50);
		lblBackground.setBounds(0, 0, 800, 535);

		phoneNumberPanel.add(lblPhoneNumber);
		phoneNumberPanel.add(txtPhoneNumber);
		phoneNumberPanel.add(btnQuery);
		phoneNumberPanel.add(lblPhMsg);
		phoneNumberPanel.add(lblCommunicationOperator);
		phoneNumberPanel.add(lblQCellCore);
		phoneNumberPanel.add(lblBackground);
	}

	private class IDCardQueryListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			lblIDMsg.setText("");
			lblAge.setText("");
			lblSex.setText("");
			lblZodiac.setText("");
			lblConstellation.setText("");
			lblDate.setText("");
			lblAddress.setText("");
			IDCardQuery idcq = new IDCardQuery();
			String strIDNum = txtIDNum.getText();
			if (strIDNum.length() != 18) {
				lblIDMsg.setText("输入的身份证号不合法!");
			} else {
				char[] a = strIDNum.toCharArray();
				int[] b = new int[18];
				for (int i = 0; i < a.length; i++) {
					b[i] = (int) (a[i] - '0');
				}
				char c = a[17];

				if (idcq.legal(c, b)) {
					lblAddress.setText("所在地：" + idcq.getAddress(a));
					lblDate.setText("出生日期：" + idcq.getDate(b));
					lblAge.setText("年龄：" + idcq.getAge(b));
					lblZodiac.setText("生肖：" + idcq.getZodiac(b));
					lblConstellation.setText("星座：" + idcq.getConstellation(b));
					lblSex.setText("性别：" + idcq.getSex(b));
				} else {
					lblIDMsg.setText("输入的身份证号不合法!");
				}
			}
		}

	}

	private class StudentNumberQueryListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			lblStMsg.setText("");
			lblName.setText("");
			lblEnrollmentYear.setText("");
			lblCollege.setText("");
			lblMajor.setText("");
			lblClass.setText("");

			StudentNumberQuery sncq = new StudentNumberQuery();
			String strStudentNumber = txtStudentNumber.getText();
			if (strStudentNumber.length() != 12) {
				lblStMsg.setText("输入的学号不合法!");
			} else if (sncq.legal(strStudentNumber)) {
				lblName.setText("姓名：" + sncq.getName(strStudentNumber));
				lblEnrollmentYear.setText("入学年份：" + sncq.getEnrollmentYear(strStudentNumber));
				lblCollege.setText("院系：" + sncq.getCollege(strStudentNumber));
				lblMajor.setText("专业：" + sncq.getMajor(strStudentNumber));
				lblClass.setText("行政班级：" + sncq.getClass(strStudentNumber));
			} else {
				lblStMsg.setText("输入的学号不合法!");
			}
		}
	}

	private class PhoneNumberQueryListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			lblPhMsg.setText("");
			lblCommunicationOperator.setText("");
			lblQCellCore.setText("");

			PhoneNumberQuery pncq = new PhoneNumberQuery();
			String strPhoneNumber = txtPhoneNumber.getText();
			if (strPhoneNumber.length() != 11) {
				lblPhMsg.setText("输入的手机号不合法!");
			} else {
				char[] a = strPhoneNumber.toCharArray();
				int[] b = new int[11];
				for (int i = 0; i < a.length; i++) {
					b[i] = (int) (a[i] - '0');
				}

				if (pncq.legal(b)) {
					lblCommunicationOperator.setText("通信运行商：" + pncq.getCommunicationOperator(b));
					lblQCellCore.setText("手机号归属地：" + pncq.getQCellCore(a));
				} else {
					lblPhMsg.setText("输入的手机号不合法!");
				}
			}
		}
	}
}