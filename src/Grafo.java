import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Grafo  {
	private ArrayList<Vertice> vertices = new ArrayList<Vertice>();
	private ArrayList<Aresta> arestas = new ArrayList<Aresta>();

	
	public Vertice adicionarVertice(int info) {
		Vertice novoVertice = new Vertice(info);
		this.vertices.add(novoVertice);
		return novoVertice;
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
	
	public void buscarLargura(Vertice o) {
		ArrayList<Vertice> marcados = new ArrayList<Vertice>();
		Queue<Vertice> q = new LinkedList<Vertice>();
//		PriorityQueue<Vertice> q = new PriorityQueue<Vertice>();
		
		q.add(o); //adicionar fila
		marcados.add(o); //marcar o vertice
		
		while(q.isEmpty() == false) {
			Vertice v = q.remove();
			System.out.println(v.info);
			for(Vertice i: v.adjacentes) {
				if(!marcados.contains(i)) {
					q.add(i);
					marcados.add(i);
				}
			}	
		}
	}
	
	public void buscarLargura2(Vertice o) {
		ArrayList<Vertice> marcados = new ArrayList<Vertice>();
		Queue<Vertice> q = new LinkedList<Vertice>();
		
		q.addAll(o.adjacentes); 
		marcados.add(o); 
		
		while(q.isEmpty() == false) {
			Vertice v = q.remove();
			if(!marcados.contains(v)) {
				System.out.println(v.info);
				q.addAll(v.adjacentes);
				marcados.add(v);
			}
		}
	}
	
	public void buscarProfundidade(Vertice o) {
		ArrayList<Vertice> marcados = new ArrayList<Vertice>();
		Stack<Vertice> pilha = new Stack<Vertice>();
		
		pilha.push(o); //adicionar pilha
		marcados.add(o); //marcar o vertice
		
		while(pilha.isEmpty() == false) {
			Vertice v = pilha.peek();
			System.out.println(v.info);
			boolean adicionaPilha = false;
			Vertice novo = null;
			
			for(Vertice i: v.adjacentes) {
				if(!marcados.contains(i)) {
					System.out.print("ADD"+ "-" +i.info);
					System.out.println();
					adicionaPilha = true;
					novo = i;
					break;
				} 
			}
			
			if(adicionaPilha) {
				pilha.push(novo);
				marcados.add(novo);
			} else {
				Vertice newV = pilha.peek();
				System.out.print("REMOVE"+ "-" + newV.info);
				System.out.println();
				pilha.pop();
			}

		}
		
	}
		
	
	public void print() {
		for(Aresta v: arestas) {
		  System.out.println(v.origem.info + "-" + v.destino.info + " W: " + v.peso);
		}
	}



}
