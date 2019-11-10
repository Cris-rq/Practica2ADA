public class Ejemplo{
    public static void main(String[] args) {
        int[] v = {2,4,6,8};
        for(int i : v){
            System.out.print(i + "  ");
        }
        System.out.println();
        reverse(v);
        for(int i : v){
            System.out.print(i + "  ");
        }
    }

    public static void reverse(int[] v){
        for(int i = 0; i < v.length; i++){
            v[i] = v[i] - 1;
        }
    }


}