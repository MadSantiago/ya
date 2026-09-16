package p000;

/* JADX INFO: renamed from: ۦۢٓۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5569 extends AbstractC5212 {
    private static final C5569 zzh;
    private static volatile InterfaceC4089 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C5569 c5569 = new C5569();
        zzh = c5569;
        AbstractC5212.m8820(C5569.class, c5569);
    }

    /* JADX INFO: renamed from: ۥَ */
    public final int m9394() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
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
            return new C3730(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", C2068.f6818, "zzf", C2068.f6817, "zzg", C2068.f6827});
        }
        if (i2 == 3) {
            return new C5569();
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
        synchronized (C5569.class) {
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
    public final int m9395() {
        int iM9046 = AbstractC5378.m9046(this.zze);
        if (iM9046 == 0) {
            return 1;
        }
        return iM9046;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final int m9396() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
