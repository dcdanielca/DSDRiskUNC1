package Model;

/**
 *
 * @author GROUP 1 UNC
 */
public class Request {
    public String state;
    public Session requestSession;
    
    public boolean answerRequest(){
        state = "Accepted";
        return true;
    }
    
    public boolean makeRequest(String sessionId, String username){
        
        return true;
    }
}
