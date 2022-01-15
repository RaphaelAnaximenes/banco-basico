package modelos;

public class Conta {
	
	float saldo;
	String conta;
	
	// Account Settings
	
	public Conta(String conta) {
		saldo = 0;
		this.conta = conta;
	
	}
	// Depositar
	public void depositar (float deposito){
		saldo += deposito;
	}
	// Sacar
	public void sacar (float sacar) {
	// Condicional para evitar saque maior que saldo	
		if(sacar > saldo) {
			System.out.println("Erro");
		}
		else {
			saldo -= sacar;
		}
	}
	// Template de saida toString()
	public String toString() {
		return "Saldo da conta "+ (conta)+ " :" +saldo;
	}
	
}
