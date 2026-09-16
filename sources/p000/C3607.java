package p000;

/* JADX INFO: renamed from: ۦؚؖؕؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3607 extends AbstractC5212 {
    private static final C3607 zzg;
    private static volatile InterfaceC4089 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        C3607 c3607 = new C3607();
        zzg = c3607;
        AbstractC5212.m8820(C3607.class, c3607);
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static C4982 m6422() {
        return (C4982) zzg.m8826();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final int m6423() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
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
            return new C3730(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", C2068.f6825, "zzf", C2068.f6824});
        }
        if (i2 == 3) {
            return new C3607();
        }
        if (i2 == 4) {
            return new C4982(zzg);
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
        synchronized (C3607.class) {
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

    /* JADX INFO: renamed from: ۥٖ */
    public final int m6424() {
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

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ void m6425(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ void m6426(int i) {
        this.zzf = i - 1;
        this.zzb |= 2;
    }
}
