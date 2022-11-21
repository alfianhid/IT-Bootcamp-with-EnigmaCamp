public class Main {
    public static void main(String[] args) {
        // instantiate all object
        Person alfian = new Person("Alfian");
        Person elena = new Person("Elena");
        Person nefida = new Person("Nefida");
        Person dimas = new Person("Dimas");
        Person haikal = new Person("Haikal");

        // initial data of every person
        System.out.println("=== Initial value of every person ===");
        System.out.println(alfian);
        System.out.println(elena);
//        System.out.println(nefida);
//        System.out.println(dimas);
//        System.out.println(haikal);
        System.out.println("-------------------------------------------------------------------------------------");

        // applying some methods to alfian
        alfian.addFriend(dimas);
        alfian.addFriend(haikal);
        System.out.println(alfian);
        System.out.println(alfian.getName() + "'s friend list includes :");
        alfian.showFriendList();
        System.out.println("-------------------------------------------------------------------------------------");

        // aplying some methods to alfian
        elena.addFriend(nefida);
        elena.addFriend(dimas);
        System.out.println(elena);
        System.out.println(elena.getName() + "'s friend list includes :");
        elena.showFriendList();
        System.out.println("-------------------------------------------------------------------------------------");

        // getting mutual friends of alfian with elena
        System.out.println(alfian.getName() + "'s mutual friend with " + elena.getName() + " includes :");
        alfian.getMutual(elena);
    }
}
