package uno;

public class Lista<T> {
	
	private Nodo<T> primeiro;
	private Nodo<T> ultimo;
	
	public boolean isEmpty(){
		return (primeiro == null) ? true : false;
	}
	
	/**
	 * Adiciona um Nodo<T> na primeira posição da lista
	 * @param t
	 */
	public void add(T t) {
		if (isEmpty()) {
			Nodo<T> aux = new Nodo<T>(t);
			this.primeiro = aux;
			this.ultimo = aux;
		 } else {
			 Nodo<T> aux = new Nodo<T>(t);
			this.ultimo.proximo = aux;
			this.ultimo = aux;
		}
	}
	
	/**
	 * Remove o primeiro elemento da lsita
	 */
	public void removeFirst(){
		if(primeiro.proximo == null)
			primeiro = null;
		else{
			primeiro = primeiro.proximo;
		}
	}
	
	/**
	 * retorna sem remover o primeiro elemento
	 * @return T
	 */
	public Nodo<T> getFirst(){
		return primeiro;
	}
	
	/**
	 * Retorna quantidade de elementos na fila
	 * @return
	 */
	public int quantidade(){
		Nodo<T> aux = primeiro;
		int i = 1;
		while(aux.proximo !=null){
			i++;
			aux = aux.proximo;
		}
		return i;
	}
	
	/**
	 * Esse metodo retorna um Nodo<T> através de um inteiro
	 * Pega o nodo na posição "i"
	 * @param int i
	 * @return Nodo<T>
	 */
	private Nodo<T> getNodo(int i){
		Nodo<T> aux = primeiro;
		Nodo<T> aux1 = primeiro.proximo;
		if(i!=0){
			while(i != 0){
				if(aux1.proximo == null)
					i = 0;
				aux = aux.proximo;
				aux1 = aux1.proximo;				
				i--;
			}
			aux.proximo = aux1.proximo;
			return aux1;
		}
		primeiro = primeiro.proximo;
		return primeiro;
	}
	
	/**
	 * Pega o elemento da posição i e o adiciona no começo da lista
	 * @param i
	 */
	public void troca(int i){
		Nodo<T> nodo = getNodo(i);
		add(nodo.element);
	}
	
	public void removeAt(int posicao){
		Nodo<T> nodo = getFirst();
		Nodo<T> nodo1 = getFirst().proximo;
		if(posicao != 1){
			while(posicao > 2){
				nodo1 = nodo1.proximo;
				nodo = nodo.proximo;
				posicao--;
			}
			nodo.proximo = nodo1.proximo;
		} else {
			primeiro = nodo1;
		}
	}
}
