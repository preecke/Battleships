/**
 * Making a Battleships game
 *
 * Keizo Preece
 * 24/06/2024
 */
import java.util.Scanner; 
public class BattleshipsProject
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Rules:");
        System.out.println("1.You need to place 5 ships on the bottom grid");
        System.out.println("2.You can't have them overlap");
        System.out.println("3.You can't have them off the grid");
        System.out.println("4.You can't cheat");
        System.out.println("5.You can't place them diaganly");
        System.out.println("6.Have fun!!!");
        System.out.println("");
        System.out.println("Ship placements:");
        System.out.println("1.The carrier ocupies 5 spaces");
        System.out.println("2.The battleship ocupies 4 spaces");
        System.out.println("3.The cruiser ocupies 3 spaces");
        System.out.println("4.The submarine ocupies 3 spaces");
        System.out.println("5.The destroyer ocupies 2 spaces");
        String[][] shipplacements = new String[10][10];
        for (int i=0; i<shipplacements.length; i++) {
            for (int j = 0; j<shipplacements[0].length; j++) {
                shipplacements[i][j] ="0";
            }
        }
        shipplacements[0][1] = "1"; //cruiser
        shipplacements[0][2] = "1";
        shipplacements[0][3] = "1";

        shipplacements[2][3] = "1"; //destroyer
        shipplacements[2][4] = "1";

        shipplacements[3][3] = "1"; //battleship
        shipplacements[3][4] = "1";
        shipplacements[3][5] = "1";
        shipplacements[3][6] = "1";

        shipplacements[5][0] = "1"; //carrier
        shipplacements[5][1] = "1";
        shipplacements[5][2] = "1";
        shipplacements[5][3] = "1";
        shipplacements[5][4] = "1";

        String[][] Coordinates = new String[10][10];
        for (int i=0; i<Coordinates.length; i++) {
            for (int j = 0; j<Coordinates[0].length; j++) {
                (Coordinates[i][j]) =".";
            }
        }
        boolean playing = true;
        while (playing == true) {
            for (int i=0; i<Coordinates.length; i++) {
                for (int j = 0; j<Coordinates[0].length; j++) {
                    System.out.print(Coordinates[i][j]+ " ");
                }System.out.println();  
            }
            int rowNum = 0;
            int collomNum =0;
            System.out.println("Please guess your row number");
            rowNum = keyboard.nextInt();
            System.out.println("Please guess your collom number");
            collomNum = keyboard.nextInt();
            if (shipplacements[rowNum][collomNum].equals("1")) {
                System.out.println("the ship is hit");
                shipplacements[rowNum][collomNum] = "2";
                Coordinates[rowNum][collomNum] ="X";
            } else {
                System.out.println("the ship is missed");
                Coordinates[rowNum][collomNum] ="O";
            }
            if (shipplacements[2][4] == ("2") && shipplacements[2][3] == ("2")) {
                System.out.println("the ship has sunk");
            }
            if (shipplacements[0][3] == ("2") && shipplacements[0][2] == ("2") && shipplacements[0][1] == ("2")) {
                System.out.println("the ship has sunk");
            }
            if (shipplacements[5][4] == ("2") && shipplacements[5][3] == ("2") && shipplacements[5][2] == ("2") && shipplacements[5][1] == ("2") & shipplacements[5][0] == ("2")){
                System.out.println("the ship has sunk"); 
            }
            if (shipplacements[3][6] == ("2") && shipplacements[3][5] == ("2") && shipplacements[3][4] == ("2") && shipplacements[3][3] == ("2")) {
                System.out.println("the ship has sunk");
            }
            boolean gameover = true;
            for (int i=0; i<shipplacements.length; i++) {
                for (int j = 0; j<shipplacements.length; j++) {
                    if (shipplacements[i][j] == "1") {
                        gameover=false;
                    }
                } 
            }
            if (gameover == true) {
                playing = false;
            }
        }
    }
}