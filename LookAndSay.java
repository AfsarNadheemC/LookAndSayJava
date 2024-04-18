import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnknownSeries2 {
    public static void main(String[] args) {

        List <Integer> li = new ArrayList<>(Arrays.asList(1));
        List <Integer> temp = new ArrayList<>();

        int rows = 10 ; // Chaneg h=this to change number of rows

        for (int i=0;i<rows;i++){
            int x = 0;
            System.out.println(li);
            int b = 0;

            while (b<li.size()){
                int y = 0;
                x=li.get(b);
                while (b<li.size()&&li.get(b)==x){
                    b++;
                    y++;
                }
                temp.add(y);
                temp.add(x);
            }

            li.clear();

            for (int j=0;j<temp.size();j++){
                li.add(temp.get(j));
            }
            
            temp.clear();
        }
        }  
}