import java.util.Scanner;

public class Fila {
	
	private static Scanner opcaoUsuario;
	private static String aux;
	private static String pacientes[] = new String[10];
	private static int totalPaciente = 0;
	
	public static void main(String[] args) {
		Fila.Opcao();
	}
	
	public static void Opcao(){
		
		opcaoUsuario = new Scanner(System.in);
		System.out.println(" SISTEMA HOSPITALAR  ");
		System.out.println("------------------");
		System.out.println("1 - Chamar Proximo Paciente");
		System.out.println("2 - Adicionar Paciente");
		System.out.println("3 - Quantidade de Pacientes Cadastrados");
		System.out.println("4 - Listar total de pacientes ");
		System.out.println("5 - Sair ");
		System.out.println("-------------------");
		System.out.print("Informe sua opção : " );
		int op = opcaoUsuario.nextInt();
		verOpcao(op);
	}
	
	
	public static void verOpcao(int op) {
		
		aux = "";
		int escolha = op;
		int pos = 0;
	
		switch(escolha) {
			case 1:
				System.out.println("\n");
			try {
				filaPaciente(pacientes);
			} catch (Exception e) {
				e.printStackTrace();
			}
				System.out.println("----------------------------------------");
				System.out.println(" Deseja realizar mais alguma operação");
				System.out.println("1 - Encerrar ");
				System.out.println("2 - Selecionar nova Opção");
				Scanner resposta = new Scanner(System.in);
				int paciente = resposta.nextInt();
				Novopaciente(paciente);
				break;
			case 2:
				Scanner nomePaciente = new Scanner(System.in);
				System.out.println(" Nome do Paciente: ");
				String nome = nomePaciente.next();
				pacientes[totalPaciente] = nome;
				totalPaciente ++;
				Opcao();
				break;
			case 3:
				System.out.println("\n");
				System.out.println("------------------------------");
				System.out.println(" Total de pacientes Cadastrados : " + totalPaciente);
				System.out.println("------------------------------");
				System.out.println("\n");
				Opcao();
				break;
			case 4:
				
				if(totalPaciente == 0) {
					System.out.println("\n");
					System.out.println(" Não contém pacientes no sistema");
					System.out.println("\n");
					Opcao();
				}
				
				System.out.println(" Pacientes ");
				for(int i = 0 ; i < pacientes.length; i ++) {
					if(pacientes[i] != null) {
						System.out.print("\n");
						System.out.println( pacientes[i]);
						System.out.print("\n");
						System.out.println("------------------------");
					}
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
	
	
	public static void Novopaciente(int paciente) {
		int resp = paciente;
		
		 if(resp == 1) {
			System.out.println("-----------------------------------------");
			System.out.println("-----------------------------------------");
			System.out.println("Encerrando programa");
		}else if(resp == 2) {
			Opcao();	
		}else {
			System.out.println("Opção inválida encerrando programa");
		}
	}
	
	
	public static void filaPaciente(String[] pacientes) {
		System.out.println("Pacientes Restantes");
		for(int i = 0 ; i < pacientes.length - 1; i++) {	
			if(pacientes[i] != null) {
				aux = pacientes[i];
				pacientes[i] = pacientes[i + 1];
				System.out.println("\n");
				System.out.println(pacientes[i]);
				System.out.println("\n");
			}else if(pacientes[i] == null){
				System.out.println(" Não há pacientes para serem chamados ");
				break;
				
			}
		}
		
	}
		
}
