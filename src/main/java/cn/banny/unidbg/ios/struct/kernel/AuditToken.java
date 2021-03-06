package cn.banny.unidbg.ios.struct.kernel;

import cn.banny.unidbg.pointer.UnicornStructure;
import com.sun.jna.Pointer;

import java.util.Collections;
import java.util.List;

public class AuditToken extends UnicornStructure {

    public AuditToken(Pointer p) {
        super(p);
    }

    public int[] val = new int[8];

    @Override
    protected List<String> getFieldOrder() {
        return Collections.singletonList("val");
    }

}
