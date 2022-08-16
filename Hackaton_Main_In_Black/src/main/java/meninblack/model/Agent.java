package meninblack.model;

public class Agent {

    private Integer id;
    private String originName;
    private String weaponOfChoice;
    private String alias;
    private Integer age;
    private Integer height;


    public Integer getId() {
        return id;
    }

    public String getWeaponOfChoice() {
        return weaponOfChoice;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWeaponOfChoice(String weaponOfChoice) {
        this.weaponOfChoice = weaponOfChoice;
    }

}
