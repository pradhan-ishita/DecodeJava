package interviewDiary;
public class CheckPrefix {
    public static void main(String[]args){
        String sentence="I love eating burger";
        String searchWord="burg";
        System.out.println(isPrefixOfWord(sentence,searchWord));
    }
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] sentences=sentence.split(" ");//stores the sentence as array
        for(int i=0;i<sentences.length;i++){
            if(sentences[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }

}
