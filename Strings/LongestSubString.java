package Strings;

public class LongestSubString {

    public static void main(String[] args) {
        LongestSubString longestSubString=new LongestSubString();
       int len= longestSubString.lengthOfLongestSubstring("dvdf");
        System.out.println("longest substring "+len);
    }

    public int lengthOfLongestSubstring(String s) {
       StringBuilder stringBuilder=new StringBuilder();
        int max=0;
        if(s!=null && !s.isEmpty()){
            char[] charArray=s.toCharArray();
            for(int i=0;i<charArray.length;i++){
                if(stringBuilder.indexOf(""+charArray[i])!=-1){
                    stringBuilder.delete(0,stringBuilder.indexOf(""+charArray[i])+1);
                }
                stringBuilder.append(charArray[i]);
                max=stringBuilder.length()>max?stringBuilder.length():max;
            }
        }
        return max;
    }
}
