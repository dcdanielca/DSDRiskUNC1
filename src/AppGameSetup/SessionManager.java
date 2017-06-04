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
public class SessionManager {

    public static JSONArray createSession(String username) throws ParseException {
        JSONObject obj = new org.json.simple.JSONObject();
        obj.put("username", username);
        System.out.println(obj.toJSONString());

        String s = (new Scanner(System.in)).nextLine();
        JSONParser parser = new JSONParser();
        JSONObject response = (JSONObject) parser.parse(s);
        JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");
        return array;
    }

    public static JSONArray deleteSession(String username, int sessionId) throws ParseException {
        JSONObject obj = new org.json.simple.JSONObject();
        obj.put("username", username);
        obj.put("sessionId", sessionId);
        System.out.println(obj.toJSONString());

        String s = (new Scanner(System.in)).nextLine();
        JSONParser parser = new JSONParser();
        JSONObject response = (JSONObject) parser.parse(s);
        JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");
        return array;
    }

    public static JSONArray leaveSession(String username) throws ParseException {
        JSONObject obj = new org.json.simple.JSONObject();
        obj.put("username", username);
        System.out.println(obj.toJSONString());

        String s = (new Scanner(System.in)).nextLine();
        JSONParser parser = new JSONParser();
        JSONObject response = (JSONObject) parser.parse(s);
        JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");
        return array;
    }

    public static JSONArray sendInvitation(String username, String contact) throws ParseException {
        JSONObject obj = new org.json.simple.JSONObject();
        obj.put("username", username);
        obj.put("contact", contact);
        System.out.println(obj.toJSONString());

        String s = (new Scanner(System.in)).nextLine();
        JSONParser parser = new JSONParser();
        JSONObject response = (JSONObject) parser.parse(s);
        JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");
        return array;
    }

    public static JSONArray answerInvitation(String contact, String resp) throws ParseException {
        JSONObject obj = new org.json.simple.JSONObject();
        obj.put("username", contact);
        obj.put("response", resp);
        System.out.println(obj.toJSONString());

        String s = (new Scanner(System.in)).nextLine();
        JSONParser parser = new JSONParser();
        JSONObject response = (JSONObject) parser.parse(s);
        JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");
        return array;
    }

    public static JSONArray makeRequest(String username, int idSession) throws ParseException {
        JSONObject obj = new org.json.simple.JSONObject();
        obj.put("username", username);
        obj.put("idSession", idSession);
        System.out.println(obj.toJSONString());

        String s = (new Scanner(System.in)).nextLine();
        JSONParser parser = new JSONParser();
        JSONObject response = (JSONObject) parser.parse(s);
        JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");
        return array;
    }

    public static JSONArray answerRequest(String contact, String resp) throws ParseException {
        JSONObject obj = new org.json.simple.JSONObject();
        obj.put("username", contact);
        obj.put("response", resp);
        System.out.println(obj.toJSONString());

        String s = (new Scanner(System.in)).nextLine();
        JSONParser parser = new JSONParser();
        JSONObject response = (JSONObject) parser.parse(s);
        JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");
        return array;
    }

    public static JSONArray listSession() throws ParseException {

        JSONObject obj = new org.json.simple.JSONObject();
        System.out.println(obj.toJSONString());

        String s = (new Scanner(System.in)).nextLine();
        JSONParser parser = new JSONParser();
        JSONObject response = (JSONObject) parser.parse(s);
        JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");
        return array;
    }

    public static JSONArray takeOutPlayer(String username, int idSession) throws ParseException {
        JSONObject obj = new org.json.simple.JSONObject();
        obj.put("username", username);
        obj.put("idSession", idSession);
        System.out.println(obj.toJSONString());

        String s = (new Scanner(System.in)).nextLine();
        JSONParser parser = new JSONParser();
        JSONObject response = (JSONObject) parser.parse(s);
        JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");
        return array;
    }
}
