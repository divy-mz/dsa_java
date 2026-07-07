class Solution {
        static boolean compare(int[] count1,int[] count2){
            for(int i=0;i<26;i++){
                if(count1[i]!=count2[i]){
                    return false;
                }
            }
            return true;
        
        }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int count1[]=new int[26];
        for(int i=0;i<s1.length();i++){
            char  ch=s1.charAt(i);
            count1[ch-'a']++;
        }
        int i=0;
        int windowLength=s1.length();
        int count2[]=new int[26];
        for(i=0;i<windowLength;i++){
            char ch=s2.charAt(i);
            count2[ch-'a']++;
        }
        if(compare(count1,count2)==true){
            return true;
        }
        else{
            while(i<s2.length()){
            char newCh=s2.charAt(i);
            count2[newCh-'a']++;
            int oldIndex=i-windowLength;
            char oldCh=s2.charAt(oldIndex);
            count2[oldCh-'a']--;
            if(compare(count1,count2)==true){
                return true;
            }
            i++;
        }
        }
            return false;
        
    }
}