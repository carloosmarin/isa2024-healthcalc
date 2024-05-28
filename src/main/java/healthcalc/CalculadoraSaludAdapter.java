package programa;

public class CalculadoraSaludAdapter implements HealthHospital {
	private HealthCalcImpl calculadoraSalud;
	
	public CalculadoraSaludAdapter(){
		
		this.calculadoraSalud = HealthCalcImpl.getInstance();
	}
	

	
	@Override
	public double bmr(char genero, int edad, float altura, int peso) {
		float alturaCm = altura * 100;
		float pesoKg = peso/1000.0f;
		
		try {
			return calculadoraSalud.basalMetabolicRate(pesoKg, (int)alturaCm, genero, edad);
			
		} catch(Exception e) {
			e.printStackTrace();
			return 0;
		}

	}
	
	@Override
	public int pesoIdeal(char genero, float altura) {
		float alturaCm = altura*100;
		
		try {
		return (int)calculadoraSalud.idealWeight((int)(alturaCm), genero);
	}catch(Exception e) {
		e.printStackTrace();
		return 0;
	}
}
}

