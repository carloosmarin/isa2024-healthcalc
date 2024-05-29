package programa;

public class HealthCalcImpl implements CardiovascularMetrics,MetabollicMetrics{
	
	//Singleton
	
	private static HealthCalcImpl instance;
	
	private HealthCalcImpl() {}
	
	public static HealthCalcImpl getInstance() {
		if ( instance == null) {
			instance = new HealthCalcImpl();
		}
		return instance;
	}
	
    @Override
    public double getIdealBodyWeight(Person person)  {
    	float height = person.height();
    	Gender gender = person.gender();
    	
    	switch (gender) {
        case MALE:
            double pesoIdealM = height - 100 - (height - 150) / 4f;
            if (pesoIdealM > 0) {
                return pesoIdealM;
            } else {
                throw new IllegalArgumentException("El peso ideal es cero o menor que cero.");
            }
        default:
            double pesoIdealF = height - 100 - (height - 150) / 2.5f;
            if (pesoIdealF > 0) {
                return pesoIdealF;
            } else {
                throw new IllegalArgumentException("El peso ideal es cero o menor que cero.");
            }
    }}
    
        
        
        
        

    @Override
    public double basalMetabollicRate(Person person) throws Exception {
    	float height = person.height();
    	Gender gender = person.gender();
    	float weight = person.weight();
    	int age = person.age();

        // 1. El peso debe ser mayor que cero
        // 2. El peso no debe causar un overflow del tipo de datos
        // 3. La altura debe ser mayor que cero
        // 4. La altura no debe causar un overflow del tipo de datos
        // . La edad debe ser mayor que cero
        // . El género debe estar dentro de los valores establecidos
        if (weight <= 0) {
            throw new IllegalArgumentException("El peso debe ser un valor positivo.");
        }
        if (weight >= Float.MAX_VALUE) { 
            throw new IllegalArgumentException("El peso proporcionado es demasiado grande.");
        }

        if (height <= 0) {
            throw new IllegalArgumentException("La altura debe ser un valor positivo.");
        }
        if (height >= Integer.MAX_VALUE) { 
            throw new IllegalArgumentException("La altura proporcionada es demasiado grande.");
        }

        if (age <= 0) {
            throw new IllegalArgumentException("La edad debe ser un valor positivo.");
        }
        if (age >= Integer.MAX_VALUE) { 
            throw new IllegalArgumentException("La edad proporcionada es demasiado grande.");
        }

        
        
        // Calculate BMR using the specified formula
        if (gender == Gender.MALE) {
            double metabolicrateM = 10 * weight + 6.25f * height - 5 * age + 5;
            if (metabolicrateM > 0) {return metabolicrateM;} 
            else {throw new IllegalArgumentException("El metabolismo basal es cero o menor que cero.");}
        } else {
            double metabolicrateF = 10 * weight + 6.25f * height - 5 * age - 161;
            if (metabolicrateF > 0) {return metabolicrateF;} 
            else {throw new IllegalArgumentException("El metabolismo basal es cero o menor que cero.");}
        }
    }
}