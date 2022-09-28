import javax.swing.JOptionPane;
import java.util.ArrayList;


public class JavaP {


	private static int respCardapio;
	private static int verifica;
	private static int entInfo;
	private static ArrayList<String> pedidos = new ArrayList<String>();
	private static ArrayList<Double> valores = new ArrayList<Double>();
	public static void main(String[] args) {
		
		inicioSistema();
	}
	
	
	public static void inicioSistema() {  //metodo para mensagem de boas vindas.
		JOptionPane.showMessageDialog(null ,"Olá, boa noite! Seja muito bem vindo a Hamburgueria Huglly!\n"
				+ "Temos os hamburgueres mais feios, porém mais gostosos que serão destinados somente a sua escolha!\n"
				+ "Clique em " + "OK " + "para darmos continuidade a seu pedido! ");
		inicioCardapio(); //método para chamar o início do menu, onde o cliente poderá escolher o que deseja fazer
	}
	
	public static void inicioCardapio() { //método para controle do início do cardápio e escolha do que o cliente irá querer fazer
		
		String resp = JOptionPane.showInputDialog(null , "\n O que deseja Fazer? \n" + "\n 1 - Ver Cardapio " + 
		"\n 2 - Sobre o Sistema " + "\n 3 - Verificar seus pedidos " + "\n 4 - Sair do Sistema" + "\n" 
				+ "\n");
		
		
		entInfo = Integer.parseInt(resp);
		
			
			if(resp == null) { //verificação de caso o cliente clique em "fechar" ou no botão "cancelar"
				JOptionPane.showMessageDialog(null, " Cancelado...");
			}else {
				int response = Integer.parseInt(resp);
				int op =  response;
				verOpcao(op);
			}
		}
	
	
	
public static void InfoSistema() {
	
	if(entInfo == 2) {
		JOptionPane.showMessageDialog(null, " Nosso sistema foi criado no intuito de resolver alguns problemas relacionados a hamburguerias\n"
				+ ", visando melhorar nosso atendimento ao cliente para facilitar demanda de pedidos, permitindo que o cliente faça seu pedido conforme desejar! "
				+ "Sendo assim, você pode realizar seu pedido de forma online conosco! ");
		
		JOptionPane.showMessageDialog(null, "Retornando ao sistema... ");
		 inicioSistema();
	}}
	
	public static void verOpcao(int op) {  //metodo criado para ver as opções do cardapio que estão dentro do vetor 
		
			//vetor no modo String criado para armazenar o cardapio	 
		String opcoes[] = { "xUglyAll" , "xEggUgly" , "xUglyBurguer" , "xUglyMaster" , "xUglyBeta" , "xMiniUgly" , "xBabyUgly" };
		
		 
		switch(op) { //switch criado para que fosse separado em casos as condições abaixo
			
			case 1: //Primeiro caso, mostra o cardapio caso o cliente tenha optado por ver cardapio
				
				  String cardapio = JOptionPane.showInputDialog(null, " Nosso Cardápio : \n" +  " 1 - xUglyAll----16.50 R$\n" + " 2 - xEggUgly----13.50 R$" + 
							"\n 3 - xUglyBurguer----12.00 R$" + "\n 4 - xUglyMaster----10.00 R$" + "\n 5 - xUglyBeta----9.50 R$" + "\n 6 - xMiniUgly----8.00 R$"
							+ "\n 7 - xBabyUgly----7.50 R$" + "\n" +  "\n" + " Deseja Realizar algum pedido ? ");
				  
				  if(cardapio == null) { 
					  inicioCardapio();
					  return;
				  }
					  respCardapio = Integer.parseInt(cardapio);
					  
						for(int i = 0 ; i < 7 ; i ++) {

							if(respCardapio == 1) {
								JOptionPane.showMessageDialog(null, "Lanche Selecionado " + " \n " + opcoes[0]);
								pedidos.add("xUglyAll");
								valores.add(16.50);
								inicioCardapio();
								break ;
							}else if(respCardapio == 2) {
								JOptionPane.showMessageDialog(null, "Lanche Selecionado " + " \n " + opcoes[1]);
								pedidos.add("xEggUgly");
								valores.add(13.50);
								inicioCardapio();
								break;
							}else if(respCardapio == 3) {
								JOptionPane.showMessageDialog(null, "Lanche Selecionado" + "\n " + opcoes[2]);
								pedidos.add("xUglyBurguer");
								valores.add(12.00);
								inicioCardapio();
								break;
							}else if(respCardapio == 4) {
								pedidos.add("xUglyMaster");
								valores.add(10.0);
								JOptionPane.showMessageDialog(null, "Lanche Selecionado" + "\n " + opcoes[3]);
								inicioCardapio();
								break;
							}else if(respCardapio == 5) {
								pedidos.add("xUglyBeta");
								valores.add(9.50);
								JOptionPane.showMessageDialog(null, "Lanche Selecionado" + "\n " + opcoes[4]);
								inicioCardapio();
								break;
							}else if(respCardapio == 6) {
								pedidos.add("xMiniUgly");
								valores.add(8.0);
								JOptionPane.showMessageDialog(null, "Lanche Selecionado" + "\n " + opcoes[5]);
								inicioCardapio();
								break;
							}else if(respCardapio == 7) {
								pedidos.add("xBabyUgly");
								valores.add(7.50);
								JOptionPane.showMessageDialog(null, "Lanche Selecionado" + "\n " + opcoes[6]);
								inicioCardapio();
								break;
							}else {
								JOptionPane.showMessageDialog(null, "Não consegui entender sua opção ou este lanche não existe no nosso cardápio" );
								inicioCardapio();
							}
						
						break;
		
				  }
			
						
			case 2:
				InfoSistema();
				break;
				
			case 3:
				
				// Opcoes apos realizar um pedido
				 
				String opcoesPedido = (JOptionPane.showInputDialog(null, " Selecione uma opção " + "\n" +
				" 1 - Ver seus pedidos " + "\n" + " 2 - Remover Pedido  " + "\n" + " 3 - Finalizar pedidos " + "\n" + " 4 - Cancelar todos os pedidos "));
				
				if(opcoesPedido == null) {
					inicioCardapio();
					return;
				}else {
					
					verifica = Integer.parseInt(opcoesPedido);
					
					// listar pedidos , quantidades e valores
					
					if(verifica == 1) {
						
					String strPedidos = "";
					
					for(String pedido : pedidos) {
						strPedidos += pedido + "\n";
					}
					
					
					Double valorTotal = (double) 0;
					
					for(Double valor : valores) {
						valorTotal += valor;
					}
					
					
					Double valorFinal = (double) valorTotal;
					String TotalPedidos = strPedidos;
					
					if(pedidos.size() < 1 || valores.size() < 0) {
						JOptionPane.showMessageDialog(null, "Você ainda não realizou nenhum pedido! ");
						inicioCardapio();
					}
			
					JOptionPane.showMessageDialog(null,"Confira aqui os seus pedidos:  \n " + TotalPedidos.toString() +  "\n \n \n " + " Quantidade de Pedidos Realizados: " + pedidos.size() + "\n"
							+ "\n Valor total a ser  pago: " + valorFinal + " R$ ");
					inicioCardapio();
						
	
					
				}else if(verifica == 2) {		
					
					// Remove o  pedido utilizando Fila
				
					
					if(pedidos.size() == 0 || pedidos.size() < 0) {
						JOptionPane.showMessageDialog(null, "Você ainda nao realizou nenhum pedido! Selecione algo para que possamos lhe atender! ");
						inicioCardapio();
					}
				
					pedidos.remove(0);
					pedidos.sort(null);
					JOptionPane.showMessageDialog(null, " Removendo o pedido mais antigo! ");
				
					
					inicioCardapio();
					
					// Finalizar Pedidos 
		
				}else if(verifica == 3) {
					
					if(pedidos.size() < 1 ) {
						JOptionPane.showMessageDialog(null, " Você não tem pedidos para finalizar ");
						inicioCardapio();
					}
					else {
						
						String strPedidos = "";
						
						
						for(String pedido : pedidos) {
							strPedidos += pedido + "\n";
						}
						
						
						
						Double valorTotal = (double) 0;
						
						for(Double valor : valores) {
							valorTotal += valor;
						}
						
	
						Double valorFinal = (double) valorTotal;
						
							String TotalPedidos = strPedidos;
							
						JOptionPane.showMessageDialog(null, "Pedidos Finalizados: " + "\n \n" + TotalPedidos.toString() + " \n " + " Valor a ser pago : " + valorFinal + " R$ ");
						JOptionPane.showMessageDialog(null, " Aguarde que já iremos entregar seu lanche , Obrigado ! ");
						pedidos.clear();
					}
				}else if(verifica == 4) {
					
					if(pedidos.size() <= 0 || pedidos.size() < 1) {
						JOptionPane.showMessageDialog(null, "Você ainda não realizou um pedido!\n"
								+ "Escolha algo para darmos continuidade. ");
						inicioCardapio();
					}
					
					pedidos.clear();
					JOptionPane.showMessageDialog(null , "Todos os seus pedidos foram cancelados! ");
					inicioCardapio();
				}else {
					JOptionPane.showMessageDialog(null, "Desculpe não consegui entender sua opção! Por favor, selecione a opção desejada novamente... ");
					inicioCardapio();
					break;
				}
					
					break;
					
				}
				
			
			case 4:
				saidaSistema();
				break;
				
			default:
				JOptionPane.showMessageDialog(null, " Esta opção não existe , Reiniciando o sistema... ");
				inicioSistema();
					
		}
		
	}
	

	public static void saidaSistema() {
		int saidaOpt = JOptionPane.showConfirmDialog(null, " Deseja sair do Sistema? ");
		
		if(saidaOpt == 0) {
			
			JOptionPane.showMessageDialog(null, " Saindo do Sistema , Obrigado por utilizar nossos serviços! ");
		}else if(saidaOpt == 1) {
			
			inicioSistema();
		}else {
			
			JOptionPane.showMessageDialog(null, "Reiniciando o Sistema... ");
			inicioSistema();
		}
	}	
}
