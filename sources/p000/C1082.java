package p000;

/* JADX INFO: renamed from: ۥِْؑۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1082 extends AbstractC5212 {
    private static final C1082 zzh;
    private static volatile InterfaceC4089 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C1082 c1082 = new C1082();
        zzh = c1082;
        AbstractC5212.m8820(C1082.class, c1082);
    }

    /* JADX INFO: renamed from: ۥَ */
    public static C3895 m2284() {
        return (C3895) zzh.m8826();
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static C1082 m2285() {
        return zzh;
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
            return new C3730(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", C2068.f6830, "zzf", C2068.f6823, "zzg", C2068.f6828});
        }
        if (i2 == 3) {
            return new C1082();
        }
        if (i2 == 4) {
            return new C3895(zzh);
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
        synchronized (C1082.class) {
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
    public final int m2286() {
        int iM3996 = AbstractC2049.m3996(this.zzf);
        if (iM3996 == 0) {
            return 1;
        }
        return iM3996;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ void m2287(int i) {
        this.zzg = i - 1;
        this.zzb |= 4;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0017 A[PHI: r2
  0x0017: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۥۖ */
    public final int m2288() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            i = i2 != 5 ? 0 : 6;
                        } else {
                            i = i3;
                        }
                    }
                } else {
                    i = i3;
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

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ void m2289(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m2290(int i) {
        this.zzf = AbstractC2049.m3993(i);
        this.zzb |= 2;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final int m2291() {
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
}
