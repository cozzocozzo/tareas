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
public class Conversion {
    private Pesos peso;
    private Alturas altura;
    
    public float alturaporpeso(){
        
        float resultado = peso.getPeso()/(altura.getAltura()*altura.getAltura());
    
    return resultado;
    }

    public Pesos getPeso() {
        return peso;
    }

    public void setPeso(Pesos peso) {
        this.peso = peso;
    }

    public Alturas getAltura() {
        return altura;
    }

    public void setAltura(Alturas altura) {
        this.altura = altura;
    }

    void setPesos() {
        
    }

    void setPesos(Pesos p) {
        
    }
    
    
    
}
