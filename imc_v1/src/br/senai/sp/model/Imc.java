package br.senai.sp.model;

public class Imc {

	public int peso;
	public double altura;
    
    public void calcularImc(){
    	double imc = peso / (altura * altura);
    	System.out.print("Resultado: " + imc);
    }
    
    public void classificarImc() {
    	}
    }

