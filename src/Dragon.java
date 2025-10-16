// Clase Concreta: Dragon 
public class Dragon extends Criatura implements Volador {
    private String escamas;
    
    public Dragon(String nombre, int salud, int fuerza, String escamas) {
        super(nombre, salud, fuerza * 2); 
        this.escamas = escamas;
    }

    @Override
    public void atacar(Criatura objetivo) { 
        int dañoTotal = this.fuerza;
        String mensaje = this.nombre + " lanza fuego a " + objetivo.getNombre();


        
        System.out.println(mensaje + ". Daño total: " + dañoTotal);
        objetivo.defender(dañoTotal);
    }

    @Override
    public void defender(int daño) { 
        int dañoRecibido = daño - 2; 
        if (dañoRecibido < 0) dañoRecibido = 0;

        this.salud -= dañoRecibido;
        System.out.println(this.nombre + " se defiende. Recibe " + dañoRecibido + " de daño. Salud restante: " + this.salud);
    }
    
    // Implementación de la interfaz Volador 
    @Override
    public String volar() { return this.nombre + " despega en un poderoso vuelo."; }
    @Override
    public String aterrizar() { return this.nombre + " aterriza pesadamente."; }
}

