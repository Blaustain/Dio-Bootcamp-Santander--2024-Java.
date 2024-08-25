
public class Main {

	public static void main(String[] args) {
		Cliente Shmuel = new Cliente();
		Shmuel.setNome("Shmuel");
		
		Conta cc = new ContaCorrente(Shmuel);
		Conta poupanca = new ContaPoupanca(Shmuel);

		cc.depositar(300);
		cc.transferir(300, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
