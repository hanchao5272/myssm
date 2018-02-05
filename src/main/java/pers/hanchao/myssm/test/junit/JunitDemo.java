package pers.hanchao.myssm.test.junit;

import org.apache.log4j.Logger;

/**
 * <p>测试junit</p>
 * @author hanchao 2018/2/5 22:03
 **/
public class JunitDemo {
    private static final Logger LOGGER = Logger.getLogger(JunitDemo.class);
    /**
     * <p>加法</p>
     * @author hanchao 2018/2/5 22:02
     **/
    public static int add(int a,int b){
        LOGGER.info(a + b);
        return a + b;
    }
}
