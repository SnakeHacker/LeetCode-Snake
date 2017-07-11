/**
 * Created by K40-1 on 2017/7/11.
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 */
public class CountandSay {
    public String countAndSay(int n) {
        String res = "";
        for(int i =1; i<=n ;i++){
            if (i == 1){
                res = "1";
            }
            else if (i == 2){
                res = "11";
            }else {
                String tmp = "";
                int times = 1;
                for (int j =1; j<res.length(); j++){
                    if(res.charAt(j-1) == res.charAt(j)){
                        times++;
                        if (j == res.length()-1){
                           tmp = tmp +""+times+res.charAt(j);
                        }
                    }else {
                        tmp = tmp +""+times+res.charAt(j-1);
                        times = 1;
                        if (j == res.length()-1){
                            tmp = tmp +""+times+res.charAt(j);
                        }
                    }
                }
                res = tmp;
            }
        }
        return res;
    }

}
