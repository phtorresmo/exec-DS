package testesarquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LerEscreverTXT {

	BufferedReader br; //lê
	BufferedWriter bw; //grava
	String arquivo = "./bd/arquivo.txt"; //local onde arquivo será salvo
	
	void salvar(String conteudo) { //qnd chamar esse método, salva o arq
		try {
			bw = new BufferedWriter(new FileWriter(arquivo, false));
			bw.write(conteudo);
			bw.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar arquivo: "+e);
		}
	}
	
	
	String abrir() {
		String retorno = "";
		try {
			br = new BufferedReader(new FileReader(arquivo));//Abre arquivo para leitura
			String linha ="";//linha em branco para leitura em etapas
			while((linha = br.readLine()) != null) { //repete enquando encontra linhas (!=null)
				retorno += linha + "\n"; //retorna todas as linhas (+=)
			}
			br.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado: "+e);
		} catch (IOException e) {

			JOptionPane.showMessageDialog(null, "Erro ao salvar arquivo: "+e);
		}
		return retorno;
	}
	int contarLn() throws IOException {
		int resp = 0; 
		br = new BufferedReader(new FileReader(arquivo));
		while((br.readLine()) != null) {
			resp += 1;
		
		}
		return resp;	
	}
	int contarCaract() throws IOException {
		int resp = 0;
		String linha = "";
		br = new BufferedReader(new FileReader(arquivo));
		while((linha = br.readLine()) != null) {
			resp += linha.length();	
		}
		return resp;
	}

	public void renameTo(String text) {

	}
	
	
}
