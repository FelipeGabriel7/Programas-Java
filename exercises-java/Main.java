import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner iptn  = new Scanner(System.in);
      int opcao = 0;
      String nome;

      System.out.println("Informe o que você deseja fazer ?");
      System.out.println(" 1 - Adicionar ");
      System.out.println(" 2 - Deletar ");
      System.out.println(" 3 - Editar ");
      System.out.println(" Informe sua opção ");
      opcao = iptn.nextInt();

      System.out.println(" Informe o nome que você deseja deletar");
      nome = iptn.next();
      System.out.println(nome );
    
    
      if(opcao == 1){
          System.out.println(" Adicionando ");
      }else if(opcao == 2){
          System.out.println( " Deletando ");
      }else if(opcao == 3){
          System.out.println(" Editando ");
      }
  }
}