import java.io.*;
import java.util.Scanner;

public class Urbano extends Cliente{

	//Construtor da class
	public Urbano(){
		super();
	}

	public void CalcularValorDaConta(){
		ValorConta = (QtdAguaConsumida + QtdEsgotoProduzido)  * 3.5;
	}

	public double AplicarAliquota(){
		if (ValorConta <= 20) {
			return ValorConta + (ValorConta * 0.03);
		}
		else{
			return ValorConta + (ValorConta * 0.15);
		}
	}
}