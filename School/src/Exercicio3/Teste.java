package Exercicio3;

public class Teste {

	public static void main(String[] args) {
		Usuario u = new Usuario("Jose",102,40);
		Aluno a = new Aluno ("João",0,85);
		a.matricular("Calculo",  80, 1);
		a.matricular("Poo", 60, 3);
		a.matricular("Fisica1", 40, 2);
		
		a.calcularCargaHorariaTotal();
	
	
		// chamada
		System.out.println("olá");
		System.out.println(a.toString());
		System.out.println(u.toString());
		
				
				
		
	}

}
