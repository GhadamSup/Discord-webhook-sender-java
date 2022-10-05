

public class Main {
    
    public static void main(String[] args) {
      
            WebhookSender webhookSender = new WebhookSender(); // Importing the class to get access inner methods
      
      /*
      * Call the class you have imported then call the inner class
      * Then fill the parameters
      */
      
            webhookSender.sender("Test title", "Test Message", "Hook URL"); 
    }
    
}
