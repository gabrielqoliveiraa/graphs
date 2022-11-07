
public class Principal {

	public static void main(String[] args) {
		Grafo grafo = new Grafo();
		
		Vertice v1 = grafo.adicionarVertice(1);
		Vertice v2 = grafo.adicionarVertice(2);
		Vertice v3 = grafo.adicionarVertice(3);
		Vertice v4 = grafo.adicionarVertice(4);
		
		
		grafo.adicionarAresta(5, v1, v2);
		grafo.adicionarAresta(9, v1, v3);
		grafo.adicionarAresta(8, v1, v4);
		grafo.adicionarAresta(10, v4, v3);

//		grafo.print();
		grafo.buscarLargura();
	}

}
