package uno;

public class Nodo<T> {
	
	//Celula da lista
	
	T element;
	Nodo<T> proximo;

	Nodo(T t){
		this.element = t;
	}
	
}
