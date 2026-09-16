package p000;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: ۥٚؑٚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1704 extends AbstractC5212 {
    private static final C1704 zzj;
    private static volatile InterfaceC4089 zzk;
    private int zzb;
    private long zzh;
    private C3775 zzi = C3775.f12547;
    private String zze = "";
    private AbstractC4314 zzf = AbstractC4314.f14260;
    private String zzg = "";

    static {
        C1704 c1704 = new C1704();
        zzj = c1704;
        AbstractC5212.m8820(C1704.class, c1704);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static C1704 m3512() {
        return zzj;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static C1704 m3513(AbstractC4650 abstractC4650, C2955 c2955) throws C5463 {
        AbstractC5212 abstractC5212M8831 = zzj.m8831();
        try {
            InterfaceC0759 interfaceC0759M8330 = C4946.f16366.m8330(abstractC5212M8831.getClass());
            C4902 c4902 = (C4902) abstractC4650.f15337;
            if (c4902 == null) {
                c4902 = new C4902(abstractC4650);
            }
            interfaceC0759M8330.mo1655(abstractC5212M8831, c4902, c2955);
            interfaceC0759M8330.mo1654(abstractC5212M8831);
            AbstractC5212.m8822(abstractC5212M8831);
            return (C1704) abstractC5212M8831;
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
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C5463) {
                throw ((C5463) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public final AbstractC4314 m3514() {
        return this.zzf;
    }

    @Override // p000.AbstractC5212
    /* JADX INFO: renamed from: ۥْ */
    public final Object mo554(int i) {
        InterfaceC4089 c4377;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3730(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", AbstractC4608.f15207});
        }
        if (i2 == 3) {
            return new C1704();
        }
        if (i2 == 4) {
            return new C0407(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzk;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C1704.class) {
            try {
                c4377 = zzk;
                if (c4377 == null) {
                    c4377 = new C4377(zzj);
                    zzk = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final String m3515() {
        return this.zze;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final String m3516() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final Map m3517() {
        return Collections.unmodifiableMap(this.zzi);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final long m3518() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final int m3519() {
        return this.zzi.size();
    }
}
