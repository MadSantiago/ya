package p000;

/* JADX INFO: renamed from: ۦؘؚؔؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3484 extends AbstractC5212 {
    private static final C3484 zzh;
    private static volatile InterfaceC4089 zzi;
    private int zzb;
    private String zze = "";
    private InterfaceC5083 zzf = C3623.f12075;
    private boolean zzg;

    static {
        C3484 c3484 = new C3484();
        zzh = c3484;
        AbstractC5212.m8820(C3484.class, c3484);
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
            return new C3730(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zze", "zzf", C2407.class, "zzg"});
        }
        if (i2 == 3) {
            return new C3484();
        }
        if (i2 == 4) {
            return new C0407(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzi;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C3484.class) {
            try {
                c4377 = zzi;
                if (c4377 == null) {
                    c4377 = new C4377(zzh);
                    zzi = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final String m6281() {
        return this.zze;
    }
}
