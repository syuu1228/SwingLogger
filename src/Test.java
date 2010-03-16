
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.LogWindow;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syuu
 */
public class Test {
    protected static Logger log = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        LogWindow.getInstance().show();
        log.info("Hoge");
        log.warn("huga");
        log.error("error", new Exception());
    }
}
