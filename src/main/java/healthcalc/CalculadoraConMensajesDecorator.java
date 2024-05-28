package programa;

public class CalculadoraConMensajesDecorator implements CalculadoraDecorator{
	private CalculadoraDecorator calculadora;
	private String idioma;
	
	public CalculadoraConMensajesDecorator(CalculadoraDecorator calculadora, String idioma) {
		this.calculadora = calculadora;
		this.idioma = idioma;
	}
	
	@Override
	public double bmr(char genero, int edad, float altura, int peso) {
		double resultado = calculadora.bmr(genero, edad, altura, peso);
		mostrarMensajeBMR(genero,altura, peso,resultado);
		return resultado;
	}
	
	@Override 
	public int pesoIdeal(char genero, float altura) {
		return calculadora.pesoIdeal(genero, altura);
	}
	
	private void mostrarMensajeBMR(char genero, float altura,int peso, double bmr) {
		String mensaje = "";
		if (idioma.equals("es")) {
			mensaje = "La persona con altura " + altura + "metros y " + peso + " Kg tiene un BMR de " + bmr + ".";
			
		}else if(idioma.equals("en")) {
			mensaje = "The person with height " +altura + "meters and " + peso + " Kg has a BMR of " + bmr + ".";
		}
		
		System.out.println(mensaje);
	}
	
	
	

}
