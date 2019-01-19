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
        for (Pokemon pokemon : listPokemon) {
            if (pokemon.getName().equals(Name)) {
                System.out.println("Un Pokémon de ce nom existe déjà !");
                Name = null;
            }
        }

        if (Name != null) {
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
    }

    @Override
    public void deletePokemon(String Name) {
        int i = 0;
        for (Pokemon pokemon : listPokemon) {
            if (pokemon.getName().equals(Name)) {
                listPokemon.remove(i);
            }
            i = i + 1;
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
        int i = 0;
        for (Trainer trainer : listeTrainer) {
            if (trainer.getName().equals(Name)) {
                listeTrainer.remove(i);
            }
            i = i + 1;
        }

    }

    @Override
    public void displayAllPokemon() {
        for (Pokemon pokemon : listPokemon) {
            System.out.println("| " + pokemon.getName() + addSpace(10 - pokemon.getName().length()) + "| " + pokemon.getType() + addSpace(10 - pokemon.getType().length()) + "| " + pokemon.getEnvironment() + addSpace(41 - pokemon.getEnvironment().length()) + "|");
        }
        if (listPokemon.size() == 0) {
            System.out.println("Il n'y a pas encore de pokemons enregistrés.");
        }
    }

    @Override
    public void displayPokeDetails(String name) {

        for (Pokemon pokemon : listPokemon) {
            if (pokemon.getName().equals(name)) {
                System.out.println(" __________________________________________________________________");
                System.out.println("|                  |                    |                          |");
                System.out.println("| NOM :  " + pokemon.getName() + addSpace(10 - pokemon.getName().length()) + "| TYPE :  " + pokemon.getType() + addSpace(10 - pokemon.getType().length()) + " | SEXE :   " + pokemon.getSex() + addSpace(10 - pokemon.getSex().length()) + "      |");
                System.out.println("|__________________|____________________|__________________________|");
                System.out.println("|                                                                  |");
                System.out.println("|                    ENVIRONNEMENT : " + pokemon.getEnvironment() + addSpace(10 - pokemon.getEnvironment().length()) + "                    |");
                System.out.println("|__________________________________________________________________|");
                System.out.println("|                             |                                    |");
                System.out.println("| ATTAQUE N°1 :  " + pokemon.getAttack1() + addSpace(13 - pokemon.getAttack1().length()) + "| ATTAQUE N°2 :  " + pokemon.getAttack2() + addSpace(13 - pokemon.getAttack2().length()) + "       |");
                System.out.println("|_____________________________|____________________________________|");
                System.out.println("|                             |                                    |");
                System.out.println("| ATTAQUE N°3 :  " + pokemon.getAttack3() + addSpace(13 - pokemon.getAttack3().length()) + "| ATTAQUE N°4 :  " + pokemon.getAttack4() + addSpace(13 - pokemon.getAttack4().length()) + "       |");
                System.out.println("|_____________________________|____________________________________|");
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
