// Clase de Composición: Arma 
public class Arma {
    String nombreArma; 
    private int dañoAdicional; 

    public Arma(String nombre, int dañoAdicional) {
        this.nombreArma = nombre;
        this.dañoAdicional = dañoAdicional;
    }

    public int getDañoAdicional() { 
        return dañoAdicional;
    }

    // Se asume que este método solo retorna el daño para ser usado en Criatura.atacar
    public String atacarConArma() {
        return "ataca con su " + nombreArma + " haciendo un daño adicional de " + dañoAdicional;
    }
}
