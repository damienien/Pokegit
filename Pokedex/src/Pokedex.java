import java.util.Scanner;

public class Pokedex {
    public static void main(String[] args) {

        System.out.println(" __________________________________________________________________");
        System.out.println("|                                                                  |");
        System.out.println("|                       ATTRAPEZ-LES TOUS !                        |");
        System.out.println("|__________________________________________________________________|");
        System.out.println("|                        Pokedex - V 1.0.0 -                       |");
        System.out.println("|__________________________________________________________________|");
        System.out.println("| 1 - RECHERCHER UN POKEMON                                        |");
        System.out.println("| 2 - RECHERCHER UN DRESSEUR                                       |");
        System.out.println("| 3 - AJOUTER UN POKEMON                                           |");
        System.out.println("| 4 - SUPPRIMER UN POKEMON                                         |");
        System.out.println("| 5 - AJOUTER UN DRESSEUR                                          |");
        System.out.println("| 6 - SUPPRIMER UN DRESSEUR                                        |");
        System.out.println("|__________________________________________________________________|");
        pokedexMenu();
    }

    public static void pokedexMenu() {
        String userKeyValue = userInput();

        switch (userKeyValue) {
            case ("1"):
                // Fonction rechercher pokemon
                break;
            case ("2"):
                // Fonction rechercher dresseur
                break;
            case ("3"):
                // Fonction ajouter un pokemon
                break;
            case ("4"):
                // Fonction supprimer un pokemon
                break;
            case ("5"):
                // Fonction ajouter un dresseur
                break;
            case ("6"):
                // Fonction supprimer un dresseur
                break;
            default:
                System.out.println("Option invalide");
                pokedexMenu();
                break;
        }
    }
    public static String userInput() {
        Scanner userInputValue = new Scanner(System.in);
        System.out.println("| Choisissez une option :                                          |");
        String keyValue = userInputValue.nextLine();
        return keyValue;
    }
}