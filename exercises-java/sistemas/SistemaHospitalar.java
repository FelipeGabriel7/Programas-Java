 lines (97 sloc)  3 KB

import java.util.Scanner;


public class Fila {
	public static void main(String[] args) {
		Fila Opcao = new Fila();
		Fila.Opcao();
	}
	
	public static void Opcao(){
		
		Scanner opcaoUsuario = new Scanner(System.in);
		System.out.println(" SISTEMA HOSPITALAR  ");
		
		System.out.println("------------------");
		System.out.println("1 - Chamar Proximo Paciente");
		System.out.println("2 - Listar Total de pacientes");
		System.out.println("3 - Total de pacientes atendidos");
		System.out.println("4 - Adicionar Paciente");
		System.out.println("5 - Sair ");
		System.out.println("-------------------");
		
		
		System.out.print("Informe sua opção : " );
		int op = opcaoUsuario.nextInt();
		verOpcao(op);
	}
	
	
	public static void verOpcao(int op) {
		
		int tamanho = 4;
		String pacientes[] = {"Paciente1" , "Paciente2" , "Paciente3" , "Paciente4"};
		int fim = -1;
		int inicio = 0;
		String aux = "";
		int escolha = op;
		int indice = 0;
	
	
		switch(escolha) {
			case 1:
				System.out.println("\n");
				System.out.println(" Paciente Chamado " +  pacientes[indice ++]);
				System.out.println("\n");
				System.out.println(" Pacientes Restantes ");
				System.out.println("----------------------------------------");
				for(int i = 0 ; i < pacientes.length - 1 ; i ++) {
					aux = pacientes[i];
					pacientes[i] = pacientes[i + 1];
					System.out.println(" " + pacientes[i]);
					System.out.println("\n");
				}
				pacientes[inicio] = null;
				
				System.out.println(" Deseja realizar mais alguma operação (S / N ) ? ");
				Scanner resposta = new Scanner(System.in);
				String paciente = resposta.next();
				Novopaciente(paciente);
				break;
			case 2:
				for(int i = 0 ; i < pacientes.length; i ++) {
					System.out.print("\n");
					System.out.println( pacientes[i]);
					System.out.print("\n");
					System.out.println("------------------------");
				}
				Opcao();
				break;
			case 3:
				System.out.println(" Total de pacientes atendidos ");
					
				System.out.println(" " + aux);
	
				System.out.println("------------------------------");
				Opcao();
				break;
			case 4:
				if(pacientes.length == tamanho) {
					System.out.println(" Lista de  pacientes cheia tente outra opcção ");
					System.out.println("\n");
					Opcao();
				}
					Scanner nomePaciente = new Scanner(System.in);
					for(int i = 0 ; i < pacientes.length ; i ++) {
						System.out.println(" Nome do Paciente: ");
						pacientes[i] = nomePaciente.next();
					}
					Opcao();
				break;
			case 5:
				System.out.println(" Saindo do programa. ");
				break;
			default:
				System.out.println("\n");
				System.out.println(" Esta opção não esta disponível");
				System.out.println("\n");
				Opcao();
				break;
		}
		
	}
	
	public static void Novopaciente(String paciente) {
		String resp = paciente;
		
		 if(resp == "N") {
			System.out.println("-----------------------------------------");
			System.out.println("Encerrando programa");
			System.out.println("-----------------------------------------");
		}else {
			Opcao();
			
		}
	}
	
}
