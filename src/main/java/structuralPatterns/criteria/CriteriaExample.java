package structuralPatterns.criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaExample {
    public static void main(String[] args) {
        List<Plodder> plodders = new ArrayList<Plodder>();
        plodders.add(new Plodder("Парниша","MALE",11));
        plodders.add(new Plodder("Strong","МУЖЫК",19));
        plodders.add(new Plodder("Strong","Petia",9));
        Crireria strongPlodderCriteria = new StrongPlodderCriteria();
        Crireria chappiePlodderCriteria = new ChappiePlodderCriteria();
        Crireria chappieAndStrongPlodderCriteria = new AndListPlodderCriteria(chappiePlodderCriteria,strongPlodderCriteria);
        println("Strong Plodders: ");
        for (Plodder plodder : strongPlodderCriteria.meetCriteria(plodders)) {
            println(plodder.toString());
        }
        println("Chappie Plodders: ");
        for (Plodder plodder : chappiePlodderCriteria.meetCriteria(plodders)) {
            println(plodder.toString());
        }
        println("Chappie and Strong Plodders: ");
        for (Plodder plodder : chappieAndStrongPlodderCriteria.meetCriteria(plodders)) {
            println(plodder);
        }
    }
    public static void println(Object string){
        System.out.println(string);
    }
}
