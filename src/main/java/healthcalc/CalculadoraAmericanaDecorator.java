package programa;

public class CalculadoraAmericanaDecorator implements CalculadoraDecorator{
	private HealthHospital healthCalc;
	
	public CalculadoraAmericanaDecorator(HealthHospital healthCalc) {
		this.healthCalc=healthCalc;
	}
	
	@Override
	public double bmr(char genero,int edad, float altura,int peso) {
		return healthCalc.bmr(genero, edad, altura*30.48f, Math.round(peso/2.20462f));
	}
	
	@Override
	public int pesoIdeal(char genero, float altura) {
		return healthCalc.pesoIdeal(genero, altura*30.48f);
		
	}
	
	

}
