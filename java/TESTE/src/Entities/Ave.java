package Entities;

public class Ave extends Pet {
	
	private boolean voa;
	
	//construtores
	public Ave(String raca, boolean voa) {
		super(raca);
		this.voa = voa;
	}
	
	//sobrecarga
	public Ave(String raca, int anoNascimento, boolean voa) {
		super(raca, anoNascimento);
		this.voa = voa;
	}
	
	
	public boolean isVoa() {
		return voa;
	}

	public void setVoa(boolean voa) {
		this.voa = voa;
	}
	
	
	

}
