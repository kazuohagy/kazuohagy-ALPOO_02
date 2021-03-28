import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int rep = sc.nextInt();
		Quartos[] vetor = new Quartos[10];
		
		int n =1;
		for(int i = 0;i<rep;i++) {
			
			System.out.println("Rent #" + n);
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Quartos: ");
			int quartos = sc.nextInt();
			
			vetor[quartos] = new Quartos(name,email,quartos);
			
			
			n++;
		}
		System.out.println("Busy rooms:");
		for (int i = 0; i < vetor.length;i++) {
			if(vetor[i] != null) {
				System.out.println(i +": "+ vetor[i]);
			}
		}
		
	}
}
