package petShop;
import java.util.*;

public class NomePet {
	private String nomePet;
	private List<Servico> servico = new ArrayList<>();
	private static int id;
	private int idPet;
	
	public NomePet(String nomePet) {//adiciona um novo pet e coloca um id para identificar e modificar.
		this.nomePet = nomePet;
		id++;
		this.idPet = id;
	}
		
	public int getIdPet() {// retorna o id do pet
		return this.idPet;
	}
	
	public String getNomePet() {// retorna o nome do pet
		return nomePet;
	}
	
	public void setNomePet(String nome) {
		this.nomePet = nome;
	}

	public List<Servico> getServico() {//retorna a lista de servicos permitindo usar os metodos de dentro da classe 
		return Collections.unmodifiableList(servico);
	}
	
	public void adicionaServico(Servico servico) {//adiciona um novo servico ao pet
		this.servico.add(servico);
	}
	
	public double retornaValor() {// soma o valor de todos os servicos adicionados para o pet 
		double total = 0;
		for(Servico i : this.servico) {
			total += i.getValor();
		}
		
		return total;
	}
	
	
	
	

}
