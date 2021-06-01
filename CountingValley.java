public class CountingValley {
    public static void main(String[] args) {

        String path="DUDDUUUUDDD";
        int altitude=0,valley=0;

        for (int i = 0; i <path.length(); i++) {
            if (path.charAt(i)=='U') {
                altitude--;
                if(altitude==0){
                    valley++;
                }
            } else {
                altitude++;
            }
        }  
        System.out.println(valley);
    }
}
