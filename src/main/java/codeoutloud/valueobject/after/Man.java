package codeoutloud.valueobject.after;

/**
 * Created by rafal on 22.09.18.
 */
public class Man {

    private boolean screwed = false;

    public Answer ask(Question question){
        if (question.getQuestion().contains("hungry")){
            return Answer.builder().ok(true).build();
        }
        else return Answer.builder().ok(false).build();
    }

    public void setScrewed(boolean screwed){
        this.screwed = screwed;
    }
}
