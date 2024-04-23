package com.mycompany.libropoo;

public class Principal {
    package com.mycompany.libro;
import  java.util.Scanner;

public class Principal {
     /**
     * Complejidad temporal: 0(1) - Tiempo constante.
     */
    
    public static void mainn (String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese el titulo del libro");
        String titulo = sc.nextLine ();
        
        System.out.println("Ingrese el autor del libro: ");
        String autor = sc.nextLine();
        
        System.out.println("Ingrese el año de publicación del libro: ");
        int anoPublicacion = sc.nextInt();
        
        Libro libro = new Libro (titulo, autor, anoPublicacion );
        Libro.marcaLeido();
        
        System.out.println(libro.mostrarInformacion)());
        System.out.println("El libro ha sido leido? + ( Libro.getLeido ()? "sí ": "No"));
        System.out.println("El libro es antiguo?  + ( Libro. esAntiguo()? "sí ": "No"));"
        
        sc.close();
    } 
    
}

    
}
