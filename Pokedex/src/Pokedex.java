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

    private static void pokedexMenu() {
        String userKeyValue = userInput("| Choisissez une option :                                          |");
        PokeManager pm = new PokeManagement();

        switch (userKeyValue) {
            case ("1"):
                pm.displayAllPokemon();
                break;
            case ("2"):
                // Fonction rechercher dresseur
                break;
            case ("3"):
                if (pm.addPokemon(userInput("| Quel est le nom du Pokémon ?"), userInput("| Quel est le type du Pokémon ?"), userInput("| Quel est le sexe du Pokémon ?"), userInput("| Dans quel environement vit le Pokémon ?"), Integer.parseInt(userInput("| Quelle taille (en cm) fait le Pokémon ?")), userInput("| Quelle est la première attaque du Pokémon ?"), userInput("| Quelle est la deuxième attaque du Pokémon ?"), userInput("| Quelle est la troisième attaque du Pokémon ?"), userInput("| Quelle est la quatrième attaque du Pokémon ?"))) {
                    System.out.println("Le Pokémon à été enregsitré dans le Pokedex avec succès !");
                } else {
                    System.out.println("Une erreur est survenue, le Pokémon n'as pas été enregistré dans le Pokedex...");
                }
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
                System.out.println("Option invalide, veuillez choisir parmis les options disponible...");
                pokedexMenu();
                break;
        }
        pokedexMenu();
    }

    private static String userInput(String message) {
        System.out.println(message);
        Scanner userInputValue = new Scanner(System.in);
        String keyValue = userInputValue.nextLine();
        return keyValue;
    }
}