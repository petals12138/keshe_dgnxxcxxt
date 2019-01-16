package xsyu.math1601.syj18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class IDCardQuery {
	private String address;
	private static Map<String, String> map = new HashMap<String, String>();
	static {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("Database/IDCardInfo.csv"));
			reader.readLine();// 第一行信息，为标题信息
			String line = null;

			while ((line = reader.readLine()) != null) {
				String item[] = line.split(",");// CSV格式文件为逗号分隔符文件，这里根据逗号切分
				map.put(item[0], item[1]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean legal(char c, int[] b) {
		int sum = 0, d, m = 0;
		sum = b[0] * 7 + b[1] * 9 + b[2] * 10 + b[3] * 5 + b[4] * 8 + b[5] * 4 + b[6] * 2 + b[7] * 1 + b[8] * 6
				+ b[9] * 3 + b[10] * 7 + b[11] * 9 + b[12] * 10 + b[13] * 5 + b[14] * 8 + b[15] * 4 + b[16] * 2;
		d = sum % 11;
		switch (d) {// 1 0 X 9 8 7 6 5 4 3 2
		case 0:
			if (c == '1')
				m = 1;
			break;
		case 1:
			if (c == '0')
				m = 1;
			break;
		case 2:
			if (c == 'X' || c == 'x')
				m = 1;
			break;
		case 3:
			if (c == '9')
				m = 1;
			break;
		case 4:
			if (c == '8')
				m = 1;
			break;
		case 5:
			if (c == '7')
				m = 1;
			break;
		case 6:
			if (c == '6')
				m = 1;
			break;
		case 7:
			if (c == '5')
				m = 1;
			break;
		case 8:
			if (c == '4')
				m = 1;
			break;
		case 9:
			if (c == '3')
				m = 1;
			break;
		case 10:
			if (c == '2')
				m = 1;
			break;
		}
		if (m != 1 || b[6] > 2 || b[10] > 1 || b[12] > 3) {
			return false;
		} else {
			return true;
		}
	}

	public String getDate(int[] b) {
		String s = new String();
		s = ""+b[6] + b[7] + b[8] + b[9] + "年" + b[10] + b[11] + "月" + b[12] + b[13] + "日";
		return s;
	}

	public String getAge(int[] b) {
		int sum, age;
		String s = new String();
		sum = b[6] * 1000 + b[7] * 100 + b[8] * 10 + b[9];
		age = 2018 - sum;
		s = ""+age;
		return s;
	}

	public String getConstellation(int[] b) {
		String s = new String();
		int sum;
		sum = b[10] * 1000 + b[11] * 100 + b[12] * 10 + b[13];
		if (sum >= 1222 || sum <= 119) {
			s = "摩羯座";
		} else if (sum >= 1123) {
			s = "射手座";
		} else if (sum >= 1024) {
			s = "天蝎座";
		} else if (sum >= 923) {
			s = "天秤座";
		} else if (sum >= 823) {
			s = "处女座";
		} else if (sum >= 723) {
			s = "狮子座";
		} else if (sum >= 622) {
			s = "巨蟹座";
		} else if (sum >= 521) {
			s = "双子座";
		} else if (sum >= 420) {
			s = "金牛座";
		} else if (sum >= 321) {
			s = "白羊座";
		} else if (sum >= 219) {
			s = "双鱼座";
		} else {
			s = "水瓶座";
		}
		return s;
	}

	public String getZodiac(int[] b) {
		int sum, age, m;
		String s = new String();
		sum = b[6] * 1000 + b[7] * 100 + b[8] * 10 + b[9];
		age = 2018 - sum;
		m = age % 12;
		switch (m) {
		case 0:
			s = "犬";
			break;
		case 1:
			s = "鸡";
			break;
		case 2:
			s = "猴";
			break;
		case 3:
			s = "羊";
			break;
		case 4:
			s = "马";
			break;
		case 5:
			s = "蛇";
			break;
		case 6:
			s = "龙";
			break;
		case 7:
			s = "兔";
			break;
		case 8:
			s = "虎";
			break;
		case 9:
			s = "牛";
			break;
		case 10:
			s = "鼠";
			break;
		case 11:
			s = "猪";
			break;
		}
		return s;
	}

	public String getSex(int[] b) {
		String s = new String();
		if (b[16] % 2 == 0) {
			s = "女";
			return s;
		} else {
			s = "男";
			return s;
		}
	}

	public String getAddress(char[] a) {
		String str = new String();
		for (int i = 0; i < 6; i++) {
			String s = String.valueOf(a[i]);
			str = str + s;
		}
		address = map.get(str);
		return address;
	}
}
