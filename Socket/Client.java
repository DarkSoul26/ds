import java.util.*;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        int num, temp;
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("127.0.0.1", 1342);
        Scanner sc1 = new Scanner(s.getInputStream());
        System.out.println("Enter number: ");
        num = sc.nextInt();
        PrintStream p = new PrintStream(s.getOutputStream());
        p.println(num);
        temp = sc1.nextInt();
        System.out.println(temp);
        sc.close();
        s.close();
    }
}