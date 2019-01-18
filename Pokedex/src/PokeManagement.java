import java.util.ArrayList;
import java.util.List;

public class PokeManagement implements PokeManager {

    private List<Pokemon> listPokemon = new ArrayList<>();
    private List<Trainer> listeTrainer = new ArrayList<>();

    private String addSpace(Integer number) {
        String space = "";
        for (int i = 1; i <= number; i++) {
            space = space + " ";
        }
        return space;
    }

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
    public void addTrainer(String Name, String Sex, String City, Integer Age, Integer Size) {

        for (Trainer trainer : listeTrainer) {
            if (trainer.getName().equals(Name)) {
                System.out.println("Un dresseur de ce nom existe déjà !");
                Name = null;
            }
        }

        if (Name != null) {
            Trainer Trainer = new Trainer();
            Trainer.setName(Name);
            Trainer.setSex(Sex);
            Trainer.setCity(City);
            Trainer.setAge(Age);
            Trainer.setSize(Size);
            listeTrainer.add(Trainer);
        }
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
            System.out.println(pokemon.getName() + addSpace(10 - pokemon.getName().length()) + "| " + pokemon.getType() + addSpace(10 - pokemon.getType().length()) + "| " + pokemon.getEnvironment() + addSpace(48 - pokemon.getEnvironment().length()) + "|");
        }
        if (listPokemon.size() == 0) {
            System.out.println("Il n'y a pas encore de pokemons enregistrés.");
        }
    }

    @Override
    public void displayPokeDetails(String name) {

        for (Pokemon pokemon : listPokemon) {
            if (pokemon.getName().equals(name)) {
                System.out.println(pokemon.getName() + "  " + pokemon.getType() + "  " + pokemon.getSex() + "  " + pokemon.getEnvironment() + "  " + pokemon.getSize() + "  " + pokemon.getAttack1() + " " + pokemon.getAttack2() + " " + pokemon.getAttack3() + "  " + pokemon.getAttack4());
            }
        }

    }

    @Override
    public void displayAllTrainer() {

        for (Trainer trainer : listeTrainer) {
            System.out.println(trainer.getName() + "  " + trainer.getAge() + "  " + trainer.getSize());
        }
        if (listeTrainer.size()==0) {
            System.out.println("Il n'y a pas encore de dresseurs enregistrés.");
        }

    }

    @Override
    public void displayTrainerDetails(String name) {
        for (Trainer trainer : listeTrainer) {
            if (trainer.getName().equals(name)) {
                System.out.println(trainer.getName() + "  " + trainer.getSex() + "  " + trainer.getCity() + "  " + trainer.getSize() + "  " + trainer.getAge());
            }
        }
    }
}
