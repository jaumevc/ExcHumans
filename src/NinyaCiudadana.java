
public class NinyaCiudadana extends Humano implements Alumno, Ninyos{

	String nombre;
	
	//constructor
	public NinyaCiudadana(String nombre){
		this.nombre= nombre;
	}
	
	//metode de NinyaCiudadana
	public void identificarse(){
		System.out.println("La ninya ciudadana se llama "+nombre);
		System.out.println("El genero de la ninya es : "+super.sexoF);
	}

	//metode abstract de Humano
		@Override
		public void definirTipo() {
			// TODO Auto-generated method stub
			System.out.println("NINYA :");
		}
		
	
	//mètodes de ninyos
	@Override
	public void crecer() {
		// TODO Auto-generated method stub
		System.out.println("Soy una ninya y estoy creciendo");
	}


	@Override
	public void divertirse() {
		// TODO Auto-generated method stub
		System.out.println("Y también me divierto jugando");
	}

	//metodes de Alumno:
	@Override
	public void asisitirClase() {
		// TODO Auto-generated method stub
		System.out.println("Soy ninya y voy al cole");
	}


	@Override
	public void aprender() {
		// TODO Auto-generated method stub
		System.out.println("Cómo soy ninya y alumna, estoy aprndiendo");
	}

	
}
