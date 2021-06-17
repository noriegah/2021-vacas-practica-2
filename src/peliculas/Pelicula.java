package src.peliculas;
//pelicula
public class Pelicula {
    private int idPelicula;
    private String nombrePelicula;
    private int anoPelicula;
    private String generoPelicula;

    public Pelicula(int idPelicula, String nombrePelicula, int anoPelicula, String generoPelicula){
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
        this.anoPelicula = anoPelicula;
        this.generoPelicula=generoPelicula;
    }

    /*public Pelicula(int idPelicula, String nombrePelicula){
        this(idPelicula, nombrePelicula, 0);
    }*/

    //getters y setters

    public int getIdPelicula(){
        return idPelicula;
    }

    public int getAnoPelicula(){
        return anoPelicula;
    }

    public String getNombrePelicula(){
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula){
        this.nombrePelicula = nombrePelicula;
    }

    public void setAnoPelicula(int anoPelicula){
        this.anoPelicula = anoPelicula;
    }

    public void setGeneroPelicula(String generoPelicula){
        this.generoPelicula=generoPelicula;
    }

    public String getGeneroPelicula(){
        return generoPelicula;
    }


    //fin getters y setters

    public String getInformacion(){
        String resultadoPelicula = "Id: "+idPelicula+" Nombre de la Pelicula: " + nombrePelicula+" Ano Pelicula:"+anoPelicula+" Genero Pelicula:"+generoPelicula;
        return resultadoPelicula;
    }
}
