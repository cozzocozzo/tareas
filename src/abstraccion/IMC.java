
package abstraccion;

/**
 *
 * @author celes
 */
public class IMC {
   
private Usuario peso;
    
    private Usuario altura;

    public float calcular(){
        //ESte metodo tiene lógica
        
         float resultado= peso.getPeso()/(altura.getAltura()*altura.getAltura());
         return resultado;
    }

    public Usuario getPeso() {
        return peso;
    }

    public void setPeso(Usuario peso) {
        this.peso = peso;
    }

    public Usuario getAltura() {
        return altura;
    }

    public void setAltura(Usuario altura) {
        this.altura = altura;
    }
    
    }
    
    