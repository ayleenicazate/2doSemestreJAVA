/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ayleen
 */
public class Cancion {
    private String titulo, artista;
    private int duracion;
    private boolean esFavorita, estaDescargada;

    public Cancion() {
    }

    public Cancion(String titulo, String artista, int duracion, boolean esFavorita, boolean estaDescargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.esFavorita = esFavorita;
        this.estaDescargada = estaDescargada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isEsFavorita() {
        return esFavorita;
    }

    public void setEsFavorita(boolean esFavorita) {
        this.esFavorita = esFavorita;
    }

    public boolean isEstaDescargada() {
        return estaDescargada;
    }

    public void setEstaDescargada(boolean estaDescargada) {
        this.estaDescargada = estaDescargada;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + ", duracion=" + duracion + ", esFavorita=" + esFavorita + ", estaDescargada=" + estaDescargada + '}';
    }
    
    
}
