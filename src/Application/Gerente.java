package Application;

public class Gerente extends Empregado {
	
	private String empregadoCat;
	
	public Gerente(int empregadoId ,String empregadoName, String empregadoCat) {
		
		super(empregadoId, empregadoName);
		this.empregadoCat = empregadoCat;
	}
	
	public String getEmpregadoCat() {
		return "FUNCAO NA LOJA: "+ empregadoCat;
	}
	
	@Override
	public String toString() {
		return ("EMPREGADO ID: " + empregadoId + ", EMPREGADO NOME: " + 
				empregadoName + ", EMPREGADO CATEGORIA: " + empregadoCat );
	}
}
