

/*
       Write a program which return "fizz" if the number is a multiplier
       of 3, return "buzz" if its multiplier of 5 and return "fizzbuzz"
       if the number is divisible by both 3 and 5. If the number is not divisible
        by either 3 or 5 then it should just return the number itself?

*/

public class QuestionTwo {

    static  String checkNumber(int number){

        if(number%3==0 && number%5==0){
            return "fizzbuzz";
        }else if(number%5==0){
            return "buzz";
        }else  if (number%3==0){
            return "fizz";
        }else {
            return String.valueOf(number);
        }
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(5));

    }


}
