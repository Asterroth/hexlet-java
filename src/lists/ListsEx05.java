package lists;
import java.util.List;
import java.util.ArrayList;

public class ListsEx05 {
    public static void main(String[] args) {
        var user1 = new User("John");
        user1.addFriend(new User("Ellery"));
        var user2 = new User("Anna");
        user2.addFriend(new User("Abey"));
// Общий друг двух пользователей
        var friend = new User("Jacky");
        user1.addFriend(friend);
        user2.addFriend(friend);
        List<User> commonFriends = getCommonFriends(user1, user2);
        System.out.println(commonFriends); // => ["Jacky"]
    }

    public static List<User> getCommonFriends(User user1, User user2) {
        var friendList1 = user1.getFriends();
        var friendList2 = user2.getFriends();
        var commonFriends = new ArrayList<>(friendList1);
        commonFriends.retainAll(friendList2);
        return commonFriends;
    }
}

final class User {

    private String name;
    private List<User> friends;

    public User(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void addFriend(User friend) {
        friends.add(friend);
    }

    @Override
    public String toString() {
        return name;
    }
}

