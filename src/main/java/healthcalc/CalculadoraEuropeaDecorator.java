package programa;

public class CalculadoraEuropeaDecorator implements CalculadoraDecorator{
	private HealthHospital healthCalc;
	
	public CalculadoraEuropeaDecorator(HealthHospital healthCalc) {
		this.healthCalc= healthCalc;
	}

	@Override
	public double bmr(Gender genero, int edad, float altura, int peso) {
		return healthCalc.bmr(genero, edad, altura*100, peso/1000);
		
	}
	
	@Override
	public int pesoIdeal(Gender genero, float altura) {
        return healthCalc.pesoIdeal(genero, altura * 100);
	}
	
	
	
	
	
	
	
	
	
	
	
}
