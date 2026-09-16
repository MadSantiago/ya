package p000;

/* JADX INFO: renamed from: ۥۛؓؔۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2312 extends AbstractC5212 {
    private static final C2312 zze;
    private static volatile InterfaceC4089 zzf;
    private InterfaceC5083 zzb = C3623.f12075;

    static {
        C2312 c2312 = new C2312();
        zze = c2312;
        AbstractC5212.m8820(C2312.class, c2312);
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
            return new C3730(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new C2312();
        }
        if (i2 == 4) {
            return new C0407(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzf;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C2312.class) {
            try {
                c4377 = zzf;
                if (c4377 == null) {
                    c4377 = new C4377(zze);
                    zzf = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }
}
