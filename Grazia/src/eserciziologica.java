public class eserciziologica {
	String nome;
	String cognome;
	int voto1;
	int voto2;
	int voto3;
	final int ESAMI = 3;
	int a;

	
	public eserciziologica(String nome, String cognome, int voto1, int voto2, int voto3) {
		
		this.nome = nome;
		this.cognome= cognome;
		this.voto1 = voto1;
		this.voto2 = voto2;
		this.voto3 = voto3;
}

	public float media() {
		int somma = voto1 + voto2 + voto3;
		float media= somma/ESAMI;
		return media;
		
		
				
	
	
}
	
}