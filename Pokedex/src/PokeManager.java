import java.util.List;

public interface PokeManager {

     void addPokemon (String Name, String Type, String Sex, String Environment, Integer Size, List Trainer, String Attack1, String Attack2, String Attack3, String Attack4);
     void deletePokemon (String Name);
     void addTrainer (String Name, String Sex, String City,Integer Age,Integer Size, List Pokemon);
     void deleteTrainer (String Name);
     void displayAllPokemon (List Pokemon);
     void displayPokeDetails (String Name, String Type, String Sex, String Environment, Integer Size, List Trainer, String Attack1, String Attack2, String Attack3, String Attack4);
     void displayAllTrainer (List Trainer);
     void displayTrainerDetails (String Name, String Sex, String City,Integer Age,Integer Size, List Pokemon);
}
