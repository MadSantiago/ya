package p000;

/* JADX INFO: renamed from: ۦٛؕٚؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4630 extends AbstractC5212 {
    private static final C4630 zzk;
    private static volatile InterfaceC4089 zzl;
    private int zzb;
    private int zze;
    private String zzf = "";
    private C0529 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C4630 c4630 = new C4630();
        zzk = c4630;
        AbstractC5212.m8820(C4630.class, c4630);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static C1209 m8013() {
        return (C1209) zzk.m8826();
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ void m8014(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final int m8015() {
        return this.zze;
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
            return new C3730(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C4630();
        }
        if (i2 == 4) {
            return new C1209(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzl;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C4630.class) {
            try {
                c4377 = zzl;
                if (c4377 == null) {
                    c4377 = new C4377(zzk);
                    zzl = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean m8016() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final String m8017() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final boolean m8018() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean m8019() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final boolean m8020() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final C0529 m8021() {
        C0529 c0529 = this.zzg;
        return c0529 == null ? C0529.m1174() : c0529;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final boolean m8022() {
        return this.zzh;
    }
}
