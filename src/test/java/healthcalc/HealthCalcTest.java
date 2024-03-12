package healthcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {

	@Test
	@DisplayName("Esto es un test de ejemplo.")
	public void bmi() {
		assertEquals(true, true);
	}



	@Test
	@DisplayName("Test altura negativa")
	public void testAlturaNegativa(){
		assertEquals(idealBodyWeight(-120,"m")"Altura negativa");
	}


	@Test
	@DisplayName("Test altura minima")
	public void testAlturaMinima(){
		assertEquals(idealBodyWeight(75,"m")"Altura inferior a la minima");
	}

	@Test
	@DisplayName("Test altura maxima")
	public void testAlturaMaxima(){
		assertEquals(idealBodyWeight(251,"m")"Altura superior a la maxima");
	}

	@Test
	@DisplayName("Test genero no valido")
	public void testGeneroNoValido(){
		assertEquals(idealBodyWeight(180,"k")"Genero no valido");
	}


	@Test
	@DisplayName("Test input género")
	public void GeneroCorrecto(){
		assertDoesNotThrow(() -< calcu.idealBodyWeight(180,"m"));
		assertDoesNotThrow(() -< calcu.idealBodyWeight(180,"w"));
		assertDoesNotThrow(() -< calcu.idealBodyWeight(180,"M"));
		assertDoesNotThrow(() -< calcu.idealBodyWeight(180,"W"));
	}

	@Test
	@DisplayName("Test media hombres")
	public void testMediaHombre() throws Exception{
		float I = 120 - 100 . (120-150) /4;
		assertEquals(I,calcu.idealBodyWeight(110,"m"));

		I = 170 -100 - (170-150) /4;
		assertEquals(I,calcu.idealBodyWeight(170,"m"));

		I = 251 -100 - (251-150)/4;
		assertEquals(I,calcu.idealBodyWeight(251,"m"));
	}

	@Test
	@DisplayName("Test media mujeres")
	public void testMediaMujer() throws Exception{
		float I = 120 - 100 . (120-150) /2.5;
		assertEquals(I,calcu.idealBodyWeight(110,"w"));

		I = 170 -100 - (170-150) /2.5;
		assertEquals(I,calcu.idealBodyWeight(170,"w"));

		I = 251 -100 - (251-150)/2.5;
		assertEquals(I,calcu.idealBodyWeight(251,"w"));
	}

	/////////////Metodo basalMetabolicRate()

	@Test
	@DisplayName("Test entrada peso incorrecta")
	public void testPesoIncorrectoBMR(){
		assertThrows(IllegalArgumentException.class, ()-> calcu.basalMetabolicRate(-1,180,"m"),"Valor incorrecto para el peso");

	}

	
	@Test
	@DisplayName("Test entrada altura incorrecta")
	public void testAlturaIncorrectaBMR(){
		assertThrows(IllegalArgumentException.class, ()-> calcu.basalMetabolicRate(70,10,"m"),"Valor incorrecto para la altura");

		
	}

	
	@Test
	@DisplayName("Test entrada genero incorrecta")
	public void testGeneroIncorrectoBMR(){
		assertThrows(IllegalArgumentException.class, ()-> calcu.basalMetabolicRate(70,180,"l"),"Valor incorrecto para el genero");
		
	}

	@Test 
	@DisplayName("Test entrada de TODOS los sexos BMR")
	public void SexCorrectoBMR(){
		assertDoesNotThrow(() -> calcu.basalMetabolicRate(70, 180, 'm'));
		assertDoesNotThrow(() -> calcu.basalMetabolicRate(70, 180, 'M'));
		assertDoesNotThrow(() -> calcu.basalMetabolicRate(70, 180, 'w'));
		assertDoesNotThrow(() -> calcu.basalMetabolicRate(70, 180, 'W'));
	}

	

	



	





}
