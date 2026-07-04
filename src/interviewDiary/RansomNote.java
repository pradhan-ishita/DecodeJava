package interviewDiary;

public class RansomNote {
    public static void main(String[] args) {
        String RansomNote="aa";
        String Magazine="abc";
        System.out.println(canconstruct(RansomNote,Magazine));
    }
        public static boolean canconstruct(String RansomNote,String Magazine){
            int[] count=new int[26];
            for(char c:Magazine.toCharArray()){
                count[c-'a']++;
            }
            for(char c:RansomNote.toCharArray()){
                if(count[c-'a']==0){
                    return false;
                }
                count[c-'a']--;
            }
            return true;


        }
    }

