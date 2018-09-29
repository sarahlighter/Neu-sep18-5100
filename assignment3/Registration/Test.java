package Registration;

public class Test {
	public static void main(String[] args) {
		Student s1=new Student("Anne",20180901);
		System.out.println("-------new student test-------------");
		System.out.println("student name :"+ s1.getName()+". student ID: "+s1.getId());
		Student s2=new Student("Bob",20180902);
		Student s3=new Student("Jane",20180903);
		Student s4=new Student("Tom",20180904);
		Student s5=new Student("Samantha",20180905);
		Student s6=new Student("Cara",2018096);
		Student s7=new Student("May",20180907);
		Student s8=new Student("Jim",20180908);
		Student s9=new Student("Ray",20180909);
		Student s10=new Student("Daisy",20180910);
		Student s11=new Student("Eve",20180911);
		Course a=new Course("JAVA");
		Course b=new Course("C++");
		System.out.println("-------register test-------------");
		a.registerStudent(s1);
		a.registerStudent(s2);		
		a.registerStudent(s3);
		a.registerStudent(s4);
		a.registerStudent(s5);
		System.out.println("Now "+ a.getNumberOfStudent() + " students has registed this course");
		a.registerStudent(s6);
		a.registerStudent(s7);
		a.registerStudent(s8);
		a.registerStudent(s9);
		a.registerStudent(s10);
		a.registerStudent(s11);
		System.out.println("---Who registered for this course?---------------");
		int i=0;
		for(Student s: a.getStudent()){
			System.out.println("Student who registered course "+a.getName()+" : "+s.getName());
		}
		
		
	}
}
