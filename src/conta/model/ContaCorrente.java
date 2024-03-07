package conta.model;

// Relação de Herança -> ContaCorrente herda características da superclasse Conta
public class ContaCorrente extends Conta { 
	
	private float limite; // limite é um atributo próprio da classe ContaCorrente

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}
	
	// Métodos de Acesso
	public float getLimite() {
		return limite;
	}
	
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	// Métodos Específico 
	// Polimorfismo de Sobrescrita
	@Override
	public boolean sacar(float valor) {
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiete!");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}
}

