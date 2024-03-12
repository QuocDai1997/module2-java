public class Main {
    public static void main(String[] args) {
        ProgrammingBook p1 = new ProgrammingBook("p1", "English", 230000,"EV1", "java", "logic");
        ProgrammingBook p2 = new ProgrammingBook("p2", "Math", 150000,"MA1", "java", "logic");
        ProgrammingBook p3 = new ProgrammingBook("p3", "History", 130000,"LS1", "EVA", "learn");
        FictionBook f1 = new FictionBook("f1", "java", 300000, "java", "vien tuong 1");
        FictionBook f2 = new FictionBook("f2", "C++", 100000, "C1", "vien tuong 2");
        FictionBook f3 = new FictionBook("f3", "PHP", 130000, "Php", "vien tuong 3");


        Book[] list = new Book[6];

        list[0] = p1;
        list[1] = p2;
        list[2] = p3;
        list[3] = f1;
        list[4] = f2;
        list[5] = f3;

        double sum = 0;

        for (Book m : list){
            sum+= m.getAMount();
        }

        System.out.println("All price of book is: " + sum);

        int countLanguageBook = 0;
        String find = "java";
        for(int i = 0; i < list.length; i++){
            if (list[i] instanceof ProgrammingBook){
                if( ((ProgrammingBook) list[i]).getLanguage().equals(find)){
                    countLanguageBook++;
                }
            }
        }
        System.out.println("Book have language Java is " + countLanguageBook);

        String fiction = "vien tuong 1";
        int countCategory = 0;

        for (int i = 0; i < list.length; i++){
            if( list[i] instanceof FictionBook){
                if ( ((FictionBook) list[i]).getCategory().equals(fiction)){
                    countCategory++;
                }
            }
        }
        System.out.println("FictionBook have category 'vien tuong 1' is " + countCategory);

        int PriceBook = 150000;
        int countPriceBook = 0;

        for (int i =0; i< list.length; i++){
            if (list[i] instanceof FictionBook){
                if ( list[i].getPrice() < PriceBook){
                    countPriceBook++;
                }
            }
        }
        System.out.println("Book in FictionBook have small price 150.000 is " + countPriceBook);


    }
}
