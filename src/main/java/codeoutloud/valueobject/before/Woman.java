package codeoutloud.valueobject.before;

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

    private void haveDinnerWith(Man man){
        //
    }
}
