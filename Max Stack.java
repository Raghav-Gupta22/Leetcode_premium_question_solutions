//Leetcode link : https://leetcode.com/problems/max-stack/
//Lintcode link : https://www.lintcode.com/problem/max-stack/description

class MaxStack {
    Stack<Integer> stack;
    TreeMap<Integer, Integer> tm;
    public MaxStack() {
        stack = new Stack<>();
        tm = new TreeMap<>();
    }  
    public void push(int x) {
        stack.push(x);
        tm.put(x, tm.getOrDefault(x, 0)+1);
    }

    public int pop() {
        int x;
        while(true){
            x = stack.pop();
            if(tm.containsKey(x)){
                break;
            }
        }
        tm.put(x, tm.get(x)-1);
        if(tm.get(x) == 0)
            tm.remove(x);
        return x;
    }
  
    public int top() {
        return stack.peek();
    }
  
    public int peekMax() {
        return tm.lastKey();
    }
  
    public int popMax() {
        int x = tm.lastKey();
        tm.put(x, tm.get(x)-1);
        if(tm.get(x) == 0)
            tm.remove(x);
        if(stack.peek() == x)
            stack.pop();
        return x;
    }
}
