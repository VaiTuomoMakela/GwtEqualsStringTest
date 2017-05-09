package equals.string.client;

import java.util.Date;

/**
 * @author tuoma
 */
public class EmptyClass {

    String undefinedString;
    String nullString = null;
    Date undefinedDate;
    Date nullDate = null;

    public String toString( ) {
        return "undefinedString: " + undefinedString + ", nullString: " + nullString + ", undefinedDate: " + undefinedDate + ", nullDate: " + nullDate;
    }

}
