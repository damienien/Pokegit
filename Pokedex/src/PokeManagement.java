import java.util.ArrayList;
import java.util.List;

public class PokeManagement implements PokeManager {

    Pokemon Pokemon = new Pokemon();
    List<Pokemon> listPokemon = new ArrayList<>();

    Trainer Trainer = new Trainer();
    List<Trainer> listeTrainer = new ArrayList<>();


    @Override
    public boolean addPokemon(String Name, String Type, String Sex, String Environment, Integer Size, String Attack1, String Attack2, String Attack3, String Attack4) {
        Integer listSize = listPokemon.size();
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

        if (listPokemon.size()==(listSize+1)) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void deletePokemon(String Name) {

    }

    @Override
    public boolean addTrainer(String Name, String Sex, String City, Integer Age, Integer Size, List Pokemon) {
        Integer listSizeTrainer = listeTrainer.size();
        Trainer.setName(Name);
        Trainer.setSex(Sex);
        Trainer.setCity(City);
        Trainer.setAge(Age);
        Trainer.setSize(Size);
        listeTrainer.add(Trainer);

        if (listeTrainer.size()==(listSizeTrainer+1)) {
            return true;
        } else {
            return false;
        }

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
