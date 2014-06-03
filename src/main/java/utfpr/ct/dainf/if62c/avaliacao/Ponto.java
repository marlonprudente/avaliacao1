package utfpr.ct.dainf.if62c.avaliacao;

/**
 * Representa um ponto no plano.
 * @author Marlon Mateus Prudente de Oliveira <marlonmateuspr@gmail.com>
 */
public class Ponto {
    
    // as coordenadas do ponto
    private double x;
    private double y;
    
    /**
     * Construtor que inicializa as coordenadas do ponto.
     * @param x A coordenada x do ponto
     * @param y A coordenada y do ponto
     */
    public Ponto(double x, double y) {
        // TODO: inicialize as coordenadas do ponto
        this.x = x;
        this.y = y;
    }   
    // Implementar os seguintes métodos:
    public double getX(){        
         return this.x;         
     }
   public double getY(){
        return this.y;
    }
     public void setXY(double x, double y){
         this.x = x;
         this.y = y;
     }
    
    /**
     * Retorna uma representação textual do ponto no formato (x, y).
     * @return 
     */
    @Override
    public String toString() {
        // TODO: retona um String com as coordenadas do ponto no formato (x, y),
        // por exemplo, (1,11, 2,22) para um ponto com coordenadas x = 1.11 e
        // y = 2.22
        String coord = "(" + this.x + "   " + this.y + ").";
        return coord;
    }
    
}
