package zoo;

/**
 * Clase gallina del Zoologico
 * @author Rafa
 */
public class Gallina extends Ave {
 
    private String cacareo = "GRRRRR";
    
    /**
     * Constructor sin parametros
     */
    public Gallina () {}
    
    /**
     * Constructor con 4 parametros
     * @param habitat Ecosistema donde vive el anima
     * @param comida Alimento que consume el animal
     * @param longevidad Cuanto vive expresado en a?os
     * @param periodoIncubacion Dias de incubacion
     */
    public Gallina (Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
        super(habitat, comida, longevidad, periodoIncubacion);
    }
    
    /**
     * Metodo para establecer el mensaje de cacareo
     * @param cacareo string de mensaje de cacareo
     */
    public void setCacareo (String cacareo) { this.cacareo = cacareo; }
    
    /**
     * Metodo para obtener el mensaje de cacareo
     * @return string con el mensaje de cacareo
     */
    public String getCacareo () { return cacareo; }
    
    /**
     * Metodo para que la gallina emita un sonido
     */
    public void rugir () { System.out.println(cacareo); }
    
    /**
     * Metodo para que la gallina coma
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     * Metodo para que la gallina se desplaze
     */
    public void desplazar () { System.out.println("Estoy volando con mucha dificultad"); }
}
