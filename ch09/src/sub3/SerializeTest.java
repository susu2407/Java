package sub3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializeTest {
	
	public static void main(String[] args) {
		
		// 직렬화를 위해 Serializable 인터페이스 구현된 객체 -> 에러가 안뜸. -> run(apple 파일이 생성됨.)
		Apple apple = new Apple("한국", 3000);
		
		String path = "C:\\Users\\GGG\\Desktop\\apple.data";
		
		try {
			// 직렬화를 위한 기본스트림과 보조스트림 생성
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutput oos = new ObjectOutputStream(fos);
			
			// 객제 직렬화
			oos.writeObject(apple);
			
			// 스트림 종료
			oos.close();
			fos.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}

}
