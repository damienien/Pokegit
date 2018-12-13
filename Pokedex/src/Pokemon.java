public class Pokemon {
    private String type;
    private Integer size;
    private String name;
    private String sex;
    private String environment;
    private String attack1;
    private String attack2;
    private String attack3;
    private String attack4;

    //Getter
    public String getType(){
        return type;
    }

    public Integer getSize(){
        return size;
    }

    public String getName(){
        return name;
    }

    public String getSex(){
        return sex;
    }

    public String getEnvironment(){
        return environment;
    }

    public String getAttack1(){
        return attack1;
    }

    public String getAttack2(){
        return attack2;
    }

    public String getAttack3(){
        return attack3;
    }

    public String getAttack4(){
        return attack4;
    }

    //Setter

    public void setType(String type) {
        this.type = type;
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

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setAttack1(String attack1) {
        this.attack1 = attack1;
    }

    public void setAttack2(String attack2) {
        this.attack2 = attack2;
    }

    public void setAttack3(String attack3) {
        this.attack3 = attack3;
    }

    public void setAttack4(String attack4) {
        this.attack4 = attack4;
    }
}
