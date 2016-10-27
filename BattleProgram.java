
import java.util.Scanner;

public class BattleProgram
{
    // Utilities
    private static Scanner scanner = new Scanner( System.in );

    // Character stats
    private static int playerHp, playerAtk, playerDef;
    private static int enemyHp, enemyAtk, enemyDef;

    public static void main( String args[] )
    {
        playerHp = 100;
        enemyHp = 100;

        chooseClass();
        battle();
    }


    /**************************************** YOU WILL UPDATE THIS */
    public static void chooseClass()
    {
        System.out.println("Choose your class:");
        System.out.println("1. Attacker, ATK 7, DEF 3");
        System.out.println("2. Defender, ATK 4, DEF 6");
        System.out.println("3. Balanced, ATK 5, DEF 5");
        int choice = getUserInput(1,3);
        
        if (choice == 1)
        {
            playerAtk = 7;
            playerDef = 3;
        }
        else if (choice == 2)
        {
            playerAtk = 4;
            playerDef = 6;
        }
        else if (choice == 3)
        {
            playerAtk = 5;
            playerDef = 5;
        }
        
        int enemyChoice = getRandomNumber(1,3);
        
        if (enemyChoice == 1)
        {
            enemyAtk = 7;
            enemyDef = 3;
        }
        else if (enemyChoice == 2)
        {
            enemyAtk = 4;
            enemyDef = 6;
        }
        else if (enemyChoice == 3)
        {
            enemyAtk = 5;
            enemyDef = 5;
        }
    }

    /**************************************** YOU WILL UPDATE THIS */
    public static void battle()
    {
        
    }


    public static int getRandomNumber( int min, int max )
    {
        return min + (int)(Math.random() * max);
    }

    /**************************************** YOU WILL UPDATE THIS */
    public static int getUserInput( int min, int max )
    {
        Scanner scanner = new Scanner(System.in);
        int selection;
        do
        {
            selection = scanner.nextInt();
            if (selection > max)
            {
                System.out.println("Too High, ya tosser!");
            }
            else if (selection < min)
            {
                System.out.println("Too low, ya loser!");
            }
        } while (selection > max || selection < min);
        return selection;
        
    }

    public static void waitASecond()
    {
        try {
            Thread.sleep(1000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}