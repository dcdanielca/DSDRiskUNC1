package Model;

/**
 *
 * @author GROUP 1 UNC
 */
public class Host extends Player {

    public Integer sessionId;
      
    public Host(Player player, int sessionId) {
        
        this.account = player.account;
        this.sessionId = sessionId;
        this.color = player.color;
        this.status = player.status;
    }
}
