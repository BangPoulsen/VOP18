public class CeasarCipher extends AbstractCipher implements CipherInterface {
    private int rotFactor;
    public CeasarCipher(int rFactor){
        rotFactor = Math.abs(rFactor);
    }

    @Override
    public String encrypt(String original) {
        char[] tempCharArray = original.toCharArray();
        String encrypted = "";
        for (char ch:tempCharArray) {
            int index = findCharIndex(ch, ALPHABETH);
            if(index == -1337){
                encrypted = encrypted + ch;
            }
            else if (index+rotFactor > ALPHABETH.length-1){
                encrypted = encrypted + ALPHABETH[(index+rotFactor)-ALPHABETH.length-1];
            }
            else {
                encrypted = encrypted + ALPHABETH[index + rotFactor];
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
            else if (index - rotFactor < 0){
                decrypted = decrypted + ALPHABETH[ALPHABETH.length+1 + (index - rotFactor)];
            }
            else{
                decrypted = decrypted + ALPHABETH[index - rotFactor];
            }
        }
        return decrypted;
    }
}
