import java.util.*;
class Person{
	private String personName;
	private int personAge;
	Person(String personName,int personAge){
		this.personName = personName;
		this.personAge = personAge;
	}
	String getpersonName() {
		return personName;
	}
	int getpersonAge() {
		return personAge;
	}
	void Displayperson() {
		System.out.println(personName);
		System.out.println(personAge);
	}
}

	
class Guest extends Person{
	private int rollnumber;
	private double amount;
	void setrollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	int getrollnumber() {
		return rollnumber;
	}
	void setamount(double amount) {
		this.amount = amount;
	}
	double getamount() {
		return amount;
	}
	Guest(String personName,int personAge,int rollnumber,double amount){
		super(personName,personAge);
		this.rollnumber = rollnumber;
		this.amount = amount;
		
	}
	void Display_Guest() {
		System.out.println("------Gust Detials------");
		System.out.println("Name           :" + getpersonName());
		System.out.println("Age            :" + getpersonAge());
		System.out.println("rollnumber     :" + rollnumber);
		System.out.println("amount         :" + amount);
	}
	
}
public class HotelmanagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Guest gt[] = new Guest[3];
		for(int i=0;i<3;i++) {
			System.out.println("Enter the user name");
			String personname = sc.nextLine();
			System.out.println("Enter the user Age");
			int personage = sc.nextInt();
			System.out.println("Enter the user rollnumber");
			int rollnumber = sc.nextInt();
			System.out.println("Enter amount");
			double amount = sc.nextDouble();
			sc.nextLine();
			gt[i] = new Guest(personname,personage,rollnumber,amount);
			
		}
		for (int i=0;i<3;i++) {
			gt[i].Display_Guest();
		}
	}

}
