package p000;

/* JADX INFO: renamed from: ۥٟۣؗۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2027 extends AbstractC5212 {
    private static final C2027 zzh;
    private static volatile InterfaceC4089 zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        C2027 c2027 = new C2027();
        zzh = c2027;
        AbstractC5212.m8820(C2027.class, c2027);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static C2027 m3967() {
        return zzh;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static C2959 m3968() {
        return (C2959) zzh.m8826();
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ void m3969(long j) {
        this.zze = 1;
        this.zzf = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ void m3970(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: ۥً */
    public final /* synthetic */ void m3971(double d) {
        this.zze = 3;
        this.zzf = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: ۥَ */
    public final long m3972() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
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
            return new C3730(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i2 == 3) {
            return new C2027();
        }
        if (i2 == 4) {
            return new C2959(zzh);
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
        synchronized (C2027.class) {
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
    public final String m3973() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final /* synthetic */ void m3974(C4585 c4585) {
        c4585.getClass();
        this.zze = 5;
        this.zzf = c4585;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean m3975() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final AbstractC4314 m3976() {
        return this.zze == 5 ? (AbstractC4314) this.zzf : AbstractC4314.f14260;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final int m3977() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final /* synthetic */ void m3978(boolean z) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final double m3979() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final /* synthetic */ void m3980(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final String m3981() {
        return this.zze == 4 ? (String) this.zzf : "";
    }
}
