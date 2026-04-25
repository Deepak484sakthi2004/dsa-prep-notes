public class Main {
    public static void main(String[] args) {
        String input = "lee((t(c)o)(de)"; // lee((t(c)o)de) || lee(t(c)o)(de)
        Stack<>
    }
    Counter/Two-pass pattern:
            1. Minimum number of swaps to make a string balanced — Given ]][[, find min swaps to balance brackets
  2. Remove outermost parentheses — Strip the outermost layer of each valid group: (()())(()) → ()()()
            3. Score of parentheses — () = 1, (A) = 2*A, AB = A+B. Find score of (()(()))

    Stack-based pattern:
            4. Longest valid parentheses substring — Find length of the longest valid chunk in "(()" → 2
            5. Decode string — 3[a2[c]] → accaccacc (nested stack problem)
  6. Simplify file path — /a/./b/../../c/ → /c

    Level up (combines multiple ideas):
            7. Generate all valid parentheses — Given n=3, generate all valid combinations of 3 pairs
  8. Check valid parentheses with wildcards — * can be (, ), or empty. Is the string valid?
            9. Trapping rain water — Not parentheses, but same two-pass/two-pointer logic applies

//        int inValidCount = 0;
//        for(char ch : input.toCharArray()){
//            if(inValidCount==')') inValidCount--;
//            else if (inValidCount=='(') inValidCount++;
//        }
//        // the count is negative, then it has more )
//        // if the count is +ve, then it has more (
//        if(inValidCount==0) return input;
//        Character characterToBeValidOn = if(inValidCount>0) ? ')' : '(';
//
//       // Stack<Character> st = new Stack<>();
//        StringBuffer sb = new StringBuffer();
//        Set<Integer> inValidOnesIdx = new HashSet<>();
//
//         // (h)ar(es(t) -> + -> )
//        // (h)ares(t)
//
//        for(char ch : input.toCharArray()){
//            if(!ch.isLetterOrDigit() && ch==characterToBeValidOn) {
//                int size = inValidOnesIdx.size()
//                if(size>0){
//                    int idx = inValidOnesIdx.get(size-1);
//                    inValidOnesIdx.remove(idx);
//                    sb.append(idx,oppositeOne(characterToBeValidOn));
//                    continue;
//                }
//            } else sb.append(ch.toString());
//        }
//        return sb.toString();
//    }
//
//    private String opposihellteOne(Character s){
//        if(s=='(') return ")";
//        return "(";
//    }
}
