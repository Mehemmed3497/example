package arraytaskyeni;

public class Task2 {
    public static void main(String[] args) {
        int[] arr= {10, 20, 30, 40, 50};
        int cem=0;
        int min=arr[0];
        int max=arr[0];
        int edediorta=0;
        int son=0;

        for (int i = 0; i < arr.length; i++) {
            cem=cem+arr[i];
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
            son=(cem-(min+max))/(arr.length-2);
            edediorta=cem/arr.length;

        }
        System.out.println("min="+min);
        System.out.println("max="+max);
        System.out.println("cem="+cem);
        System.out.println("son="+son);
        System.out.println("edediorta="+edediorta);

    }
}
