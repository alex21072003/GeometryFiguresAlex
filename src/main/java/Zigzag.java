public class Zigzag {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if( i + j== 3||i == 0||i == 3){
                    System.out.print(" V ");
                }else{
                    System.out.print("   ");
                }

            }
            System.out.println();

        }
    }
}
