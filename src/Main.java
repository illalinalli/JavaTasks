

public class Main {
    public static void main(String[] args) {
        // Adapter
        Russian rus = new Translator(new Human());
        rus.communicationWithTheForum();

        // Decorator
        // создаем и заполняем объект типа Dog
       Dog dog = new Dog() {
           @Override
           public String Command() {
               return "Сидеть, лежать, голос";
           }
       };
       // добавляем команду "ждать"
       dog = new CommandWaitDecorator(dog);
       System.out.println(dog.Command());

    }
}