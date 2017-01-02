package uno;

public class Game {
	
	/**
	 * Esse metodo verifica se a carta selecionada pelo jogador segue as regras do jogo.
	 * @param mesa
	 * @param carta
	 * @return boolean
	 */
	public boolean permiteJogada(Lista<Carta> mesa, Carta carta){
		Carta cartaNaMesa = mesa.getFirst().element;
		if(cartaNaMesa.cor.equals(carta.cor) || cartaNaMesa.numero == carta.numero )
			return true;
		else if (carta.prioridade)
			return true;
		System.out.println("[CONSOLE] Escolha outra carta ou pegue uma do baralho");
		return false;
	}

}
