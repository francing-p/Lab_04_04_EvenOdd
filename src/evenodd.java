public class evenodd {
    public static void main(String[] args){
        int numToExamine=2;
        int moduloRes=numToExamine % numToExamine;
        System.out.println(numToExamine + " mod " + numToExamine + " is " + moduloRes);
        System.out.println("Since the result was " + moduloRes + ", " + numToExamine + " is even.");
    }
}
