import java.util.Scanner;
public class Pilha {

  private String caixa[];
  
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tamanho = 5;
		this.cai = new String[tamanho];
		int topo = -1;
		int opmenu = 0;
		
		do {
			System.out.println("1 - Adicionar");
			System.out.println("2 - Remover");
			System.out.println("3 - Listar");
			System.out.println("4 - Sair");
			System.out.println("Digite sua opção: ");
			opmenu = input.nextInt();
			
			if(opmenu == 1) {
				if(topo == tamanho - 1)
					System.out.println("Caixa cheia!");
				else {
					topo++;
					System.out.println("Digite o sabor: ");
					caixa[topo] = input.next();
					
				}
			}else if(opmenu == 2) {
				if(topo == - 1)
					System.out.println("Caixa está vazia!");
				else {
					System.out.println(caixa[topo]+" foi removida");
					caixa[topo] = null;
					topo--;
				}
			}else if(opmenu == 3) {
				if(topo == - 1)
					System.out.println("Caixa está vazia!");
				else {
					System.out.println("Lista: ");
					for(int i = 0; i <= topo; i++)
						System.out.println(caixa[i]);
				}
			}else if(opmenu == 4) {
				System.out.println("Fim");
			}else {
				System.out.println("Escolha certo!");
			}
			
		}while(opmenu != 4);
		
		

	}

}