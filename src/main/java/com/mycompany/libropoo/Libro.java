package com.mycompany.libropoo;

public class Libro {


    
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private boolean leido;

//Constructor de la clase 
    /**
     * Complejidad temporal: 0(1) - Tiempo constante.
     */
   
    public Libro(String titulo, String autor, int anoPublicacion, boolean leido) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.leido = false;
       
        
    }
    
     /**
     * Complejidad temporal: 0(1) - Tiempo constante.
     */
    
    public String mostrarInformacion (){
        String mostrarInformacion = "Titulo: " + titulo + ", Autor: " + autor + "; Año de publicación: " + anoPublicacion + ", Leído: " + (leido ? "Sí" : "No");
        return mostrarInformacion;
    }
     /**
     * Complejidad temporal: 0(1) - Tiempo constante.
     */
    public void marcarLeido (){
        this.leido = true;
    }
     /**
     * Complejidad temporal: 0(1) - Tiempo constante.
     */
    public boolean getleido (){
        return leido;   
    }
     /**
     * Complejidad temporal: 0(1) - Tiempo constante.
     */
    public boolean esAntiguo(){
        if (anoPublicacion < 1974){
            return true;
        }
        else {
            return false;
        }
    }
}   
}
