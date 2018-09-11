package structuralPatterns.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypePool = new HashMap<String, TreeType>();

    public static TreeType getTreeType(String name , Color color, String otherTreeData) {
        TreeType result = treeTypePool.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypePool.put(name, result);
        }
        return result;
    }
}
