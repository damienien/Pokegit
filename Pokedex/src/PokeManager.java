import java.util.List;

public interface PokeManager {

     void addPokemon(String Name, String Type, String Sex, String Environment, Integer Size, String Attack1, String Attack2, String Attack3, String Attack4);
     boolean deletePokemon(String Name);
     boolean addTrainer(String Name, String Sex, String City, Integer Age, Integer Size, List Pokemon);
     void deleteTrainer(String Name);
     void displayAllPokemon();
     void displayPokeDetails(String Name, String Type, String Sex, String Environment, Integer Size, String Attack1, String Attack2, String Attack3, String Attack4);
     void displayAllTrainer();
     void displayTrainerDetails(String Name, String Sex, String City,Integer Age,Integer Size);
}
