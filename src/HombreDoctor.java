
public class HombreDoctor extends Humano implements Hombre, HombreCiudadano {

	String nombre = "Hause";
	
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
			System.out.println("Cada anyo pago mis impuestos");
		}

		@Override
		public void votar() {
			// TODO Auto-generated method stub
			System.out.println("Ejerzo mi derecho al voto cada 4 anyos, votando en blanco");
		}
		
		//herència d'home:
		@Override
		public void ejercer() {
			// TODO Auto-generated method stub
			System.out.println("Mi profesión es la de Doctor cabroncete");
		}

		@Override
		public void descansar() {
			// TODO Auto-generated method stub
			System.out.println("Por vacaciones me voy a Sitges");
		}	

}
