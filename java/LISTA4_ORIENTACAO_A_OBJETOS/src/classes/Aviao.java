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
		System.out.println("Nome avião: " + nomeAviao);
	}
	
	public void passageirosNumero () {
		System.out.println("Número de passageiros: " + numeroPassageiros);
	}
	
	public void situacao () {
		if (ativo == true) {
			System.out.println("Avião voando");
		}
		else if (ativo == false) {
			System.out.println("Avião pousado");
		}
	}
	

}
