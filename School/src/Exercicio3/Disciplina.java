package Exercicio3;

public class Disciplina {
	private String nome; 
	private int cargahoraria,semestre;
	
	Disciplina(String nome , int cargahoraria, int semestre){
			this.nome = this.getNome();
			this.cargahoraria = this.getCargahoraria();
			this.semestre = this.getSemestre();
			
	}
	 Disciplina(String nome){
		this.nome = this.getNome();
		this.cargahoraria = 80;
		this.semestre = 1;
		
}

	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargahoraria() {
		return cargahoraria;
	}

	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}


	public String toString () {
		return "Disciplina:" + getNome() + "\nCarga Horaria: " + getCargahoraria() + "\nSemestre: " + getSemestre()+"\n\n" ;
	
		
		
		
	}
	
	
}
