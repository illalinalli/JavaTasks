public class Translator implements Russian {
    public Human human;
    public Translator(Human human) {
        this.human = human;
    }
    @Override
    public void communicationWithTheForum() {
        System.out.println("Статья переведена на иностранный язык.");
        human.loadTheArticle();
    }
}
