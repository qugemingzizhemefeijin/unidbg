package cn.banny.unidbg.ios.struct.kernel;

import cn.banny.unidbg.pointer.UnicornStructure;
import com.sun.jna.Pointer;

import java.util.Arrays;
import java.util.List;

public class VmRegionRecurse32Request extends UnicornStructure {

    public VmRegionRecurse32Request(Pointer p) {
        super(p);
    }

    public NDR_record NDR;
    public int address;
    public int nestingDepth;
    public int infoCnt;

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("NDR", "address", "nestingDepth", "infoCnt");
    }

    public long getAddress() {
        return address & 0xffffffffL;
    }

}
