package Moody;

public class Psychiatrist {
	//asks a moody object about its mood
	public void examine(Moody moodyObject){
		System.out.println("How are you feeling today?");
		moodyObject.queryMood();
	}
	//a moodyObject is observed to either laugh or cry
	public void observe(Moody moodyObject){	
		System.out.println("Observation: "+moodyObject.toString()+"\n");
	}

}
