/*
 * Classe Principal
 * Chama 
 * 
 */

package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author Marlon Mateus Prudente de Oliveira <marlonmateuspr@gmail.com>
 * 
 */
public class Avaliacao1 {
    public static void main(String[] args) {
        Poligonal poligono = new Poligonal(4);       
        poligono.setVertice(0, 1, 1);
        poligono.setVertice(1, 3, 3);
        poligono.setVertice(2, 6, 3);
        poligono.setVertice(3, 9, 1);
        poligono.setVertice(4, 1, 1);      
        
        System.out.println("Area do Poligono: " + poligono.getArea());
        System.out.println("Perimetro do Poligono: " + poligono.getPerimetro());
    
    }
}
