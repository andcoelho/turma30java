package Entities;

public class Gato extends Pet {
	
	private boolean miadoAlto;

	public Gato(String raca, int anoNascimento, boolean miadoAlto) {
		super(raca, anoNascimento);
		this.miadoAlto = miadoAlto;
	}

	public boolean isMiadoAlto() {
		return miadoAlto;
	}

	public void setMiadoAlto(boolean miadoAlto) {
		this.miadoAlto = miadoAlto;
	}
	
	@Override // heran?a de m?todo da classe abstrata
	public void emiteSom() {
		if(miadoAlto) {
			System.out.println("MIAU MIAU MIAU");
		}
		else {
			System.out.println("miau miau miau");
		}
		
	}

}
