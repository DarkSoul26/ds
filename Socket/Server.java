import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

	public static void main(String args[]) throws IOException {
		int num, temp;
		ServerSocket s = new ServerSocket(1342);
		Socket s1 = s.accept();
		Scanner sc = new Scanner(s1.getInputStream());
		num = sc.nextInt();
		temp = num * 2;

		PrintStream p = new PrintStream(s1.getOutputStream());
		p.println(temp);
	}
}