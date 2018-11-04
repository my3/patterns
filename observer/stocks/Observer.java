package stocks;

import java.util.*;

public interface Observer {
    public void update(Map<String, Float> prices);
}