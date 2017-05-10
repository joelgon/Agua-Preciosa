import java.io.*;
import java.util.Scanner;

public class Cliente{
	protected String Nome;
	protected String Endereco;
	protected double QtdAguaConsumida;
	protected double QtdEsgotoProduzido;
	protected double ValorConta;

	//metodos de acesso;

	public void setNome (String Nome){
		this.Nome = Nome;
	}

	public void setEndereco(String Endereco){
		this.Endereco = Endereco;
	}

	public void setQtdAguaConsumida(double QtdAguaConsumida){
		this.QtdAguaConsumida = QtdAguaConsumida;
	}

	public void setQtdEsgotoProduzido(double QtdEsgotoProduzido){
		this.QtdEsgotoProduzido = QtdEsgotoProduzido;
	}

	public String getNome(){
		return Nome;
	}

	public String getEndereco(){
		return Endereco;
	}

	public double getQtdAguaConsumida(){
		return QtdAguaConsumida;
	}

	public double getQtdEsgotoProduzido(){
		return QtdEsgotoProduzido;
	}

	public double getValorConta(){
		return ValorConta;
	}

	public void CalcularValorDaConta(){

	}

	public double AplicarAliquota(){
		return 0;
	}
}