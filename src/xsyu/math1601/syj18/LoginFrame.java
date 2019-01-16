package xsyu.math1601.syj18;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame {
	private static final String USER = "root";
	private static final String PASSWORD = "1234";
	// 主面板
	private JPanel panel;
	// 标签
	private JLabel lblName, lblPwd, lblMsg;
	// 用户名，文本框
	private JTextField txtName;
	// 密码，密码框
	private JPasswordField txtPwd;
	// 登录，按钮
	private JButton btnOK;

	public LoginFrame() {
		super("Login");
		// 创建面板，布局为null
		panel = new JPanel(null);
		// 实例化两个标签
		lblName = new JLabel("用户名");
		lblPwd = new JLabel("密    码");
		lblMsg = new JLabel();
		// 设置标签的文字为红色
		lblMsg.setForeground(Color.red);
		// 创建一个长度为20的文本框
		txtName = new JTextField(20);
		// 创建一个长度为20的密码框
		txtPwd = new JPasswordField(20);
		// 设置密码显示的字符为*
		txtPwd.setEchoChar('*');
		// 创建按钮
		btnOK = new JButton("登录");
		// 登录按钮的事件处理
		btnOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 设置信息标签为空，清空原来历史信息
				lblMsg.setText("");
				// 获取用户输入的用户名
				String strName = txtName.getText();
				if (strName == null || strName.equals("")) {
					lblMsg.setText("用户名不能为空");
					return;
				}
				if (strName.equals(USER)) {
					// 获取用户输入的密码
					String strPwd = new String(txtPwd.getPassword());
					if (strPwd == null || strPwd.equals("")) {
						lblMsg.setText("密码不能为空");
						return;
					} else {
						// 判断用户密码是否正确
						if (strPwd.equals(PASSWORD)) {
							lblMsg.setText("登录成功");
							// 登录成功，隐藏登录窗口
							LoginFrame.this.setVisible(false);
							// 显示主窗口
							new MainFrame();
						} else {
							lblMsg.setText("密码输入错误");
							return;
						}
					}
				} else {
					lblMsg.setText("用户名不存在");
					return;
				}
			}
		});
		// 定位所有组件
		lblName.setBounds(70, 50, 50, 30);
		txtName.setBounds(120, 50, 200, 30);
		lblPwd.setBounds(70, 100, 50, 30);
		txtPwd.setBounds(120, 100, 200, 30);
		lblMsg.setBounds(150, 130, 100, 50);
		btnOK.setBounds(170, 180, 60, 30);
		panel.add(lblName);
		panel.add(txtName);
		panel.add(lblPwd);
		panel.add(txtPwd);
		panel.add(lblMsg);
		panel.add(btnOK);
		// 将面板添加到窗体中
		this.add(panel);
		// 设定窗口大小
		this.setSize(400, 300);
		// 设置窗口初始化居中
		this.setLocationRelativeTo(null);
		// 设定窗口默认关闭方式为退出程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new LoginFrame();
	}
}

