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
   
        public static JSONArray startSession(int sessionId, String type, String mapName) throws ParseException {
        JSONObject obj = new org.json.simple.JSONObject();
        obj.put("sessionId", sessionId);
        obj.put("type", type);
        obj.put("mapName", mapName);
        System.out.println(obj.toJSONString());

        String s = (new Scanner(System.in)).nextLine();
        JSONParser parser = new JSONParser();
        JSONObject response = (JSONObject) parser.parse(s);
        JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");
        return array;
    }
}
