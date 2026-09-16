package p000;

/* JADX INFO: renamed from: ۦؗؕٗؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3426 extends AbstractC5212 {
    private static final C3426 zzk;
    private static volatile InterfaceC4089 zzl;
    private int zzb;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        C3426 c3426 = new C3426();
        zzk = c3426;
        AbstractC5212.m8820(C3426.class, c3426);
    }

    /* JADX INFO: renamed from: ۥً */
    public static C2141 m6200() {
        return (C2141) zzk.m8826();
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final boolean m6201() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final float m6202() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final long m6203() {
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
            return new C3730(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C3426();
        }
        if (i2 == 4) {
            return new C2141(zzk);
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
        synchronized (C3426.class) {
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
    public final boolean m6204() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final /* synthetic */ void m6205(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final String m6206() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final boolean m6207() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean m6208() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final /* synthetic */ void m6209(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final /* synthetic */ void m6210() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final double m6211() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final /* synthetic */ void m6212(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final /* synthetic */ void m6213(double d) {
        this.zzb |= 32;
        this.zzj = d;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final /* synthetic */ void m6214() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    /* JADX INFO: renamed from: ۦُ */
    public final /* synthetic */ void m6215() {
        this.zzb &= -33;
        this.zzj = 0.0d;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final long m6216() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final boolean m6217() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final /* synthetic */ void m6218(long j) {
        this.zzb |= 1;
        this.zze = j;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final String m6219() {
        return this.zzg;
    }
}
