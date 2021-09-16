import java.util.Scanner;

public class Exercise5 {

    public static boolean isDoubloon(String s)
    {
        //Making the text string have no capitalization, will make it easier for us
        String testString = s.toLowerCase();

        //Go through all characters to verify that each occurs exactly twice
        for(int index=0; index < testString.length(); index++)
        {
            //Assume NO occurences for the character on 'index'
            int occurences = 0;

            //Go through all the characters to verify that the one on 'index' occurs exactly twice
            for(int index2=0; index2 < testString.length() ;index2++)
            {
                //Get character on 'index'
                char currentChar = testString.charAt(index);

                //Increment if character 'index2' matches with the one at 'index'
                if (testString.charAt(index2) == currentChar) {
                    occurences++;
                    }
            }

            //Character at 'index' break the exactly-two-matches rule -> 'String s' is NOT a Doubloon -> return false
            if (occurences !=2){
                return false;
            }
        }

        //When reaching here it has been verified that each character occurs exactly twice -> return true
        return true;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter doubloon: ");

        String s = input.nextLine();
        boolean result = isDoubloon(s);
        if (result) {
            System.out.println(s + " is a doubloon");
        }
        else
        {
            System.out.println(s + " is not a doubloon");
        }
    }
}
