package codeoutloud.valueobject.before;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by rafal on 22.09.18.
 */
@AllArgsConstructor(staticName = "of")
public class Question {
    @Getter @Setter private String question;
}
