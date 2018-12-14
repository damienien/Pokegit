import java.util.List;

public interface PokeManager {

     boolean addPokemon(String Name, String Type, String Sex, String Environment, Integer Size, String Attack1, String Attack2, String Attack3, String Attack4);
     void deletePokemon(String Name);
     boolean addTrainer(String Name, String Sex, String City, Integer Age, Integer Size, List Pokemon);
     void deleteTrainer(String Name);
     void displayAllPokemon(List<Pokemon> Pokemon);
     void displayPokeDetails(String Name, String Type, String Sex, String Environment, Integer Size, List Trainer, String Attack1, String Attack2, String Attack3, String Attack4);
     void displayAllTrainer(List<Trainer> Trainer);
     void displayTrainerDetails(String Name, String Sex, String City,Integer Age,Integer Size, List Pokemon);
}
