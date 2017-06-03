package AppAccount;

import Controller.ConnectionStatus;
import Controller.AllServices;
import Controller.Connection;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author GROUP 1 UNC
 */
public class AccountManager {


    public static ConnectionStatus createAccount(String username, String password, String confirmPassword, String email) {
        
        if (password.equals(confirmPassword)) {

            JSONObject obj = new org.json.simple.JSONObject();
            obj.put("username", username);
            obj.put("password", password);
            obj.put("e-mail", email);
            obj.put("confirmPass", confirmPassword);
            System.out.println(obj.toJSONString());
            try {
                String s = (new Scanner(System.in)).next();                   
                JSONParser parser = new JSONParser();
                JSONObject response = (JSONObject) parser.parse(s);                  
                JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");

                if (((JSONObject) (array.get(0))).get("result").equals("true")) {
                    return ConnectionStatus.SUCCESSFUL;
                } else {
                    return ConnectionStatus.FAILED;
                }
            } catch (Exception ex) {

                ex.printStackTrace();
                return ConnectionStatus.WITHOUT_CONNECTION;

            }
        } else {
            return ConnectionStatus.INVALID_PARAMETERS;
        }
    }
    
    public static ConnectionStatus loginAccount(String username, String password){

            JSONObject obj = new org.json.simple.JSONObject();
            obj.put("username", username);
            obj.put("password", password);
            System.out.println(obj.toJSONString());
            try {
                String s = (new Scanner(System.in)).next();                   
                JSONParser parser = new JSONParser();
                JSONObject response = (JSONObject) parser.parse(s);                  
                JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");

                if (((JSONObject) (array.get(0))).get("result").equals("true")) {
                    return ConnectionStatus.SUCCESSFUL;
                } else {
                    return ConnectionStatus.FAILED;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                return ConnectionStatus.WITHOUT_CONNECTION;
            }
    }
    
    
}
