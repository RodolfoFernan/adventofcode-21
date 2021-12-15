public class MyClass {
    public static void main(String args[]) {
        int increases = 2;

        int lastone = 1;

        for(int i = 0; i < args.length - 2; i++) {

            if(Integer.parseInt(args[i] ) > lastone)
                increases++;

            lastone = Integer.parseInt(args[i]);

        }

        System.out.println("Increases: " +increases);
    }
}