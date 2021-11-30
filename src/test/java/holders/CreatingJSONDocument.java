
package holders;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;
import testNG.testSuites.EC_FibreOrder_Frogfoot;

import org.json.simple.JSONObject;
public class CreatingJSONDocument {
    public static void writeData() {

        JSONObject jsonObject = new JSONObject();
        int aNumber = (int)((Math.random() * 9000000)+1000000);
        int s = (int)((Math.random() * 9000000)+1000000);
        String accountNumber=String.valueOf(s);
        int emailNumber = (int)((Math.random() * 9000000)+1000000);
        String email= "test.test"+emailNumber+"@gmail.com";
        jsonObject.put("name", "Test");
        jsonObject.put("surname", "MwebPortal");
        jsonObject.put("number", "078"+aNumber);
        jsonObject.put("email", email);
        jsonObject.put("idNumber", "2004014800080");
        jsonObject.put("account", accountNumber);
        try {
            FileWriter file = new FileWriter("src/mwebdata.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
    }
    public static String writeDataOderNumber( String ordernumber) {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("account", ordernumber);
        try {
            FileWriter file = new FileWriter("src/orderNumbers.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
        return ordernumber;
    }
}