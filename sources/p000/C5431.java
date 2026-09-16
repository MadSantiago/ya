package p000;

/* JADX INFO: renamed from: ۦٌ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5431 extends AbstractC5212 {
    private static final C5431 zzl;
    private static volatile InterfaceC4089 zzm;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        C5431 c5431 = new C5431();
        zzl = c5431;
        AbstractC5212.m8820(C5431.class, c5431);
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
            return new C3730(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C5431();
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
        synchronized (C5431.class) {
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
}
