class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        //String[] transform = new String[words.length];
        String transform = "";
        Set<String> hashset = new HashSet<>();
        int i=0;
        for(String word: words){
            for(char c:word.toCharArray()){
                transform+=morse[c - 'a'];
            }
            hashset.add(transform);
            transform = "";
        }
        return hashset.size();
    }
}