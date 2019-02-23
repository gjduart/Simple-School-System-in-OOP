package Exercicio3;

import java.util.ArrayList;

public class Aluno extends Usuario {

	Aluno ( String nome, int horas, int matricula){
		super(nome,0,matricula);
	}
	private ArrayList<Disciplina> D = new ArrayList<Disciplina>();
	
		

	
	public void matricular (String nome) {
		D.add(new Disciplina(nome));
	}
	public void matricular(String nome , int cargahoraria, int semestre) {
		D.add(new Disciplina(nome,cargahoraria,semestre));
		
	}

	
	public void calcularCargaHorariaTotal() {
		for (int i = 0; i <3; i++) {
		setCargaHorariaTotal(D.get(i).getCargahoraria()+getCargaHorariaTotal());
		}
	}
	public String toString() {
		return super.toString() +D.get(1).toString()   ;
				
						}

	public ArrayList<Disciplina> getD() {
		return D;
	}

	public void setD(ArrayList<Disciplina> d) {
		D = d;
	}	
}
