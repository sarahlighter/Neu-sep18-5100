package Registration;

public class Course {
	private String name;
	private int numberOfStudent;
	private Student[] student= new Student[10];
	public String getName() {
		return name;
	}
	public int getNumberOfStudent() {
		return numberOfStudent;
	}
	public Student[] getStudent() {
		return student;
	}
	public Course(String name) {
		this.name = name;
		this.numberOfStudent = 0;
	}
	public boolean isFull(){
		if(numberOfStudent>=10){
			return true;
		}
		return false;
	}
	public void registerStudent(Student student){
		if(!this.isFull()){
			this.student[numberOfStudent++]=student;
			System.out.println("Success!");
		}else{
			System.out.println("Sorry "+ student.getName()+", this course is full, please register another course.");
		}
	}
	
}
