import java.io.*;
import java.util.Scanner;

public class Rural extends Cliente{

	//Construtor da class;
	public Rural(){
		super();
	}

	public void CalcularValorDaConta(){
		ValorConta = (QtdAguaConsumida + QtdEsgotoProduzido) * 2.5; 
	}

	public double AplicarAliquota(){
		if(ValorConta <=200){
			return ValorConta - (ValorConta * 0.1);
		}
		else{
			return ValorConta - (ValorConta * 0.05);
		}
	}
}