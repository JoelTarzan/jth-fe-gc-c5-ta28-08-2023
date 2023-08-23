import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiniCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldOperando1;
	private JTextField textFieldOperando2;
	private JTextField textFieldResultado;

	/**
	 * Create the frame.
	 */
	public MiniCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Mini Calculadora");
		lblTitle.setBounds(162, 11, 107, 14);
		contentPane.add(lblTitle);
		
		// Operando 1
		JLabel lblOperando1 = new JLabel("Operando 1");
		lblOperando1.setBounds(42, 46, 97, 14);
		contentPane.add(lblOperando1);
		
		textFieldOperando1 = new JTextField();
		textFieldOperando1.setBounds(42, 71, 86, 20);
		contentPane.add(textFieldOperando1);
		textFieldOperando1.setColumns(10);
		
		// Operador 2
		JLabel lblOperando2 = new JLabel("Operando 2");
		lblOperando2.setBounds(172, 46, 86, 14);
		contentPane.add(lblOperando2);
		
		textFieldOperando2 = new JTextField();
		textFieldOperando2.setBounds(172, 71, 86, 20);
		contentPane.add(textFieldOperando2);
		textFieldOperando2.setColumns(10);
		
		// Resultado
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(310, 46, 86, 14);
		contentPane.add(lblResultado);
		
		textFieldResultado = new JTextField();
		textFieldResultado.setBounds(310, 71, 86, 20);
		contentPane.add(textFieldResultado);
		textFieldResultado.setColumns(10);
		
		// Botones de operadores
		JButton btnSumar = new JButton("+");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double operandos[] = recogerInputs(textFieldOperando1, textFieldOperando2);
				textFieldResultado.setText(operandos[0] + operandos[1] + "");
			}
		});
		btnSumar.setBounds(100, 117, 89, 23);
		contentPane.add(btnSumar);
		
		JButton btnRestar = new JButton("-");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double operandos[] = recogerInputs(textFieldOperando1, textFieldOperando2);
				textFieldResultado.setText(operandos[0] - operandos[1] + "");
			}
		});
		btnRestar.setBounds(244, 117, 89, 23);
		contentPane.add(btnRestar);
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double operandos[] = recogerInputs(textFieldOperando1, textFieldOperando2);
				textFieldResultado.setText(operandos[0] * operandos[1] + "");
			}
		});
		btnMultiplicar.setBounds(100, 167, 89, 23);
		contentPane.add(btnMultiplicar);
		
		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double operandos[] = recogerInputs(textFieldOperando1, textFieldOperando2);
				textFieldResultado.setText(operandos[0] / operandos[1] + "");
			}
		});
		btnDividir.setBounds(244, 167, 89, 23);
		contentPane.add(btnDividir);
		
		// Botón para salir
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(335, 227, 89, 23);
		contentPane.add(btnSalir);
	}
	
	public static double[] recogerInputs(JTextField textField1, JTextField textField2) {
		double num1 = Double.parseDouble(textField1.getText());
		double num2 = Double.parseDouble(textField2.getText());
		
		double operandos[] = {num1, num2};
		return operandos;
	}
}