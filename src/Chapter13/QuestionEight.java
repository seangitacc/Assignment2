package Chapter13;

import java.util.ArrayList;

public class QuestionEight {

    public static void main(String[] args) throws CloneNotSupportedException {
        // Create a MyStack object
        MyStack stack1 = new MyStack();

        // Push objects on to stack1
        System.out.println("Pushing the number 4, 5, and 6 to 1st stack...");
        stack1.push(new Integer(4));
        stack1.push(new Integer(5));
        stack1.push(new Integer(6));

        // Clone stack1 and assign the clone to stack2
        System.out.println("Cloning 1st stack...");
        MyStack stack2 = (MyStack)stack1.clone();

        // Pop an object from stack1
        System.out.println("Popping object from 1st stack...");
        stack1.pop();

        // Display results
        System.out.print("1st ");
        System.out.println(stack1);
        System.out.print("2nd ");
        System.out.println(stack2);
        System.out.println("Is the 1st stack equal to the 2nd? " +
                (stack1 == stack2));
    }

}

class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<Object>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override /** Override the protected clone method define in
     the Object class, and strengthen its accessibility */
    public Object clone() throws CloneNotSupportedException {
        // Perform a shollow copy
        MyStack myStackClone = (MyStack)super.clone();
        // Deep copy list
        myStackClone.list = copyList();
        return myStackClone;
    }

    /** Returns a copy of a list */
    private ArrayList<Object> copyList() {
        ArrayList<Object> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
            newList.add(list.get(i));
        return newList;
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
