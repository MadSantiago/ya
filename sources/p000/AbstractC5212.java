package p000;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۦۛؑۡؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5212 extends AbstractC3127 {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected C3192 zzc;

    public AbstractC5212() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = C3192.f10721;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static AbstractC5212 m8818(AbstractC5212 abstractC5212, byte[] bArr, C2955 c2955) throws C5463 {
        int length = bArr.length;
        if (length != 0) {
            AbstractC5212 abstractC5212M8831 = abstractC5212.m8831();
            try {
                InterfaceC0759 interfaceC0759M8330 = C4946.f16366.m8330(abstractC5212M8831.getClass());
                interfaceC0759M8330.mo1653(abstractC5212M8831, bArr, 0, length, new C0958(c2955));
                interfaceC0759M8330.mo1654(abstractC5212M8831);
                abstractC5212 = abstractC5212M8831;
            } catch (IndexOutOfBoundsException unused) {
                C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (C5463 e) {
                if (e.f18014) {
                    throw new C5463(e.getMessage(), e);
                }
                throw e;
            } catch (IOException e2) {
                if (e2.getCause() instanceof C5463) {
                    throw ((C5463) e2.getCause());
                }
                throw new C5463(e2.getMessage(), e2);
            } catch (C5515 e3) {
                throw e3.m9202();
            }
        }
        m8822(abstractC5212);
        return abstractC5212;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static AbstractC5212 m8819(Class cls) {
        Map map = zze;
        AbstractC5212 abstractC5212 = (AbstractC5212) map.get(cls);
        if (abstractC5212 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC5212 = (AbstractC5212) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC5212 != null) {
            return abstractC5212;
        }
        try {
            AbstractC5212 abstractC5213 = (AbstractC5212) ((AbstractC5212) AbstractC0667.f2458.allocateInstance(cls)).mo554(6);
            if (abstractC5213 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, abstractC5213);
            return abstractC5213;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static void m8820(Class cls, AbstractC5212 abstractC5212) {
        abstractC5212.m8825();
        zze.put(cls, abstractC5212);
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static Object m8821(Method method, AbstractC5212 abstractC5212, Object... objArr) {
        try {
            return method.invoke(abstractC5212, objArr);
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

    /* JADX INFO: renamed from: ۦ۟ */
    public static void m8822(AbstractC5212 abstractC5212) throws C5463 {
        if (abstractC5212 != null && !m8823(abstractC5212, true)) {
            throw new C5515().m9202();
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static final boolean m8823(AbstractC5212 abstractC5212, boolean z) {
        byte bByteValue = ((Byte) abstractC5212.mo554(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo1648 = C4946.f16366.m8330(abstractC5212.getClass()).mo1648(abstractC5212);
        if (z) {
            abstractC5212.mo554(2);
        }
        return zMo1648;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C4946.f16366.m8330(getClass()).mo1650(this, (AbstractC5212) obj);
    }

    public final int hashCode() {
        if (m8824()) {
            return C4946.f16366.m8330(getClass()).mo1649(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iMo1649 = C4946.f16366.m8330(getClass()).mo1649(this);
        this.zza = iMo1649;
        return iMo1649;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC1566.f5282;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC1566.m3317(this, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥُ */
    public final boolean m8824() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m8825() {
        this.zzb &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۥْ */
    public abstract Object mo554(int i);

    @Override // p000.AbstractC3127
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo5753(InterfaceC0759 interfaceC0759) {
        if (m8824()) {
            int iMo1652 = interfaceC0759.mo1652(this);
            if (iMo1652 >= 0) {
                return iMo1652;
            }
            C2316.m4360(String.valueOf(iMo1652).length() + 42, iMo1652);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo1653 = interfaceC0759.mo1652(this);
        if (iMo1653 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iMo1653;
            return iMo1653;
        }
        C2316.m4360(String.valueOf(iMo1653).length() + 42, iMo1653);
        return 0;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final AbstractC0955 m8826() {
        return (AbstractC0955) mo554(5);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m8827(AbstractC0438 abstractC0438) {
        InterfaceC0759 interfaceC0759M8330 = C4946.f16366.m8330(getClass());
        C2391 c2391 = abstractC0438.f1610;
        if (c2391 == null) {
            c2391 = new C2391(abstractC0438);
        }
        interfaceC0759M8330.mo1647(this, c2391);
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m8828() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC0955 m8829() {
        AbstractC0955 abstractC0955 = (AbstractC0955) mo554(5);
        abstractC0955.m1980(this);
        return abstractC0955;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final int m8830() {
        if (m8824()) {
            int iMo1652 = C4946.f16366.m8330(getClass()).mo1652(this);
            if (iMo1652 >= 0) {
                return iMo1652;
            }
            C2316.m4360(String.valueOf(iMo1652).length() + 42, iMo1652);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo1653 = C4946.f16366.m8330(getClass()).mo1652(this);
        if (iMo1653 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iMo1653;
            return iMo1653;
        }
        C2316.m4360(String.valueOf(iMo1653).length() + 42, iMo1653);
        return 0;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final AbstractC5212 m8831() {
        return (AbstractC5212) mo554(4);
    }
}
