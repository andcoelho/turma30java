package classes;

public class Cavalo extends Animal {

	private boolean correr;

	public Cavalo(String nome, int idade, boolean som, boolean correr) {
		super(nome, idade, som);
		this.correr = correr;
	}
	
	public void corre() {
		if (correr) {
			System.out.printf("\nEsse cavalo corre!");
		}
		else {
			System.out.printf("\nEsse cavalo não corre!");
		}
	}
	
	@Override
	public void emiteSom() {
		System.out.println("\nRiinnn in in");
	}

}
