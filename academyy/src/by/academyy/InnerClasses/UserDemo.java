package by.academyy.InnerClasses;

//В методе main(): создать экземпляр класса User и вызвать метод createQuery(); создать экземпляр класса Query и вызвать метод printToLog()
//используя конструкцию user.new Query(); 
//создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query();

public class UserDemo {

	public static void main(String[] args) {
		User user = new User ("Kate", "sss222");
		user.createQuery();

	}

}
