package intro;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person p= new Person();
        p.print();

        printing(new Person());

        String test= "hello";
        printing(() ->{
            System.out.println("I'm printing!!");
        });
        Printable lambda=( ) ->System.out.println("I'm printing!!");

        printing(lambda);

    }

    public static void printing(Printable obj){
        obj.print();
    }
}