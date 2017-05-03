/*
	Desenvolvedor: Joel Gonçalves;
	Disciplina: Implementação orientada a objetos;
*/

import java.io.*;
import java.util.Scanner;

public class Urbano extends Cliente{
	private double ValorLiquido;

	//construtor
	public Urbano(String Nome, String Endereco, double QuantidadeAguaConsumida, double QuantidadeEsgotoProduzido){
		super(Nome, Endereco, QuantidadeAguaConsumida, QuantidadeEsgotoProduzido);
	}

	//metodos de acesso

	public double getValorLiquido(){
		return ValorLiquido;
	}

	public void CalcularValorLiquido(){
		if (CalcularValorBruto(3.5) <= 200){
			ValorLiquido = CalcularValorBruto(3.5) + (CalcularValorBruto(3.5) * 0.01); 
		}
		else{
			ValorLiquido = CalcularValorBruto(3.5) + (CalcularValorBruto(3.5) * 0.15);
		}
	}
}