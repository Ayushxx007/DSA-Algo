
public class main {
    public static void main(String[] args) {
        TrieNode root =new TrieNode();
        insert("mahika",root);
        insert("ganduka",root);
        insert("panduka",root);
        insert("manduka",root);
        System.out.println( insert("yamuna",root));
        System.out.println(search("gandukaa",root));
        System.out.println(startsWith("gz",root));






    }
    public static boolean insert(String word, TrieNode root){
        TrieNode curr=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null){
                curr.children[index]=new TrieNode();


            }
            curr=curr.children[index];

        }
        return curr.isEnd=true;





    }
    public static boolean search(String word,TrieNode root){
        TrieNode curr=root;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i)-'a';
            if(curr.children[index]==null){
                return false;

            }
            curr=curr.children[index];

        }
        return curr.isEnd;



    }
    public static boolean startsWith(String word,TrieNode root){
        TrieNode curr=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null){
                return false;
            }
            curr=curr.children[index];
        }
        return true;


    }

}


class TrieNode{
    TrieNode children[];
    boolean isEnd;
    TrieNode(){
        children=new TrieNode[26];
        isEnd=false;

    }




}
