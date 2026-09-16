package p000;

/* JADX INFO: renamed from: ۦٌْۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4096 extends AbstractC5212 {
    private static final C4096 zzf;
    private static volatile InterfaceC4089 zzg;
    private int zzb;
    private boolean zze;

    static {
        C4096 c4096 = new C4096();
        zzf = c4096;
        AbstractC5212.m8820(C4096.class, c4096);
    }

    /* JADX INFO: renamed from: ۥَ */
    public static C4096 m7280() {
        return zzf;
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
            return new C3730(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new C4096();
        }
        if (i2 == 4) {
            return new C0407(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzg;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C4096.class) {
            try {
                c4377 = zzg;
                if (c4377 == null) {
                    c4377 = new C4377(zzf);
                    zzg = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean m7281() {
        return this.zze;
    }
}
