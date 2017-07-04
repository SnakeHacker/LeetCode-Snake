/**
 * Created by Snake on 2017/7/2.
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s){
        int maxlen = 0;
        int head = 0;
        int tail = 1;

        if (s.length() == 0){
            return 0;
        }
        if (s.length() == 1){
            return 1;
        }

        for (; tail<s.length(); tail++){
            int flag = 0;
            for (int j = head; j < tail; j++){
                if (s.charAt(j) == s.charAt(tail)){
                    if ((tail-head) > maxlen){
                        maxlen = tail-head;
                    }
                    head = j+1;
                    flag = 1;
                    break;
                }
            }

            if (flag == 0){
                if ((tail-head+1)>maxlen){
                    maxlen = tail-head+1;
                }
            }
        }

        return maxlen;
    }

}
