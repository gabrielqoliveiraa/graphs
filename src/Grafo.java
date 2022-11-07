import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Grafo implements Comparable<Vertice> {
	private ArrayList<Vertice> vertices = new ArrayList<Vertice>();
	private ArrayList<Aresta> arestas = new ArrayList<Aresta>();

	
	public Vertice adicionarVertice(int info) {
		Vertice novoVertice = new Vertice(info);
		this.vertices.add(novoVertice);
		return novoVertice;
	}
	
	@Override
	public int compareTo(Vertice o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	public void adicionarAresta(double peso, Vertice org, Vertice dest) {
		Aresta novaAresta = new Aresta(peso, org, dest);
		org.adjacentes.add(dest);
		dest.adjacentes.add(org);
		this.arestas.add(novaAresta);
	}
	
	public void buscarVizinhos(Vertice vertice) {
		for(Vertice v: vertice.adjacentes) {
			  System.out.println(v.info);
		}
	}
	
	public void buscarLargura() {
		PriorityQueue<Vertice> q = new PriorityQueue<Vertice>();
		q.add(this.vertices.get(1));
		while(q.isEmpty() == false) {
			Vertice v = (Vertice)q.remove();
			System.out.println(v);
			for(Vertice i: v.adjacentes) {
				q.add(i);
			}
			
		}
		
	}
		
	
	public void print() {
		for(Aresta v: arestas) {
		  System.out.println(v.origem.info + "-" + v.destino.info + " W: " + v.peso);
		}
	}



//	@Override
//	public int compareTo(Grafo o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}




}
