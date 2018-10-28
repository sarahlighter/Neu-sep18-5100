package MyIndexOutOfBoundException;

public class MyIndexOutOfBoundException extends Exception{

	private int lowerBound;
	private int upperBound;
	private int index;
	
	public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index) {
		super();
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.index=index;
	}

	public boolean outbound(){
		if(this.index<this.lowerBound || this.index>this.upperBound){
			return true;
		}
		return false;
	}
	
	public String toString(){
		return "Error Message: Index: "+this.index
				+", but Lower bound: "+this.lowerBound
				+", Upper bound: "+this.upperBound;
	}
	
	public static void main(String[] args) throws MyIndexOutOfBoundException {
		//set lower bound, upper bound and index
		MyIndexOutOfBoundException m = new MyIndexOutOfBoundException(0,9,10);
		if( m.outbound()) {
			throw m;
		}
	}
	
}
