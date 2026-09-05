class Solution {
    public String reverseVowels(String s) {
        // s -> IceCreAm
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        helper(ch, start, end);
        return new String(ch);
    }
    static void helper(char[] ch, int start, int end){
        if(start >= end){
            return;
        }
        if(!(ch[start] == 'a' || ch[start] == 'e' || ch[start] == 'i' || ch[start] == 'o' || ch[start] == 'u'|| ch[start] == 'A' || ch[start] == 'E' || ch[start] == 'I'|| ch[start] == 'O' || ch[start] == 'U')){
            helper(ch, start + 1 , end);
            return;
        }

         if(!(ch[end] == 'a' || ch[end] == 'e' || ch[end] == 'i' || ch[end] == 'o' || ch[end] == 'u'|| ch[end] == 'A' || ch[end] == 'E' || ch[end] == 'I'|| ch[end] == 'O' || ch[end] == 'U')){
            helper(ch, start , end - 1);
            return;
        }

        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;

        helper(ch, start + 1, end - 1);
    }
}