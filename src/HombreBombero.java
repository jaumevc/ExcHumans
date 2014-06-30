
public class HombreBombero extends Humano implements Hombre, HombreCiudadano{

	String nombre = "Romero";
	public void identificarse(){
		System.out.println("Me llamo "+this.nombre+" mi genero es "+super.sexoM);
	}
	
	//metode abstract de Humano
	@Override
	public void definirTipo() {
		// TODO Auto-generated method stub
		System.out.println("HOMBRE :");
	}
		
	
	//herència d'HombreCiudadano:
	@Override
	public void pagarImpuestos() {
		// TODO Auto-generated method stub
		System.out.println("Como buen ciudadano pago mis impuestos");
	}

	@Override
	public void votar() {
		// TODO Auto-generated method stub
		System.out.println("Ejerzo mi derechoa al voto cada 4 anyos");
	}
	
	//herència d'home:
	@Override
	public void ejercer() {
		// TODO Auto-generated method stub
		System.out.println("Mi profesión es la de Bombero");
	}

	@Override
	public void descansar() {
		// TODO Auto-generated method stub
		System.out.println("Por vacaciones me voy a Cadaqués");
	}


}
