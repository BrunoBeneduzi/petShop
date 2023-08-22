package petShop;
import java.util.*;

public class Servico {
	private double valor = 0;
	private String servico;
	
	Scanner sc = new Scanner(System.in);
	
	public Servico() {//adiciona um servico e atribui um valor a ele
		this.adicionaServico();
	}
	
	public double getValor() {//retorna o total do servico
		return valor;
	}
	
	
	public String getServico() {
		return servico;
	}

	private void adicionaServico() {//adiciona o serviço e atribui valor
		int escolha;
		System.out.print("Selecione o serviço para adicionar\n"+"1- Corte: 100 R$\n"+"2- Banho 50 R$\n"+"-> ");
		escolha = sc.nextInt();
		
		switch(escolha) {
		case 1:
			this.valor = 100;
			this.servico = "Corte";
			System.out.println("Adicionado");
			break;
		case 2:
			this.valor = 50;
			this.servico = "Banho";
			System.out.println("Adicionado");
			break;
		default:
			System.out.println("Serviço invalido");
			break;
		}
	}

	@Override
	public String toString() {
		return servico;
	}
	
	
	
}