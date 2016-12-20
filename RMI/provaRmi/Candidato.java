import java.io.Serializable;


public class Candidato implements Serializable {

	private static final long serialVersionUID = 1;
	public int voti;
	public String nome;

	public Candidato(String nome) {
		this.nome=nome;
		voti=0;
	}

	public void vota() {
		voti++;
	}

	public String toString() {
		return nome+" voti: "+voti;
	}


}