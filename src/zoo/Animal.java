package zoo;

/**
 *
 * @author Rafa
 */
public abstract class Animal implements Curable {

    private static int numAnimales = 0;

    /**
     *
     */
    protected String comida;
    private int longevidad;
    private Habitat habitat;
    private Tratamiento tratamiento;

    /**
     *
     */
    public enum Habitat {

        /**
         *
         */
        SELVA,

        /**
         *
         */
        ESTEPA,

        /**
         *
         */
        DESIERTO,

        /**
         *
         */
        BOSQUE,

        /**
         *
         */
        ARTICO
    }

    /**
     *
     */
    public Animal() {
        numAnimales++;
    }

    /**
     *
     * @param habitat
     * @param comida
     * @param longevidad
     */
    public Animal(Habitat habitat, String comida, int longevidad) {
        this();
        this.habitat = habitat;
        this.comida = comida;
        this.longevidad = longevidad;
    }

    /**
     *
     * @return
     */
    public static int getNumAnimales () { return numAnimales; }
    
    /**
     *
     * @return
     */
    public int getLongevidad () { return longevidad; }
    
    /**
     *
     * @return
     */
    public String getComida  () { return comida; }
    
    /**
     *
     * @return
     */
    public Habitat getHabitat () { return habitat; }
    
    /**
     *
     * @param longevidad
     */
    public void setLongevidad (int longevidad) { this.longevidad = longevidad; }
    
    /**
     *
     * @param comida
     */
    public void setComida (String comida) { this.comida = comida; }
    
    /**
     *
     * @param habitat
     */
    public void setHabitat (Habitat habitat) { this.habitat = habitat; }
    
    /**
     *
     * @throws Throwable
     */
    @Override
    protected void finalize () throws Throwable {
        numAnimales--;
        super.finalize();
    }

    // Implementa interface Curable

    /**
     *
     * @param tratamiento
     */
    public void setTratamiento (Tratamiento tratamiento) { this.tratamiento = tratamiento; }
    
    /**
     *
     * @return
     */
    public Tratamiento getTratamiento () { return tratamiento; }
    
    /**
     *
     */
    public void quitarTratamiento () { if (tratamiento != null) tratamiento = null; }
    
    
    // Métodos a implementar en las clases derivadas

    /**
     *
     */
    public abstract void desplazar();
    
    /**
     *
     */
    public abstract void comer();
    
}

