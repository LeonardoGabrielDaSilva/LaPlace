
public class LaPlace {
	
	private double resultado;
	private double result;
	private double y;
	
	public double det(double[][] mat) {
		if(mat.length ==1) {
			return mat[0][0];
		}
		if(mat.length==2) {
			resultado = (mat[0][0] * mat[1][1]) - (mat[0][1]* mat[1][0]); 
			return resultado;
		} else {
			double mat2[][] = new double[mat.length-1][mat.length-1];
			y=0;
			for(int h =0; h<mat.length; h++) {
			int a=0;
			int b=0;
			for(a = 1; a<mat.length; a++) {
				for(b = 0; b<mat.length; b++) {
					if(b!= h) {
							if(b < h) {
								mat2[a-1][b] = mat[a][b];
							}
							else{
								mat2[a-1][b-1] = mat[a][b];
							}
				}
					if(mat.length-1==a && mat.length-1==b) {
						for(a = 0; a<mat2.length; a++) {
							for(b = 0; b<mat2.length; b++) {
							}}
					}
			}
			}
			
			y += mat[0][h] *(Math.pow(-1, h)*det(mat2));
			result += y;
		}		
		}
		
		return y;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LaPlace [y=");
		builder.append(y);
		builder.append("]");
		return builder.toString();
	}
	
}
