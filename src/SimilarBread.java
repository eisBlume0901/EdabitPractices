public class SimilarBread
{
    public static boolean hasSameBread(String[] a, String[] b)
    {
        a = new String[3];
        b = new String[3];
        return a[0].equals(b[0]) && a[2].equals(b[2]);
    }
    public static void main(String[] args)
    {

        System.out.println(hasSameBread(new String [] {"white bread", "lettuce", "white bread"}, new String[] {"white bread", "lettuce", "white bread"}));
    }
}
