package zoo;

/**
 *
 * @author Rafa
 */
public interface Curable {

    /**
     *
     */
    public boolean enfermo = true;
    
    /**
     *
     */
    public enum Tratamiento { 

        /**
         *
         */
        ANTIBIOTICO, 

        /**
         *
         */
        ANALGESICO, 

        /**
         *
         */
        ANTITERMICO, 

        /**
         *
         */
        ANTIVIRAL, 

        /**
         *
         */
        ANTIINFLAMATORIO }
    
    /**
     *
     * @param tratamiento
     */
    public void setTratamiento (Tratamiento tratamiento);
    
    /**
     *
     * @return
     */
    public Tratamiento getTratamiento();
    
    /**
     *
     */
    public void quitarTratamiento();
}
