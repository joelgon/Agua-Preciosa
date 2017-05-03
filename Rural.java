/*
	Desenvolvedor: Joel Gonçalves;
	Disciplina: Implementação orientada a objetos;
*/

import java.io.*;
import java.util.Scanner;

public class Rural extends Cliente{
	private double ValorLiquido;

	//Construtor
	public Rural(String Nome, String Endereco, double QuantidadeAguaConsumida, double QuantidadeEsgotoProduzido){
		super(Nome, Endereco, QuantidadeAguaConsumida, QuantidadeEsgotoProduzido);
	}

	//metodos de acesso

	public double getValorLiquido(){
		return ValorLiquido;
	}

	public void CalcularValorLiquido(){
		if (CalcularValorBruto(2.5) <= 200 ) {
			ValorLiquido = CalcularValorBruto(2.5) - (CalcularValorBruto(2.5) * 0.1);
		}
		else{
			ValorLiquido = CalcularValorBruto(2.5) - (CalcularValorBruto(2.5) * 0.05);
		}
	}

}