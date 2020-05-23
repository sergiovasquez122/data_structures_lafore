public class Reverser {
    private String input;
    private String output;

    public Reverser(String in)
    {
        input = in;
    }

    public String doRev(){
        int stack_size = input.length();
        StackX the_stack = new StackX(stack_size);

        for(int j = 0;j < input.length();++j){
            char ch = input.charAt(j);
            the_stack.push(ch);
        }

        output = "";
        while(!the_stack.isEmpty()){
            char ch = the_stack.pop();
            output = output + ch;
        }
        return output;
    }
}
