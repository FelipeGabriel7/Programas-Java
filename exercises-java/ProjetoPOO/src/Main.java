import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MenuInit();
    }

    public static void MenuInit(){

        int op;

        System.out.println("-------------------------------");
        System.out.println("-----------BEM VINDO-----------");
        System.out.println("-------------------------------");
        System.out.println("1 - Cadastrar Pessoa Física");
        System.out.println("2 - Cadastrar Pessoa Juridica");
        System.out.println("3 - Sair do Sistema");
        System.out.println("4 - Reiniciar o sistema");
        System.out.println("-------------------------------");

        try{

            Scanner sc = new Scanner(System.in);
            System.out.print("\n Informe uma opção: ");
            op = sc.nextInt();
            OptionPerson(op);

        }catch (Exception e){
            System.out.println(e);
        }


    }

    public static void OptionPerson(int op){

        Scanner sc = new Scanner(System.in);
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();

        switch (op){
            case 1:
                PersonFisic(pf);
                MenuInit();
                break;
            case 2:
                PersonJuridic(pj);
                MenuInit();
                break;
            case 3:
               System.out.println(" Obrigado por utilizar o nosso sistema ");
            case 4:
                System.out.println(" Reiniciando o Sistema.... ");
                MenuInit();
                break;
            default:
                MenuInit();
        }
    }


    public static void PersonFisic(PessoaFisica p){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Informe o nome da pessoa que deseja cadastrar: ");
        p.setNome(sc.nextLine());
        System.out.println(" Informe a idade da pessoa: ");
        p.setIdade(sc.nextInt());
        System.out.println(" Informe seu salário: ");
        p.setSalario(sc.nextDouble());
        System.out.println(" Informe o CPF ( Apenas números ):  ");
        p.setCpf(sc.next());
        System.out.println("Informe a data de nascimento: ");
        p.setData_nascimento(sc.next());

        p.calculaSalario(p.getSalario());

        System.out.println("Nome: " + p.getNome() + "\n" +
                " Idade: " + p.getIdade() + " \n " +
                " Salario: " + p.getSalario());
    }

    public static void PersonJuridic(PessoaJuridica p){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Informe o nome da pessoa que deseja cadastrar: ");
        p.setNome(sc.nextLine());
        System.out.println(" Informe a idade da pessoa: ");
        p.setIdade(sc.nextInt());
        System.out.println(" Informe seu salário: ");
        p.setSalario(sc.nextDouble());
        System.out.println(" Informe o CNPJ( Apenas números ):  ");
        p.setCnpj(sc.next());
        System.out.println("Informe as horas trabalhadas:  ");
        p.setHorasTrabalhadas(sc.nextDouble());

        p.calculaSalario(p.getSalario());

        System.out.println("Nome: " + p.getNome() + "\n" +
                " Idade: " + p.getIdade() + " \n " +
                " Salario: " + p.getSalario());
    }




}