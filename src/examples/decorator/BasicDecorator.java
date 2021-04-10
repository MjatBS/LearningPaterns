package examples.decorator;

public class BasicDecorator implements Questioner{
    private Questioner questioner;
    BasicDecorator(Questioner questioner){
        this.questioner = questioner;
    }

    @Override
    public String ask(String text) {
        return questioner.ask(text);
    }
}
