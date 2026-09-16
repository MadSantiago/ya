package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ۥٍِْؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1095 extends AbstractC5212 {
    private static final C1095 zzl;
    private static volatile InterfaceC4089 zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private InterfaceC5083 zzg = C3623.f12075;

    static {
        C1095 c1095 = new C1095();
        zzl = c1095;
        AbstractC5212.m8820(C1095.class, c1095);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static C1095 m2315(InputStream inputStream, C2955 c2955) throws C5463 {
        C1095 c1095 = zzl;
        AbstractC4650 abstractC4650M8025 = AbstractC4650.m8025(inputStream, 4096);
        AbstractC5212 abstractC5212M8831 = c1095.m8831();
        try {
            InterfaceC0759 interfaceC0759M8330 = C4946.f16366.m8330(abstractC5212M8831.getClass());
            C4902 c4902 = (C4902) abstractC4650M8025.f15337;
            if (c4902 == null) {
                c4902 = new C4902(abstractC4650M8025);
            }
            interfaceC0759M8330.mo1655(abstractC5212M8831, c4902, c2955);
            interfaceC0759M8330.mo1654(abstractC5212M8831);
            AbstractC5212.m8822(abstractC5212M8831);
            return (C1095) abstractC5212M8831;
        } catch (C5515 e) {
            throw e.m9202();
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C5463) {
                throw ((C5463) e2.getCause());
            }
            throw e2;
        } catch (C5463 e3) {
            if (e3.f18014) {
                throw new C5463(e3.getMessage(), e3);
            }
            throw e3;
        } catch (IOException e4) {
            if (e4.getCause() instanceof C5463) {
                throw ((C5463) e4.getCause());
            }
            throw new C5463(e4.getMessage(), e4);
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public final boolean m2316() {
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
            return new C3730(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", C2068.f6819, "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new C1095();
        }
        if (i2 == 4) {
            return new C0407(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzm;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C1095.class) {
            try {
                c4377 = zzm;
                if (c4377 == null) {
                    c4377 = new C4377(zzl);
                    zzm = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final String m2317() {
        return this.zze;
    }
}
