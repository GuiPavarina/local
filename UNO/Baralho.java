package uno;

public class Baralho {
	
	Lista<Carta> baralho = new Lista<Carta>();
	
	private int[] numeros = {0,1,2,3,4,5,6,7,8,9};
	private String[] cores = {"vermelho","azul","amarelo","verde"};
	private String[] poderes = {"mudaDirecao","bloqueia","adiciona2"};
	private String[] poderes2 = {"mudaCor","adiciona4"};
	
	final int Min = 0;
	final int Max = 105;
	
	/**
	 * O construtor da classe Baralho, adiciona as 108 cartas do jogo no baralho
	 * No final as cartas são embaralhadas pelo metodo bagunça()
	 */
	Baralho(){
		for(int i:numeros){
			for(String s:cores){
				Carta carta = new Carta(i,s);
				baralho.add(carta);
				if(i != 0)
					baralho.add(carta);
			}
		}
		for(String c:cores){
			for(String p:poderes){
				Carta carta = new Carta(c,true,p);
				baralho.add(carta);
				baralho.add(carta);
			}
		}
		for(String p:poderes2){
			for(int i = 0;i<4;i++){
				Carta carta = new Carta("preto", true, true, p);
				baralho.add(carta);
			}
		}
		bagunça();
	}
	
	/**
	 * Retorna primeira carta do baralho sem remove-la
	 * @return Carta
	 */
	public Carta getFirst(){
		return baralho.getFirst().element;
	}
	
	/**
	 * Remove primeira carta do baralho
	 */
	public void remove(){
		baralho.removeFirst();
	}
	
	/**
	 * Rertona uma carta e a remove.
	 * @return Carta
	 */
	public Carta distribuiCartas(){
		Carta carta = getFirst();
		remove();
		return carta;
	}
	
	/**
	 * Esse método emabaralha as cartas do jogo
	 */
	public void bagunça(){
		int cont = 5000;
		while(cont > 0){
			int i = Min + (int)(Math.random() * ((Max - Min) + 1));
			baralho.troca(i);
			cont--;
		}
	}
	
	/**
	 * 
	 * @return Carta
	 */
	private Carta next(){
		Carta carta = baralho.getFirst().element;
		baralho.removeFirst();
		baralho.add(carta);
		return carta;
	}
	
	public void mostraBaralho(){		
		int tam = baralho.quantidade();
		System.out.println("O baralho tem: " + tam + " cartas");
		int contador = 1;
		while(tam > 0){
			Carta carta = next();
			if(carta.cor.equals("preto")){
				System.out.print("[" + contador + "] " + carta.poder + " - " + carta.cor );
			} else if(carta.poderSpecial) {
				System.out.print("[" + contador + "] " + carta.poder + " - " + carta.cor );			
			} else {
				System.out.print("[" + contador + "] " + carta.numero + " - " + carta.cor );
			}
			tam--;
			contador++;
			System.out.println();
		}
	}
	
	public void removeAt(int i){
		baralho.removeAt(i);
	}
}
