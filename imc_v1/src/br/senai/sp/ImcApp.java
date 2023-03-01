package br.senai.sp;

import br.senai.sp.model.Imc;

public class ImcApp {

	public static void main(String[] args) {
		
		Imc imc1 = new Imc();
		imc1.peso = 60; 
		imc1.altura = 1.67;
		imc1.calcularImc();
	}

}
