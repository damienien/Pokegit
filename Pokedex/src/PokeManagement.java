import java.util.ArrayList;
import java.util.List;

public class PokeManagement implements PokeManager {

    private List<Pokemon> listPokemon = new ArrayList<>();

    private Trainer Trainer = new Trainer();
    private List<Trainer> listeTrainer = new ArrayList<>();


    @Override
    public void addPokemon(String Name, String Type, String Sex, String Environment, Integer Size, String Attack1, String Attack2, String Attack3, String Attack4) {
        Pokemon pokemon = new Pokemon();

        pokemon.setName(Name);
        pokemon.setType(Type);
        pokemon.setSex(Sex);
        pokemon.setEnvironment(Environment);
        pokemon.setSize(Size);
        pokemon.setAttack1(Attack1);
        pokemon.setAttack2(Attack2);
        pokemon.setAttack3(Attack3);
        pokemon.setAttack4(Attack4);
        listPokemon.add(pokemon);

    }

    @Override
    public boolean deletePokemon(String Name) {
    Integer listSizePokemon = listPokemon.size();
        for (Pokemon pokemon : listPokemon) {
            if (pokemon.getName().equals(Name)) {
                listPokemon.remove(pokemon);
            }
        }

        if (listPokemon.size()==(listSizePokemon-1)) {
            return true;
        } else {
            return false;
        }
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
    public void displayAllPokemon() {
        for (Pokemon pokemon : listPokemon) {
            System.out.println(pokemon.getName() + "  " +  pokemon.getType() + "  " + pokemon.getEnvironment());
        }
    }

    @Override
    public void displayPokeDetails(String Name, String Type, String Sex, String Environment, Integer Size, List Trainer, String Attack1, String Attack2, String Attack3, String Attack4) {

    }

    @Override
    public void displayAllTrainer() {

        for (Trainer trainer : listeTrainer) {
            System.out.println(trainer.getName() + "  " +  trainer.getAge() + "  " + trainer.getSize());
        }

    }

    @Override
    public void displayTrainerDetails(String Name, String Sex, String City, Integer Age, Integer Size, List Pokemon) {

    }
}
