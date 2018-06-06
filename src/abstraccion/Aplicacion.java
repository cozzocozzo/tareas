/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author celes
 */
public class Aplicacion {
    public static void main(String[] args) {
        
   Pesos p= new Pesos();
   p.setPeso(0);
   
   Conversion c= new Conversion();
    c.setPesos(p);
            
            System.out.println(c.alturaporpeso());
            
   }
}
