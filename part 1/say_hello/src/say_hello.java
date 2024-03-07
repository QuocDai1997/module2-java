import java.util.Scanner;

public class say_hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name? ");
        String name = scanner.nextLine();
        int choice;

        System.out.println("what is your gender");
        System.out.println("1. male");
        System.out.println("2. female");
        System.out.println("3. LGBT");
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                    System.out.println("Hello " + name);
                    System.out.println("Nice to meet you " + name + ", you are so handsome!");
                    break;
            case 2:
                    System.out.println("Hello " + name);
                    System.out.println("Nice to meet you " + name + ", you are so beautiful!");
                    break;
            case 3:
                    System.out.println("Hello " + name);
                    System.out.println("Nice to meet you " + name);
            }



    }
}
