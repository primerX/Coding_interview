import java.util.Stack;

public class Mystack1 {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public Mystack1(){
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum){
        if(this.stackMin.isEmpty()){    //最小栈为空
            this.stackMin.push(newNum);
        }else if(newNum < this.getmin()){
            this.stackMin.push(newNum);
        }
    }

    public int pop(){
        if(this.stackData.isEmpty()){
            throw new RuntimeException("Your stack is empty.");
        }
        int value = this.stackData.pop();
        if(value == this.getmin()){
            this.stackMin.pop();
        }
        return value;
    }

    public int getmin(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackMin.peek();
    }
}
