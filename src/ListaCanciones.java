
import java.util.ArrayList;

/**
 *
 * @author Ayleen Guajardo
 * @version 15-09-2023
 */
public class ListaCanciones {

    private ArrayList<Cancion> listaCancion;

    public ListaCanciones() {
        listaCancion = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion) {

        listaCancion.add(cancion);

    }

    public boolean buscarCancion(String titulo) {

        for (Cancion cancion : listaCancion) {
            if (cancion.getTitulo().equals(titulo)) {
                return true;
            }
        }
        return false;
    }

    public void eliminarCancion(String titulo) {
        for (Cancion cancion : listaCancion) {
            if (cancion.getTitulo().equals(titulo)) {
                listaCancion.remove(cancion);

            } else {
                System.out.println("La cancion no existe en el registro");
            }

        }
    }
    
    public void listarCancion(){
        for (Cancion cancion : listaCancion) {
            System.out.println(cancion);
            
            
        }
    }

}
