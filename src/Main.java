import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		ImportarCsv csv = new ImportarCsv();
		LaPlace lp = new LaPlace();
		
		
		double mat[][];
		mat = csv.importar();
	
		
		System.out.println(lp.det(mat));
	
		
		

	}

}
