import java.util.Scanner;


public class Librarian {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать!");
        System.out.println("Выберите книгу:");


        Scanner input = new Scanner(System.in);
        Books ob = new Books();
        Reader obReader = new Reader();
        int choice;
        int searchChoice;

        do{

            ob.dispMenu();

            choice = input.nextInt();

            switch(choice){

                case 1:
                    Book b = new Book();
                    ob.addBook(b);
                    break;

                case 2:
                    ob.upgradeBookQty();
                    break;

                case 3:
                    System.out.println("Введите 1 для поиска по номеру.");
                    System.out.println("Введите 2 для поиска по имени автора.");
                    searchChoice = input.nextInt();

                    switch (searchChoice) {
                        case 1 -> ob.searchBySno();
                        case 2 -> ob.searchByAuthorName();
                    }
                    break;

                case 4:
                    ob.showAllBooks();
                    break;
                case 5:
                    Reader s = new Reader();
                    obReader.addReader(s);
                    break;
                case 6:
                    obReader.showAllReader();
                    break;
                case 7:
                    obReader.checkOutBook();
                    break;
                case 8:
                    obReader.checkInBook();
                    break;
                default:
                    System.out.println("Выбор доступен от 0-8");


            }

        }
        while (choice!=0);

    }

}
