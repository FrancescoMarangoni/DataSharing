import java.io.Serializable;
public class Persona implements Serializable {
    private static final long serialVersionUID = 1; 
    private static int ultima=1;
    private String nome;
    private int matricola;
    public Persona(String nome) {
        this.nome=nome;
        this.matricola=ultima++;
    }
    public String getNome (){
        return nome;
    }
    public String toString(){
        return nome+" "+matricola;
    }
}
