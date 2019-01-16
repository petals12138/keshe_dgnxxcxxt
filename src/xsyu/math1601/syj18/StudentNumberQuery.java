package xsyu.math1601.syj18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class StudentNumberQuery {
	
	static Map<String, StNumInformation> map = new HashMap<String, StNumInformation>();
	static {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("Database/StudentInformation.csv"));
			reader.readLine();// 第一行信息，为标题信息
			String line = null;

			while ((line = reader.readLine()) != null) {
				StNumInformation snif = new StNumInformation();
				String item[] = line.split(",");
				snif.setName(item[1]);
				snif.setEnrollmentYear(item[2]);
				snif.setCollege(item[3]);
				snif.setMajor(item[4]);
				snif.setClasses(item[5]);
				map.put(item[0], snif);
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

	public boolean legal(String str) {
		if(map.get(str) == null) {
			return false;
		} else {
			return true;
		}
	}

	public String getName(String str) {
		
		return map.get(str).getName();
	}
	
	public String getEnrollmentYear(String str) {
		return map.get(str).getEnrollmentYear();
	}

	public String getCollege(String str) {
		return map.get(str).getCollege();
	}

	public String getMajor(String str) {
		return map.get(str).getMajor();
	}

	public String getClass(String str) {
		return map.get(str).getClasses();
	}
}
