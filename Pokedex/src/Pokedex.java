import java.util.Scanner;

public class Pokedex {

    private static PokeManager pm = new PokeManagement();

    public static void main(String[] args) {
        pm.addPokemon("Pikachu", "Électrique", "Mâle", "Plaine", 3, "Tonerre", "Cage-éclair", "Reflet", "Vive-attaque");
        pm.addPokemon("Salamèche", "Feu", "Mâle", "Montagne", 3, "Flamèche", "Griffe", "Queue de fer", "Intimidation");
        pm.addPokemon("Carapuce", "Eau", "Femelle", "Rivière", 3, "Pistolet à ô", "Abri", "Écume", "Reflet");
        pm.addPokemon("Bubizarre", "Plante", "Mâle", "Forêt", 3, "Fouet-lianes", "Vampi-graines", "Intimidation", "Griffe");
        pokedexMenu();
    }

    private static void pokedexMenu() {
        System.out.println(" __________________________________________________________________");
        System.out.println("|                                                                  |");
        System.out.println("|                       ATTRAPEZ-LES TOUS !                        |");
        System.out.println("|__________________________________________________________________|");
        System.out.println("|                      Pokedex   - V 1.0.0 -                       |");
        System.out.println("|__________________________________________________________________|");
        System.out.println("| 1 - AFFICHER TOUS LES POKÉMONS                                   |");
        System.out.println("| 2 - AFFICHER TOUS LES DRESSEURS                                  |");
        System.out.println("| 3 - AJOUTER UN POKEMON                                           |");
        System.out.println("| 4 - SUPPRIMER UN POKEMON                                         |");
        System.out.println("| 5 - AJOUTER UN DRESSEUR                                          |");
        System.out.println("| 6 - SUPPRIMER UN DRESSEUR                                        |");
        System.out.println("| 7 - AFFICHER UN POKEMON                                          |");
        System.out.println("| 8 - AFFICHER UN DRESSEUR                                         |");
        System.out.println("|__________________________________________________________________|");

        String userKeyValue = userInput("| Choisissez une option :                                          |", 1);

        switch (userKeyValue) {
            case ("1"):
                System.out.println(" __________________________________________________________________");
                System.out.println("|           |           |                                          |");
                System.out.println("|    NOM    |   TYPE    |              ENVIRONNEMENT               |");
                System.out.println("|___________|___________|__________________________________________|");
                pm.displayAllPokemon();
                System.out.println("|__________________________________________________________________|");
                break;
            case ("2"):
                pm.displayAllTrainer();
                break;
            case ("3"):
                pm.addPokemon(userInput("| Quel est le nom du Pokémon ?", 10), userInput("| Quel est le type du Pokémon ?", 10), userInput("| Quel est le sexe du Pokémon ?", 10), userInput("| Dans quel environement vit le Pokémon ?", 10), Integer.parseInt(userInput("| Quelle taille (en cm) fait le Pokémon ?", 3)), userInput("| Quelle est la première attaque du Pokémon ?", 15), userInput("| Quelle est la deuxième attaque du Pokémon ?", 15), userInput("| Quelle est la troisième attaque du Pokémon ?", 15), userInput("| Quelle est la quatrième attaque du Pokémon ?", 15));
                System.out.println("Le Pokémon à été enregsitré dans le Pokedex avec succès !");
                break;
            case ("4"):
                pm.deletePokemon(userInput("Quel est le nom du Pokémon que vous souhaitez supprimer ?", 10));
                System.out.println("Le Pokémon à été supprimé du Pokedex avec succès !");
                break;
            case ("5"):
                pm.addTrainer(userInput("Quel est le nom du dresseur que vous souhaitez enregistrer dans le Pokedex ?", 10), userInput("Quel est le sexe du dresseur que vous souhaitez enregistrer dans le Pokedex ?", 5), userInput("Quel est la ville d'origine du dresseur que vous souhaitez enregistrer dans le Pokedex ?", 10), Integer.parseInt(userInput("Quel est l'âge du dresseur que vous souhaitez enregistrer dans le Pokedex ?", 3)), Integer.parseInt(userInput("Quel est la taille du dresseur que vous souhaitez enregistrer dans le Pokedex ?", 3)));
                System.out.println("Le dresseur à été enregistré dans le Pokedex avec succès !");
                break;
            case ("6"):
                pm.deleteTrainer(userInput("Quel est le nom du dresseur que vous souhaitez supprimer ?", 10));
                System.out.println("Le dresseur à été supprimé du Pokedex avec succès !");
                break;
            case ("7"):
                pm.displayPokeDetails(userInput("Quel est le nom du Pokémon que vous souhaitez afficher ?", 10));
                break;
            case ("8"):
                pm.displayTrainerDetails(userInput("Quel est le nom du dresseur que vous souhaitez afficher ?", 10));
                break;
            default:
                System.out.println("Option invalide, veuillez choisir parmis les options disponible...");
                break;
        }
        pokedexMenu();
    }

    private static String userInput(String message, Integer size) {
        System.out.println(message);
        Scanner userInputValue = new Scanner(System.in);
        String keyValue = userInputValue.nextLine();

        if (keyValue.length() > size) {
            System.out.println("La taille de la chaine de caractère ne doit pas dépasser " + size.toString() + " caractères.");
            return userInput(message, size);
        }
        return keyValue;
    }
}