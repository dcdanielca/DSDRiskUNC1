package AppAccount;

import Controller.ConnectionStatus;
import Controller.AllServices;
import Controller.Connection;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author GROUP 1 UNC
 */
public class AccountManager {

    public static String createAccount(String username, String password, String confirmPassword, String email) throws ParseException {

        if (password.equals(confirmPassword)) {

            JSONObject obj = new org.json.simple.JSONObject();
            obj.put("username", username);
            obj.put("password", password);
            obj.put("e-mail", email);
            obj.put("confirmPass", confirmPassword);
            System.out.println(obj.toJSONString());
            String s = (new Scanner(System.in)).nextLine();
            JSONParser parser = new JSONParser();
            JSONObject response = (JSONObject) parser.parse(s);
            JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");
            return (String) (((JSONObject) (array.get(0))).get("message"));
        } else {
            return "The password and confirm password are diferent";
        }
    }

    public static JSONArray loginAccount(String username, String password) throws ParseException {

        JSONObject obj = new org.json.simple.JSONObject();
        obj.put("username", username);
        obj.put("password", password);

        System.out.println(obj.toJSONString());
        String s = (new Scanner(System.in)).nextLine();
        JSONParser parser = new JSONParser();
        JSONObject response = (JSONObject) parser.parse(s);
        JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");
        return array;
    }

}
