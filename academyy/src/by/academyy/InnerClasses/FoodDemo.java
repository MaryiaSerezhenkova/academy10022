package by.academyy.InnerClasses;
//Создать экземпляр класса Food и вызвать его метод prepare().

//На вход метода prepare() передать экземпляр анонимного класса, расширяющего интерфейс Cookable. 

public class FoodDemo {

	public static void main(String[] args) {
		Food food = new Food("meat", 500);
		food.prepare(new Cookable() {
			@Override
			public void cook(String str) {
				str = "Let's cook a medium rare steak from ";
				System.out.println(str+food.getName());
			}
		},"Cook new dish from"); 

		food.cook("Cook new dish from");
	    
	}

}
