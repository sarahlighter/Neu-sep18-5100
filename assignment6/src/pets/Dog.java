package pets;

public class Dog extends Pet implements Boardable {
	private String size;
	private int[] boardStart; 
	private int[] boardEnd;
	
	public Dog(String petName, String ownerName, String color, String size) {
		super(petName, ownerName, color);
		this.size=size;
		boardStart = new int [3];
		boardEnd = new int [3];
	}

	public String getSize() {
		return size;
	}
	
	public String toString(){
		String result="DOG:\n"+super.toString()+"\nSize: "+this.getSize();
		return result;
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		this.boardStart[0]=month;
		this.boardStart[1]=day;
		this.boardStart[2]=year;
	}
	@Override
	public void setBoardEnd(int month, int day, int year) {
		this.boardEnd[0]=month;
		this.boardEnd[1]=day;
		this.boardEnd[2]=year;	
	}
	@Override
	public boolean boarding(int month, int day, int year) {
		if(year>this.boardStart[2] && year<this.boardEnd[2]){
			return true;
		}
		if(year==this.boardStart[2]){
			if(month>this.boardStart[0]) return true;
			if(month==this.boardStart[0]&& day>=this.boardStart[1]) return true;
		}
		if(year==this.boardEnd[2]){
			if(month<this.boardStart[0]) return true;
			if(month==this.boardStart[0]&& day<=this.boardStart[1]) return true;
		}
		return false;
	}

}
