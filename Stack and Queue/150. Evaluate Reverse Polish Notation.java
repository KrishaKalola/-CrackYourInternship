class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> evalStack = new Stack<Integer>();

        for (int i = 0; i < tokens.length; i++) {
            int first, second;

            switch (tokens[i]) {
                case "+":
                    second = evalStack.pop();
                    first = evalStack.pop();

                    evalStack.push(first + second);
                    break;

                case "-":
                    second = evalStack.pop();
                    first = evalStack.pop();

                    evalStack.push(first - second);
                    break;

                case "*":
                    second = evalStack.pop();
                    first = evalStack.pop();

                    evalStack.push(first * second);
                    break;
                
                case "/":
                    second = evalStack.pop();
                    first = evalStack.pop();

                    evalStack.push(first / second);
                    break;
                
                default:
                    evalStack.push(Integer.parseInt(tokens[i]));
            }
        }

        return evalStack.peek();
    }
}