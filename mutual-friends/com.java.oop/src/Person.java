public class Person extends Friend {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void addFriend(Person friend) {
        if (this.friendsList.contains(friend)){
            System.out.println(friend.getName() + " is already in your friend list.");
        } else {
            this.friendsList.add(friend);
            Person me = new Person(this.getName());
            friend.friendsList.add(me);
        }
    }

    public void getFriend(Person friend){
         this.friendsList.add(friend);
    }

    @Override
    public void showFriendList() {
        if (friendsList.size() > 0){
            for(int i = 0; i < friendsList.size(); i++){
                System.out.println(friendsList.get(i));
            }
        } else {
            System.out.println("Sorry! You do not have friends yet.");
        }
    }

    @Override
    public void getMutual(Person friend) {
        // compare to alfian
        for (Person friendName : this.friendsList){
            if(friend.friendsList.contains(friendName)){
                System.out.println(friendName);
            } else {
                System.out.println("Sorry! You do not have mutual friends with " + friend.getName() + " (" + friendName.getName() + ")");
            }
        }

        // compare to elena
        for (Person friendName : friend.friendsList){
            if(!this.friendsList.contains(friendName))
                System.out.println("Sorry! You do not have mutual friends with " + friend.getName() + " (" + friendName.getName() + ")");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", friends=" + friendsList +
                '}';
    }
}
