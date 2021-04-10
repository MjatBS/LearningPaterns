package examples.decorator;

public class ReactiveChanQuestioner extends BasicDecorator{
    ReactiveChanQuestioner(Questioner questioner){
        super(questioner);
    }

    @Override
    public String ask(String text) {
        String answer = super.ask(text);
        react(answer);
        return answer;
    }

    private void react(String answer){
        if(answer.length()<4){
            System.out.println("You are wrong");
        }else{
            System.out.println("Not bad");
        }
    }
}

