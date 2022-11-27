package BuldingCompany;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(
                "Maught Library",
                "Strand",
                1856,
                "Stiven Seagul",
                true,
                2,
                "Science");
        System.out.println(library);
        Library northSide = new Library(
                "North Side Libraty",
                "King's Cross",
                1955,
                "Ilya",
                true,
                15,
                "Science");
        northSide.setBooks(List.of("The Art of painting","Man and a fish","Colt"));
        House house = new House(
                "Yellow Swan",
                "PIK",
                2010,
                "DOLBAEB",
                false,
                25,
                900,
                "Islam");

        System.out.println(northSide);
        house.heat();
        house.setSalary(9000);
        house.produceTax();
        System.out.println(house.getSalary());
        System.out.println(house);
        int random_number1 = (int) (Math.random() * 12);
        System.out.println("Номер билета "+random_number1);
        Univercity univercity = new Univercity
                .Builder(12,500,80)
                .univercityBranch("Sports")
                .country("London")
                .build();

        System.out.println(univercity);

    }
}
