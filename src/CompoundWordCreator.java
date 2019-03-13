import java.util.List;

public class CompoundWordCreator {
    private List<String> wordList;

    private boolean inDictionary(String word){

    }

    private int findMaxLength(){
        int temp=0;
        for(int i =0; i<this.wordList.size();i++){
            if(this.wordList.get(i).length()>temp){
                temp=this.wordList.get(i).length();
            }
        }
        return temp;
    }

    private void addCompoundWords(List<String>compoundWords, int letterSum){
        String compWord1="";
        String compWord2="";

        for(int )
    }
}
