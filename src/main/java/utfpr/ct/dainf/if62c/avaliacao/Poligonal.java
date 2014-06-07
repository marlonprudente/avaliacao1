package utfpr.ct.dainf.if62c.avaliacao;

/**
 * Representa uma poligonal fechada.
 *
 * @author Marlon Mateus Prudente de Oliveira <marlonmateuspr@gmail.com>
 */
public class Poligonal {

    private final Ponto[] vertices;

    /**
     * Construtor que inicializa a poligonal com um vetor de vértices recebido.
     *
     * @param vertices Os vértices da poligonal
     */
    public Poligonal(Ponto[] vertices) {
        this.vertices = vertices;
    }

    /**
     * Construtor que inicializa um vetor de n+1 vértices.
     *
     * @param n O número de vértices da poligonal
     */
    public Poligonal(int n) {
        // inicializa o vetor de vertices com n+1 vértices 
        //Ponto[] ponto = new Ponto[n +1];
        this.vertices = new Ponto[n + 1];
        //throw new UnsupportedOperationException("Não implementado");
    }

    // Implmentar os seguintes métodos:
    public Ponto getVertice(int i) {
        //return vertices[i];
        return i < 0 || i >= vertices.length ? null : vertices[i];
    }

    public void setVertice(int i, double x, double y) {
        Ponto set = new Ponto(x, y);
        set.setXY(x, y);
        
        if (i > this.vertices.length || i < 0) {

        } else {
            this.vertices[i] = new Ponto(x, y);
            
        }
            this.vertices[this.vertices.length - 1] = this.vertices[0];
    }
    
    public void setVertice(int i, Ponto x) {
        
        if (i > this.vertices.length || i < 0) {

        } else {
            this.vertices[i] = x;
            
        }
            this.vertices[this.vertices.length - 1] = this.vertices[0];
    }
    // setVertice(int i, Ponto vertice)
    public double getArea() {
        double soma = 0;
        for (int i = 1; i < this.vertices.length; i++) {
            soma = soma + (this.vertices[i].getX() - this.vertices[i-1].getX()) * (this.vertices[i].getY() + this.vertices[i-1].getY());
        }
        double area = 0.5 * Math.abs(soma);
        return area;
    }

    public double getPerimetro() {
        double perimetro = 0;
        for (int i = 1; i < this.vertices.length; i++) {
            perimetro = perimetro + Math.sqrt(Math.pow((this.vertices[i].getX() - this.vertices[i-1].getX()), 2) + Math.pow((this.vertices[i].getY() - this.vertices[i-1].getY()), 2));
        }

        return perimetro;
    }

}
