package uno;

public class Application {

	public static void main(String[] args) {

		Baralho baralho = new Baralho();
		Jogador player1 = new Jogador("Gui");
		Jogador player2 = new Jogador("Leo");
		Jogador player3 = new Jogador("Carol");
		Jogador player4 = new Jogador("Giu");
		for(int i = 0 ; i<7;i++){
			player1.addNaMao(baralho.distribuiCartas());
			player2.addNaMao(baralho.distribuiCartas());
			player3.addNaMao(baralho.distribuiCartas());
			player4.addNaMao(baralho.distribuiCartas());
		}
		player1.mostraMao();
		player1.selecionaCarta(6);
		player1.mostraMao();
		player2.mostraMao();
		player3.mostraMao();
		player4.mostraMao();
//		baralho.mostraBaralho();
//		baralho.removeAt(1);
//		baralho.mostraBaralho();
	}

}
