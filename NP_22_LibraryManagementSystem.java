import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;

class LibraryMethods{
    Scanner sc=new Scanner(System.in);
    String user;
    ArrayList<String> books = new ArrayList<>();
    LibraryMethods(){
        System.out.println("bienvenue, tu en un Libray");
        System.out.println("Enter your name to login to library");
        user=sc.nextLine();
        books.add("c++");
        books.add("Java");
        books.add("Math");
        books.add("history");
        books.add("Geo");
        books.add("Civil War");
        books.add("Hero 2");
    }
    public void select(Boolean x){
        while (x==true) {
        String choose;
        System.out.println("Which operation you wants to perform \n Issue \n Add \n Return \n Press any other key to logout");
        choose =sc.nextLine();
//        while (x==true) {
            if (choose.equalsIgnoreCase("Issue")) {
                issueBook();
            } else if (choose.equalsIgnoreCase("Add")) {
                addBook();
            } else if (choose.equalsIgnoreCase("Return")) {
                returBook();
            } else {
                System.out.println("Invalid input user logging out...");
                x=false;
            }
        }
    }

    //Adding book to library
    public void addBook(){
        String bookName;
        System.out.println("Please enter the book name you wants to add");
        bookName=sc.nextLine();
        books.add(bookName);
        System.out.println( bookName + " is added to the library");
    }

    //Add returning books
    public void returBook(){
        addBook();
    }

    //Issuing books to the user
    public void issueBook(){
        System.out.println("Enter the book you wants to take");
        String bookName=sc.nextLine();
        System.out.println("Serching for the book...");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.out.println("Going forward");
        }
        boolean search=false;
        for(int i=0;i<books.size();i++)
        {
            if(books.get(i).equalsIgnoreCase(bookName))
            {
                search=true;
                System.out.println("Book : "+bookName);
                System.out.println("Issued to : "+user);
                LocalDate ld=LocalDate.now();
                LocalTime lt=LocalTime.now();
                System.out.println("Issued at : "+ ld +" "+lt);
                books.remove(i);
            }
        }
        if (search==false)
        {
            System.out.println("Sorry! This book is not in our library");
        }
    }

}

public class NP_22_LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryMethods lm =new LibraryMethods();
        lm.select(true);
        System.out.println("Current books on the library are...");
        System.out.println(lm.books);
    }
}
