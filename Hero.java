import java.util.Comparator;

public class Hero implements Comparable<Hero>{

    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Hero hero1) {
        // TODO Auto-generated method stub
        return this.getName().compareTo(hero1.getName());
    }

}

class SortByNameDesc implements Comparator<Hero> {
    public int compare(Hero hero1, Hero hero2){
        return hero2.getName().compareTo(hero1.getName());
    }
}

class SortByAge implements Comparator<Hero> {
    public int compare(Hero hero1, Hero hero2) {
        return hero1.getAge() - hero2.getAge();
    }
}

class SortByAgeDesc implements Comparator<Hero> {
    public int compare(Hero hero1, Hero hero2) {
        return hero2.getAge() - hero1.getAge();
    }
}