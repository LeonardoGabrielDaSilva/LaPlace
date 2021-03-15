import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ImportarCsv {
	
	int j=0;
	double[][] mat;
	
	public double[][] importar() throws IOException {
		
		 int p = 0; 
		 FileReader arq1 = new FileReader("agenda.csv");
		 BufferedReader lerArq = new BufferedReader(arq1);
		 String linha = lerArq.readLine(); 
		 
		 criaMatriz();
		 
		 while(linha!=null) {
			 String[] leitura = linha.split(";");
			 for(int k=0;k<leitura.length;k++) {
				 mat[p][k] = Double.parseDouble(leitura[k]);
			 }
			 p++;
			 linha = lerArq.readLine();
		 }
	
		 arq1.close();

		return mat;
	}
	
	public double[][] criaMatriz() throws IOException{
		
		 FileReader arq1 = new FileReader("agenda.csv");
		 BufferedReader lerArq = new BufferedReader(arq1);
		 String linha = lerArq.readLine(); 
		 
		 while (linha != null) {
			 j++;
			 linha = lerArq.readLine();
		 }
		 arq1.close();

		mat = new double[j][j];
		
		return mat;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ImportarCsv [mat=");
		builder.append(Arrays.toString(mat));
		builder.append("]");
		return builder.toString();
	}
	
	
	
}