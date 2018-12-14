public interface PokeManager {

     void addPokemon(String Name, String Type, String Sex, String Environment, Integer Size, String Attack1, String Attack2, String Attack3, String Attack4);
     void deletePokemon(String Name);
     void addTrainer(String Name, String Sex, String City, Integer Age, Integer Size);
     void deleteTrainer(String Name);
     void displayAllPokemon();
     void displayPokeDetails(String Name, String Type, String Sex, String Environment, Integer Size, String Attack1, String Attack2, String Attack3, String Attack4);
     void displayAllTrainer();
     void displayTrainerDetails(String Name, String Sex, String City,Integer Age,Integer Size);
}
