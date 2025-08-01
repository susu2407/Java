package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferStreamTest {
	 public static void main(String[] args) {
	        // 스트립 생성(파일 연결)
	        String source = "C:\\Users\\GGG\\Desktop\\Person.tif";
	        String target = "C:\\Users\\GGG\\Desktop\\Person2.tif";

	        try {
	            // 기본 스트림 생성(파일 연결)
	            FileInputStream fis = new FileInputStream(source);
	            FileOutputStream fos = new FileOutputStream(target);

	            // 보조 스트립(Buffer) 생성
	            BufferedInputStream bis =  new BufferedInputStream(fis);
	            BufferedOutputStream bos = new BufferedOutputStream(fos);
	            
	            while (true) {
	            	
	            	// 파일 읽기
	                int data = bis.read();   // char

	                if (data == -1)  break; // 파일 내용 없으면


	                bos.write(data); 		// 파일 쓰기
	            }
	            //스트림 작업 종료
	            bis.close();
	            bos.close();
	            
	            fis.close();
	            fos.close();

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        System.out.println("프로그램 종료...");
	    }
}
