import java.io.*;
import java.util.Scanner;

public class AguaPreciosa{
	public static void main(String[] args) {
		Cliente cliente;
		Rural rural = new Rural();
		Urbano urbano = new Urbano();

		cliente = rural;
		cliente.setNome("Joel");
		cliente.setEndereco("Av. Amazonas");
		cliente.setQtdAguaConsumida(220);
		cliente.setQtdEsgotoProduzido(240);
		cliente.CalcularValorDaConta();
		cliente.AplicarAliquota();
		System.out.println("\nNome: " + cliente.getNome());
		System.out.println("Endereço: " + cliente.getEndereco());
		System.out.println("Quantidade de Agua Consumida: " + cliente.getQtdAguaConsumida());
		System.out.println("Quantidade de Esgoto Produzido: " + cliente.getQtdEsgotoProduzido());
		System.out.println("Valor Bruto da conta: " + cliente.getValorConta());
		System.out.println("Valor Liquido: " + cliente.AplicarAliquota());

		cliente = urbano;
		cliente.setNome("Joel");
		cliente.setEndereco("Av. Amazonas");
		cliente.setQtdAguaConsumida(30);
		cliente.setQtdEsgotoProduzido(35);
		cliente.CalcularValorDaConta();
		cliente.AplicarAliquota();
		System.out.println("\nNome: " + cliente.getNome());
		System.out.println("Endereço: " + cliente.getEndereco());
		System.out.println("Quantidade de Agua Consumida: " + cliente.getQtdAguaConsumida());
		System.out.println("Quantidade de Esgoto Produzido: " + cliente.getQtdEsgotoProduzido());
		System.out.println("Valor Bruto da conta: " + cliente.getValorConta());
		System.out.println("Valor Liquido: " + cliente.AplicarAliquota());
	}
}