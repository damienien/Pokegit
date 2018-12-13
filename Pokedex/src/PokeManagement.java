import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokeManagement implements PokeManager {

    Pokemon Pokemon = new Pokemon();
    List<Pokemon> listPokemon = new ArrayList<>();

    public static String userInput() {
        Scanner userInputValue = new Scanner(System.in);
        String keyValue = userInputValue.nextLine();
        return keyValue;
    }

    @Override
    public void addPokemon(String Name, String Type, String Sex, String Environment, Integer Size, String Attack1, String Attack2, String Attack3, String Attack4) {
        Pokemon.setName(Name);
        Pokemon.setType(Type);
    }

    @Override
    public void deletePokemon(String Name) {

    }

    @Override
    public void addTrainer(String Name, String Sex, String City, Integer Age, Integer Size, List Pokemon) {

    }

    @Override
    public void deleteTrainer(String Name) {

    }

    @Override
    public void displayAllPokemon(List<Pokemon> Pokemon) {

    }

    @Override
    public void displayPokeDetails(String Name, String Type, String Sex, String Environment, Integer Size, List Trainer, String Attack1, String Attack2, String Attack3, String Attack4) {

    }

    @Override
    public void displayAllTrainer(List<Trainer> Trainer) {

    }

    @Override
    public void displayTrainerDetails(String Name, String Sex, String City, Integer Age, Integer Size, List Pokemon) {

    }
}
