package marangoni;


import java.io.Serializable;

/**
 *
 * @author FSEVERI\marangoni3292
 */
public class Risorsa implements Serializable {
    private String nomeRisorsa;

    public Risorsa(String nomeRisorsa) {
        this.nomeRisorsa = nomeRisorsa;
    }

    public String getNomeRisorsa() {
        return nomeRisorsa;
    }
    

    @Override
    public String toString() {
        return "Risorsa{" + "nomeRisorsa=" + nomeRisorsa + '}';
    }

}
