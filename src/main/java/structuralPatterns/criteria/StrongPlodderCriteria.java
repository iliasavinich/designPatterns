package structuralPatterns.criteria;

import java.util.ArrayList;
import java.util.List;

public class StrongPlodderCriteria implements Crireria {
    @Override
    public List<Plodder> meetCriteria(List<Plodder> plodders) {
        List<Plodder> strongPlodders = new ArrayList<Plodder>();
        for (Plodder plodder : plodders) {
            if (plodder.getAlias().equalsIgnoreCase("STRONG")){
                strongPlodders.add(plodder);
            }
        }
        return strongPlodders;
    }
}
