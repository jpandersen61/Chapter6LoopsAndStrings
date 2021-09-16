import java.util.Scanner;

public class Exercise4 {
    public static boolean isAbecedarian(String s)
    {
        //Making the text string have no capitalization, will make it easier for us
        String testString = s.toLowerCase();

        //Go through all characters to verify alphabetical order
        for(int index=1;index < testString.length() ;index++)
        {
            if (testString.charAt(index-1) <= testString.charAt(index))
            {
                //Every is OK -> Do nothing
            }
            else
            {
                //If we reach here character at 'index-1' is alphabetically after character at 'index' -> return false
                return false;
            }
        }

        //If we reach here all characters are in alphabetical order
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Abecedarian: ");

        String s = input.nextLine();
        boolean result = isAbecedarian(s);
        if (result) {
            System.out.println(s + " is an Abecedarian");
        }
        else
        {
            System.out.println(s + " is not an Abecedarian");
        }
    }
}
