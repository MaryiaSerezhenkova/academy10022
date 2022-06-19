package by.academyy.InnerClasses;
//Создать экземпляр класса Food и вызвать его метод prepare().

//На вход метода prepare() передать экземпляр анонимного класса, расширяющего интерфейс Cookable. 

public class FoodDemo {

	public static void main(String[] args) {
		Cookable food = new Food("meat", 500) {
			@Override
			public void prepare(Cookable a, String str) {
				System.out.println("We have " + a.toString() + "Let's cook a medium rare steak");
			}
		};

		food.cook("Cook new dish from");
		
	}

}
