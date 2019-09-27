import models.Auto;
import models.User;
import services.UserService;

public class Main {
    public static void main(String[] args){

        UserService userService = new UserService();

        for (User u : userService.findAllUsers()){
            userService.deleteUser(u);
        }

        User user = new User("Masha",26);
        userService.saveUser(user);
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        user.setAge(18);
        userService.updateUser(user);

    }
}