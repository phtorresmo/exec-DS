package testesarquivo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

public class FormTeste extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	static LerEscreverTXT le;
	private JPanel painel;
	private JButton btnLer, btnSave, btnSaveas, btnMudaNomearq, btnTotln, btnMaisc, btnCaract;
	private JTextArea areaTexto;
	private JTextField newFileName;
	private JLabel texto, texto2;
	
	FormTeste(){
		//base para abrir um form***
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Bloco de Notas | GUI");
		setSize(630, 600);
		painel = new JPanel();
		setContentPane(painel);
		painel.setBackground(Color.DARK_GRAY);
		setLocationRelativeTo(null);
		setLayout(null);
		//***
		
		texto = new JLabel("");
		texto.setBounds(20, 300, 650, 40);
		texto.setForeground(Color.white);
		texto.setFont(new Font("Times New Roman", Font.BOLD, 15));
		painel.add(texto);
		
		texto2 = new JLabel("");
		texto2.setBounds(200, 300, 650, 40);
		texto2.setForeground(Color.white);
		texto2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		painel.add(texto2);
		
		btnLer = new JButton("Ver arquivo");
		btnLer.setBounds(10, 10, 150, 35);
		btnLer.setBackground(Color.orange);
		btnLer.setFont(new Font("Times New Roman", Font.BOLD, 15));
		painel.add(btnLer);
		btnLer.addActionListener(this);
		
		btnSave = new JButton("Salvar");
		btnSave.setBounds(10, 50, 150, 35);
		btnSave.setBackground(Color.orange);
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 15));
		painel.add(btnSave);
		btnSave.addActionListener(this);
		
		btnSaveas = new JButton("Salvar como: ");
		btnSaveas.setBounds(170, 10, 150, 35);
		btnSaveas.setBackground(Color.cyan);
		btnSaveas.setFont(new Font("Times New Roman", Font.BOLD, 15));
		painel.add(btnSaveas);
		btnSaveas.addActionListener(this);
		
		btnMaisc = new JButton("Deixar maiúsculo");
		btnMaisc.setBounds(170, 50, 150, 35);
		btnMaisc.setBackground(Color.cyan);
		btnMaisc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		painel.add(btnMaisc);
		btnMaisc.addActionListener(this);
		
		btnTotln = new JButton("Mostrar quantidade de linhas");
		btnTotln.setBounds(328, 10, 270, 35);
		btnTotln.setBackground(Color.cyan);
		btnTotln.setFont(new Font("Times New Roman", Font.BOLD, 15));
		painel.add(btnTotln);
		btnTotln.addActionListener(this);
		
		btnCaract = new JButton("Mostrar quantidade de caracteres");
		btnCaract.setBounds(328, 50, 270, 35);
		btnCaract.setBackground(Color.cyan);
		btnCaract.setFont(new Font("Times New Roman", Font.BOLD, 15));
		painel.add(btnCaract);
		btnCaract.addActionListener(this);

		areaTexto = new JTextArea("");
		areaTexto.setBounds(10, 100, 590, 100);
		areaTexto.setFont(new Font("Times New Roman", Font.BOLD, 15));
		painel.add(areaTexto);
		
		btnMudaNomearq = new JButton("OK");
		btnMudaNomearq.setBounds(450, 220, 150, 35);
		btnMudaNomearq.setBackground(Color.cyan);
		btnMudaNomearq.setFont(new Font("Times New Roman", Font.BOLD, 15));
		painel.add(btnMudaNomearq);
		btnMudaNomearq.addActionListener(this);
		btnMudaNomearq.setVisible(false);
		
		newFileName = new JTextField("");
		newFileName.setBounds(10, 220, 400, 35);
		newFileName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		painel.add(newFileName);
		newFileName.setVisible(false);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnLer) { //Botão para ver arquivo
			areaTexto.setText(le.abrir());
		}
		if(e.getSource() == btnSave) { //Botão para Salvar
			le.salvar(areaTexto.getText());
		}
		if(e.getSource() == btnSaveas) { //Botão de "Salvar como"
			newFileName.setVisible(true);
			btnMudaNomearq.setVisible(true);
		}
		if(e.getSource() == btnMudaNomearq) { //Renomeando arquivo - nesse caso só da para renomear 1 vez, apos renomear, o programa nn funciona mais com o arquivo tendo que criar outro
			File file = new File("./bd/arquivo.txt");
			file.renameTo(new File("./bd/", newFileName.getText()  + ".txt"));
			newFileName.setVisible(false);
			btnMudaNomearq.setVisible(false);
		}
		if(e.getSource() == btnMaisc) { //Deixando as letras em maiúsculo
			le.salvar(areaTexto.getText().toUpperCase());
			areaTexto.setText(le.abrir());
		}
		if(e.getSource() == btnTotln) { //Vendo total de linhas
			try {
				texto.setText("Total de linhas: " + le.contarLn() + "\n");
			} catch (IOException err) {
				JOptionPane.showMessageDialog(null, "Erro ao carregar arquivo: " + err);
			}
		}
		if(e.getSource() == btnCaract) { //Vendo total de caracteres
			try {
				texto2.setText("Quantidade total de caracteres: " + le.contarCaract());
			} catch (IOException err) {
				JOptionPane.showMessageDialog(null, "Erro ao carregar arquivo: " + err);
			}
		}
	
	}
		
	public static void main(String[] args) {
		le = new LerEscreverTXT();
		new FormTeste().setVisible(true);
	}
}
