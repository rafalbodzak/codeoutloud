package codeoutloud.valueobject.after;

import lombok.*;

import java.util.List;

/**
 * Created by rafal on 22.09.18.
 */
@Builder
public class Answer {
    @Getter @Setter private String words;
    @Getter @Setter private boolean ok;
    @Getter @Setter private EyeContact eyeContact;
    @Getter @Setter private Long delay = 0L;
    @Getter @Setter private List<FacialExpression> facialExpressions;


    public boolean isImmediate(){
        return delay <= 0;
    }
}
