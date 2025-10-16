
// Clase Abstracta: Criatura 
public abstract class Criatura {
    protected String nombre; 
    protected int salud; 
    protected int fuerza; 
    protected Arma armaEquipada; 

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
        this.armaEquipada = null;
    }
    
    // Métodos abstractos, obligatorios para las subclases 
    public abstract void atacar(Criatura objetivo);
    public abstract void defender(int daño);

    // Método concreto 
    public boolean estaViva() { 
        return salud > 0;
    }

    // Métodos para manejar la composición de Arma
    public void equiparArma(Arma arma) { 
        this.armaEquipada = arma;
        System.out.println(nombre + " ha equipado " + arma.nombreArma + ".");
    }
    
    // Getters y Setters (necesarios para la batalla)
    public int getFuerza() { return fuerza; }
    public String getNombre() { return nombre; }
    public int getSalud() { return salud; }
    public void setSalud(int nuevaSalud) { this.salud = nuevaSalud; }
    public Arma getArmaEquipada() { return armaEquipada; }
}