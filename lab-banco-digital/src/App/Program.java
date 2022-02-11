package App;

import entities.Banco;
import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		Banco bradesco = new Banco("Bradesco");
		
		Banco nubank = new Banco("Nubank");
		
		Cliente anailton = new Cliente("Anailton");
		
		Cliente fred = new Cliente("Fred");
		
		Conta ccAnailton = new ContaCorrente(anailton, bradesco, 1000.00);
		
		Conta cpFred = new ContaPoupanca(fred, nubank, 0);
		
		ccAnailton.depositar(2300.00);
		
		ccAnailton.transferencia(cpFred, 1000.00);

		System.out.println(ccAnailton);
		System.out.println(cpFred);

	}

}
