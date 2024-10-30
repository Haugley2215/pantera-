package aula8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class telacarro implements ActionListener {

	JFrame tela = new JFrame("Cadastro de Carros");
	JPanel painel = new JPanel();
	
	// Campos informativos
	JLabel lbmodelo = new JLabel("Modelo: ");
	JLabel lbano = new JLabel ("Ano: " );
	JLabel lbvalor = new JLabel ("Valor: ");
	// Input de dados
	JTextField txtmodelo = new JTextField();
	JTextField txtano = new JTextField();
	JTextField txtvalor = new JTextField();
	// botoes
	JButton btsalvar = new JButton("Salvar");			
	JButton btexibir = new JButton("Exibir");	
	
	carro car;
	String m;
	Double v;
	int a;
	
	
	
	void criarTela() {
		tela.setSize(350, 350);//Tamanho da tela
		tela.setLocation(200, 200);// Posição da tela
		painel.setLayout(null);
		
		lbmodelo.setBounds(30, 20, 100, 30);
		txtmodelo.setBounds(130, 20, 140, 30);
		lbano.setBounds(30, 70, 100, 30);
		txtano.setBounds(130, 70, 140, 30);
		lbvalor.setBounds(30, 120, 100, 30);
		txtvalor.setBounds(130, 120, 140, 30);
		
		btsalvar.setBounds(40, 180, 100, 30);
		btsalvar.addActionListener(this);//Ação do Botão
		btexibir.setBounds(150, 180, 100, 30);
		btexibir.addActionListener(this);//Ação do Botão
		
		painel.add(lbmodelo);
		painel.add(txtmodelo);
		painel.add(lbano);
		painel.add(txtano);
		painel.add(lbvalor);
		painel.add(txtvalor);
		painel.add(btsalvar);
		painel.add(btexibir);
		
		tela.getContentPane().add(painel);
		tela.setVisible(true);// tornar a tela visivel p/ o usuario
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
	
		
		if(e.getSource()== btsalvar) {
			if(txtmodelo.getText().equals("")||
			txtano.getText().equals("")||
			txtvalor.getText().equals(""))
		JOptionPane.showMessageDialog(null,"Preencha os campos em branco!");
		}else{
		
			m = txtmodelo.getText();
			v = Double.parseDouble(txtvalor.getText());
			a = Integer.parseInt(txtano.getText());
			
			car = new carro(m, v, a);
			JOptionPane.showMessageDialog(null,"Objeto salvo com sucesso!");
			
			txtmodelo.setText("");
			txtano.setText("");
			txtvalor.setText("");
			
		
		}
		
		if(e.getSource()==btexibir) {
			
			if(car == null) {
				JOptionPane.showMessageDialog(null,"Nenhum carro cadastrado!");
			}else {
				JOptionPane.showMessageDialog(null,"O modelo: "+car.getModelo()
										+"\nO ano:"+car.getAno()
										+"\nO valor: R$ "+car.getValor());
	}
	
		}
	
}
	
}