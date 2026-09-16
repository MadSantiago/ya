package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۥؚؓؕٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0318 extends AbstractC0066 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0318> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C5708 unknownFields;

    public AbstractC0318() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C5708.f18791;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static Object m670(Method method, AbstractC0318 abstractC0318, Object... objArr) {
        try {
            return method.invoke(abstractC0318, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final boolean m671(AbstractC0318 abstractC0318, boolean z) {
        byte bByteValue = ((Byte) abstractC0318.mo674(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C5734 c5734 = C5734.f18904;
        c5734.getClass();
        boolean zMo3394 = c5734.m9541(abstractC0318.getClass()).mo3394(abstractC0318);
        if (z) {
            abstractC0318.mo674(2);
        }
        return zMo3394;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static AbstractC0318 m672(Class cls) {
        AbstractC0318 abstractC0318 = defaultInstanceMap.get(cls);
        if (abstractC0318 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0318 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC0318 != null) {
            return abstractC0318;
        }
        try {
            AbstractC0318 abstractC0319 = (AbstractC0318) ((AbstractC0318) AbstractC1194.f4120.allocateInstance(cls)).mo674(6);
            if (abstractC0319 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0319);
            return abstractC0319;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public static void m673(Class cls, AbstractC0318 abstractC0318) {
        abstractC0318.m676();
        defaultInstanceMap.put(cls, abstractC0318);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5734 c5734 = C5734.f18904;
        c5734.getClass();
        return c5734.m9541(getClass()).mo3390(this, (AbstractC0318) obj);
    }

    public final int hashCode() {
        if (m680()) {
            C5734 c5734 = C5734.f18904;
            c5734.getClass();
            return c5734.m9541(getClass()).mo3391(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        C5734 c5735 = C5734.f18904;
        c5735.getClass();
        int iMo3391 = c5735.m9541(getClass()).mo3391(this);
        this.memoizedHashCode = iMo3391;
        return iMo3391;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC1790.f5989;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC1790.m3578(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public abstract Object mo674(int i);

    @Override // p000.AbstractC0066
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo675(C2100 c2100) {
        C5734 c5734 = C5734.f18904;
        c5734.getClass();
        InterfaceC1622 interfaceC1622M9541 = c5734.m9541(getClass());
        C5086 c5086 = c2100.f6919;
        if (c5086 == null) {
            c5086 = new C5086(c2100);
        }
        interfaceC1622M9541.mo3389(this, c5086);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m676() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // p000.AbstractC0066
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo677(InterfaceC1622 interfaceC1622) {
        int iMo3388;
        int iMo3389;
        if (m680()) {
            if (interfaceC1622 == null) {
                C5734 c5734 = C5734.f18904;
                c5734.getClass();
                iMo3389 = c5734.m9541(getClass()).mo3388(this);
            } else {
                iMo3389 = interfaceC1622.mo3388(this);
            }
            if (iMo3389 >= 0) {
                return iMo3389;
            }
            C1078.m2276(AbstractC5078.m8670(iMo3389, "serialized size must be non-negative, was "));
            return UNINITIALIZED_HASH_CODE;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (interfaceC1622 == null) {
            C5734 c5735 = C5734.f18904;
            c5735.getClass();
            iMo3388 = c5735.m9541(getClass()).mo3388(this);
        } else {
            iMo3388 = interfaceC1622.mo3388(this);
        }
        m679(iMo3388);
        return iMo3388;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC0318 m678() {
        return (AbstractC0318) mo674(4);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m679(int i) {
        if (i < 0) {
            C1078.m2276(AbstractC5078.m8670(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean m680() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }
}
