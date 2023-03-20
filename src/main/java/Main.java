import com.sun.jdi.PathSearchingVirtualMachine;
import com.sun.source.util.SourcePositions;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to my first HW");
     // Qa1
        String firstname ="Mouad";
        String lastname =" Ahlafi";
        String fullname = firstname + lastname ;
        System.out.println(fullname);
      //Qa2
        int[] firstArray = {103,23,34,41,75};
        int[] secondArray = {66,75,18,91,120};
        System.out.println(firstArray[3] * secondArray[1]);
        firstArray[firstArray.length- 1]=69;
        System.out.println(firstArray[3] * secondArray[1]/firstArray[1]);

        //Qa3
        String [] musicians = {"AdeL","Alanwalker","khaled"};
        int indexposition = 0;
        while (indexposition < musicians.length) {
            System.out.println("my best musician is :" + musicians[indexposition] );
            indexposition++ ;}
        System.out.println( returnvalue());

        parameter(10);


        System.out.println("\n");
//Qa6
         for (int K=13;K<20;K++
             ) {
             System.out.println(K);

        }
//Qa7
        int oddnumbers =20;
        for (int i=0;i<=oddnumbers;i++){if (i%2!=0){
            System.out.println(i);}
        }
   //Qa8
        int studentsgrade = 95;
        System.out.println(studentsgrade);
        if (studentsgrade < 100 && studentsgrade>90){
            System.out.println("you got an A");}
        if (studentsgrade < 89 && studentsgrade>80){
            System.out.println("you got an B");}
        if(studentsgrade < 79 && studentsgrade>70){
            System.out.println("you got an C");}
        if (studentsgrade < 69 && studentsgrade>60){
            System.out.println("you got an D");}
        if (studentsgrade<59){
            System.out.println("you got an F");}
    //Qa9
        int[] numbersArray ={2,34,7,48,0,13,24};
        int sum = 0;
        for (int numbersofArray=0; numbersofArray<numbersArray.length; numbersofArray++ ){
            System.out.println(numbersArray[numbersofArray]);}
        for (int i : numbersArray)
            sum += i;
        System.out.println(sum);
        System.out.println(sum/7);
        for (int num = 45; num > 0; num--) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("Year Up");
            } else if (num % 3 == 0) {
                System.out.println("Year");
            } else if (num % 5 == 0) {
                System.out.println("Up");
            } else {
                System.out.println(num);
            }

        }


    }
// Qa4
    public static String returnvalue(){
         String X ="Learning Java Is Fun";
        return X;


    }
    //Qa5
    public static void parameter(int number) {
        for (int Z = 0; Z <= number; Z++) {
            System.out.print(Z + " ");}}
    // Qa10
    public static void printNumbers() {
        for (int num = 45; num > 0; num--) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("Year Up");
            } else if (num % 3 == 0) {
                System.out.println("Year");
            } else if (num % 5 == 0) {
                System.out.println("Up");
            } else {
                System.out.println(num);
            }
        }
    }




}
