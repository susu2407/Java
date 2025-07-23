package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 날짜 : 2025/07/23
 * 이름 : 이수연
 * 내용 : 자바 파일 입출력 스트림 실습
 */

public class StreamTest {

    public static void main(String[] args) {
        // 스트립 생성(파일 연결)
        String source = "C:\\Users\\GGG\\Desktop\\sample1.txt";
        String target = "C:\\Users\\GGG\\Desktop\\sample2.txt";

        try {
            // 바이트 스트림
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(target);

            // 문자 스트림
            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(target);

            while (true) {
                int data = fis.read();  // byte
                int text = fr.read();   // char

                if (data == -1 || text == -1) break;

                // 출력 (문자 스트림 기준으로)
                char ch2 = (char) text;
                System.out.print(ch2);

                fos.write(data); // 바이트 스트림 쓰기
                fw.write(text);  // 문자 스트림 쓰기
            }

            fis.close();
            fos.close();
            fr.close();
            fw.close();

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("입출력 오류 발생");
            e.printStackTrace();
        }

        System.out.println("프로그램 종료...");
    }
}
