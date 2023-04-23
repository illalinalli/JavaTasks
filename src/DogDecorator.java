public abstract class DogDecorator implements Dog {
    public Dog dog;

    public DogDecorator(Dog dog) {
        this.dog = dog;
    }
}
