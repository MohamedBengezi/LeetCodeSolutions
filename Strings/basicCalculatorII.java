public class Solution {
    public int calculate(String s) {
        int len = s.length();
        if(s==null || len == 0) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        int num = 0;
        char op = '+';
        
        for (int i = 0; i<len; i++) {
            char letter = s.charAt(i);
            if (Character.isDigit(letter)) num = num*10 + letter - '0';
            
            if((!Character.isDigit(letter) && ' ' != letter) || i == len - 1){
                switch(op){
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop()*num);
                        break;
                    case '/':
                        stack.push(stack.pop()/num);
                        break;
                }
                    op = letter;
                    num =  0;
            }
        
        }
        int ans = 0;
        for (int i: stack) ans+=i;
        return ans;
    }
}