public class Main {
    
    public void simularBatalla(Criatura criatura1, Criatura criatura2) { 
        System.out.println("\n--- INICIO DE LA BATALLA ---");
        System.out.println(criatura1.getNombre() + " vs " + criatura2.getNombre());

        Criatura atacante = criatura1;
        Criatura defensor = criatura2;
        int turno = 1;

        // Bucle de la batalla: continúa hasta que una de las criaturas muera 
        while (criatura1.estaViva() && criatura2.estaViva()) {
            System.out.println("\n--- Turno " + turno + " ---");
            
            // Demostración de habilidades especiales 
            if (atacante instanceof Volador) {
                System.out.println(((Volador) atacante).volar()); // Polimorfismo con interfaces
            }
            
            atacante.atacar(defensor); // Polimorfismo: llama al 'atacar' específico
            
            if (!defensor.estaViva()) {
                System.out.println("\n¡" + defensor.getNombre() + " ha caído!");
                break;
            }

            // Intercambio de roles
            Criatura temp = atacante;
            atacante = defensor;
            defensor = temp;
            turno++;
        }
        
        System.out.println("\n--- FIN DE LA BATALLA ---");
        if (criatura1.estaViva()) {
            System.out.println("¡El ganador es " + criatura1.getNombre() + "!"); 
        } else {
            System.out.println("¡El ganador es " + criatura2.getNombre() + "!"); 
        }
    }

    public static void main(String[] args) { 
        Main simulador = new Main();
        
        // 1. Crear instancias de criaturas con características únicas 
        Dragon Aaron = new Dragon("Aaron el poderoso", 150, 15, "Rojas");
        Mago maxi = new Mago("Maxi el hechicero", 100, 20, "Rayo");
        
        // 2. Equipar armas (Composición)
        Arma espadaFuego = new Arma("Espada de Fuego", 10);
        Arma varaMagica = new Arma("Vara Mágica", 5);
        
        Aaron.equiparArma(espadaFuego); // El dragón usa un arma
        maxi.equiparArma(varaMagica); // El mago usa un arma
        
        // El mago aprende un hechizo para demostrar la interfaz Magico 
        System.out.println(maxi.aprenderHechizo("Bola de Fuego"));
        
        // 3. Simular batallas 
        simulador.simularBatalla(Aaron, maxi);
    }
}