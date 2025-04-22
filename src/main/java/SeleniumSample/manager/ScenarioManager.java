package SeleniumSample.manager;

import java.util.HashMap;
import java.util.Map;

public class ScenarioManager {

    private Map<String , Object> scenarioContext;

    public ScenarioManager()
    {
        scenarioContext =new HashMap<>();
    }

    public void setContext(String key, Object value)
    {
        scenarioContext.put(key,value);
    }

    public String getContext(String key)
    {
        return scenarioContext.get(key).toString();
    }

    public boolean contextContains(String key)
    {
        return scenarioContext.containsKey(key);
    }
}
