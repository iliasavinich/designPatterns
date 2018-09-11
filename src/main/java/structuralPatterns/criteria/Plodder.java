package structuralPatterns.criteria;

public class Plodder {

    private String alias;
    private String gender;
    private Integer age;


    public  Plodder(String alias, String gender, Integer age){
        this.age = age;
        this.gender = gender;
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Alias : " + alias + " Gender : " + gender + " Age : " + age.toString();
    }
}
