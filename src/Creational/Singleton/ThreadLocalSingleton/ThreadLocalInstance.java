package Creational.Singleton.ThreadLocalSingleton;

/**
 * @author Maoxin
 * @ClassName ThreadLocalInstance
 * @date 4/13/2019
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance
                = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue(){
            return new ThreadLocalInstance();
        }
    };

    private static ThreadLocalInstance getInstance(){
        return threadLocalInstance.get();
    }
}
