
public class HombrePolicia extends Humano implements Hombre, HombreCiudadano {
	
	String nombre = "Starsky";
	
	public void identificarse(){
		System.out.println("Me llamo "+this.nombre+" mi genero es "+super.sexoM);
	}
	
	//metode abstract de Humano
	@Override
	public void definirTipo() {
		// TODO Auto-generated method stub
		System.out.println("HOMBRE :");
	}
	

	@Override
	public void ejercer() {
		// TODO Auto-generated method stub
		System.out.println("Mi profesión es la de Policia");
	}


	@Override
	public void descansar() {
		// TODO Auto-generated method stub
		System.out.println("Soy policia pero estoy descansando, atrapen ustedes al ladron");
	}

	@Override
	public void pagarImpuestos() {
		// TODO Auto-generated method stub
		System.out.println("Pago mis impuestos a la fuerza");
	}

	@Override
	public void votar() {
		// TODO Auto-generated method stub
		System.out.println("No necesito votar, mi mente obedece órdenes");
	}


}
