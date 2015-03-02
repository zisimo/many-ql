package uva.sc.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class QuestionareForm extends JFrame {	
	
	public QuestionareForm(){
		JPanel questionsPanel = new JPanel();
        JScrollPane scroller = new JScrollPane(questionsPanel);
		setTitle ("QL Questionare Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		questionsPanel.setLayout(new BoxLayout(questionsPanel, BoxLayout.Y_AXIS));
		questionsPanel.setBorder(new EmptyBorder(new Insets(40, 60, 40, 60)));
        
		scroller.setPreferredSize(new Dimension(300,600));

		questionsPanel.add(new JLabel("Question 1"));
		questionsPanel.add(Box.createRigidArea(new Dimension(0, 5)));
		questionsPanel.add(new JTextField(10));
		questionsPanel.add(new JLabel("Question 2"));
		questionsPanel.add(Box.createRigidArea(new Dimension(0, 5)));
		questionsPanel.add(new JTextField());
		questionsPanel.add(new JLabel("Question 3"));
		questionsPanel.add(Box.createRigidArea(new Dimension(0, 5)));
		questionsPanel.add(new JTextField(10));
		questionsPanel.add(new JLabel("Question 4"));
		questionsPanel.add(Box.createRigidArea(new Dimension(0, 5)));
		questionsPanel.add(new JTextField(10));
		questionsPanel.add(new JLabel("Question 5"));
		questionsPanel.add(Box.createRigidArea(new Dimension(0, 5)));
		questionsPanel.add(new JTextField(10));
		questionsPanel.add(new JLabel("Question 6"));
		questionsPanel.add(Box.createRigidArea(new Dimension(0, 5)));
		ButtonGroup bg = new ButtonGroup();
		JRadioButton b1 = new JRadioButton("op1");
		JRadioButton b2 = new JRadioButton("op2");
		JRadioButton b3 = new JRadioButton("op3");
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		questionsPanel.add(b1);
		questionsPanel.add(b2);
		questionsPanel.add(b3);
		questionsPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		questionsPanel.add(new JButton("Submit"));
		
        add(scroller);

        pack();

		
		
		//jugar.addActionListener(lisJugar);
		//juego.addActionListener(lisJugar);
		/*botonesNivel.setBounds(150, 450, 250, 250);
		imagen.setBounds(40, 40, 500, 400);
		botonJugar.setBounds(180, 0, 100, 100);
		botonesNivel.add(n1);
		botonesNivel.add(n2);
		botonesNivel.add(n3);
		botonJugar.add(jugar);
		imagen.add(l);
		cp.add(imagen);
		cp.add(botonesNivel);
		cp.add(botonJugar);*/
	}
	
	private class ListenerJugar implements ActionListener{
			
		public void actionPerformed(ActionEvent evt){

		}
	}
	
	private class ListenerNivel implements ActionListener{
		
		public void actionPerformed(ActionEvent evt){
		}
	}
	
	public static void main(String[] args) {
		QuestionareForm form = new QuestionareForm();
		form.setVisible(true);
	}
}

