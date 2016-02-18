/**
	 * Write a Computer program to find the type of a person and print the type.
	 * Infant : If the age is less than 1 year
	 * Toddler : If the age is less than 3 and greater than 1
	 * Pre Schooler : If the age is less than 5 and greater than 3
	 * KG Girl : If the age is greater than 5 and less than 6 and the gender is female
	 * KG Boy : If the age is greater than 5 and less than 6 and the gender is male
	 */
	 class Person
{
	int age;
	boolean gender;
	Person(int age, boolean gender)
    {
      this.age = age;
	  this.gender = gender;
	 
    }
  }  
class Persontest{ 
public void personType(Person person)
{    
	if ((person.age<=3) && (person.age>1))
	System.out.println("The person is a toddler");
	if (person.age<=1)
		System.out.println("The person is an infant");
	if(person.age<5 && (person.age>3))
		System.out.println("The person is a per schooler");
	if((person.age>=5) && (person.age<=6) && (person.gender == true))
		System.out.println("The person is a KG girl");
	if((person.age>=5) && (person.age<=6) && (person.gender == false))
		System.out.println("The person is a KG boy");
	
} 

	public static void main(String[] args)
	{
		Persontest pt = new Persontest();
		Person person1 = new Person(2, true);
		Person person2 = new Person(4, false);
		Person person3 = new Person(1,true);
		Person person4 = new Person(5, true);
		Person person5 = new Person(5, false);
		pt.personType(person1);
		pt.personType(person2);
		pt.personType(person3);
		pt.personType(person4);
		pt.personType(person5);
		
	}
}
