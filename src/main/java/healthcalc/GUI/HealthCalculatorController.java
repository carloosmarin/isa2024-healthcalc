package programa.GUI;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import programa.HealthCalcImpl;
import programa.Gender;
import programa.Person;
import programa.EspecPerson;


public class HealthCalculatorController implements ActionListener{

	private Gender gender = null;
	private int height = 1;
	private int age = 1;
	private float weight = 1;
	private HealthCalcImpl calculadora = HealthCalcImpl.getInstance();
	private HealthCalculatorView vista;
	
	public HealthCalculatorController(HealthCalcImpl calc, HealthCalculatorView gui) {
		this.calculadora = calc;
		this.vista = gui;
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		switch (comando) {
			case "maleButton":
				vista.getMaleButton().setBackground(new Color(244, 182, 194));
				vista.getFemaleButton().setBackground(Color.BLACK);
				gender = Gender.MALE;
				break;
			case "femaleButton":
				vista.getFemaleButton().setBackground(new Color(244, 182, 194));
				vista.getMaleButton().setBackground(Color.BLACK);
				gender = Gender.FEMALE;
				break;
			case "getBMR":
				try {
					height = Integer.parseInt(vista.getHeightValue().getText());
					weight = Float.parseFloat(vista.getWeightValue().getText());
					age = (Integer) vista.getAgeValue().getValue();
					
					try {
						Person person = new EspecPerson(weight,height,age,gender);
						double bmr = this.calculadora.basalMetabollicRate(person);
			            vista.setBMRResults(bmr);
					} catch (Exception e1) {
						vista.invalidInputsBMR(e1.getMessage());
					}
				} catch (Exception e0) {
					vista.noInputsErr();
				}
				break;
			case "getIdealW":	
				try {
					height = Integer.parseInt(vista.getHeightValue().getText());
					
					try {
						Person person = new EspecPerson(height,gender);
						double idealWeight = this.calculadora.getIdealBodyWeight(person);
			            vista.setIdealWResults(idealWeight);
					} catch (Exception e1) {
						vista.invalidInputsIdealWError(e1.getMessage());
					} 
					
				} catch (Exception e0) {
					vista.noInputsErr();
				}
				break;
				
		}
	}

}
