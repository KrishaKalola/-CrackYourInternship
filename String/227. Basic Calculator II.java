class Solution {
    public int calculate(String s) {
        
        if(s.length()==0|| s==null) return 0;

        int currentNumber =0, result=0;
        Stack<Integer> st = new Stack<>();
        char operator='+';

        int n=s.length();

        for(int i=0;i<n;i++){

            char currentChar = s.charAt(i);
            
            if(Character.isDigit(currentChar)){
                currentNumber = currentNumber*10+ (currentChar-'0');
            }

            if(!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar)|| i==s.length()-1){

                if(operator=='+'){
                    st.push(currentNumber);
                }
                else if (operator=='-'){
                    st.push(-currentNumber);
                }
                else if (operator=='*'){
                    st.push(st.pop()* currentNumber);
                }
                else if(operator =='/'){
                    st.push(st.pop()/currentNumber);
                }
                operator = currentChar;
                currentNumber =0;
            }

        }
        result=0;
        while(!st.isEmpty()){
            result+=st.pop();
        }
        return result;
    }
}