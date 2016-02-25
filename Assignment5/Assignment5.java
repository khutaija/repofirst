import java.util.ArrayList;
import java.util.Date;

/**
 * Finish all the assignments before next class.
 * 
 * @author Yang
 */

public class Assignment5 {
	
	/**
	 * In computer, the file system is very important. Try to create classes for
	 * file and folder. Hint: You might find there are many similarities between
	 * file and folder: they both have name, size and created date; they both
	 * could be open by double click; ... So use the concept of abstract class
	 * to make your code more neat.
	 */
	
	public abstract class Directory {

		private String name;
		private Date dateCreated;
		int size;

		public Directory(String name, Date dateCreated) {
			this.name = name;
			this.size = 2;
			this.dateCreated = dateCreated;
		}

		public abstract Directory doubleClick();

		public abstract void rightClick();

		public String getName() {
			return name;
		}

		public int getSize() {
			return size;
		}

		public Date getDateCreated() {
			return dateCreated;
		}

		public void rename(String name) {
			this.name = name;
		}

	}

	public class Folder extends Directory {

		ArrayList<Directory> content;

		public Folder(String name, Date dateCreated) {
			super(name, dateCreated);
			content = new ArrayList<Directory>();
		}

		@Override
		public Directory doubleClick() {
			return this;
		}

		@Override
		public void rightClick() {
			System.out.println("Pop up menu is displayed");
		}

		@Override
		public int getSize() {
			if (content.isEmpty())
				return 0;
			return content.size();
		}

	}

	public class File extends Directory {

		public File(String name, Date dateCreated) {
			super(name, dateCreated);
		}

		@Override
		public Directory doubleClick() {
			return this;

		}

		@Override
		public void rightClick() {
			System.out.println("Pop up menu is displayed");

		}

		public void moveFileInto(Folder folder) {
			if (folder == null)
				return;
			folder.content.add(this);

		}

	}

	/**
	 * Design abstract class Person, interface Driver, Teacher, Teenager, Adult.
	 * Then create classes TeenagerDriver, TeenagerTeacher, AdultDriver and
	 * AdultTeacher which extend Person and implement suitable interfaces.
	 */
	
	public abstract class Person {

		public abstract void eat();

		public void greet() {
			System.out.println("Says Hello");
		}

		public void sleep() {
			System.out.println("Sleeps");
		}

	}

	public interface Driver {

		public void driveCar();

	}

	public interface Teacher {

		public void teach();

		public void answerQuestions(String question);

		public void gradeStudents();

	}

	public interface Teenager {

		public void goToSchool();

		public void watchMovies();

		public void finishAssignments();

	}

	public interface Adult {

		public void goToWork();

		public void payTaxes();

	}

	public class TeenagerDriver extends Person implements Teenager, Driver {
		private String name;

		public TeenagerDriver(String name) {
			this.name = name;
		}

		public void getInfo() {
			System.out.println("This is a Teenager Driver");
			System.out.println("Name is " + name);
		}

		@Override
		public void driveCar() {
			System.out.println(name + " drives a car");

		}

		@Override
		public void goToSchool() {
			System.out.println(name + " goes to school");

		}

		@Override
		public void watchMovies() {
			System.out.println(name + "watches movies on weeknights and weekends");

		}

		@Override
		public void finishAssignments() {
			System.out.println(name + " finishes assignments well before deadline");

		}

		@Override
		public void eat() {
			System.out.println(name + " eats food");

		}

	}

	public class TeenagerTeacher extends Person implements Teenager, Teacher {
		private String name;

		public TeenagerTeacher(String name) {
			this.name = name;
		}

		public void getInfo() {
			System.out.println("This is a Teenager Teacher");
			System.out.println("Name is " + name);
		}

		@Override
		public void teach() {
			System.out.println("Teaches chosen subject");

		}

		@Override
		public void answerQuestions(String question) {
			System.out.println(name + " answers questions asked by students");

		}

		@Override
		public void gradeStudents() {
			System.out.println("Checks answers to examination questions and decides the grade");

		}

		@Override
		public void goToSchool() {
			System.out.println(name + " goes to school to teach");

		}

		@Override
		public void watchMovies() {
			System.out.println(name + " watches movies on weeknights and weekends");

		}

		@Override
		public void finishAssignments() {
			System.out.println(name + " finishes setting assignments for students");

		}

		@Override
		public void eat() {
			System.out.println(name + " eats food");

		}

	}

	public class AdultDriver extends Person implements Adult, Driver {

		private String name;

		public AdultDriver(String name) {
			this.name = name;
		}

		public void getInfo() {
			System.out.println("This is an Adult Driver");
			System.out.println("Name is " + name);
		}

		@Override
		public void eat() {
			System.out.println(name + " eats food");

		}

		@Override
		public void driveCar() {
			System.out.println("Is driving a car");

		}

		@Override
		public void goToWork() {
			System.out.println(name + " goes to work");

		}

		@Override
		public void payTaxes() {
			System.out.println("Pays taxes on time");

		}

	}

	public class AdultTeacher extends Person implements Adult, Teacher {

		private String name;

		public AdultTeacher(String name) {
			this.name = name;
		}

		public void getInfo() {
			System.out.println("This is an Adult Teacher");
			System.out.println("Name is " + name);
		}

		@Override
		public void teach() {
			System.out.println("Teaches chosen subject");

		}

		@Override
		public void answerQuestions(String question) {
			System.out.println("Answers questions asked by students");

		}

		@Override
		public void gradeStudents() {
			System.out.println("Checks answers to examination questions and decides the grade");

		}

		@Override
		public void goToWork() {
			System.out.println(name + " goes to work at school");

		}

		@Override
		public void payTaxes() {
			System.out.println("Pays taxes on time");

		}

		@Override
		public void eat() {
			System.out.println(name + " eats food");
		}

	}

	/**
	 * Reverse the input array in place(without extra space) e.g. input nums =
	 * {5,1,9,0}, after calling this method, the nums should be {0,9,1,5}
	 */
	
	public int[] reverseArrayInPlace(int[] nums) {
		if(nums.length == 0)
			return null;
		
		int length = (nums.length - 1);
		int temp = 0;
		
		for (int i = 0; i <= (length / 2); i++) {
			temp = nums[i];
			nums[i] = nums[length - i];
			nums[length - i] = temp;
		}
		return nums;
	}

	/**
	 * Reverse the input array without changing the input. Return the reversed
	 * array. e.g. input nums = {5,1,9,0}, after calling this method it'll
	 * return {0,9,1,5} while the nums is still {5,1,9,0}
	 */
	
	public int[] reverseArrayWithoutModifyInput(int[] nums) {
		
		if (nums.length == 0)
			return null;
		int[] reverseNums = new int[nums.length];
		int i = 0;

		for (int j = (nums.length - 1); j >= 0; j--) {

			reverseNums[i] = nums[j];
			i++;
		}
		return reverseNums;
	}

}