package programa.GUI;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import programa.HealthCalcImpl;


public class HealthCalculatorController implements ActionListener{

	private char gender = 'x';
	private int height = 0;
	private int age = 0;
	private float weight = 0;
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
				gender = 'm';
				break;
			case "femaleButton":
				vista.getFemaleButton().setBackground(new Color(244, 182, 194));
				vista.getMaleButton().setBackground(Color.BLACK);
				gender = 'w';
				break;
			case "getBMR":
				try {
					height = Integer.parseInt(vista.getHeightValue().getText());
					weight = Float.parseFloat(vista.getWeightValue().getText());
					age = (Integer) vista.getAgeValue().getValue();
					
					try {
						float bmr = this.calculadora.basalMetabolicRate(weight, height, gender, age);
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
						float idealWeight = this.calculadora.idealWeight(height, gender);
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
