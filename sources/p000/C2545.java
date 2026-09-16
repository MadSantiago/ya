package p000;

/* JADX INFO: renamed from: ۥًۡؒؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2545 extends AbstractC5212 {
    private static final C2545 zzl;
    private static volatile InterfaceC4089 zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C2545 c2545 = new C2545();
        zzl = c2545;
        AbstractC5212.m8820(C2545.class, c2545);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static C2545 m4774() {
        return zzl;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static C1384 m4775() {
        return (C1384) zzl.m8826();
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ void m4776(boolean z) {
        this.zzb |= 1;
        this.zze = z;
    }

    /* JADX INFO: renamed from: ۥً */
    public final /* synthetic */ void m4777(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final boolean m4778() {
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
            return new C3730(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C2545();
        }
        if (i2 == 4) {
            return new C1384(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzm;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C2545.class) {
            try {
                c4377 = zzm;
                if (c4377 == null) {
                    c4377 = new C4377(zzl);
                    zzm = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean m4779() {
        return this.zze;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final /* synthetic */ void m4780(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean m4781() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean m4782() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final /* synthetic */ void m4783(boolean z) {
        this.zzb |= 32;
        this.zzj = z;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final /* synthetic */ void m4784(boolean z) {
        this.zzb |= 2;
        this.zzf = z;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final /* synthetic */ void m4785(boolean z) {
        this.zzb |= 64;
        this.zzk = z;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final boolean m4786() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final boolean m4787() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final /* synthetic */ void m4788(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final boolean m4789() {
        return this.zzi;
    }
}
