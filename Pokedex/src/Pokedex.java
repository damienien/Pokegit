import java.util.Scanner;

public class Pokedex {

    private static PokeManager pm = new PokeManagement();

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

        switch (userKeyValue) {
            case ("1"):
                pm.displayAllPokemon();
                break;
            case ("2"):
                pm.displayAllTrainer();
                break;
            case ("3"):
                pm.addPokemon(userInput("| Quel est le nom du Pokémon ?"), userInput("| Quel est le type du Pokémon ?"), userInput("| Quel est le sexe du Pokémon ?"), userInput("| Dans quel environement vit le Pokémon ?"), Integer.parseInt(userInput("| Quelle taille (en cm) fait le Pokémon ?")), userInput("| Quelle est la première attaque du Pokémon ?"), userInput("| Quelle est la deuxième attaque du Pokémon ?"), userInput("| Quelle est la troisième attaque du Pokémon ?"), userInput("| Quelle est la quatrième attaque du Pokémon ?"));
                System.out.println("Le Pokémon à été enregsitré dans le Pokedex avec succès !");
                break;
            case ("4"):
                pm.deletePokemon(userInput("Quel est le nom du Pokémon que vous souhaitez supprimer ?"));
                System.out.println("Le Pokémon à été supprimé du Pokedex avec succès !");
                break;
            case ("5"):
                pm.addTrainer(userInput("Quel est le nom du dresseur que vous souhaitez enregistrer dans le Pokedex ?"), userInput("Quel est le sexe du dresseur que vous souhaitez enregistrer dans le Pokedex ?"), userInput("Quel est la ville d'origine du dresseur que vous souhaitez enregistrer dans le Pokedex ?"), Integer.parseInt(userInput("Quel est l'âge du dresseur que vous souhaitez enregistrer dans le Pokedex ?")), Integer.parseInt(userInput("Quel est la taille du dresseur que vous souhaitez enregistrer dans le Pokedex ?")));
                System.out.println("Le dresseur à été enregistré dans le Pokedex avec succès !");
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