public class BracketChecker {

    private String input;

    public BracketChecker(String in){
        input = in;
    }

    public void check(){
        int stack_size = input.length();
        StackX theStackX = new StackX(stack_size);

        for(int i = 0;i < input.length();++i){
            char current_character = input.charAt(i);

            switch (current_character)
            {
                case '{':
                case '[':
                case '(':
                    theStackX.push(current_character);
                    break;

                case '}':
                case ']':
                case ')':
                    if( !theStackX.isEmpty() ){
                        char left_bracket = theStackX.pop();
                        if((left_bracket == '{' && current_character != '}')
                                || (left_bracket == '(' && current_character != ')')
                                || (left_bracket == '[' && current_character != ']'))
                            System.out.println("Error: " + current_character + " j");
                    } else {
                        System.out.println("Error: " + current_character + " at " + i);
                    }
                break;
            }
        }
        if(!theStackX.isEmpty()){
            System.out.println("Error: missing right delimiter");
        }
    }
}
