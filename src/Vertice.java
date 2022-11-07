import java.util.ArrayList;

public class Vertice {
	public int info;
	public ArrayList<Vertice> adjacentes = new ArrayList<Vertice>();
	
	Vertice(int info) {
		this.info = info;
	}
	
	void addAdjacente(Vertice novoAdjacente) {
		this.adjacentes.add(novoAdjacente);
		return;
	}
}
