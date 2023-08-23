import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Encuesta extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Encuesta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Título
		JLabel lblTitleSO = new JLabel("Elije un SO");
		lblTitleSO.setBounds(36, 11, 93, 14);
		contentPane.add(lblTitleSO);
		
		// Radio Buttons
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(20, 38, 109, 23);
		contentPane.add(rdbtnWindows);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(20, 64, 109, 23);
		contentPane.add(rdbtnLinux);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(20, 90, 109, 23);
		contentPane.add(rdbtnMac);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnWindows);
		bgroup.add(rdbtnLinux);
		bgroup.add(rdbtnMac);
		
		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setBounds(176, 11, 93, 14);
		contentPane.add(lblEspecialidad);
		
		JCheckBox chckbxProgramacion = new JCheckBox("Programación");
		chckbxProgramacion.setBounds(167, 38, 123, 23);
		contentPane.add(chckbxProgramacion);
		
		JCheckBox chckbxDiseno = new JCheckBox("Diseño Gráfico");
		chckbxDiseno.setBounds(167, 64, 123, 23);
		contentPane.add(chckbxDiseno);
		
		JCheckBox chckbxAdministracion = new JCheckBox("Administración");
		chckbxAdministracion.setBounds(167, 90, 123, 23);
		contentPane.add(chckbxAdministracion);
		
		JLabel lblSlider = new JLabel("Horas dedicadas en el ordenador");
		lblSlider.setBounds(36, 145, 193, 14);
		contentPane.add(lblSlider);
		
		JSlider slider = new JSlider();
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(1);
		slider.setMaximum(10);
		slider.setBounds(29, 183, 200, 45);
		contentPane.add(slider);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Miramos los radio buttons
				String osElegido = "";
				
				if (rdbtnWindows.isSelected()) {
					osElegido = "Windows";
					
				} else if (rdbtnLinux.isSelected()) {
					osElegido = "Linux";
					
				} else if (rdbtnMac.isSelected()) {
					osElegido = "Mac";
				}
				
				// Miramos ahora los checkbox
				StringBuilder especialidadesElegidas = new StringBuilder();
				
				if (chckbxProgramacion.isSelected()) {
					especialidadesElegidas.append("Programación, ");
				}
				
				if (chckbxDiseno.isSelected()) {
					especialidadesElegidas.append("Diseño Gráfico, ");
				}
				
				if (chckbxAdministracion.isSelected()) {
					especialidadesElegidas.append("Administración, ");
				}
				
				// Miramos el slider
				int horasElegidas = slider.getValue();
				
				// Creamos el mensaje
				String message = "Sistema Operativo: " + osElegido + "\n" +
						"Especialidades: " + especialidadesElegidas.toString() + "\n" +
						"Horas dedicadas: " + horasElegidas;
				
				JOptionPane.showMessageDialog(contentPane, message, "Selecciones del Usuario", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnEnviar.setBounds(289, 227, 89, 23);
		contentPane.add(btnEnviar);
	}
}