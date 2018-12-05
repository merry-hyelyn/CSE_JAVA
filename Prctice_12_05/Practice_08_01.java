import java.io.*;
import java.util.Scanner;

public class Practice_08_01 {

	public static void main(String[] args) {
		System.out.println("전화번호 입력 프로그램입니다.");
		Scanner s = new Scanner(System.in);
		FileWriter fout = null;
		try {
			fout = new FileWriter("c:\\temp\\phone.txt");
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String line = s.nextLine();
				if(line.equals("그만"))
					break;
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);
			}
			fout.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		s.close();
	}

}
