package Vista;

import Controller.Connection;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class prueba {

    public static void main(String[] args) throws IOException, ParseException {

        JSONObject obj = new org.json.simple.JSONObject();

        obj.put("username", "spinos");
        obj.put("password", "12345");
        obj.put("e-mail", "s@");

        Connection c = (new Connection());
        JSONObject response = c.createConnection(Controller.AllServices.createUser, obj);

        JSONParser parser = new JSONParser();
        JSONArray array = (JSONArray) parser.parse("["+ response.toJSONString() +"]");
        
        System.out.println(((JSONObject)(array.get(0))).get("result"));

    }
}
