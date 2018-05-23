import java.util.Random;

public class e2_3 {
    public static void main(String[] args){
        int sum = 0;
        int[][] array = new int[10][5];
        Random random = new Random();
        for (int i = 0;i<10;i++){
            for (int j = 0;j<5;j++){
                array[i][j] = random.nextInt(101);
                System.out.print(array[i][j]+"  ");
                sum +=array[i][j];
            }
            System.out.print("\n");
        }
        System.out.print("the sum is "+sum);

    }
}
