
package Vista;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class prueba {
    
    public static void main(String[] args) throws ParseException {
        
        SessionGUI s = new SessionGUI("Daniel");
        /*
        JSONParser parser = new JSONParser();
        JSONObject response = (JSONObject) parser.parse("{\"sessions\":[{\"players\":[{\"numberOfSessionsWon\":0,\"color\":\"YELLOW\",\"percentajeOfWins\":0.0,\"numberOfSessionLost\":0,\"email\":\"casimiro@unal.edu.co\",\"username\":\"casimiro\",\"status\":\"ONLINE\"}],\"id\":1,\"type\":null,\"map\":null,\"hostUsername\":\"No Face\"},{\"players\":[{\"numberOfSessionsWon\":0,\"color\":\"YELLOW\",\"percentajeOfWins\":0.0,\"numberOfSessionLost\":0,\"email\":\"berta@unal.edu.co\",\"username\":\"berta\",\"status\":\"ONLINE\"}],\"id\":2,\"type\":null,\"map\":null,\"hostUsername\":\"with Face\"}],\"status\":true}");
        JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");
        
        System.out.println(((JSONObject) (((JSONArray) (((JSONObject) (array.get(0))).get("sessions"))).get(0))).get("hostUsername"));*/
    }
}
