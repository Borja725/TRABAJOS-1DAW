public class Main {
    public static void main(String[] args) {
        int [] vector = new int[5];


        for (int i=0;i<vector.length;i++) {
            vector[i] = i + 1;
            vector[i] = 3;
        }


        for (int i=0;i<vector.length;i++){
            System.out.println(vector[i]);

        }
    }
}