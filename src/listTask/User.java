package listTask;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Ferid", 26));
        users.add(new User("Resid", 27));
        users.add(new User("Elcin", 21));

        users.forEach(user -> {
            System.out.println("Name : "+user.getName() + ", Age : " + user.getAge());
        });
    }


}
