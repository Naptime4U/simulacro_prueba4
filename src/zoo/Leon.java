package zoo;

/**
 *
 * @author Rafa
 */
public class Leon extends Mamifero {
 
    private String rugido = "GRRRRR";
    
    /**
     *
     */
    public Leon () {}
    
    /**
     *
     * @param habitat
     * @param comida
     * @param longevidad
     * @param periodoLactancia
     */
    public Leon (Habitat habitat, String comida, int longevidad, int periodoLactancia) {
        super(habitat, comida, longevidad, periodoLactancia);
    }
    
    /**
     *
     * @param rugido
     */
    public void setRugido (String rugido) { this.rugido = rugido; }
    
    /**
     *
     * @return
     */
    public String getRugido () { return rugido; }
    
    /**
     *
     */
    public void rugir () { System.out.println(rugido); }
    
    /**
     *
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     *
     */
    public void desplazar () { System.out.println("Estoy en busca de " + comida); }
}
