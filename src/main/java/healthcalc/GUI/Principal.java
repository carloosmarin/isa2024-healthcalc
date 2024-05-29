package programa.GUI;

import java.awt.EventQueue;

import programa.HealthCalcImpl;

public class Principal {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthCalcImpl healthCalc = HealthCalcImpl.getInstance();
					HealthCalculatorView vista = new HealthCalculatorView();
					HealthCalculatorController controlador = new HealthCalculatorController(healthCalc, vista);
					vista.registroControlador(controlador);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

