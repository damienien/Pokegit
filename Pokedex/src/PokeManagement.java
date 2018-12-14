import java.util.ArrayList;
import java.util.List;

public class PokeManagement implements PokeManager {

    private List<Pokemon> listPokemon = new ArrayList<>();
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
    public void deletePokemon(String Name) {
        for (Pokemon pokemon : listPokemon) {
            if (pokemon.getName().equals(Name)) {
                listPokemon.remove(pokemon);
            }
        }
    }

    @Override
    public void addTrainer(String Name, String Sex, String City, Integer Age, Integer Size, List Pokemon) {

         Trainer Trainer = new Trainer();

        Trainer.setName(Name);
        Trainer.setSex(Sex);
        Trainer.setCity(City);
        Trainer.setAge(Age);
        Trainer.setSize(Size);
        listeTrainer.add(Trainer);


    }

    @Override
    public void deleteTrainer(String Name) {

        for (Trainer trainer : listeTrainer) {
            if (trainer.getName().equals(Name)) {
                listeTrainer.remove(trainer);
            }
        }

    }

    @Override
    public void displayAllPokemon() {
        for (Pokemon pokemon : listPokemon) {
            System.out.println(pokemon.getName() + "  " + pokemon.getType() + "  " + pokemon.getEnvironment());
        }
    }

    @Override
    public void displayPokeDetails(String Name, String Type, String Sex, String Environment, Integer Size, String Attack1, String Attack2, String Attack3, String Attack4) {

        for (Pokemon pokemon : listPokemon) {
            if (pokemon.getName().equals(Name)) {
                System.out.println(pokemon.getName() + "  " + pokemon.getType() + "  " + pokemon.getSex() + "  " + pokemon.getEnvironment() + "  " + pokemon.getSize() + "  " + pokemon.getAttack1() + " " + pokemon.getAttack2() + " " + pokemon.getAttack3() + "  " + pokemon.getAttack4());
            }
        }

    }

    @Override
    public void displayAllTrainer() {

        for (Trainer trainer : listeTrainer) {
            System.out.println(trainer.getName() + "  " + trainer.getAge() + "  " + trainer.getSize());
        }

    }

    @Override
    public void displayTrainerDetails(String Name, String Sex, String City, Integer Age, Integer Size) {
        for (Trainer trainer : listeTrainer) {
            if (trainer.getName().equals(Name)) {
                System.out.println(trainer.getName() + "  " + trainer.getSex() + "  " + trainer.getCity() + "  " + trainer.getSize() + "  " + trainer.getAge());
            }

        }
    }
}
