/**
 * Created by Snake on 2017/6/29.
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 */
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        String strX = Integer.toBinaryString(x);
        String strY = Integer.toBinaryString(y);

        int Xindex = strX.length()-1;
        int Yindex = strY.length()-1;
        int hammingDistance = 0;
        while (Xindex >=0 && Yindex >=0){
            if (strX.charAt(Xindex) == strY.charAt(Yindex)){

            }else {
                hammingDistance++;
            }
            Xindex--;
            Yindex--;
        }

        if(Xindex >=0){
            while (Xindex >=0){

                if (strX.charAt(Xindex) == '1'){
                    hammingDistance++;
                }
                Xindex--;
            }
        }else {
            while (Yindex >=0){
                if (strY.charAt(Yindex) == '1'){
                    hammingDistance++;
                }
                Yindex--;
            }
        }

        return hammingDistance;
    }

}
