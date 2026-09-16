package p000;

/* JADX INFO: renamed from: ۥۧؓؐۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2854 extends AbstractC5212 {
    private static final C2854 zzj;
    private static volatile InterfaceC4089 zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C2854 c2854 = new C2854();
        zzj = c2854;
        AbstractC5212.m8820(C2854.class, c2854);
    }

    /* JADX INFO: renamed from: ۥؓ */
    public static C2854 m5419() {
        return zzj;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final String m5420() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final boolean m5421() {
        return (this.zzb & 2) != 0;
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
            return new C3730(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", C2068.f6816, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C2854();
        }
        if (i2 == 4) {
            return new C0407(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzk;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C2854.class) {
            try {
                c4377 = zzk;
                if (c4377 == null) {
                    c4377 = new C4377(zzj);
                    zzk = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean m5422() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean m5423() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final boolean m5424() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean m5425() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final int m5426() {
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

    /* JADX INFO: renamed from: ۦٕ */
    public final String m5427() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final boolean m5428() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final String m5429() {
        return this.zzg;
    }
}
