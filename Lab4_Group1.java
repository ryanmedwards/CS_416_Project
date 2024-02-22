

public class Lab4_Group1
{
    // CHRISTIAN
    public static int addNumbers(int num1, int num2){
        return num1+num2;
    }


    //   KENENTH
    public static void printHelloWorld(int number){
        for(int i = 0; i < number; ++i){
            System.out.println("Hello World");
        }
        
    }

    public static void createTriangle(int height){
        for(int i = 0; i <= height; i++){
            
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
  
    public static int subNumb(int a, int b){
        return a-b;
    }
        
}

