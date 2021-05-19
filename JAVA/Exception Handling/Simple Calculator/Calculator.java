
public class Calculator {

	private int no1;
	private int no2;
	private char operation;
	
	public int getNo1() {
		return no1;
	}
	public void setNo1(int no1) {
		this.no1 = no1;
	}
	public int getNo2() {
		return no2;
	}
	public void setNo2(int no2) {
		this.no2 = no2;
	}
	public char getOperation() {
		return operation;
	}
	public void setOperation(char operation) {
		this.operation = operation;
	}
	
	public int performCalculation()
	{
		int result=0;
		//fill the code
		try{
		    switch(operation){
		        case '+':
		            result=no1+no2;
		            break;
		        case '-':
		            result=no1-no2;
		            break;
		        case '*':
		            result=no1*no2;
		            break;
		        case '/':
		            result=no1/no2;
		            break;
		    }
		}catch(ArithmeticException e){
		    result=-1;
		}finally{
		    no1=0;
		    no2=0;
		}
		return result;
	}
	
	public Calculator(){}
}
