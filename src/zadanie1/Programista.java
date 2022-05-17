package zadanie1;

public class Programista {

    public Programista(String enterName,String enterSecondName,String enterLanguage,int enterSalary){
        this.name = enterName;
        this.secondName = enterSecondName;
        this.language = enterLanguage;
        this.salary = enterSalary;
    }

    private String name;
    private String secondName;
    private String language;
    private int salary;

    public String getName(){
        return name;
    }
    public String getSecondName(){
        return secondName;
    }
    public String getLanguage(){
        return language;
    }
    public int getSalary(){
        return salary;
    }

}
