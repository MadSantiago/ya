package p000;

/* JADX INFO: renamed from: ۥؖؓۗؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0529 extends AbstractC5212 {
    private static final C0529 zzi;
    private static volatile InterfaceC4089 zzj;
    private int zzb;
    private C1288 zze;
    private C2854 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        C0529 c0529 = new C0529();
        zzi = c0529;
        AbstractC5212.m8820(C0529.class, c0529);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static C0529 m1174() {
        return zzi;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ void m1175(String str) {
        this.zzb |= 8;
        this.zzh = str;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final C1288 m1176() {
        C1288 c1288 = this.zze;
        return c1288 == null ? C1288.m2717() : c1288;
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
            return new C3730(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C0529();
        }
        if (i2 == 4) {
            return new C2798(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzj;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C0529.class) {
            try {
                c4377 = zzj;
                if (c4377 == null) {
                    c4377 = new C4377(zzi);
                    zzj = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean m1177() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean m1178() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final String m1179() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean m1180() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final boolean m1181() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final C2854 m1182() {
        C2854 c2854 = this.zzf;
        return c2854 == null ? C2854.m5419() : c2854;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final boolean m1183() {
        return (this.zzb & 4) != 0;
    }
}
