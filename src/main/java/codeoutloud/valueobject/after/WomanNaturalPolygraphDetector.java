package codeoutloud.valueobject.after;

import java.util.List;

/**
 * Created by rafal on 22.09.18.
 */
public class WomanNaturalPolygraphDetector {

    public boolean isBigFatLie(Answer answer){
        return  isMakingStrangeFaces(answer.getFacialExpressions()) ||
                hisEyesLie(answer.getEyeContact()) ||
                iJustHaveThatFeeling();
    }

    private boolean isMakingStrangeFaces(List<FacialExpression>facialExpressions){
        return tossCoin();
    }

    private boolean hisEyesLie(EyeContact eyeContact){
        return tossCoin();
    }

    private boolean iJustHaveThatFeeling(){
        return tossCoin();
    }

    private boolean tossCoin() {
        return Math.round( Math.random() ) == 1;
    }
}
