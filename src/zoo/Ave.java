package zoo;

/**
 *
 * @author Rafa
 */
public abstract class Ave extends Animal {

        private static int numAves = 0;
        private int periodoIncubacion;
        
        Ave () {
            super();
            numAves++;
        }
        
        Ave (int periodoIncubacion) {
            this();
            this.periodoIncubacion = periodoIncubacion;
        }
        
        Ave (Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
            super(habitat, comida, longevidad);
            this.periodoIncubacion = periodoIncubacion;
            numAves++;        
        }
        
    /**
     *
     * @return
     */
    public static int getNumAves ()  { return numAves;  }
        
    /**
     *
     * @param periodo
     */
    public void setPeriodoIncubacion ( int periodo ) { periodoIncubacion = periodo;  }
        
    /**
     *
     * @return
     */
    public int getPeriodoIncubacion () { return periodoIncubacion; }
        
    /**
     *
     * @throws Throwable
     */
    @Override
        protected void finalize () throws Throwable {
            numAves--;
            super.finalize();
        }
   
}
