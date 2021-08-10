package application;

import Entities.Cachorro;
import Entities.Gato;
import Entities.Pet;

public class TestePet {

	public static void main(String[] args) {
		
		Pet animal1 = new Pet("Angora", 2019);
		
		animal1.setPorte('M');
		
		System.out.println(animal1.getRaca());
		System.out.println("Idade do bicho: " + (2021-animal1.getAnoNascimento()) + " anos");
		animal1.emiteSom();
		System.out.printf("\nA idade �: %d anos", animal1.idade());
		
		Cachorro cachorro1 = new Cachorro("pincher", 2018, true);
		System.out.printf("\nRa�a do cachorro: %s, ano nascimento: %d\n", cachorro1.getRaca(), cachorro1.getAnoNascimento());
		
		cachorro1.latido();
		cachorro1.emiteSom();
		
		Gato pet2 = new Gato("Siames", 2014, false);
		pet2.emiteSom();
		
		
		
		
		
	
	}

}
