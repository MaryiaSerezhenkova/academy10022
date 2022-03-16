package by.academyy.classwork.lesson1;

public class Cat {
	
	private int age;
	
	private String nickname;
	
	private int money;
	
	public int getMoney() {
		return money;}
	
	 public void setMoney(int a){
	      money = a;
	      System.out.println("На кота тратится " + a + " рублей в месяц");}
	
	
	public Cat(int age) {
		super();
		this.age = age;
	}

	public Cat(int age, String nickname, String isHomeAnimal, String money) {
		super();
		this.age = age;
		this.nickname = nickname;
	}


	public Cat(String nickname, int age) {
		this.nickname = nickname;
		this.age = age;
	}
	public void grow (int Addage) {
		this.age = age + Addage;
System.out.println("Кот вырос на " + Addage);
System.out.println("Возраст кота " + age);}
	
public void sleep () {
System.out.println("Кот  " + nickname+ " спит");}

public void eat () {
System.out.println("Кот  " + nickname+ " ест");}

public void walk () {
System.out.println("Кот " + nickname + " гуляет");}

public Cat () {
	//nothing
}
public Cat(String nickname) {
	this.nickname = nickname;
}

public void printAge() {
	// TODO Auto-generated method stub
 	}


}
	

