import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.ArrayList;

public class cardapio {


	private static int respCardapio;
	private static int verifica;
	
	public static void main(String[] args) {
		inicioSistema();
	}
	
	
	public static void inicioSistema() {
		JOptionPane.showMessageDialog(null , " Bem vindo ao nosso Sistema clique para Prosseguir");
		inicioCardapio();
	}
	
	public static void inicioCardapio() {
		
		String resp = JOptionPane.showInputDialog(null , "\n O que deseja Fazer? \n" + "\n 1 - Ver Cardapio " + 
		"\n 2 - Sobre o Sistema " + "\n 3 - Verificar seus pedidos " + "\n 4 - Sair do Sistema" + "\n" 
				+ "\n");
		
		if(resp == null) {
			JOptionPane.showMessageDialog(null, " Cancelado...");
		}else {
			int response = Integer.parseInt(resp);
			int op =  response;
			verOpcao(op);
		}
	}
	
	public static void verOpcao(int op) {
		
		
		int tamanho = 8;
		String opcoes[] = { "xUglyAll" , "xEggUgly" , "xUglyBurguer" , "xUglyMaster" , "xUglyBeta" , "xMiniUgly" , "xBabyUgly" };
		String pedidos[] = new String[tamanho];
		
		
		switch(op) {
			
			case 1:
				
				
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
								pedidos[0] =  "xUglyAll" ;
								inicioCardapio();
								break ;
							}else if(respCardapio == 2) {
								JOptionPane.showMessageDialog(null, "Lanche Selecionado " + " \n " + opcoes[1]);
								pedidos[1] =  "xEggUgly";
								inicioCardapio();
								break;
							}else if(respCardapio == 3) {
								JOptionPane.showMessageDialog(null, "Lanche Selecionado" + "\n " + opcoes[2]);
								pedidos[2] = "xUglyBurguer";
								inicioCardapio();
								break;
							}else if(respCardapio == 4) {
								pedidos[3] = opcoes[3];
								JOptionPane.showMessageDialog(null, "Lanche Selecionado" + "\n " + opcoes[3]);
								inicioCardapio();
								break;
							}else if(respCardapio == 5) {
								pedidos[4] = "xUglyMaster" ;
								JOptionPane.showMessageDialog(null, "Lanche Selecionado" + "\n " + opcoes[4]);
								inicioCardapio();
								break;
							}else if(respCardapio == 6) {
								pedidos[5] =  "xUglyBeta";
								JOptionPane.showMessageDialog(null, "Lanche Selecionado" + "\n " + opcoes[5]);
								inicioCardapio();
								break;
							}else if(respCardapio == 7) {
								pedidos[6] =  "xMiniUgly" ;
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
				inicioSistema();
				break;
				
			case 3:
				 
				String opcoesPedido = (JOptionPane.showInputDialog(null, " Selecione uma opção " + "\n" +
				"1 - Ver seus pedidos " + "\n" + " 2 - Cancelar seus pedido " + "\n" + " 3 - Finalizar seu pedido "));
				
				if(opcoesPedido == null) {
					inicioCardapio();
					return;
				}
				
				
				verifica = Integer.parseInt(opcoesPedido);
				
			
				if(verifica == 1) {
										
						if(pedidos != null) {
							JOptionPane.showMessageDialog(null, "Seus pedidos: " + pedidos);
						}else {
							JOptionPane.showMessageDialog(null, " Voçê não possui pedidos ");
							inicioCardapio();
						}
						break;
					
				}else if(verifica == 2) {			
					for(int i = 0 ; i < pedidos.length - 1 ; i ++) {
						
						pedidos[i] = null;
						if(pedidos == null) {
							pedidos[i] = pedidos[i + 1];
						}
						
					}
					
					JOptionPane.showInputDialog(null, "Qual Pedido você deseja cancelar ? : " , pedidos);
					
					inicioCardapio();
		
				}else if(verifica == 3) {
						JOptionPane.showMessageDialog(null, " Pedido Finalizado");
				}
				break;
				
			case 4:
				saidaSistema();
				break;
				
			default:
				JOptionPane.showMessageDialog(null, " Esta opção não existe , Reiniciando o sistema");
				inicioSistema();
				
				
		}
		
		
	}
	
	
	public static void InfoSistema() {
		
		JOptionPane.showMessageDialog(null, " Nosso sistema foi criado no intuito de resolver alguns problemas relacionados a hamburguerias" + " \n" +
				" sendo assim você pode realizar seu pedido de forma online conosco!");
		
		JOptionPane.showMessageDialog(null, "Retornando ao sistema");
		
	}
	
	
	
	public static void saidaSistema() {
		int saidaOpt = JOptionPane.showConfirmDialog(null, " Deseja sair do Sistema? ");
		
		if(saidaOpt == 0) {
			
			JOptionPane.showMessageDialog(null, " Saindo do Sistema , Obrigado por utilizar nossos serviços! ");
		}else if(saidaOpt == 1) {
			
			inicioSistema();
		}else {
			
			JOptionPane.showMessageDialog(null, "Reiniciando o Sistema ");
			inicioSistema();
		}
	}
	
	
}