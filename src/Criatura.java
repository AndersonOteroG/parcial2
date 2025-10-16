
// Clase Abstracta: Criatura 
public abstract class Criatura {
    protected String nombre; 
    protected int salud; 
    protected int fuerza; 
    

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
        
    }
    
   
    public abstract void atacar(Criatura objetivo);
    public abstract void defender(int daño);
    public abstract void lanzarHechizo(Criatura objetivo);
    public abstract void aprenderHechizo(int daño);
   
    public boolean estaViva() { 
        return salud > 0;
    }

    public int getFuerza() { return fuerza; }
    public String getNombre() { return nombre; }
    public int getSalud() { return salud; }
    public void setSalud(int nuevaSalud) { this.salud = nuevaSalud; }

}