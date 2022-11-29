package OrientacaoAObjetos;


public class Calculos {
	//definição dos atributos
	int op1,
	    op2,
	    resultado;
	
	//método construtor alternativo
	public Calculos(int o1, int o2) {
		op1  = o1;
		op2 = o2;
	}
	// gets e sets
	 void setOp1(int op) { // atribui valores a op1
		op1 = op;
	}
	 void setOp2(int op) {
		 op2 = op;
	 }
	 int getResultado() {
		 return resultado;
	 }
	 int somar() {
		 resultado = op1 + op2;
		 return resultado;
	 }
	 int subtrair() {
		 resultado = op1-op2;
		 return resultado;
	 }
	 int getOp1 () {
		 return op1;
	 }
	 int getOp2() {
		 return op2;
	 }
	 
}

