package arraytaskyeni;

public class Task3 {
    public static void main(String[] args) {
        int[] arr={21,36,88,61,55};
        int cem=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=36){
                cem=cem+arr[i];
            }
            else {
                i++;
            }
            System.out.println(cem);

        }
    }
}
