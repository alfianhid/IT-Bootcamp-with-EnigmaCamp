import java.util.ArrayList;

public abstract class Friend {
    // define ArrayList
    ArrayList<Person> friendsList = new ArrayList<>();

    // define abstract method
    public abstract void addFriend(Person friend);
    public abstract void showFriendList();
    public abstract void getMutual(Person friend);
}
