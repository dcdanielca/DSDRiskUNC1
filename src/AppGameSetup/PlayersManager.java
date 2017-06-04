package AppGameSetup;

import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author GROUP 1 UNC
 */
public class PlayersManager {

    public static JSONArray request(String username) throws ParseException {
        JSONObject obj = new org.json.simple.JSONObject();
        obj.put("username", username);
        System.out.println(obj.toJSONString());

        String s = (new Scanner(System.in)).nextLine();
        JSONParser parser = new JSONParser();
        JSONObject response = (JSONObject) parser.parse(s);
        JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");
        return array;
    }

    public static JSONArray invite(String username) throws ParseException {
        JSONObject obj = new org.json.simple.JSONObject();
        obj.put("username", username);
        System.out.println(obj.toJSONString());

        String s = (new Scanner(System.in)).nextLine();
        JSONParser parser = new JSONParser();
        JSONObject response = (JSONObject) parser.parse(s);
        JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");
        return array;
    }
}
