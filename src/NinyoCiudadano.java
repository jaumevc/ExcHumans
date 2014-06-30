
public class NinyoCiudadano extends Humano implements Ninyos, Alumno{
	String nombre;
	
	//constructor
	public NinyoCiudadano(String nombre){
		
		this.nombre= nombre;
	}
	
	//metode abstract de Humano
	@Override
	public void definirTipo() {
		// TODO Auto-generated method stub
		System.out.println("NINYO :");
	}
	
	//metode de NinyoCiudadano
	public void identificarse(){
		
		System.out.println("El ninyo ciudadana se llama "+nombre);
		System.out.println("El genero de la ninya es : "+super.sexoM);
	}

	@Override
	public void asisitirClase() {
		// TODO Auto-generated method stub
		System.out.println("Cuando crezca sere alumno del cole de mi barrio");
	}


	@Override
	public void aprender() {
		// TODO Auto-generated method stub
		System.out.println("Cuando vaya al cole aprendere muchas cosas");
	}


	@Override
	public void crecer() {
		// TODO Auto-generated method stub
		System.out.println("Como soy un ninyo, mi función principal es crecer");
	}


	@Override
	public void divertirse() {
		// TODO Auto-generated method stub
		System.out.println("La diversión me ayuada a crecer como Ciudadano");
	}


}
