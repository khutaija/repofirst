public class AbstractInterfaceTest
{
	public static void main(String[] args) {
		

	TeenagerDriver teendriver = new TeenagerDriver("sam");
	teendriver.getInfo(); //method of class TeenagerDriver
	teendriver.greet(); //method of SuperClass Person
	teendriver.driveCar(); //method of interface Driver
	teendriver.goToSchool(); //method of interface Teenager
	teendriver.eat(); // overridden method of SuperClass Person
	teendriver.sleep(); //method of SuperClass Person

	System.out.println("\n");
	
	AdultTeacher adultTeacher = new AdultTeacher("siva");
	adultTeacher.getInfo();
	adultTeacher.greet();
	adultTeacher.goToWork();
	adultTeacher.teach();
	adultTeacher.answerQuestions("How do exceptions work?");
	adultTeacher.payTaxes();
	adultTeacher.eat();
	adultTeacher.sleep();
	System.out.println("\n");
	
	TeenagerTeacher teenTeacher = new TeenagerTeacher("yang");
	teenTeacher.getInfo();
	teenTeacher.greet();
	teenTeacher.finishAssignments();
	teenTeacher.answerQuestions("How do String functions work?");
	teenTeacher.gradeStudents();
	teenTeacher.eat();
	teenTeacher.sleep();
	System.out.println("\n");
	
	AdultDriver adultdriver = new AdultDriver("Lei");
	adultdriver.getInfo();
	adultdriver.greet();
	adultdriver.driveCar();
	adultdriver.payTaxes();
	adultdriver.eat();
	adultdriver.sleep();
		
	}
}