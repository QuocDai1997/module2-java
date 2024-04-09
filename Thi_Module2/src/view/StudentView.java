package view;

import product.Student;
import service.IStudentService;
import service.StudentService;
import untils.AppUtils;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private final IStudentService studentService;
    private final Scanner scanner = new Scanner(System.in);

    public StudentView() {
        studentService = StudentService.getInstance();
    }

    public void add() {
        do {
            int idSV = (int) (System.currentTimeMillis() / 1000);
            String nameSV = inputName(InputOption.ADD);
            int ageSV = inputAge(InputOption.ADD);
            String sex = inputSex(InputOption.ADD);
            String address = inputAddress(InputOption.ADD);
            double averageScore  = inputAverageScore(InputOption.ADD);

            Student student = new Student(idSV, nameSV, ageSV, sex, address, averageScore);
            System.out.println("input success \n");

        } while (AppUtils.isRetry(InputOption.ADD));
    }

    public void update() {
        boolean isRetry;
        do {
            showStudentList(InputOption.UPDATE);
            int id = inputId(InputOption.UPDATE);
            System.out.println("┌ - - CHANGE - - -  ┐");
            System.out.println("| 1.Change ID       |");
            System.out.println("| 2.Change Name     |");
            System.out.println("| 3.Change Age      |");
            System.out.println("| 4.Change Sex      |");
            System.out.println("| 5.Change Address  |");
            System.out.println("| 6.Change Average Score|");
            System.out.println("└ - - - - - - - - - ┘");
            System.out.println("Your choice: ");
            int option = AppUtils.retryChoose(1, 4);
            Student newStudent = new Student();
            newStudent.setIdSV(id);
            switch (option) {
                case 1:
                    int idSV = inputId(InputOption.UPDATE);
                    newStudent.setIdSV(idSV);
                    studentService.update(newStudent);
                    System.out.println("Change id student successfully");
                    break;
                case 2:
                    String name = inputName(InputOption.UPDATE);
                    newStudent.setNameSV(name);
                    studentService.update(newStudent);
                    System.out.println("Change name student successfully");
                    break;
                case 3:
                    int age = inputAge(InputOption.UPDATE);
                    newStudent.setAgeSV(age);
                    studentService.update(newStudent);
                    System.out.println("Change age student successfully");
                    break;
                case 4:
                    String sex = inputSex(InputOption.UPDATE);
                    newStudent.setSexSV(sex);
                    studentService.update(newStudent);
                    System.out.println("Change sex student successfully");
                    break;
                case 5:
                    String address = inputAddress(InputOption.UPDATE);
                    newStudent.setAddressSV(address);
                    studentService.update(newStudent);
                    System.out.println("Change address student successfully");
                    break;
                case 6:
                    Double average_sc = inputAverageScore(InputOption.UPDATE);
                    newStudent.setAverageScoreSV(average_sc);
                    studentService.update(newStudent);
                    System.out.println("Change sex student successfully");
                    break;
            }
            isRetry = option != 4 && AppUtils.isRetry(InputOption.UPDATE);
        } while (isRetry);
    }

    private int inputId(InputOption option) {
        int id;
        switch (option) {
            case ADD:
                System.out.println("Press Id");
                break;
            case UPDATE:
                System.out.println("Press Id want to change");
                break;
            case DELETE:
                System.out.println("Press Id want delete");
                break;
        }
        boolean isRetry = false;
        do {
            id = AppUtils.retryParseInt();
            boolean exist = studentService.existsById((int) id);
            switch (option) {
                case ADD:
                    if (exist) {
                        System.out.println("Id already exists! Please input again");
                    }
                    isRetry = exist;
                    break;
                case UPDATE:
                    if (!exist) {
                        System.out.println("Can't find id! Please input again");
                    }
                    isRetry = !exist;
                    break;
            }
        } while (isRetry);
        return id;
    }

    private String inputName(InputOption option) {
        switch (option) {
            case ADD:
                System.out.println("Input student's name want to add:");
                break;
            case UPDATE:
                System.out.println("Input student's name want to edit:");
                break;
        }
        System.out.print("==> ");
        
        return scanner.nextLine();
    }
    private String inputAddress(InputOption option) {
        switch (option) {
            case ADD:
                System.out.println("Input student's address want to add:");
                break;
            case UPDATE:
                System.out.println("Input student's address want to edit:");
                break;
        }
        System.out.print("==> ");

        return scanner.nextLine();
    }
    private String inputSex(InputOption option) {
        switch (option) {
            case ADD:
                System.out.println("Input student's sex want to add:");
                break;
            case UPDATE:
                System.out.println("Input student's sex want to edit:");
                break;
        }
        System.out.print("==> ");

        return scanner.nextLine();
    }

    private int inputAge (InputOption option) {
        int age;
        switch (option) {
            case ADD:
                System.out.println("Enter age student");
                break;
            case UPDATE:
                System.out.println("Enter age student you want change");
                break;
        }
        boolean isRetry = false;
        do {
            age = AppUtils.retryParseInt();
            if (age <= 0)
                System.out.println("age better 0?");
        } while (age <= 0);
        return age;
    }

    private double inputAverageScore(InputOption option) {
        double score;
        switch (option) {
            case ADD:
                System.out.println("Enter score student");
                break;
            case UPDATE:
                System.out.println("Enter score student you want change");
                break;
        }
        boolean isRetry = false;
        do {
            score = AppUtils.retryParseDouble();
            if (score <= 0)
                System.out.println("age better 0?");
        } while (score <= 0);
        return score;
    }

    public void showListStudentSort(InputOption inputOption, List<Student> students) {
        System.out.println("-----------------------------------------MENU STUDENT-------------------------------------------");
        System.out.printf("%-15s %-30s %-25s %-10s %-20s\n", "Id", "Name", "Age", "Sex", "Address", "Average Score");
        for (Student student : students) {
            System.out.printf("%-15d %-30s %-25s %-10d %-20s\n",
                    student.getIdSV(),
                    student.getNameSV(),
                    student.getAgeSV(),
                    student.getSexSV(),
                    student.getAddressSV(),
                    student.getAverageScoreSV()
            );
        }
        System.out.println("--------------------------------------------------------------------------------------------------\n");
        if (inputOption == InputOption.SHOW)
            AppUtils.isRetry(InputOption.SHOW);
    }
    public void showStudentList(InputOption inputOption) {
        System.out.println("-----------------------------------------List Student-------------------------------------------");
        System.out.printf("%-15s %-30s %-25s %-10s %-20s \n", "Id", "Name", "Age", "Sex", "Address", "Average Score");
        for (Student student : studentService.findAll()) {
            System.out.printf("%-15d %-30s %-25s %-10d %-20s\n",
                    student.getIdSV(),
                    student.getNameSV(),
                    student.getAgeSV(),
                    student.getSexSV(),
                    student.getAddressSV(),
                    student.getAverageScoreSV()
            );
        }
        System.out.println("--------------------------------------------------------------------------------------------------\n");
        if (inputOption == InputOption.SHOW)
            AppUtils.isRetry(InputOption.SHOW);
    }

    public void remove() {
        showStudentList(InputOption.DELETE);
        int id;
        while (!studentService.exist(id = inputId(InputOption.DELETE))) {
            System.out.println("Dont find id student");
            System.out.println("Press'y' to continue \t|\t 'q' to back \t|\t 't' để exit program");
            System.out.print(" ⭆ ");
            String option = scanner.nextLine();
            switch (option) {
                case "y":
                    break;
                case "q":
                    return;
                case "t":
                    AppUtils.exit();
                    break;
                default:
                    System.out.println("Selected incorrect function! please choice again?");
                    break;
            }
        }
        System.out.println("❄ ❄ ❄ ❄ REMOVE CONFIRM ❄ ❄ ❄ ❄");
        System.out.println("❄  1. Press 1 to delete         ❄");
        System.out.println("❄  2. Press 2 to come back     ❄");
        System.out.println("❄ ❄ ❄ ❄ ❄ ❄ ❄  ❄ ❄ ❄ ❄ ❄ ❄ ❄");
        int option = AppUtils.retryChoose(1, 2);
        if (option == 1) {
            studentService.deleteById(id);
            System.out.println("Delete success! \uD83C\uDF8A");
            AppUtils.isRetry(InputOption.DELETE);
        }

    }

    public void sortByAverageScoreOrderByASC() {
        showListStudentSort(InputOption.SHOW, studentService.findAllOrderByAverageScoreASC());
    }

    public void sortByAverageScoreOrderByDESC() {
        showListStudentSort(InputOption.SHOW, studentService.findAllOrderByAverageScoreDESC());
    }
}
