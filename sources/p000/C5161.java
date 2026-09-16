package p000;

/* JADX INFO: renamed from: ۦۚؓٔٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5161 extends AbstractC5212 {
    private static final C5161 zzh;
    private static volatile InterfaceC4089 zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        C5161 c5161 = new C5161();
        zzh = c5161;
        AbstractC5212.m8820(C5161.class, c5161);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static C4001 m8755() {
        return (C4001) zzh.m8826();
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ void m8756(boolean z) {
        this.zze = 3;
        this.zzf = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ void m8757(long j) {
        this.zze = 2;
        this.zzf = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ۥً */
    public final /* synthetic */ void m8758(String str) {
        str.getClass();
        this.zze = 5;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final long m8759() {
        if (this.zze == 2) {
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
            return new C3730(zzh, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i2 == 3) {
            return new C5161();
        }
        if (i2 == 4) {
            return new C4001(zzh);
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
        synchronized (C5161.class) {
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
    public final String m8760() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final int m8761() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 5;
        }
        return 4;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean m8762() {
        if (this.zze == 3) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ void m8763(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final AbstractC4314 m8764() {
        return this.zze == 6 ? (AbstractC4314) this.zzf : AbstractC4314.f14260;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final /* synthetic */ void m8765(double d) {
        this.zze = 4;
        this.zzf = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final double m8766() {
        if (this.zze == 4) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final /* synthetic */ void m8767(AbstractC4314 abstractC4314) {
        abstractC4314.getClass();
        this.zze = 6;
        this.zzf = abstractC4314;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final String m8768() {
        return this.zze == 5 ? (String) this.zzf : "";
    }
}
