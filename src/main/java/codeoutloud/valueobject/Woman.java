package codeoutloud.valueobject;

/**
 * Created by rafal on 22.09.18.
 */
public class Woman {

    private Man husband;

    private Question lastQuestionAsked;

    public void dinnerTime(){
        Answer hungryAnswer = husband.ask(Question.of("Are you hungry?"));
        if (hungryAnswer.isOk()){
            haveDinnerWith(husband);
        }
    }

    public void haveDinnerWith(Man man){
        //
    }
}
