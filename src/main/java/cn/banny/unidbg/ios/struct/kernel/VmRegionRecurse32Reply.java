package cn.banny.unidbg.ios.struct.kernel;

import cn.banny.unidbg.pointer.UnicornStructure;
import com.sun.jna.Pointer;

import java.util.Arrays;
import java.util.List;

public class VmRegionRecurse32Reply extends UnicornStructure {

    public VmRegionRecurse32Reply(Pointer p) {
        super(p);
    }

    public NDR_record NDR;
    public int retCode;
    public int address;
    public int size;
    public int nestingDepth;
    public int infoCnt = 7;
    public VmRegionSubMapShortInfo64 info;

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("NDR", "retCode", "address", "size", "nestingDepth", "infoCnt", "info");
    }

}
