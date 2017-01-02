package uno;

public class Jogador {

	Lista<Carta> mao = new Lista<Carta>();

	String nome;
	
	/**
	 * Inicializa um jogador a partir de seu nome
	 * @param nome
	 */
	Jogador(String nome){
		this.nome = nome;
	}
	
	/**
	 * Adiciona uma carta na mão do jogador
	 * @param carta
	 */
	public void addNaMao(Carta carta){
		mao.add(carta);
	}
	
	/**
	 * Remove a carta da mão do jogador para joga-la na mesa
	 * @return Carta
	 */
//	public Carta joga(int posicao){
//		Nodo<Carta> nodo = mao.getFirst();
//		while(posicao > 1){
//			nodo = nodo.proximo;
//			posicao--;
//		}
//	}
	
	/**
	 * Metodo que retorna a primeira carta,remove e a adiciona no final da mão do jogador.
	 * @return
	 */
	public Carta next(){
		Carta carta = mao.getFirst().element;
		mao.removeFirst();
		mao.add(carta);
		return carta;
	}
	
	/**
	 * Retorna a quantidade de Cartas na mão do jogador
	 * @return int
	 */
	public int quantidade(){
		return mao.quantidade();
	}
	
	/**
	 * Imprime na tela as cartas do jogador
	 */
	public void mostraMao(){		
		System.out.println("Jogador: " + nome);
		int tam = quantidade();
		int num = 1;
		System.out.println("Numero de cartas na mão: " + tam);
		while(tam > 0){
			Carta carta = next();
			if(carta.cor.equals("preto") || carta.poderSpecial){
				System.out.print("[CARTA " + num + "] "+ carta.poder + " - " + carta.cor );		
			} else {
				System.out.print("[CARTA " + num + "] "+ carta.numero + " - " + carta.cor );
			}
			tam--;
			num++;
			System.out.println();
		}
		System.out.println();
	}
	
	public Carta selecionaCarta(int posicao){
		Nodo<Carta> nodo = mao.getFirst();
		while(posicao > 1){
			nodo = nodo.proximo;
			posicao--;
		}
		Carta carta = nodo.element;
		System.out.print("[CONSOLE] Carta selecionada foi: ");
		carta.imprimeCarta(carta);
		return carta;
	}
	
}
