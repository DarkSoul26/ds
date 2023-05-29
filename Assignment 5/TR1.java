import java.util.*;

public class TR1 {

	public static void main(String[] args) {
		int sender, receiver, token = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of process : ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
			System.out.print(" p" + i);
		System.out.println(" p" + 0);
		while (true) {
			System.out.println("---------------------------------");
			System.out.print("Enter Sender : ");
			sender = sc.nextInt();
			System.out.print("Enter Receiver : ");
			receiver = sc.nextInt();
			System.out.print("Token passes : ");
			for (int i = token; i != sender; i = (i + 1) % n) {
				System.out.print(i + "->");
			}
			System.out.println(sender);

			System.out.print("Enter Data tobe send : ");
			String data = sc.next();
			for (int i = sender; i != receiver; i = (i + 1) % n) {
				System.out.println(data + " forwarded by " + i);
			}
			System.out.println(data + " received at " + receiver);
			token = sender;
			System.out.println("---------------------------------");
		}
	}
}