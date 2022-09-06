import java.util.Scanner;

public class Media{
  public static void main(String[] args){
    System.out.println("Calculadora de media");

    System.out.println(" --------------------------- ");

    Scanner nota = new Scanner(System.in);
      
    int n1 , n2 , n3 ,n4;

    System.out.println(" Informe a primeira nota ");
    n1 = nota.nextInt();
    System.out.println(" Informe a segunda nota ");
    n2 = nota.nextInt();
    System.out.println(" Informe a terceira nota ");
    n3 = nota.nextInt();
    System.out.println(" Informe a quarta nota ");
    n4 = nota.nextInt();

    System.out.println(" ------------------------ ");
  
    int media = ( n1 + n2 + n3 + n4 ) / 4;

    if(media >= 6){
      System.out.println(media);
      System.out.println(" Aluno Aprovado ");
    }else{
      System.out.println(" Aluno reprovado ");
    }

    System.out.println(" ---------------------- ");
  
    System.out.println(" Fim do Programa ");
  

  
  }
}