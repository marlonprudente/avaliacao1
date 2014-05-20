package utfpr.ct.dainf.if62c.avaliacao;

/**
 * Representa uma poligonal fechada.
 * @author Nome do Aluno <email@do.aluno>
 */
public class Poligonal {
    private final Ponto[] vertices;
    
    /**
     * Construtor que inicializa a poligonal com um vetor de vértices recebido.
     * @param vertices Os vértices da poligonal
     */
    public Poligonal(Ponto[] vertices) {
        this.vertices = vertices;
    }
    
    /**
     * Construtor que inicializa um vetor de n+1 vértices.
     * @param n O número de vértices da poligonal
     */
    public Poligonal(int n) {
        // inicializa o vetor de vertices com n+1 vértices
        throw new UnsupportedOperationException("Não implementado");
    }
    
    // Implmentar os seguintes métodos:
    // getVertice(int i)
    // setVertice(int i, double x, double y)
    // setVertice(int i, Ponto vertice)
    // getArea()
    // getPerimetro()

}
