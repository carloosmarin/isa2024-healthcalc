package programa.GUI;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JSpinner;

import javax.swing.JTextField;

public class HealthCalculatorView {

	private JFrame frame;
	private JTextField WeightVal;
	private JTextField HeightVal;
	private JTextField IdealWeightResults;
	private JTextField BMRResults;
	private JButton MaleB;
	private JButton FemaleB;
	private JSpinner AgeVal;
	private JButton CalcBMR;
	private JButton CalcIdealWeight;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthCalculatorView window = new HealthCalculatorView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HealthCalculatorView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(250, 230, 247));
		frame.setBounds(100, 100, 745, 607);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		
		
		JLabel lblNewLabel = new JLabel("Health Calculator");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel.setBounds(24, 11, 202, 66);
		panel.add(lblNewLabel);
		
		
		JLabel GenderLabel = new JLabel("Gender");
		GenderLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		GenderLabel.setBounds(285, 31, 88, 29);
		frame.getContentPane().add(GenderLabel);
		
		// Botones para el Género
		MaleB = new JButton("Male");
		FemaleB = new JButton("Female");
		
		MaleB.setFont(new Font("Arial", Font.BOLD, 15));
		MaleB.setBounds(337, 76, 121, 36);
		frame.getContentPane().add(MaleB);
		
		FemaleB.setFont(new Font("Arial", Font.BOLD, 15));
		FemaleB.setBounds(532, 76, 121, 36);
		frame.getContentPane().add(FemaleB);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Arial", Font.BOLD, 18));
		lblAge.setBounds(285, 123, 88, 29);
		frame.getContentPane().add(lblAge);
		
		AgeVal = new JSpinner();
		AgeVal.setFont(new Font("Arial", Font.PLAIN, 13));
		AgeVal.setBounds(427, 151, 135, 36);
		frame.getContentPane().add(AgeVal);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Arial", Font.BOLD, 18));
		lblWeight.setBounds(285, 204, 88, 29);
		frame.getContentPane().add(lblWeight);
		
		WeightVal = new JTextField();
		WeightVal.setBounds(427, 229, 135, 36);
		frame.getContentPane().add(WeightVal);
		WeightVal.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("kg");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(583, 234, 49, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setFont(new Font("Arial", Font.BOLD, 18));
		lblHeight.setBounds(285, 280, 88, 29);
		frame.getContentPane().add(lblHeight);
		
		HeightVal = new JTextField();
		HeightVal.setColumns(10);
		HeightVal.setBounds(427, 308, 135, 36);
		frame.getContentPane().add(HeightVal);
		
		JLabel lblNewLabel_1_1 = new JLabel("cm");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(583, 313, 49, 25);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		// Botones Cálculo de IdealWeight y BasalMR
		CalcIdealWeight = new JButton("Calculate Ideal Weight");
		CalcBMR = new JButton("Calculate Basal MR");
		CalcBMR.setFont(new Font("Arial", Font.BOLD, 13));
		CalcBMR.setBounds(532, 371, 173, 55);
		frame.getContentPane().add(CalcBMR);
		CalcIdealWeight.setFont(new Font("Arial", Font.BOLD, 13));
		CalcIdealWeight.setBounds(285, 371, 173, 55);
		frame.getContentPane().add(CalcIdealWeight);
		
		
		JLabel lblResults = new JLabel("Results");
		lblResults.setFont(new Font("Arial", Font.PLAIN, 18));
		lblResults.setBounds(285, 457, 88, 29);
		frame.getContentPane().add(lblResults);
		
		IdealWeightResults = new JTextField();
		IdealWeightResults.setColumns(10);
		IdealWeightResults.setBounds(285, 497, 121, 36);
		frame.getContentPane().add(IdealWeightResults);
		
		BMRResults = new JTextField();
		BMRResults.setColumns(10);
		BMRResults.setBounds(532, 497, 121, 36);
		frame.getContentPane().add(BMRResults);
		
		JLabel lblNewLabel_1_2 = new JLabel("kg");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(416, 502, 49, 25);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("kcal/day");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1_2_1.setBounds(656, 502, 49, 25);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		frame.pack();
		frame.setSize(800, 600);
		frame.setVisible(true);
	}

	public JTextField getWeightValue() {
		return WeightVal;
	}

	public JTextField getHeightValue() {
		return HeightVal;
	}

	public JTextField getIdealWeightResults() {
		return IdealWeightResults;
	}

	public JTextField getBMRResults() {
		return BMRResults;
	}

	public JButton getMaleButton() {
		return MaleB;
	}

	public JButton getFemaleButton() {
		return FemaleB;
	}

	public JSpinner getAgeValue() {
		return AgeVal;
	}

	public JButton getCalcBMR() {
		return CalcBMR;
	}

	public JButton getCalcIdealWeight() {
		return CalcIdealWeight;
	}
	
	public void registroControlador(ActionListener ctrl) {
		CalcBMR.addActionListener(ctrl);
		CalcBMR.setActionCommand("getBMR");
        
		CalcIdealWeight.addActionListener(ctrl);
		CalcIdealWeight.setActionCommand("getIdealW");
        
		MaleB.addActionListener(ctrl);
		MaleB.setActionCommand("maleButton");
        
		FemaleB.addActionListener(ctrl);
		FemaleB.setActionCommand("femaleButton");
	}
	
	public void setBMRResults(double res) {
		BMRResults.setText(String.valueOf(res));
	}
	
	public void setIdealWResults(double res) {
		IdealWeightResults.setText(String.valueOf(res));
	}
	
	public void invalidInputsIdealWError(String errCode) {
		JOptionPane.showMessageDialog(frame,
				errCode,
                "Ingrese números válidos para la altura y género",
                JOptionPane.ERROR_MESSAGE);
	}
	
	public void invalidInputsBMR(String errCode) {
		JOptionPane.showMessageDialog(frame,
                errCode,
                "Ingrese números válidos para la altura, peso, género y edad",
                JOptionPane.ERROR_MESSAGE);
	}
	
	public void noInputsErr() {
		JOptionPane.showMessageDialog(frame,
                "Debe rellenar los campos necesarios antes de calcular",
                "Ha sucedido un error",
                JOptionPane.ERROR_MESSAGE);
	}
	
	
}


