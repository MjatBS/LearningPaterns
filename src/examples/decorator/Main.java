package examples.decorator;

public class Main {
    public static void main(String []args){
        Questioner chan = new ChanQuestioner();
        chan = new ReactiveChanQuestioner(chan);
        chan = new PoliteChanQuestioner(chan);
        chan.ask("how do you do?");
    }
}
