package src.peliculas;
import src.tienda.*;
public class VectorPeliculas {
    private Pelicula[] peliculas=new Pelicula[50];
    private int siguienteCodigo;

    public VectorPeliculas(){
        siguienteCodigo = 1;
    }

    //agregarPeliculas
    public void agregarPelicula(String nombrePelicula, int anoPelicula, String generoPelicula){
        if (siguienteCodigo > 50){
            System.out.println("Límite de peliculas alcanzado");
        }
        else{
            peliculas[(siguienteCodigo-1)] = new Pelicula(siguienteCodigo, nombrePelicula, anoPelicula,generoPelicula);
        }
        siguienteCodigo++;
    }

    public void agregarPelicula(){
        String nombrePelicula = IngresoDatos.getTexto("Ingrese el nombre de la Pelicula");
        int anoPelicula = IngresoDatos.getEntero("Ingrese el ano de lanzamiento de la pelicula", false);
        String generoPelicula = IngresoDatos.getTexto("Ingrese el genero de la Pelicula");
        agregarPelicula(nombrePelicula, anoPelicula, generoPelicula);
    }

    // fin agregar pelicula

    public void mostrarPeliculas(){
        System.out.println("\n\n Peliculas de memorabilia");
        for (int i = 0; i < (siguienteCodigo-1); i++) {
            System.out.println("-"+i+") "+peliculas[i].getInformacion());
            //System.out.println("-"+i+") "+clientes[i].getId() + " nombre "+clientes[i].getNombre()+ " telefono "+clientes[i].getTelefono());
            
        }
        System.out.println("\n\n");
    }

     //Ordenamiento
     public void ordenarPorNombre(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (siguienteCodigo-1); i++) {
            for (int j = 0; j < (siguienteCodigo-1-i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente)
                    cambio= (peliculas[j].getNombrePelicula().compareTo(peliculas[j+1].getNombrePelicula()) > 0 );
                else 
                    cambio= (peliculas[j].getNombrePelicula().compareTo(peliculas[j+1].getNombrePelicula()) < 0 );

                if(cambio ){
                    //clientes i va antes que clientes j <0 descendente
                    Pelicula aux = peliculas[j];
                    peliculas[j] = peliculas[j+1];
                    peliculas[j+1]= aux;
                }
            }
        }

    }



}
