package examples.decorator;

import java.util.Scanner;

public class ChanQuestioner implements Questioner{

    @Override
    public String ask(String text){
        System.out.println(text);
        return getAnswer();
    }
    private String getAnswer(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
