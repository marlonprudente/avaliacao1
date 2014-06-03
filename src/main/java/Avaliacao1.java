
import utfpr.ct.dainf.if62c.avaliacao.*;

/*
 * Classe Principal
 * Chama 
 * 
 */

//package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author Marlon Mateus Prudente de Oliveira <marlonmateuspr@gmail.com>
 * 
 */
public class Avaliacao1 {
    public static void main(String[] args) {
        Poligonal poligono = new Poligonal(4);       
        Ponto ponto0 = new Ponto(1,1);
        Ponto ponto1 = new Ponto(3,3);
        Ponto ponto2 = new Ponto(6,3);
        Ponto ponto3 = new Ponto(9,1);
        poligono.setVertice(0,ponto0);
        poligono.setVertice(1,ponto1);
        poligono.setVertice(2,ponto2);
        poligono.setVertice(3,ponto3);
        poligono.setVertice(4, ponto0);     
        
        System.out.println("Area do Poligono: " + poligono.getArea());
        System.out.println("Perimetro do Poligono: " + poligono.getPerimetro());
    
    }
}
