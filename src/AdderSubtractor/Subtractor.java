package AdderSubtractor;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    Value v;
    public Subtractor(Value v){
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=10000;i++){
            synchronized (this){ // Subtractor.class.lock.lock()
                v.x -= i;
            } //Subtractor.class.lock.unlock()
        }
        return null;
    }
}
