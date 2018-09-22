package codeoutloud.valueobject;

/**
 * Created by rafal on 22.09.18.
 */
public class Man {

    public Answer ask(Question question){
        if (question.getQuestion().contains("hungry")){
            return new Answer(true);
        }
        else return new Answer(false);
    }
}
