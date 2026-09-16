package p000;

/* JADX INFO: renamed from: ۦؘۗؗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4987 extends AbstractC5212 {
    private static final C4987 zzg;
    private static volatile InterfaceC4089 zzh;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        C4987 c4987 = new C4987();
        zzg = c4987;
        AbstractC5212.m8820(C4987.class, c4987);
    }

    /* JADX INFO: renamed from: ۥَ */
    public final String m8372() {
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
            return new C3730(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C4987();
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
        synchronized (C4987.class) {
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

    /* JADX INFO: renamed from: ۥٓ */
    public final String m8373() {
        return this.zze;
    }
}
