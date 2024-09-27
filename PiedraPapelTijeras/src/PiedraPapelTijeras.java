import java.util.Scanner;

public class PiedraPapelTijeras {

    public static void main(String[] args) {

        // Creación del objeto Scanner para leer las entradas de ambos jugadores
        Scanner s = new Scanner(System.in);

        // Solicitar la entrada del Jugador 1
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine().toLowerCase();  // Convertimos a minúsculas para evitar problemas de capitalización.

        // Solicitar la entrada del Jugador 2
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine().toLowerCase();  // Convertimos a minúsculas para evitar problemas de capitalización.

        // Comprobar si hay un empate
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            // Inicializamos al jugador 2 como ganador por defecto
            int ganador = 2;

            // Evaluamos las opciones del jugador 1 utilizando un switch
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        ganador = 1;  // Gana jugador 1 si elige piedra y jugador 2 tijeras
                    }
                    break;
                case "papel":
                    if (j2.equals("piedra")) {
                        ganador = 1;  // Gana jugador 1 si elige papel y jugador 2 piedra
                    }
                    break;
                case "tijeras":
                    if (j2.equals("papel")) {
                        ganador = 1;  // Gana jugador 1 si elige tijeras y jugador 2 papel
                    }
                    break;
                default:
                    // Si el jugador 1 no introdujo piedra, papel o tijeras, mostramos un error
                    System.out.println("Elección inválida por parte del jugador 1.");
                    return;  // Terminamos el programa si la elección es inválida
            }

            // Mostrar quién ganó
            System.out.println("Gana el jugador " + ganador);
        }

        // Cerramos el scanner para evitar fugas de recursos
        s.close();
    }
}
