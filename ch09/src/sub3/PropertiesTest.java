package sub3;
/*
 * 2025/07/23
 * 이수연
 * 프로퍼티스 자료구조 실습
 */

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesTest {
	
	 public static void main(String[] args) {
		
		 // 프로퍼티 : 키-값이 모두 문자열인 자료구조
		 Properties prop = new Properties();
		 prop.setProperty("A", "Apple");
		 prop.setProperty("B", "Banana");
		 prop.setProperty("C", "Cherry");
		 System.out.println(prop);
		 
		 // 직렬화
		 String path = "C:\\Users\\GGG\\Desktop\\fruit.properties";
		 
		 try {
			 FileOutputStream fos = new FileOutputStream(path);
			 prop.store(fos, null);			 
			 fos.close();
			 
		 }catch(Exception e) {
			 e.printStackTrace();			 
		 }
		 
		 
		 
	}

}
