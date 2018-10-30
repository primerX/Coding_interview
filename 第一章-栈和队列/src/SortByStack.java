import java.util.Stack;

//用一个栈实现另一个栈的排序
public class SortByStack {

    public static void sortStackByStack(Stack<Integer> stack){
        Stack<Integer> help = new Stack<Integer>();     //帮助栈 或者 中间栈
        while(!stack.isEmpty()){
            int cur = stack.pop();
            while(!help.isEmpty() && cur > help.peek()){
                stack.push(help.pop());
            }
            help.push(cur);
        }

        while (!help.isEmpty()){        //将 help 栈中的元素压入 栈stack 中
            stack.push(help.pop());
        }
    }
}
