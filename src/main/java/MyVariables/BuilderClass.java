package MyVariables;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: soofis
 * Date: 4/25/13
 * Time: 3:25 PM
 * To change this template use File | Settings | File Templates.
 */

@Component
public class BuilderClass {

    private String s;

    public String getS() {
        return s;
    }


    public BuilderClass(){
       s = "Hello Spring World";
    }


}
