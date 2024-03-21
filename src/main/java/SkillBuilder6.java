
/**
 * SkillBuilder6 is a class for completing this Skill
 * Builder assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder6 {
    private static final int START = 0;
    private static final int FOUND_T = 1;
    private static final int FOUND_TY = 2;
    private static final int FOUND_TYY = 3;

    public static String findTYPattern(String s)
    {
        int state = START; //initiallize
        StringBuilder currentSubstring = new StringBuilder(); //current
        for (char c : s.toCharArray()) {
            switch (state) {
                case START:
                    if (c == 't' || c == 'T') {
                        state = FOUND_T;
                        currentSubstring.append(c);
                    }
                    break;
                case FOUND_T:
                    if (c == 'y' || c == 'Y') {
                        state = FOUND_TY;
                        currentSubstring.append(c);
                    } else {
                        state = START;
                        currentSubstring.setLength(0); //return to 0
                    }
                    break;
                case FOUND_TY:
                    if (Character.isLetter(c)) {
                        state = FOUND_TYY;
                        currentSubstring.append(c);
                    } else if (c == ' ') {
                        return currentSubstring.toString();
                    } else {
                        state = START;
                        currentSubstring.setLength(0); //return to 0
                    }
                    break;
                case FOUND_TYY:
                    if (c == ' ') {
                        return currentSubstring.toString();
                    } else {
                        currentSubstring.append(c);
                    }
                    break;
            }
        }

        return ""; //no string works
    }
}
