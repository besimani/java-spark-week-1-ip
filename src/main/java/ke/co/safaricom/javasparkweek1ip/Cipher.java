package ke.co.safaricom.javasparkweek1ip;

public class Cipher {
    private String message;
    private int key;
    public String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Cipher() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;

    public String encrypt(){
        char[] message = this.getMessage().toCharArray();
        String output = "";
        for (int i = 0; i < message.length; 1++){
            char c = message[i];
            int charPos = this.alphabets.indexOf(c);
            int newPos = charPos + this.getKey();
            char newChar = this.alphabets.charAt(newPos);
            output = output + newChar;
        }
        return output;
    }

    public String decrypt(){
        return "decrypt";
    }

    }

}

