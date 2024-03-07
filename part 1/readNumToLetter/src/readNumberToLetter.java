import java.util.Scanner;

public class readNumberToLetter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number?");
        int number = scanner.nextInt();
        int numHundred = number / 100;
        int  numDozen = (number % 100) / 10;
        int numUnit = (number % 100) % 10;


        String speakOne = "";
        String speakTwo = "";
        String speakThree = "";
        String speakFour = "";


        switch (numUnit){
            case 0:
                speakOne = "never age, please replay again!";
                break;
            case 1:
                speakOne = "one";
                break;
            case 2:
                speakOne = "two";
                break;
            case 3:
                speakOne = "three";
                break;
            case 4:
                speakOne = "four";
                break;
            case 5:
                speakOne = "five";
                break;
            case 6:
                speakOne = "six";
                break;
            case 7:
                speakOne = "seven";
                break;
            case 8:
                speakOne = "eight";
                break;
            case 9:
                speakOne = "nine";
                break;
        }
        switch (numUnit){
            case 0:
                speakTwo = "Ten";
                break;
            case 1:
                speakTwo = "Eleven";
                break;
            case 2:
                speakTwo = "Twelve";
                break;
            case 3:
                speakTwo = "Thirteen";
                break;
            case 4:
                speakTwo = "Fourteen";
                break;
            case 5:
                speakTwo = "Fifteen";
                break;
            case 6:
                speakTwo = speakOne + "teen";
                break;
            case 7:
                speakTwo = speakOne + "teen";
                break;
            case 8:
                speakTwo = speakOne + "teen";
                break;
            case 9:
                speakTwo = speakOne + "teen";
                break;
        }
        switch (numDozen){
            case 1:
                speakThree = "Ten";
                break;
            case 2:
                speakThree = "Twenty";
                break;
            case 3:
                speakThree = "Thirty";
                break;
            case 4:
                speakThree = "Fourty";
                break;
            case 5:
                speakThree = "Fifty";
                break;
            case 6:
                speakThree = "Sixty";
                break;
            case 7:
                speakThree = "Seventy";
                break;
            case 8:
                speakThree = "Eightty";
                break;
            case 9:
                speakThree = "Ninety";
                break;
        }
        switch (numDozen){
            case 2:
                speakFour = "Twenty-" + speakOne;
                break;
            case 3:
                speakFour = "Thirty-" + speakOne;
                break;
            case 4:
                speakFour = "fourty-" + speakOne;
                break;
            case 5:
                speakFour = "Fifty-" + speakOne;
                break;
            case 6:
                speakFour = "Sixty-" + speakOne;
                break;
            case 7:
                speakFour = "Seventy-" + speakOne;
                break;
            case 8:
                speakFour = "Eighty-" + speakOne;
                break;
            case 9:
                speakFour = "Ninety-" + speakOne;
                break;
        }
        switch (numHundred){
            case 1:
                speakFour =  " One hundred";
                break;
            case 2:
                speakFour =  " Two hundred";
                break;
            case 3:
                speakFour = " Three hundred";
                break;
            case 4:
                speakFour =  "Four hundred";
                break;
            case 5:
                speakFour =  " Fif hundred";
                break;
            case 6:
                speakFour = " Six hundred";
                break;
            case 7:
                speakFour = "Seven hundred";
                break;
            case 8:
                speakFour = " Eight hundred";
                break;
            case 9:
                speakFour = " Nine hundred";
                break;
        }
        System.out.println(numDozen);
        System.out.println(numUnit);

        if(number>0 && number <=10){
            System.out.println(speakOne);
        }
//            so lon hon 0<a<10
        if(number>10 && number <20){
            System.out.println(speakTwo);
        }
//            so 10<a<20
        if(number>= 20 && number <100){
            System.out.println(speakFour);
        }
//            sp 20<a<100
        if(numDozen > 0 && numUnit == 0){
            System.out.println(speakThree);
        }
//            so hang chuc
        if(number > 100){
            System.out.println(speakFour);
        }
//            so hang tram

    }

}
