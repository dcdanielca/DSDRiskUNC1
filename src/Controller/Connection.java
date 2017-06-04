package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Connection {

    private URL url;
    private HttpURLConnection httpCon;

    public JSONObject createConnection(Service s, JSONObject json) throws IOException, ParseException {

        url = new URL("http://" + AllServices.ip + ":" + s.port + s.path);
        httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod(s.method); 
        this.addJson(json);
        
        JSONParser parser = new JSONParser();
        String reponse = "["+ catchTheResponseResult()+"]";
        return (JSONObject)((JSONArray)(parser.parse(reponse))).get(0);
        
    }

    public void addJson(JSONObject json) throws IOException {
        
        System.out.println(json.toJSONString());
        byte[] o = json.toJSONString().getBytes(java.nio.charset.StandardCharsets.UTF_8);
        int length = o.length;

        httpCon.setFixedLengthStreamingMode(length);
        httpCon.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        httpCon.connect();
        OutputStream os = httpCon.getOutputStream();

        try {
            os.write(o);
        } catch (Exception e) {
        }
    }
    
    public String catchTheResponseResult() throws IOException{
        
        InputStream is = httpCon.getInputStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
        String line;
        
        while ((line = rd.readLine()) != null) {
            response.append(line);
            response.append('\r');
        }
        rd.close();

        return response.toString();
    }
    
    public HttpURLConnection getHttpCon() {
        return httpCon;
    }
    
     
}
