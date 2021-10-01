import java.util.Scanner;
public class Solution {
    static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length())
            return false;
        else
        {
           a=a.toLowerCase();
           b=b.toLowerCase();
           int ar[] = new int[255];
           for(int i=0;i<a.length();i++)
            {
                ar[a.charAt(i)]++;
            }
            for(int i=0;i<b.length();i++)
            {
                ar[a.charAt(i)]--;
            }
            for(int i=0;i<255;i++){
                if(ar[i]!=0)
                    return false;
            }
        return true;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
