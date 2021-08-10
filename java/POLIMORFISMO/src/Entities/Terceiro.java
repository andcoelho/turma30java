package Entities;


public class Terceiro extends Funcionario {

	//Atributos
	private double adicional;
	
	//Construtor
	public Terceiro(String matricula, int horasTrabalhadas, double valorPorHora, double adicional) {
		super(matricula, horasTrabalhadas, valorPorHora);
		this.adicional=adicional;
	}

	//Encapsulamento
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	//Método
	
	@Override
	public double salario () {
		return ((getHorasTrabalhadas()*getValorPorHora())+adicional);
	}
	
	

	
}