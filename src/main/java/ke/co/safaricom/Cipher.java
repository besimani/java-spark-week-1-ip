package ke.co.safaricom;

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

    }
    public String encrypt() {
        char[] message = this.getMessage().toCharArray();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < message.length; i++) {
            char c = message[i];
            int charPos = this.alphabets.indexOf(c);
            int newPos = charPos + this.getKey();
            char newChar = this.alphabets.charAt(newPos);
            output.append(newChar);
        }
        return output.toString();
    }

    public String decrypt(){
        return "decrypt";
    }

    }



