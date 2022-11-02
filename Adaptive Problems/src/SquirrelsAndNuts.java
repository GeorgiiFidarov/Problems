import java.util.*;

class SquirrelsAndNuts {
    public static Scanner scan = new Scanner(System.in);
    public static void main(final String[] args) {
        /*
       while (!scan.nextLine().equals("Stop")){
           if (scan.hasNext("Москва")||scan.hasNext("Ростов")
               ||scan.hasNext("Владивосток")){
               System.out.println("Россия");
           }else if (scan.hasNext("Рим")||scan.hasNext("Милан")
                   ||scan.hasNext("Турин")) {
               System.out.println("Италия");
           }else if (scan.hasNext("Ливерпуль")||scan.hasNext("Манчестер")
                   ||scan.hasNext("Лондон")) {
               System.out.println("Англия");
           }else if (scan.hasNext("Берлин")||scan.hasNext("Мюнхен")
                   ||scan.hasNext("Кёльн")) {
               System.out.println("Германия");
           }else
               System.out.println("Неизвестная страна");

       }

         */
       List<String> ArrayList = new ArrayList<>();
       ArrayList.add("Rostov");
       ArrayList.add("Volgograd");
       if (ArrayList.contains(scan.nextLine())){
           System.out.println("Russia");
       }

    }
}
