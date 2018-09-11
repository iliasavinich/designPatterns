package structuralPatterns.criteria;

import java.util.ArrayList;
import java.util.List;

public class ChappiePlodderCriteria implements Crireria {
    @Override
    public List<Plodder> meetCriteria(List<Plodder> plodders) {
        List<Plodder> chappiePlodders = new ArrayList<Plodder>();

        for (Plodder plodder : plodders) {
            if (plodder.getAge()<18){
                chappiePlodders.add(plodder);
            }
        }
        return chappiePlodders;
    }
}
