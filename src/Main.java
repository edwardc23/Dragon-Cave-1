import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "\n" +
                "and will share his treasure with you. The other dragon\n" +
                "\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "\n" +
                "Which cave will you go into? (1 or 2)");
        Scanner in = new Scanner(System.in);
        int choices=in.nextInt();

while(choices != 0){
       if(choices==1){
                System.out.println("You approach the cave...\n" +
                        "\n" +
                        "It is dark and spooky...\n" +
                        "\n" +
                        "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                        "\n" +
                        "Gobbles you down in one bite!");
       break;}

            else if(choices==2){
                System.out.println("You approach the cave...\n" +
                        "\n" +
                        "It is bright and inviting...\n" +
                        "\n" +
                        "A large dragon jumps out in front of you! You immediately notice he is friendly and...\n" +
                        "\n" +
                        "Shares his treasure with you.");
            break;}
           else
       {
           System.out.println("Choose either 1 or 2");
           choices = in.nextInt();
       }
        }
if(choices == 0)
{
    System.out.println("You stupid You turned around?"+ "\n"
                        +"GO HOME!"
            );
}

    }
}
