package member;

public class Static {

    private  static String phase = "First phase";

    public static int add(int n1, int n2) {
        int plus = n1 + n2;
        return plus;
    }

    public static void main (String[] args){
        System.out.println(Static.phase);
        System.out.println(" The add is: "+Static.add(3,4));

    }
}
