public class WebhookSender {

public void sender(String title, String message, String hookurl) {

      /*
      * Event i dont know how i make this part so
      * PLEASE DONT CHANGE IT
      */
  
        String jsonBrut = "";
        jsonBrut += "{\"embeds\": [{"
                + "\"title\": \""+ title +"\","
                + "\"description\": \""+ message +"\","
                + "\"color\": 3586272"
                + "}]}";
  
  
      /*
      * Its just a simple http request though web "-"
      * opening the url then sending the request then closing it
      */
  
        try {
            URL url = new URL(hookurl); 
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            con.addRequestProperty("Content-Type", "application/json");
            con.addRequestProperty("User-Agent", "Hook By Ghadam");
            con.setDoOutput(true);
            con.setRequestMethod("POST");
            OutputStream stream = con.getOutputStream();
            stream.write(jsonBrut.getBytes());
            stream.flush();
            stream.close();
            con.getInputStream().close();
            con.disconnect();
          
        } catch (Exception e) { // Make sure its catch Exception so this part dont ruin your code
            e.printStackTrace();
        }
    }
}
