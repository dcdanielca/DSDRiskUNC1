package Model;

/**
 *
 * @author GROUP 1 UNC
 */
public class Player extends User{
    public String color;

    
    public Player(User user, String color){
        this.account = user.account;
        this.status = user.status;
        this.color = color;
    }
    
    public Player() {
        
    }
    
    public static boolean takeOutPlayer(String username){
        
        return true;
    }
}
