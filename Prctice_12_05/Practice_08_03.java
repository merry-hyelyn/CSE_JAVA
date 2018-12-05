import java.io.*;

public class Practice_08_03 {

	public static void main(String[] args) {
		FileReader fi = null;
		try {
			fi = new FileReader("c:\\windows\\system.ini");
			int c;
			while((c = fi.read())!=-1) {
				c = Character.toUpperCase(c);
				System.out.print((char)c);
			}
			fi.close();
		}catch(IOException e ) {
			System.out.println("입출력 오류");
		}
	}
}
