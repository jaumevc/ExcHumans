
public abstract class Humano {
		
	String sexoM ="Masculino";
	String sexoF = "Femenino";
	
	public abstract void definirTipo();
	
	//abstract: com a mínim un mètode buit, per tant aquest no cladria
	public void Saludar(String saludo){
		System.out.println(saludo);
		
	}
	
	
	

}
