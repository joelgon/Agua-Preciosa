/*
	Desenvolvedor: Joel Gonçalves;
	Disciplina: Implementação orientada a objetos;
*/

import java.io.*;
import java.util.Scanner;

public class Cliente{
	private String Nome;
	private String Endereco;
	protected double QuantidadeAguaConsumida;
	protected double QuantidadeEsgotoProduzido;

	//Construtor da class Cliente;

	public Cliente(String Nome, String Endereco, double QuantidadeAguaConsumida, double QuantidadeEsgotoProduzido){
		this.Nome = Nome;
		this.Endereco = Endereco;
		this.QuantidadeAguaConsumida = QuantidadeAguaConsumida;
		this.QuantidadeEsgotoProduzido = QuantidadeEsgotoProduzido;
	}

	//Metodos de acesso;

	public void setNome(String Nome){
		this.Nome = Nome;
	}

	public void setEndereco(String Endereco){
		this.Endereco = Endereco;
	}

	public void setQuantidadeAguaConsumida(double QuantidadeAguaConsumida){
		this.QuantidadeAguaConsumida = QuantidadeAguaConsumida;
	}

	public void setQuantidadeEsgotoProduzido(double QuantidadeEsgotoProduzido){
		this.QuantidadeEsgotoProduzido = QuantidadeEsgotoProduzido;
	}

	public String getNome(){
		return Nome;
	}

	public String getEndereco(){
		return Endereco;
	}

	public double getQuantidadeAguaConsumida(){
		return QuantidadeAguaConsumida;
	} 

	public double getQuantidadeEsgotoProduzido(){
		return  QuantidadeEsgotoProduzido;
	}

	//calcular valor bruto;

	public double CalcularValorBruto(double Taxa){
		return (QuantidadeAguaConsumida + QuantidadeEsgotoProduzido ) * Taxa;
	}
}

