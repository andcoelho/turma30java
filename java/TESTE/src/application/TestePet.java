package application;

import Entities.Cachorro;
import Entities.Pet;

public class TestePet {

	public static void main(String[] args) {
		
		Pet animal1 = new Pet("Angora", 2019);
		
		animal1.setPorte('M');
		
		System.out.println(animal1.getRaca());
		System.out.println("Idade do bicho: " + (2021-animal1.getAnoNascimento()) + " anos");
		animal1.emiteSom();
		System.out.printf("\nA idade é: %d anos", animal1.idade());
		
		//Cachorro - pet - latidoAlto / verdadeiro ou falso (construtor)
		//Gato - pet - miadoAlto / verdadeiro ou falso  (construtor)
		//Ave - pet - voa / verdadeiro ou falso (construtor)
		
		Cachorro cachorro1 = new Cachorro("pincher", 2018, false);
		System.out.printf("\nRaça do cachorro: %s, ano nascimento: %d\n", cachorro1.getRaca(), cachorro1.getAnoNascimento());
		
		cachorro1.latido();
	}

}
