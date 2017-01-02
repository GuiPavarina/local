package uno;

public class Carta {
	
	int numero;
	String cor;
	boolean poderSpecial = false;
	boolean prioridade = false;
	String poder = null;
	
	/**
	 * Construtor para cartas comuns com apenas numero e core
	 * @param num
	 * @param cor
	 */
	Carta(int num, String cor){
		this.numero = num;
		this.cor = cor;
	}
	
	/**
	 * Construtor para cartas pretas que tem prioridade sobre as outras cartas.
	 * Podem ser jogadas a qualquer momento
	 * @param cor
	 * @param poderSpecial
	 * @param prioridade
	 * @param poder
	 */
	public Carta(String cor, boolean poderSpecial, boolean prioridade, String poder) {
		this.cor = cor;
		this.poderSpecial = poderSpecial;
		this.prioridade = prioridade;
		this.poder = poder;
	}
	
	/**
	 * Construtor para cartas que realizam alguma ação mas tem cores comuns(vermelho,verde,azul,amarelo)
	 * @param cor
	 * @param poderSpecial
	 * @param poder
	 */
	public Carta(String cor, boolean poderSpecial, String poder) {
		this.cor = cor;
		this.poderSpecial = poderSpecial;
		this.poder = poder;
	}
	
	public void imprimeCarta(Carta carta){
		if(carta.cor.equals("preto") || carta.poderSpecial){
			System.out.println("[CARTA] " + carta.poder + " - " + carta.cor );		
		} else {
			System.out.println("[CARTA] " + carta.numero + " - " + carta.cor );
		}
	}

}
