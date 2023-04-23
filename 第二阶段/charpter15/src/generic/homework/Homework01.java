package generic.homework;

import java.util.*;


public class Homework01 {
    public static void main(String[] args) {
        User xiaoming = new User(001, 19, "xiaoming");
        User xiaohong = new User(002, 20, "xiaohong");
        User hack = new User(003, 21, "hack");
        User milan = new User(004, 22, "milan");
        User john = new User(005, 23, "john");

        DAO<User> ud = new DAO<User>(new HashMap<>());

        //save
        ud.save(xiaoming.getId() + "", xiaoming);
        ud.save(xiaohong.getId() + "", xiaohong);
        ud.save(hack.getId() + "", hack);
        ud.save(milan.getId() + "", milan);
        ud.save(john.getId() + "", john);
        //先看下map
        System.out.println(ud.getMap());

        //get
        System.out.println(ud.get(milan.getId() + ""));

        //update
        ud.update(milan.getId() + "", john);
        System.out.println(ud.getMap());

        //list
        System.out.println("list = " + ud.list());

        //delete
        ud.delete(john.getId() + "");
        System.out.println(ud.getMap());
    }
}

class DAO<T> {
    private Map<String, T> map;

    public DAO(Map<String, T> map) {
        this.map = map;
    }

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {//有点看不太懂
//         Collection<T> values = map.values();//原本返回Collection<T>,但是我向下转型了
        List<T> ts = new ArrayList<>();
        Set<Map.Entry<String, T>> entries = map.entrySet();
        for (Map.Entry<String, T> o : entries) {
            ts.add(o.getValue());
        }
        return ts;
    }

    public void delete(String id) {
        map.remove(id);
    }

    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "DAO{" +
                "map=" + map +
                '}' + "\n";
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}