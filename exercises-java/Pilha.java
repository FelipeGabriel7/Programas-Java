import java.util.Scanner;

public class Pilha{

	public static void main(String[] args) {
    Pilha pilha = new Pilha();
    pilha.opcoes();
  }

  public void opcoes(){
      Scanner opcaoSelecionada = new Scanner(System.in);
      System.out.println("1 - Adicionar");
			System.out.println("2 - Remover");
			System.out.println("3 - Listar");
			System.out.println("4 - Sair");
			System.out.println("Digite sua opção: ");
	    int opcao = opcaoSelecionada.nextInt();
      caixa(opcao);
  }

  public void caixa(int opcao){
    int tamanho = 5;
    Scanner valorInput = new Scanner(System.in);
    String caixa[] = new String[tamanho];
    int top = -1;
    int menuEscolha = opcao;
    
    switch(menuEscolha){
      case 1:
          if(top == tamanho - 1){
             System.out.println(" Caixa cheia ");
          }else{
              top ++;
              System.out.println(" Digite o sabor : ");
              caixa[top] = valorInput.next();
              opcoes();
              break; 
          }
      case 2:
        System.out.println(caixa[top] + " Foi removida ");
        caixa[top] = null;
        top --;
        opcoes();
        break;
      case 3:
        System.out.println(" ------------------ ");
        System.out.println(" Lista : ");
        for(int i = 0 ; i <= top ; i ++){
          System.out.println(caixa[i]);
        }
        System.out.println(" ------------------");
        opcoes();
        break;
      case 4:
        System.out.println(" Saindo do programa .. ");
        System.out.println(" Fim ");
        break;
      default:
        System.out.println(" ------------------------ ");
        System.out.println(" Não existe essa opcao ");
        opcoes();
        break;
    }
  }
}