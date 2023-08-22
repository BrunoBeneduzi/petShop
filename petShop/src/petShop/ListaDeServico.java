package petShop;
import java.util.*;

public class ListaDeServico {
	private List<NomePet> pet = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public List<NomePet> getPet() {//metodo que retorna apenas a lista e não permite alteração
		return Collections.unmodifiableList(pet);
	}
	
	public void exibePet(){//exibe a lista dos pets
		for(NomePet i : this.pet) {
			System.out.println("id: "+ i.getIdPet()+ " Nome: "+ i.getNomePet()+ " Serviços: " + i.getServico() + " Total: " 
					+ i.retornaValor()+"R$");
		}	
	}
	
	public void remove(int posicao) {//remove um pet da lista
		int valor = this.retornaPosicao(posicao);
		
		if(valor != -1) {
			this.pet.remove(pet.get(valor));
			System.out.println("Pet removido com sucesso");
		}
		else System.out.println("id não existe");
	}

	private int retornaPosicao(int posicao) {//apoia a exclusão do elemnto fornecendo a posição que ele está.
		int valor = -1;
		for(NomePet i: this.pet) {
			valor++;
			if(i.getIdPet() == posicao) {
				return valor;
			}
		}
		return -1;
	}
	
	public void editaNomePet(int valor) {//edita o nome do pet
		int posi = this.retornaPosicao(valor);
		
		System.out.print("Digite o nome do pet -> ");
		this.pet.get(posi).setNomePet(sc.nextLine());	
		System.out.println("Alteração concluida");
	}
	
	public void adicionaPet(NomePet pet) {//metodo para adicionar um novo pet na lista
		this.pet.add(pet);
		System.out.println("o Pet "+pet.getNomePet()+" Foi adicionado com sucesso");
	}
	
	public void adicionaServico(int posicao) {//adiciona um servico no pet pelo id dele
			int valor = this.retornaPosicao(posicao);
			
			if(valor != -1) this.pet.get(valor).adicionaServico(new Servico());
		}
	
	@Override
	public String toString() {
		return "ListaDeServico [pet=" + pet + "]";
	}
}