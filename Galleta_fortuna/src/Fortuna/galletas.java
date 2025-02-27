package Fortuna;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class galletas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel labelFortuna;
	
	private String[] frases = {
            "No tengas miedo de fallar, ten miedo de no intentarlo",
            "La vida es una pregunta que solo cada persona puede responder",
            "Sé tú mismo. Todos los demás ya están ocupados",
            "La perseverancia es la clave para alcanzar tus metas y hacer realidad tus sueños",
            "El éxito no es un destino, es un viaje, disfrútalo",
            "La fortuna está en ti, no en la galleta",
            "Todo el mundo se siente atraído hacia ti",
            "Ignora la galleta anterior",
            "Ya era hora de que saliera de la galleta",
            "A los 5 años no hubieras perdido el tiempo jugando," +
                    " mejor hubieras aprendido a programar",
            "La vida no siempre es bella",
            "Felicidad es lograr hacer la tarea de programación en eclipse"
    };


	/**
	 * Create the frame.
	 */
	public galletas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GALLETA DE LA FORTUNA");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 25));
		lblNewLabel.setBounds(130, 11, 299, 29);
		contentPane.add(lblNewLabel);
		
		JLabel labelFortuna = new JLabel("Abre la galleta y mira tu destino...");
		labelFortuna.setFont(new Font("Palatino Linotype", Font.BOLD, 12));
		labelFortuna.setBounds(10, 68, 527, 83);
		contentPane.add(labelFortuna);
		
		JButton buttomFortuna = new JButton("ABRIR GALLETA");
		buttomFortuna.setFont(new Font("Broadway", Font.PLAIN, 11));
		buttomFortuna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttomFortuna.setBackground(new Color(0, 128, 255));
		buttomFortuna.setBounds(227, 231, 137, 43);
		contentPane.add(buttomFortuna);
		
		buttomFortuna.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int indice = random.nextInt(frases.length);
                labelFortuna.setText(frases[indice]);
            }
        });
		
	}
}
