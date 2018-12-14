import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokeManagement implements PokeManager {

    Pokemon Pokemon = new Pokemon();
    List<Pokemon> listPokemon = new ArrayList<>();

    Trainer Trainer = new Trainer();
    List<Pokemon> listeTrainer = new ArrayList<>();

    public static String userInput() {
        Scanner userInputValue = new Scanner(System.in);
        String keyValue = userInputValue.nextLine();
        return keyValue;
    }

    @Override
    public void addPokemon(String Name, String Type, String Sex, String Environment, Integer Size, String Attack1, String Attack2, String Attack3, String Attack4) {
        Pokemon.setName(Name);
        Pokemon.setType(Type);
        Pokemon.setSex(Sex);
        Pokemon.setEnvironment(Environment);
        Pokemon.setSize(Size);
        Pokemon.setAttack1(Attack1);
        Pokemon.setAttack2(Attack2);
        Pokemon.setAttack3(Attack3);
        Pokemon.setAttack4(Attack4);
        listPokemon.add(Pokemon);

    }

    @Override
    public void deletePokemon(String Name) {

    }

    @Override
    public void addTrainer(String Name, String Sex, String City, Integer Age, Integer Size, List Pokemon) {
        Trainer.setName(Name);
        Trainer.setSex(Sex);
        Trainer.setCity(City);
        Trainer.setAge(Age);
        Trainer.setSize(Size);

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
