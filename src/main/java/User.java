public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        User anna = new User("Anna", 20);
        User marta = new User("Marta", 36);
        User nel = new User("Nel", 33);
        User viki = new User("Viki", 18);
        User suzie = new User("Suzie", 28);

        User[] users = {anna, marta, nel, viki, suzie};

        int sumAge = 0;
        for (int i = 0; i < users.length; i++) {
            sumAge = sumAge + users[i].age;
        }
        System.out.println(sumAge);

        int usersNumber = users.length;
        int averageAge = sumAge / usersNumber;
        System.out.println("The average age of user is  " + averageAge);

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < averageAge) {
                System.out.println(" Users under the average age' user :" + users[i].name);
            }
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
