package petShop;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		ListaDeServico lista = new ListaDeServico();
		Scanner sc = new Scanner(System.in);
		boolean sair = true;
		do {
			System.out.print("Digite o que deseja fazer"+"\n"+"0- Encerrar cadastro"+"\n"+
					"1- Cadastrar um Pet"+"\n"+
					"2- vincular um servico ao pet"+"\n"+
					"3- Remover um Pet que já realizou o pagamento"+"\n"+
					"4- Editar o nome de um pet"+"\n"+
					"5- Exibe lista dos pet"+"\n"+
					"-> ");
			
			int escolha = sc.nextInt();
			sc.nextLine();
			separa();
			
			switch(escolha) {
			case 0:// sai do programa
				System.out.println("Saindo do programa, Obrigado por utilizar :)");
				sair = false;
				break;
			case 1://adiciona um pet
				System.out.print("Digite o nome do Pet que deseja cadastrar -> ");
				
				String nome = sc.nextLine();
				lista.adicionaPet(new NomePet(nome));
				break;
			case 2:// vincula o pet a um servico
				System.out.println("Seleciona o id do pet que deseja adicionar um servico");
				lista.exibePet();
				
				System.out.print("-> ");
				int escolha2 = sc.nextInt();
				lista.adicionaServico(escolha2);
				break;
			case 3://remove da lista o pet que já fez o pagamento 
				System.out.println("Selecione o Pet que realizou o pagamento para excluir da lista");
				lista.exibePet();
				System.out.print("-> ");
				
				int remove = sc.nextInt();
				
				lista.remove(remove);
				
				break;
			case 4://edita o nome de um pet
				System.out.println("Escolha qual o nome do pet que deseja editar");
				lista.exibePet();
				
				System.out.print("-> ");
				int posi = sc.nextInt();
				
				lista.editaNomePet(posi);
				break;
			case 5:// exibe os pets e os servicos 
				lista.exibePet();
				
				break;
			default:
				System.out.println("Codigo não existe");
				break;
			}
			separa();
		}while(sair);
	
	
	}	
	
	public static void separa() {
		System.out.println("**********************************************");
	}
}