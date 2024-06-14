package application;

public class Main {

	public static void main(String[] args) {
		
		Cliente denis = new Cliente();
		denis.setNome("Denis");
		
		Conta cc = new ContaCorrente(denis);
		Conta poupanca = new ContaPoupanca(denis);
		
		
		cc.depositar(100);
		cc.transferir(80, poupanca);
		
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato(); 
		
	}

	

}
 