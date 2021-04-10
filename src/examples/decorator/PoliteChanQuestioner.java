package examples.decorator;

public class PoliteChanQuestioner extends BasicDecorator{
    PoliteChanQuestioner(Questioner questioner) {
        super(questioner);
    }

    @Override
    public String ask(String text) {
        String answer = super.ask(text);
        System.out.println("Thank you");
        return answer;
    }
}
