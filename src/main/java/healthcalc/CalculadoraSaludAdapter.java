package programa;

public class CalculadoraSaludAdapter implements HealthHospital {
	private HealthCalcImpl calculadoraSalud;
	
	public CalculadoraSaludAdapter(){
		
		this.calculadoraSalud = HealthCalcImpl.getInstance();
	}
	

	
	@Override
	public double bmr(Gender genero, int edad, float altura, int peso) {
		float alturaCm = altura * 100;
		float pesoKg = peso/1000.0f;
		
		try {
			double bmr = calculadoraSalud.basalMetabollicRate(new EspecPerson(pesoKg, (int)alturaCm, edad, genero));
			return bmr;
		} catch(Exception e) {
			e.printStackTrace();
			return 0;
		}

	}
	
	@Override
	public int pesoIdeal(Gender genero, float altura) {
		float alturaCm = altura*100;
		
		try {
		return (int)calculadoraSalud.getIdealBodyWeight(new EspecPerson((int)(alturaCm), genero));
	}catch(Exception e) {
		e.printStackTrace();
		return 0;
	}
}
}

