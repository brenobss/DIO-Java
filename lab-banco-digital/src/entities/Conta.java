package entities;

public abstract class Conta {
	
	private static final int AGENCIA_PADRAO = 11;
	private static int NUMERO_SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;
	protected Banco banco;
	
	public Conta(Cliente cliente, Banco banco, double saldo) {
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = NUMERO_SEQUENCIAL++;
		this.saldo = saldo;
		this.banco = banco;
		this.cliente = cliente;
	}
	public int getAgencia() {
		return agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	
	public void transferencia(Conta contaDestino, double valor) {
		sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public String toString() {
		return "Títular da conta: " + cliente.getNome() + "\n"
		+ "Banco: " + banco.getNome() + "\n"
		+ "Agência: " + agencia + "\n"
		+ "Número da Conta: " + numeroConta + "\n"
		+ "Saldo: " + String.format("%.2f", saldo) + "\n";
	}
	
	
	
	
}
