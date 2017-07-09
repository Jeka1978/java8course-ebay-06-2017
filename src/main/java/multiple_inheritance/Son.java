package multiple_inheritance;

/**
 * Created by Evegeny on 09/07/2017.
 */
public class Son implements Father,Mother {
    @Override
    public void talk() {
        Father.super.talk();
        Mother.super.talk();
    }

}
