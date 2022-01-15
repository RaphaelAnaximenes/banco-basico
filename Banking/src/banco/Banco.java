package banco;
//================================
// Estudo por AnxDev, Java Essentials 1.
//================================
import modelos.Conta;

public class Banco {

	public static void main(String[] args) {
		Conta a = new Conta("Conta A");
		Conta b = new Conta("Conta B");
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		// INPUT em A
		System.out.println("Inserindo 200 em A.");
		a.depositar(200);
		System.out.println(a.toString());
		
		// INPUT em B
		System.out.println("Inserindo 3500 em B.");
		b.depositar(3500);
		System.out.println(b.toString());

		// SAQUE
		System.out.println("Saque 100 e 3200, A e B, respectivamente.");
		a.sacar(100);
		b.sacar(3200);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
	
	}
	

}
