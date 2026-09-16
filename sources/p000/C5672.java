package p000;

/* JADX INFO: renamed from: ۦًُۤؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5672 extends AbstractC5212 {
    private static final C5672 zzg;
    private static volatile InterfaceC4089 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        C5672 c5672 = new C5672();
        zzg = c5672;
        AbstractC5212.m8820(C5672.class, c5672);
    }

    /* JADX INFO: renamed from: ۥَ */
    public final int m9491() {
        int iM9046 = AbstractC5378.m9046(this.zzf);
        if (iM9046 == 0) {
            return 1;
        }
        return iM9046;
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
            C2068 c2068 = C2068.f6818;
            return new C3730(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", c2068, "zzf", c2068});
        }
        if (i2 == 3) {
            return new C5672();
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
        synchronized (C5672.class) {
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
    public final int m9492() {
        int iM9046 = AbstractC5378.m9046(this.zze);
        if (iM9046 == 0) {
            return 1;
        }
        return iM9046;
    }
}
