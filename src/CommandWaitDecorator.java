public class CommandWaitDecorator extends DogDecorator {
    public CommandWaitDecorator(Dog dog) {
        super(dog);
    }


    @Override
    public String Command() {
        return dog.Command() + ", ждать";
    }
}