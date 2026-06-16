
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        //Append
        sb.append(" Programming");
        System.out.println("After append: " + sb);

        //Insert
        sb.insert(5, " Language");
        System.out.println("After insert: " + sb);

        //Replace
        sb.replace(0, 4, "Python");
        System.out.println("After replace: " + sb);

        //Delete
        sb.delete(6, 15);
        System.out.println("After delete: " + sb);

        //Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        //Capacity
        System.out.println("Capacity: " + sb.capacity());   

    }
}
