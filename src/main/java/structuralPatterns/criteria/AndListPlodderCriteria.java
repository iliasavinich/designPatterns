package structuralPatterns.criteria;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AndListPlodderCriteria implements Crireria{

    private List<Crireria> crirerias;

    public AndListPlodderCriteria(Crireria ... crirerias){
        this.crirerias = Arrays.asList(crirerias);
    }

    @Override
    public List<Plodder> meetCriteria(List<Plodder> plodders) {
        for (Crireria crireria : crirerias) {
            plodders = crireria.meetCriteria(plodders);
        }
        return plodders;
    }
}
