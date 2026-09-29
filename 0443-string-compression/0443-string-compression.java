class Solution {
    public int compress(char[] chars) {
    int readind = 0;
    int writeind = 0;
    while(readind<chars.length){
        char currchar = chars[readind];
        int count = 0;
        while(readind< chars.length && currchar==chars[readind]){
            readind++;
            count++;
        }
        chars[writeind]=currchar;
        writeind++;
        if(count>1){
            String countstr = String.valueOf(count);
            for(char digit:countstr.toCharArray()){
                chars[writeind]=digit;
                writeind++;
            }
        }
        
    }   
    return writeind; 
    }
}