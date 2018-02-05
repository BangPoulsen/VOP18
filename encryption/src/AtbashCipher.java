public class AtbashCipher extends AbstractCipher implements CipherInterface {
    @Override
    public String encrypt(String original) {
        char[] tempCharArray = original.toCharArray();
        String encrypted = "";
        System.out.println(ALPHABETH.length);
        System.out.println("tempCharArray: " + tempCharArray.length);
        for (char ch:tempCharArray) {
            int index = findCharIndex(ch, ALPHABETH);
            if(index == -1337){
                encrypted = encrypted + ch;
            }
            else {
                encrypted = encrypted + ALPHABETH[ALPHABETH.length-index-1];
            }
        }
        return encrypted;
    }

    @Override
    public String decrypt(String encrypted) {
        char[] tempCharArray = encrypted.toCharArray();
        String decrypted = "";
        for (char ch:tempCharArray) {
            int index = findCharIndex(ch, ALPHABETH);
            if(index == -1337){
                decrypted = decrypted + ch;
            }
            else{
                decrypted = decrypted + ALPHABETH[ALPHABETH.length-index-1];
            }
        }
        return decrypted;
    }
}
