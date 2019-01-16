package xsyu.math1601.syj18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PhoneNumberQuery {
	private String communicationOperator;
	private String QCellCore;
	static Map<String, String> map = new HashMap<String, String>();
	static {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("Database/QCellCore.csv"));
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

	public boolean legal(int[] b) {
		for (int i : b) {
			if (i < 0 || i > 9) {
				return false;
			}
		}
		return true;
	}

	public String getCommunicationOperator(int[] b) {
		int sum;
		sum = b[0] * 100 + b[1] * 10 + b[2];
		switch (sum) {
		case 134:
		case 135:
		case 136:
		case 137:
		case 138:
		case 139:
		case 147:
		case 148:
		case 150:
		case 151:
		case 152:
		case 157:
		case 158:
		case 159:
		case 182:
		case 183:
		case 184:
		case 187:
		case 188:
		case 178:
		case 198:
			communicationOperator = "中国移动";
			break;
		case 130:
		case 131:
		case 132:
		case 140:
		case 145:
		case 146:
		case 155:
		case 156:
		case 166:
		case 185:
		case 186:
		case 175:
		case 176:
			communicationOperator = "中国联通";
			break;
		default:
			communicationOperator = "中国电信";
			break;
		}
		return communicationOperator;
	}

	public String getQCellCore(char[] a) {
		String str = new String();
		for (int i = 0; i < 7; i++) {
			String s = String.valueOf(a[i]);
			str = str + s;
		}
		QCellCore = map.get(str);
		return QCellCore;
	}
}
