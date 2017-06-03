package AppGameSetup;

import Model.Player;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author GROUP 1 UNC
 */
public class InitialSetup {
        public static JSONArray startSession(int numberPlayers, String type, String mapName, Player[] players, String username) throws ParseException {
        JSONObject obj = new org.json.simple.JSONObject();
        obj.put("numberPlayers", numberPlayers);
        obj.put("type", type);
        JSONObject p = new org.json.simple.JSONObject();
        for (Player player : players) {
            p.put("username", player);
        }
        obj.put("players",p);
        obj.put("mapName", mapName);
        obj.put("numberPlayers", numberPlayers);
     
        obj.put("username", username);

        System.out.println(obj.toJSONString());

        String s = (new Scanner(System.in)).nextLine();
        JSONParser parser = new JSONParser();
        JSONObject response = (JSONObject) parser.parse(s);
        JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");
        return array;
    }
}
