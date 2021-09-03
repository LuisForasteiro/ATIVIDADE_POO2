package Application;

public class Main {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente (198768, "Matheus Santos", "GERENTE GERAL"); 
		System.out.println(gerente);
		System.out.printf(gerente.getEmpregadoCat());

	}

}
