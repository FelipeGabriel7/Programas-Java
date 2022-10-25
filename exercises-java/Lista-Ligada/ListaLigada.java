
public class ListaLigada {
			private Celula primeira;
			private Celula ultima;
			private Celula valor;
			private int totalDeElementos;
			
		public void adicionaNoComeco(Object elemento) {
				if(this.totalDeElementos == 0){
					Celula nova = new Celula(elemento);
					this.primeira = nova;
					this.ultima = nova;
				} else {
					Celula nova = new Celula(this.primeira, elemento);
					this.primeira.setAnterior(nova);
					this.primeira = nova;
				}
				this.totalDeElementos++;
			}
		
		
		public void adicionaFim(Object elemento) {
			if(this.totalDeElementos == 0) {
				return;
			}else {
				Celula fim = new Celula(elemento);
				fim.setProxima(null);
				ultima.setProxima(fim);
				ultima = fim;
				totalDeElementos ++;
			}
		}
		
		
		public void removeUltimo() {
			if(this.totalDeElementos <=  0) {
				System.out.println(" Não existe elementos para serem removidos ");
			}else {
				Celula ant = new Celula();
				this.ultima.setAnterior(ant);
				this.ultima = ant;
			}
			totalDeElementos --;
		}
		
		public void removeInicio() {
			if(this.totalDeElementos == 0) {
				return;
			}
			
			primeira = primeira.getProxima();
			totalDeElementos --;
			
			if(this.totalDeElementos == 0) {
				ultima = null;
			}
		}
		
		
		public void total() {
			System.out.println(" Tamanho da lista:  " + this.totalDeElementos);
		}
		
	
	
	
		@Override
			public String toString() {
				// Verificando se a Lista está vazia
				if(this.totalDeElementos == 0){
					return "[]";
				}
				
				StringBuilder builder = new StringBuilder("[");
				Celula atual = primeira;
				
				// Percorrendo até o penúltimo elemento.
				for (int i = 0; i < this.totalDeElementos - 1; i++) {
					builder.append(atual.getElemento());
					builder.append(", ");
					atual = atual.getProxima();
				}
				
				// último elemento
				builder.append(atual.getElemento());
				builder.append("]");
				
				return builder.toString();
			}
			
		}
