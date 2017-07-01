import java.util.ArrayList;

/**
 * Created by Snake on 2017/6/29.
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        char line1[] = {'q','w','e','r','t','y','u','i','o','p'};
        char line2[] = {'a','s','d','f','g','h','j','k','l'};
        char line3[] = {'z','x','c','v','b','n','m'};


        ArrayList<String> targets = new ArrayList<String>();

        for (int i=0; i<words.length; i++){
            int len = words[i].length();
            char linenum[] = null;
            int flag = 0;

            for (int j=0; j<len;j++){
                if (j == 0){
                    if (whetherin(words[i].charAt(j),line1)){
                        linenum = line1;
                    }else if (whetherin(words[i].charAt(j),line2)){
                        linenum = line2;
                    }else {
                        linenum = line3;
                    }
                    continue;
                }
                if (whetherin(words[i].charAt(j),linenum)){
                    continue;
                }else {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0){
                targets.add(words[i]);
            }
        }
        String[] strArray = (String[]) targets.toArray(new String[targets.size()]);
        return strArray;
    }

    public boolean whetherin(char a, char[] b){

        for (char c : b){
            if (Character.toLowerCase(a) == c){
                return true;
            }
        }
        return false;

    }

}
