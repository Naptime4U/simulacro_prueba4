package zoo;

/**
 *
 * @author Rafa
 */
public abstract class Mamifero extends Animal {

        private static int numMamiferos = 0;
        private int periodoLactancia;
        
        Mamifero () {
            super();
            numMamiferos++;
        }
        
        Mamifero (int periodoLactancia) {
            this();
            this.periodoLactancia = periodoLactancia;
        }
        
        Mamifero (Habitat habitat, String comida, int longevidad, int periodoLactancia) {
            super(habitat, comida, longevidad);
            this.periodoLactancia = periodoLactancia;
            numMamiferos++;        
        }
        
    /**
     *
     * @return
     */
    public static int getNumMamiferos ()  { return numMamiferos;  }
        
    /**
     *
     * @param periodo
     */
    public void setPeriodoLactancia ( int periodo ) { periodoLactancia = periodo;  }
        
    /**
     *
     * @return
     */
    public int getPeriodoLactancia () { return periodoLactancia; }
        
    /**
     *
     * @throws Throwable
     */
    @Override
        protected void finalize () throws Throwable {
            numMamiferos--;
            super.finalize();
        }
   
}
