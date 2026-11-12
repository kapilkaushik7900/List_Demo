package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
class Library{
    int[] borrowBook = {111,121,441};
    public void borrowBook(int Booksrequested){
        int availableBooks = 5;
        try{
            if(Booksrequested > availableBooks){
                throw new Exception("Not enough books are available");
            }
         //   System.out.println("Book requested" +borrowBook[Booksrequested]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Occurred: The book you try to find is not available!!!");
        }catch (NullPointerException e){
            System.out.println("Exception");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
public class Exceptions {
    static void main(String[] args) {
    Library library = new Library();
    library.borrowBook(7);

    }
}
