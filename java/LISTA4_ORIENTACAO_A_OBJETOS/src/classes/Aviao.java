package classes;

public class Aviao {
	
	public String nomePiloto;
	public String nomeCopiloto;
	public String nomeAviao;
	public int numeroPassageiros;
	public boolean ativo;
	
	public void pilotoNome () {
		System.out.println("Nome do Piloto: " + nomePiloto);		
	}
	
	public void copilotoNome() {
		System.out.println("Nome Copiloto: " + nomeCopiloto);
	}
	
	public void aviaoNome() {
		System.out.println("Nome avi�o: " + nomeAviao);
	}
	
	public void passageirosNumero () {
		System.out.println("N�mero de passageiros: " + numeroPassageiros);
	}
	
	public void situacao () {
		if (ativo == true) {
			System.out.println("Avi�o voando");
		}
		else if (ativo == false) {
			System.out.println("Avi�o pousado");
		}
	}
	

}
