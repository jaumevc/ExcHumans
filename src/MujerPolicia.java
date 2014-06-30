
public class MujerPolicia extends Humano implements Mujer , MujerCiudadano{
	
	String nombre = "Aurora";
	
	//metode propi de MujerPolicia
	public void presentarse(){
		System.out.println("Hola me llamo "+this.nombre+" y soy de género "+super.sexoF);
	}

	//metode abstract de Humano
	@Override
	public void definirTipo() {
		// TODO Auto-generated method stub
		System.out.println("MUJER :");
	}
		
		
	//Mètodes heretats de interfaces amb implements:
	
	@Override
	public void ejercer() {
		// TODO Auto-generated method stub
		System.out.println("Mi profesión es la de policia");
		
	}

	@Override
	public void criar() {
		// TODO Auto-generated method stub
		System.out.println("Tengo un niño y una niña");
	}
	

}
