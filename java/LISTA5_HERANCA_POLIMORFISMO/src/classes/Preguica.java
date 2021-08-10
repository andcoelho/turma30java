package classes;

public class Preguica extends Animal {
	 
	private boolean subir;

	public Preguica(String nome, int idade, boolean som, boolean subir) {
		super(nome, idade, som);
		this.subir = subir;
	}
	
	public void subir() {
		if (subir) {
			System.out.printf("\nEssa pregui�a sobe em �rvore!");
		}
		else {
			System.out.printf("\nEssa pregui�a n�o sobe em �rvore!");
		}
	}
	
	@Override
	public void emiteSom() {
		System.out.println("\nhmmmmmm q soninho");
	}
	
	
		
}
