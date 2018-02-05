public abstract class AbstractCipher{
    public int findCharIndex(char ch, char[] charArray){
        int i = 0;
        for (char c: charArray) {
            if(c == ch){
                return i;
            }
            i++;
        }

        return -1337;
    }
}
