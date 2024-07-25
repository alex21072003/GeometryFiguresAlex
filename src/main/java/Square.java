public class Square {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if(j == 1 || i ==4 || j ==4 || i == 1){
                    System.out.print(" O ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();

        }
    }
}
