import java.util.Scanner;

public class Duke {

    private static int array_size = 100;

    public static void print_line(){ // line
        System.out.println("--------------------");
    }

    public static void intro(){
        System.out.println("     Hello! I'm Duke\n" +
                "     What can I do for you?"); // prints the first line
        print_line();
    }

    public static void bye(){
        System.out.println("Bye. Hope to see you again soon!\n");
        print_line();
    }

    int count = 0;
    String[] todo = new String[array_size];

    public void todo_list(String input) throws Exception{
        count +=1;
        String[] break_line = input.split(" ");
        print_line();
        System.out.println("Got it. I've added this task: ");
        System.out.println("[T]"+"[" + "\u2718" + "]");
        System.out.println("Now you have " +count+ " tasks in the list." );
        todo[count] = "T";
        print_line();
    }

    public void main(String[] argv) throws Exception
    {
        intro();
        String[] store = new String[array_size];
        String[] tick_cross = new String[array_size];

        for (int i=0;i<array_size;i++){
            tick_cross[i]= "[" + "\u2718" + "]";
        }

        int num = 0;
        int readnum;


        boolean check = true;
        while (check) {

            Scanner scanline = new Scanner(System.in); //read in lines
            String readin;
            readin = scanline.nextLine(); //scan line and check
            String[] break_line = readin.split(" ");

            if (readin.equals("list")){
                System.out.println("Here are the tasks in your list:");
                for (int i=0;i<num;i++){

                }
                print_line();
            }

            if (break_line[0].equals("todo")){
                todo_list(break_line[1]);
            }

            else if (break_line[0].equals("done")){

                readnum = Integer.parseInt(break_line[1]);
                System.out.println("Nice! I've marked this task as done: ");
                tick_cross[readnum-1] = "[" + "\u2713" + "]" ;
                System.out.println(tick_cross[readnum-1] + store[readnum-1]);
            }

            else if (readin.equals("bye")){
                bye();
                check = false;
            }

            else {
                System.out.println("added : " +readin + "\n" );
                print_line();
                store[num] = readin;
                num +=1;
            }

        }
    }
}