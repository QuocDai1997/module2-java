public class testOOP {
    private int theNumberOfStudent;
    private  int theNumberOfClass;

    public testOOP(int theNumberOfClass) {
        this.theNumberOfClass = theNumberOfClass;
    }

    public int getTheNumberOfStudent() {
        return theNumberOfStudent;
    }

    public int getTheNumberOfClass() {
        return theNumberOfClass;
    }

    public void setTheNumberOfStudent(int theNumberOfStudent) {
        this.theNumberOfStudent = theNumberOfStudent;
    }

    public void setTheNumberOfClass(int theNumberOfClass) {
        this.theNumberOfClass = theNumberOfClass;
    }

    @Override
    public String toString() {
        return "testOOP {" +
                "my class = " + theNumberOfStudent + " student" +
                "}";
    }

    public static void main(String[] args) {
        testOOP human = new testOOP(4);

        human.setTheNumberOfStudent(30);

        System.out.println("My class have " + human.getTheNumberOfStudent() + " student");

        System.out.println(human);

        System.out.println(human.theNumberOfClass + " Class and "  + " every class have " + human.getTheNumberOfStudent() + " ");


    }
}
