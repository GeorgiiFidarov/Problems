package BuldingCompany;

import java.util.ArrayList;
import java.util.List;

public class Library extends Building{
    private String libraryType;
    public List<String> books = new ArrayList<>();
    private int number;

    public void deleteBook(String bookName){
        getBooks().remove(bookName);
    }

    public void showLibrary(){
        System.out.println(books);
    }

    //-------------Constructors---------//

    public Library(String name, String address, int year, String architectorName, boolean cultiralMonument, int numberOfFloors, String libraryType) {
        super(name, address, year, architectorName, cultiralMonument, numberOfFloors);
        this.libraryType = libraryType;
        number = getCount();
    }
    public Library(){
        number = getCount();
    }

    //-------setters/getters------//

    public int getNumber() {
        return number;
    }
    public String getLibraryType() {
        return libraryType;
    }

    public void setLibraryType(String libraryType) {
        this.libraryType = libraryType;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public int getAmountOfBooks() {
        return books.size();
    }

    public void setAmountOfBooks(int amountOfBooks) {
        int amountOfBooks1 = books.size();
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryType='" + libraryType + '\'' +
                ", books=" + books +
                '}'+'\n'+
                "Building info\n"+"Address: "+getAddress()+'\n'
                +"Name: "+getName()+'\n'
                +"Established at: "+getYear()+'\n'
                +"Arhitector's Name: "+getArchitectorName()+'\n'
                +"Cultural Monument: "+(isCulturalMonument()?"Да":"Нет")+'\n'
                +"The Bulding number: " + getNumber()+'\n'
                +"Amount of floors: " + getNumberOfFloors()+"\n-----------------";
    }
}
