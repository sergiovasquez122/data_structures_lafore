public class ParsePost {
    private RPNStack the_stack;
    private String input;

    private ParsePost(String s){
        input = s;
    }

    public int doParse() {
        the_stack = new RPNStack(20);

        for(int i = 0;i < input.length(); ++i){
            char c = input.charAt(i);

            if(Character.isDigit(c)){
                int value = (int)(c - '0');
                the_stack.push(value);
            }
            else {
                int y = the_stack.pop();
                int x = the_stack.pop();
                switch (c){
                    case '+':
                        the_stack.push(x + y);
                        break;
                    case '-':
                        the_stack.push(x-y);
                        break;
                    case '*':
                        the_stack.push(x*y);
                        break;
                    case '/':
                        the_stack.push(x/y);
                        break;
                }
            }
        }
        return the_stack.peek();
    }
}
