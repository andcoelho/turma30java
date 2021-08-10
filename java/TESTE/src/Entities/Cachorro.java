package Entities;

public class Cachorro extends Pet {
	
	private boolean latidoAlto;
	
	//construtor
	public Cachorro(String raca, int anoNascimento, boolean latidoAlto) {
		super(raca, anoNascimento);
		this.latidoAlto = latidoAlto;
	}
	
	//encapsuladores
	public boolean isLatidoAlto() {		
		return latidoAlto;
	}

	public void setLatidoAlto(boolean latidoAlto) {
		this.latidoAlto = latidoAlto;
	}
	
	//metodo
	public void latido() {
		if(latidoAlto == true) {
			System.out.println("\nLatido alto: AU AU AU AU");
		}
		else {
			System.out.println("\nLatido baixo: au au...");
		}
	}
	
	@Override // herança de método da classe abstrata
	public void emiteSom() {
		if(latidoAlto) {
			System.out.println("AU AU AU AU");
		}
		else {
			System.out.println("au au au au...");
		}
		
	}
	
	
	

}
