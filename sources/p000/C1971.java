package p000;

/* JADX INFO: renamed from: ۥؘٜٞؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1971 extends AbstractC5212 {
    private static final C1971 zzi;
    private static volatile InterfaceC4089 zzj;
    private int zzb;
    private int zze;
    private C3906 zzf;
    private C3906 zzg;
    private boolean zzh;

    static {
        C1971 c1971 = new C1971();
        zzi = c1971;
        AbstractC5212.m8820(C1971.class, c1971);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static C2861 m3858() {
        return (C2861) zzi.m8826();
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ void m3859(C3906 c3906) {
        this.zzf = c3906;
        this.zzb |= 2;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ void m3860(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    /* JADX INFO: renamed from: ۥً */
    public final /* synthetic */ void m3861(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final int m3862() {
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
            return new C3730(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C1971();
        }
        if (i2 == 4) {
            return new C2861(zzi);
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
        synchronized (C1971.class) {
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
    public final boolean m3863() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final C3906 m3864() {
        C3906 c3906 = this.zzf;
        return c3906 == null ? C3906.m6978() : c3906;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean m3865() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final /* synthetic */ void m3866(C3906 c3906) {
        this.zzg = c3906;
        this.zzb |= 4;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final boolean m3867() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final boolean m3868() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final C3906 m3869() {
        C3906 c3906 = this.zzg;
        return c3906 == null ? C3906.m6978() : c3906;
    }
}
