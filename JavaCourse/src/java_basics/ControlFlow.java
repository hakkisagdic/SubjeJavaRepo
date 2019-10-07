package java_basics;

public class ControlFlow {
    public static void main(String[] args) {
        boolean control = ((4 > 6) || !((100 / 5) == 20));

        if (control) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (100 / 5 == 20) {
            System.out.println("true");
        }

        int hungerRating = 5;
        if (!(hungerRating < 6)) {
            System.out.println("starving");
        } else {
            System.out.println("not starving");
        }

        int favoriteTemp = 75, currentTemp = 60;
        String opinion;

        if (currentTemp < favoriteTemp - 30) { //45 46 ... 60 61
            opinion = "it is pretty cold";  //55 56 57 58 59 60 61 ortak
        } else if (currentTemp < favoriteTemp - 20) { //55 56 ... 80 81   //55 < x < 85
            opinion = "it is kinda cold";
        } else if (currentTemp > favoriteTemp + 10) {
            opinion = "it is hot";
        } else {
            opinion = "my favorite temperature";
        }

        System.out.println(opinion);

        int month = 12;
        String monthName;

        switch (month) {
            case 1:
                monthName = "Ocak";
                break;
            case 2:
                monthName = "Şubat";
                break;
            case 3:
                monthName = "Mart";
                break;
            case 4:
                monthName = "Nisan";
                break;
            case 5:
                monthName = "Mayıs";
                break;
            case 6:
                monthName = "Haziran";
                break;
            case 7:
                monthName = "Temmuz";
                break;
            case 8:
                monthName = "Ağustos";
                break;
            case 9:
                monthName = "Eylül";
                break;
            case 10:
                monthName = "Ekim";
                break;
            case 11:
                monthName = "Kasım";
                break;
            case 12:
                monthName = "Aralık";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }

        System.out.println(monthName);
    }
}
