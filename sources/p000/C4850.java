package p000;

/* JADX INFO: renamed from: ۦٟٜؓٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4850 extends AbstractC5212 {
    private static final C4850 zzg;
    private static volatile InterfaceC4089 zzh;
    private int zzb;
    private int zze = 1;
    private InterfaceC5083 zzf = C3623.f12075;

    static {
        C4850 c4850 = new C4850();
        zzg = c4850;
        AbstractC5212.m8820(C4850.class, c4850);
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
            return new C3730(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zze", C2068.f6822, "zzf", C1047.class});
        }
        if (i2 == 3) {
            return new C4850();
        }
        if (i2 == 4) {
            return new C0407(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzh;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C4850.class) {
            try {
                c4377 = zzh;
                if (c4377 == null) {
                    c4377 = new C4377(zzg);
                    zzh = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }
}
