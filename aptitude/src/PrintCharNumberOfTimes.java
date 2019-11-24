import java.util.Scanner;

public class PrintCharNumberOfTimes {
    
    static char ch;
    static int  timesToPrint = 0;
    static int currentNum = 0;
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner dr = new Scanner(System.in);
        String string = null;
        char charToPrint = '1';
        try {
            string = dr.nextLine();
        } catch (Exception io) {

        }
        string= string +"x0";
        assert string != null;
        for (char ch : string.toCharArray()) {

            if (Character.isAlphabetic(ch)) {
                if(timesToPrint > 0){
                    PrintCharNumberOfTimes.printChar( timesToPrint, charToPrint);
                }
                charToPrint = ch;
                timesToPrint = 0;
            } else {
                currentNum = Character.getNumericValue(ch);
            }
            timesToPrint = timesToPrint == 0 ? currentNum : ((timesToPrint * 10) + currentNum);
        }

    }

    public static void printChar(int timesToPrint, char charToPrint) {
            for (int i = 0; i < timesToPrint; i++) {
                System.out.println(" i= " + i + " " + charToPrint);
            }
            currentNum = 0;
    }
}
