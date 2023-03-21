import java.util.Scanner;

public class Reader {


    String readerName;
    String regNum;

    Scanner input = new Scanner(System.in);

    public Reader(){

        System.out.println("Введите имя пользователя :");
        this.readerName = input.nextLine();

        System.out.println("Введите рег.номер :");
        this.regNum = input.nextLine();

    }

    public void addReader(Reader ignoredS) {
    }

    public void showAllReader() {
    }

    public void checkOutBook() {
    }

    public void checkInBook() {
    }
}