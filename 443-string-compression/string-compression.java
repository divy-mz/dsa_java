class Solution {
    public int compress(char[] chars) {
        int read=0;
        int  write=0;
        while(read<chars.length){
            int count=0;
            char currChar=chars[read];
            while(read<chars.length && currChar==chars[read]){
                count++;
                read++;
            }
            chars[write]=currChar;
            write++;
            if(count>1){
            String countStr=String.valueOf(count);
            for(char digit:countStr.toCharArray()){
                chars[write]=digit;
                write++;
            }
            }
       
        }
        return write;
    }
}