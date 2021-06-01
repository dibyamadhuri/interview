public class RepeatedString {
    public static void main(String[] args) {
        
        String input="aba";
        long repeat = 10;
        long inputLength=input.length();
        long numberOfAInTheString = countA(input,inputLength) ;
        
        long tempResult= numberOfAInTheString*(repeat/inputLength);

        long subStringLength = repeat-((repeat/inputLength)*inputLength);
        long numberOfAInTheSubString =countA(input,subStringLength);
        long result=tempResult+numberOfAInTheSubString ;

        System.out.println(result);
    }

    public static long countA(String input,long inputLength){

        int numberOfAInTheString = 0;
        for (int i = 0; i < inputLength; i++) {
            if(input.charAt(i)=='a'){
                numberOfAInTheString++;
            }
        }

        return numberOfAInTheString;
    }

}
