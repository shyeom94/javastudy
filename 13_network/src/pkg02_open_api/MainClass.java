package pkg02_open_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainClass {

  public static void main(String[] args) {

    // 공공데이터 포털 요청주소 작성
    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath");
    builder.append("?serviceKey=").append("UqeR2pYvXWjo9qarvQRC3w5nogapbLemiq2RgreZCPIHMu4Llh6YY6SrKjcBy1tzJ7ppkJ5bHdBfZ8807IDg7Q%3D%3D");
    builder.append("&searchYear=").append(2022);
    builder.append("&siDo=").append(1100);
    builder.append("&guGun=").append(1125);
    builder.append("&type=").append("json");
    builder.append("&numOfRows=").append(10);
    builder.append("&pageNo=").append(1);

    String spec = builder.toString();

    URL url = null;
    HttpURLConnection con = null;

    BufferedReader in = null;

    try {

      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();

      if (con.getResponseCode() != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException("API 요청 실패");
      }

      in = new BufferedReader(new InputStreamReader(con.getInputStream()));

      StringBuilder sb = new StringBuilder();
      String line = null;

      while ((line = in.readLine()) != null) {
        sb.append(line);
      }

      // System.out.println(sb.toString()); // 결과 출력 
      
      // import org.json.JSONObject; 하여 사용하기
      
      /*
       * JSONObject-> {} 객체 처리용 
       * JSONArray -> [] 배열 처리용 
       * 
       * JSONObject obj = {name:value} 
       * value 가 int     인 경우, obj.getInt(name)
       * value 가 String  인 경우, obj.getString(name)
       * value 가 { } 객체인 경우, obj.getJSONObject(name)
       * value 가 [ ] 객체인 경우, obj.getJSONArray(name)
       * 
       * String responseDAta = sb.toString();
       * JSONObject obj = new JSONObject(responseData);
       * 
       * obj.getString("resultCode") == "00" 
       * obj.getString("resultMsg")  == "NORMAL_CODE" 
       * obj.getJSONObject("items").getJSONArray("item") == [  ] // Array 
       */
      
      JSONObject obj = new JSONObject(sb.toString());
      JSONArray items = obj.getJSONObject("items").getJSONArray("item");
      
      // 아이템 갯수 출력
      // System.out.println(items.length()); 
      
      for (int i = 0, length = items.length(); i < length; i++) {
        Map<String, Object> map = items.getJSONObject(i).toMap();
        // key 와 value 의 조합인 Map 으로 바꾸기
        System.out.println(map.get("occrrnc_dt") + " : " + map.get("dth_dnv_cnt"));
      }

      in.close();
      con.disconnect();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
