package pratice001;

public class Employee {
	private String name;
	private int age;
	private String position;
	public Employee(String name, int age, String position ){
		this.name = name; this.age = age; this.position = position;}
	public String getName(){return name;}
	public int getAge() {return age;}
	public String getPosition() {return position;}
	public void data(){System.out.println
		("N a m e :" + name +
		"\nA  g  e : " + age + " years" +
		"\nposition: " + position);}
	public boolean equals(Object o) {
		return this.name == ((Employee) o).name && this.age==(((Employee) o).age)
				&& this.position == ((Employee) o).position;}}



class Security extends Employee{
	int grade;
	public Security(String name,int age, String position, int grade) {
		super(name,age,position);}
	public int getGrade(){return grade;}
	public void data(){super.data();
		System.out.println("g r a d e: " + grade);}
	public boolean equals(Object o) {return 
			super.equals(o) && this.getGrade() == ((Security) o).getGrade();}}



class Veterinarians extends Employee{
	String responsibility;
	public Veterinarians(String name,int age, String position, String responsibility) {
		super(name,age,position);}
	public String getRespon(){return responsibility;}
	public void data(){super.data();
		System.out.println("responsibility: " + responsibility);}
	public boolean equals(Object o) {return 
			super.equals(o) && this.getRespon() == ((Veterinarians) o).getRespon();}}



class Manager extends Employee{
	String department;
	public Manager(String name,int age, String position, String department) {
		super(name,age,position);}
	public String getDepartment(){return department;}
	public void data(){super.data();
		System.out.println("Department : " + department);}
	public boolean equals(Object o) {return 
			super.equals(o) && this.getDepartment() == ((Manager) o).getDepartment();}
	}