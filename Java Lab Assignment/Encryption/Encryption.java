import java.util.Scanner;

public class Encryption {
    private String alphabet;
    private String shiftedAlphabet;
    private int mainKey;
    public Encryption(int key){
        alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);
        mainKey = key;
    }

    public String encrypt(String input){
        StringBuilder sb = new StringBuilder(input);
        String alphaLower = alphabet.toLowerCase();
        String shiftLower = shiftedAlphabet.toLowerCase();
        for (int i=0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            int idx = alphabet.indexOf(c);
            int idxLower = alphaLower.indexOf(c);
            if(Character.isLowerCase(c)){
                if(idxLower != -1){
                    c = shiftLower.charAt(idxLower);
                    sb.setCharAt(i, c);
                }
            }
            else{
                if (idx != -1){
                    c = shiftedAlphabet.charAt(idx);
                    sb.setCharAt(i, c);
                }
            }
        }
        return sb.toString();
    }

    public String decrypt(String input){
        Encryption cc = new Encryption(26 - mainKey);
        String decrypt = cc.encrypt(input);
        return decrypt;
    }

    public void testEncrypt(){
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        String encryptedMessage = encrypt(message);
        System.out.println(encryptedMessage);
        System.out.println("Decrypted message: " + decrypt(encryptedMessage));
    }
}
