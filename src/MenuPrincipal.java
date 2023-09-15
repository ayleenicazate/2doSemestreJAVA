
import java.util.ArrayList;
import java.util.Scanner;

/*
 *Problema PlanteadoRetomando el problema planteado en la experiencia 2, de una aplicación que permitereproducir música, 
  se requiere como segunda etapa, crear una lista de canciones.En una primera etapa, almacenamos la información de las canciones quetiene una lista. 
  La canción tiene un título, un artista, tiempo de duración,si es favorita o no y si se encuentra descargada o no en el dispositivo.
Requerimientos
  Crear una clase que permita almacenar una lista de canciones.
  Desde el main, crear dos listas de canciones, con 3 canciones cada lista.
  Mostrar las listas de canciones, a través de un menú que permita seleccionar lalista que se desea escuchar.
  Cada grupo debe implementar un método que determinen necesario para la aplicación solicitada. 
 *
 */
/**
 *
 * @author Ayleen
 */
public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;

        //cancion
        String titulo;
        String artista;
        int duracion;
        boolean esFavorita;
        boolean estaDescargada;

        ArrayList<Cancion> listaCanciones = new ArrayList<>(3);

        Cancion cancion1 = new Cancion("Toxicity", "System of a Down", 350, true, true);
        Cancion cancion2 = new Cancion("Californication", "Red Hot Chili Peppers", 350, true, false);
        Cancion cancion3 = new Cancion("Falkor", "Covet", 350, true, true);

        listaCanciones.add(cancion1);
        listaCanciones.add(cancion2);
        listaCanciones.add(cancion3);

        do {
            System.out.println("+--------------Spookyfai------------+");
            System.out.println("|  1.- Mostrar lista de canciones   |");
            System.out.println("|  2.- Escuchar lista               |");
            System.out.println("|  3.- Salir                        |");
            System.out.println("+--------------Spookyfai------------+");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    //System.out.println(listaCanciones);
                    
                    for (Cancion cancion : listaCanciones) {
                        System.out.println("+-----------------------------------+");
                        System.out.println("   Titulo: " + cancion.getTitulo());
                        System.out.println("   Artista: " + cancion.getArtista());
                        
                    }
                case 2:
                    do {
                        System.out.println("+--¿Que lista desea escuchar?----+");
                        System.out.println(listaCanciones);
                    } while (opcion!=3);
            }
           
        } while (opcion !=3);
    } 
}

