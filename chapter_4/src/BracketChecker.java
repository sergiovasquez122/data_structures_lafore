public class BracketChecker {

    private String input;

    public BracketChecker(String in){
        input = in;
    }

    public void check(){
        int stack_size = input.length();
        StackX theStackX = new StackX(stack_size);

        for(int i = 0;i < input.length();++i){
            char c = input.charAt(i);

            switch (c)
            {
                case '{':
                case '[':
                case '(':
                    break;
            }
        }
    }
}
