package october;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class DestinationCity_1436 {
    @Test
    public void testData1(){
        List<List<String>> paths = new ArrayList<>();
        paths.add(new ArrayList<>(Arrays.asList("Sao Paulo","New York")));
        paths.add(new ArrayList<>(Arrays.asList("New York","Lima")));
        paths.add(new ArrayList<>(Arrays.asList("Lima","Sao Paulo")));
        Assert.assertEquals("Sao Paulo",findDestinationCity(paths));

    }
    public String findDestinationCity(List<List<String>> paths){
        Map<String, String> map = new HashMap<>();
        for(List<String> each : paths) {
            map.put(each.get(0), each.get(1));
        }
        for(String dstPath : map.values()) {
            if(!map.containsKey(dstPath)) {
                return dstPath;
            }
        }
        return "";
    }
}
