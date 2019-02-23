package Exercicio3;

public class Usuario {	
		private String nome; 
		private int matricula,cargaHorariaTotal;
		  
		Usuario (String nome,int matricula, int cargaHorariaTotal){
			this.nome = nome; 
			this.matricula = matricula ; 
			this.cargaHorariaTotal = cargaHorariaTotal ; 
		}

		
		
		public String getNome() {
			return nome;
		}
		
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		
		public int getCargaHorariaTotal() {
			return cargaHorariaTotal;
		}
		
		
		public void setCargaHorariaTotal(int cargaHorariaTotal) {
			this.cargaHorariaTotal = cargaHorariaTotal;
		}
		
		
		public int getMatricula() {
			return matricula;
		}
		
		
		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}
		
		public String toString() {
			return  "Nome: " + getNome() +  "\nMatricula:" + getMatricula() +"\nCarga horaria total :" + getCargaHorariaTotal()+ "\n\n" ;
					}
		
}
