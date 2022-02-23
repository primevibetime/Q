package core.lang.q;

import core.etc.Scope;
import core.lang.Function;

import java.util.Map;

public class QClass {

    public String name;
    public Map<String, Function> functions;
    private Scope scope;

    public QClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
