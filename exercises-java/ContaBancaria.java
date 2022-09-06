import java.util.Scanner;

public class Pilha{

	public static void main(String[] args) {
    Pilha pilha = new Pilha();
    pilha.opcoes();
  }

  public void opcoes(){
      Scanner opcaoSelecionada = new Scanner(System.in);
      System.out.println("1 - Verificar Limite de deposito");
			System.out.println("2 - Depositar ");
			System.out.println("3 - Sacar ");
			System.out.println("4 - Sair");
			System.out.println("Digite sua opção: ");
	    int opcao = opcaoSelecionada.nextInt();
      conta(opcao);
  }

  public void exibeSaldo(int saldo){
      System.out.println("  Seu saldo atual: ");
      System.out.println( saldo );
  }
  

  public void conta(int opcao){
    int tamanho = 5;
    Scanner valorInput = new Scanner(System.in);
    String conta[] = new String[tamanho];
    int menuEscolha = opcao;
    int valor = 0;
    int saldo = 0;
    int saque = 0;
    int novoSaldo = 0;
   
   exibeSaldo();

    do{
         if(menuEscolha < 1 || menuEscolha > 5){
          System.out.println(" Esta opção não existe ");
          System.out.println(" ----------------------- ");
          opcoes();
      }
      
      if(menuEscolha == 1){
        System.out.println(" Seu limite atual é 10000 R$");
        opcoes();  
      }
      else if(menuEscolha == 2){
        System.out.println(" Informe o valor que voce deseja depositar: ");
        valor = valorInput.nextInt();

        if(valor >= 10000){
          System.out.println(" Não é possível depositar mais de 10000 tente novamente amanha ");
        }else {
               novoSaldo = saldo += valor;
        System.out.println(" Seu novo saldo : " + novoSaldo); 
        }
        opcoes();
      }else if(menuEscolha == 3){
        System.out.println(" Saldo disponivel " + novoSaldo );
        System.out.println(" Qual valor você deseja sacar ? ");
        saque = valorInput.nextInt();

        if(saque > novoSaldo){
          System.out.println(" Não é possível sacar esse valor");
          opcoes();
        }
        novoSaldo = novoSaldo - saque;
        System.out.println(" Seu novo saldo após o saque : " + novoSaldo);
        opcoes();
      }else{
        System.out.println(" Saindo do programa .. ");
        System.out.println(" Fim ");
      }

      
    }while(menuEscolha != 4);

  
    
}
}
