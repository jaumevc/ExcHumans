
/*
 * ENUNCIAT:
 * El ejercicio consiste en crear las siguientes clases:
 * (Es para ver si entienden los conceptos de miembros, clases, objetos, métodos.)
 * Clase humano, Clase Hombre, Clase Mujer, Clase HombrePolicia, Clase MujerPolocia,
 * Clase Hombre Bombero, Clase HombreCiudadano, Clase MujerCiudadano, Clase NiñoCiudadano,
 * Clase NiñaCiudadano, Clase HombreDoctor, Clase MujerEnfermera.
*/

//ESTRUCTURA:
//Humano(ABSTRACT CLASS : atributos : genero M/F + 1metodo vacio (obligatorio) + 1 con codigo)

//Hombre(INTERFACE : ejercer() /descansar() )
//HombreCiudadano (INTERFACE : pagarImpuestos() / votar())
//HombreBombero || HombreDoctor || HombrePolicia (CLASS extends Humano || implements: Hombre / HombreCiudadano)

//Mujer (INTERFACE : criar() )
//MujerCiudadano (INTERFACE : ejercer() )
//MujerEnfermera || MujerPolicia (CLASS extends Humano || implements: Mujer / MujerCiudadano)

//Alumno (INTERFACE : asisitirClase () / aprender())
//Ninyos (INTERFACE : crecer() / divertirse())
//NinyoCiudadano || NinyaCiudadana(CLASS : atribut + constructor extends Humano || implemets : ninyos / alumnos)

public class Main {
	
	public static void main(String[] args){
		
		HombrePolicia starsky;
		HombreDoctor hause;
		HombreBombero romero;
		
		MujerEnfermera susanna;
		MujerPolicia aurora;
		
		NinyaCiudadana mariona;
		NinyoCiudadano biel;
		
		
		starsky = new HombrePolicia();
		//metode heretat de Abstract Humano:
		starsky.definirTipo();
		//metode propi d'HombrePolicia:
		starsky.identificarse();
		//metodes heretats de HombreCiudadano
		starsky.pagarImpuestos();
		starsky.votar();
		//metodes heretats d'Hombre
		starsky.ejercer();
		starsky.descansar();
		
		System.out.println("");
		
		hause = new HombreDoctor();
		//metode heretat de Abstract Humano:
		hause.definirTipo();
		//metode propi d'HombreCiudadano:
		hause.identificarse();
		//metodes heretats de HombreCiudadano
		hause.pagarImpuestos();
		hause.votar();
		//metodes heretats d'Hombre
		hause.ejercer();
		hause.descansar();
		
		System.out.println("");
		
		romero = new HombreBombero();
		//metode heretat de Abstract Humano:
		romero.definirTipo();
		//metode propi d'HombreCiudadano:
		romero.identificarse();
		//metodes heretats de HombreCiudadano
		romero.pagarImpuestos();
		romero.votar();
		//metodes heretats d'Hombre
		romero.ejercer();
		romero.descansar();
		
		System.out.println("***************************************");
		
		susanna = new MujerEnfermera();
		//metode heretat de Abstract Humano:
		susanna.definirTipo();
		//metode amb codi d'Abstract Humano:
		susanna.Saludar("HOLA QUE TAL!!!!");
		//metode propi d'HombreCiudadano:
		susanna.presentarse();
		//metodes heretats de MujerCiudadana
		susanna.ejercer();
		//metode heretat de Mujer
		susanna.criar();
		
		System.out.println("");
		
		aurora = new MujerPolicia();
		//metode heretat de Abstract Humano:
		aurora.definirTipo();
		//metode amb codi d'Abstract Humano:
		aurora.Saludar("HOLA QUE TAL!!!!");
		//metode propi d'HombreCiudadano:
		aurora.presentarse();
		//metodes heretats de MujerCiudadana
		aurora.ejercer();
		//metode heretat de Mujer
		aurora.criar();
		
		System.out.println("***************************************");
		
		mariona = new NinyaCiudadana("Mariona");
		//metode heretat de Abstract Humano:
		mariona.definirTipo();
		//metode propi de NinyaCiudadana:
		mariona.identificarse();
		//metodes heretats de Alumno
		mariona.aprender();
		mariona.asisitirClase();
		//metodes heretats de Ninyos
		mariona.crecer();
		mariona.divertirse();
		
		System.out.println("***************************************");
		
		biel = new NinyoCiudadano("Biel");
		//metode heretat de Abstract Humano:
		biel.definirTipo();
		//metode propi de NinyoCiudadano:
		biel.identificarse();
		//metodes heretats de Alumno
		biel.aprender();
		biel.asisitirClase();
	    //metodes heretats de Ninyos
		biel.crecer();
		biel.divertirse();
			
	}

}
