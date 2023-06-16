package maquette;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Graphics;

public class Fenetre extends JFrame {

	public Fenetre() {
		getContentPane().setLayout(new GridLayout(0, 2, 5, 0));
		String[] listeDevise = {"FCFA", "EURO", "DOLLAR US", "NAIRA", "YUAN","YEN","ROUBLE","LIVRE STERLING","DOLLAR CANADIEN","FRANCS SUISSE","DINAR","BITCOIN"};
		JComboBox combo = new JComboBox(listeDevise);
		JComboBox combo2 = new JComboBox(listeDevise);
		JPanel top = new JPanel();
		JPanel top2 = new JPanel();
		JPanel top3 = new JPanel();
		JLabel label = new JLabel("Quelle est votre devise ?");
		JLabel label2 = new JLabel("Quelle est la devise de destination ?");
		JLabel label3 = new JLabel("MONTANT ->");
		JFrame fenetre = new JFrame();
		JPanel pan = new JPanel();
		JTextField jtf = new JTextField("");
		JButton bouton = new JButton("CONVERTIR");
		
		
		fenetre.setTitle("TCHEDE by VANA ZOKOM ELIE");
		fenetre.setSize(400, 200);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.getContentPane().setLayout(new GridLayout(5, 1));

		
		combo.setPreferredSize(new Dimension(100, 20));
		top.add(label);
		top.add(combo);
		pan.add(top);
		
		Font police = new Font("Arial", Font.BOLD, 14);
		jtf.setFont(police);
		jtf.setPreferredSize(new Dimension(180, 30));
		jtf.setForeground(Color.RED);
		top3.add(label3);
		top3.add(jtf);
		pan.add(top3);
		
		combo2.setPreferredSize(new Dimension(100, 20));
		top2.add(label2);
		top2.add(combo2);
		pan.add(top2);
		
		pan.add(bouton);
		
		fenetre.setContentPane(pan);
		fenetre.setVisible(true);
	}

}
