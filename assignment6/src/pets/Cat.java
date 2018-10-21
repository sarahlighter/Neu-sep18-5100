package pets;

public class Cat extends Pet implements Boardable{
	private String HairLength;
	private int[] boardStart; 
	private int[] boardEnd;
	public Cat(String petName, String ownerName, String color,String HairLength) {
		super(petName, ownerName, color);
		this.HairLength=HairLength;
		boardStart = new int [3];
		boardEnd = new int [3];
	}
	public String getHairLength(){
		return this.HairLength;
	}
	@Override
	public String toString(){
		String result="CAT:\n"+super.toString()+"\nHair: "+this.getHairLength();
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
