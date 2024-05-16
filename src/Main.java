import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Season favoritSeason = Season.SPRING;
        System.out.println(favoritSeason);
        boolean isdoing=true;
        while(isdoing) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the level (LOW, MEDIUM, WELLDONE): ");
            String levelInput = sc.nextLine().toUpperCase();

            try {
                Level howOrder = Level.valueOf(levelInput);
                setLevel(howOrder);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid level entered.");
            }
            System.out.println("Would you like to finish your order? yes or no : ");
            String answer = sc.nextLine().toUpperCase();
            if (answer.equals("YES")){
                isdoing = false;
            }





        }
    }

    static void setLevel(Level level) {
        switch (level) {
            case LOW:
                System.out.println("#" + level.getNumber() + " Low Please");
                break;
            case MEDIUM:
                System.out.println("#" + level.getNumber() + " Medium please");
                break;
            case WELLDONE:
                System.out.println("#" + level.getNumber() + " Well done please");
                break;
            default:
                System.out.println("Unknown level");
                break;
        }
    }
}