package aula8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class telamarca implements ActionListener {
	JFrame tela = new JFrame("Cadastro de Marca");
	JPanel painel = new JPanel();
	
	// Campos informativos
		JLabel lbcodigo = new JLabel("Codigo: ");
		JLabel lbnome = new JLabel ("Nome: " );
		// Input de dados
		JTextField txtcodigo = new JTextField();
		JTextField txtnome = new JTextField();
		// botoes
		JButton btsalvar = new JButton("Salvar");
		
		
		void criarTela() {
			tela.setSize(350, 350);//Tamanho da tela
			tela.setLocation(200, 200);// Posição da tela
			painel.setLayout(null);
			
			lbcodigo.setBounds(30, 20, 100, 30);
			txtcodigo.setBounds(130, 20, 140, 30);
			lbnome.setBounds(30, 70, 100, 30);
			txtnome.setBounds(130, 70, 140, 30);
			
			btsalvar.setBounds(40, 180, 100, 30);
			btsalvar.addActionListener(this);//Ação do Botão
			
			painel.add(lbcodigo);
			painel.add(txtcodigo);
			painel.add(lbnome);	
			painel.add(txtnome);
			painel.add(btsalvar);	
			
			
			
			
			tela.getContentPane().add(painel);
			tela.setVisible(true);// tornar a tela visivel p/ o usuario
			
		
		}

		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== btsalvar) {
				JOptionPane.showMessageDialog(null,"Marca salva com sucesso!");
			}
			
		}
		

}
