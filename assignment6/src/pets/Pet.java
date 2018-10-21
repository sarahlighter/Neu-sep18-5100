package pets;

public class Pet {
	private String petName;
	private String ownerName;
	private String color;
	protected int sex;
	public static final int male = 1;
	public static final int female = 2;
	public static final int spayed = 3;
	public static final int neutered = 4;
	
	public Pet(String petName, String ownerName, String color) {
		this.petName = petName;
		this.ownerName = ownerName;
		this.color = color;
	}

	public String getSex() {
		if(this.sex==1)
			return "MALE";
		if(this.sex==2)
			return "FEMALE";
		if(this.sex==3)
			return "SPAYED";
		if(this.sex==4)
			return "NEUTERED";
		else return"Please set your pet's sex.";
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getPetName() {
		return petName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getColor() {
		return color;
	}
	@Override
	public String toString(){
		String result=this.getPetName()+" owned by "+this.getOwnerName()
				+"\nColor: "+this.getColor()
				+"\nSex: "+this.getSex();
		return result;
	}
	
	
}
