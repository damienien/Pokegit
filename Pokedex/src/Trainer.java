import java.util.List;

public class Trainer {
    private String age;
    private Integer size;
    private String name;
    private String sex;
    private String city;
    private List<Pokemon> listPokemon;

    public String getAge() {
        return age;
    }

    public Integer getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getCity() {
        return city;
    }

    public List<Pokemon> getListPokemon() {
        return listPokemon;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setListPokemon(List<Pokemon> listPokemon) {
        this.listPokemon = listPokemon;
    }
}
