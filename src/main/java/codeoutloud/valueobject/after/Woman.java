package codeoutloud.valueobject.after;

/**
 * Created by rafal on 22.09.18.
 */
public class Woman {

    private static final boolean FOR_FKN_EVER = true;
    private static final boolean SO_FKN_TRUE = true;

    private Man husband;
    private Long selfEsteem = 0L;
    private WomanNaturalPolygraphDetector womanNaturalPolygraphDetector;

    public void dinnerTime(){
        Answer hungryAnswer = husband.ask(Question.of("Are you hungry?"));
        if (hungryAnswer.isOk()){
            haveDinnerWith(husband);
        }
    }

    public void outOfNowhere(){
        Answer answer = husband.ask(Question.of("Do I look fat?"));
        if (doIEvenCareWhatTheAnswerIs()){
            if (!answer.isImmediate()){
                husband.setScrewed(true);
                selfEsteem-=3;
            }else if (complimentsNumber(answer) + selfEsteem <= 0 ){
                husband.setScrewed(true);
                selfEsteem-=2;
            }else if (womanNaturalPolygraphDetector.isBigFatLie(answer)){
                while (FOR_FKN_EVER){
                    husband.setScrewed(SO_FKN_TRUE);
                }
            }else{
                selfEsteem--;
            }
        }else{
            while (true){
                selfEsteem--;
            }
        }
    }

    private Long complimentsNumber(Answer answer){
        return 0L;
    }

    private boolean doIEvenCareWhatTheAnswerIs(){
        return true;
    }

    private void haveDinnerWith(Man man){
        //
    }
}
