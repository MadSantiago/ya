package p000;

/* JADX INFO: renamed from: ۦُۡؖٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5485 extends AbstractC5212 {
    private static final C5485 zzi;
    private static volatile InterfaceC4089 zzj;
    private int zzb;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C5485 c5485 = new C5485();
        zzi = c5485;
        AbstractC5212.m8820(C5485.class, c5485);
    }

    /* JADX INFO: renamed from: ۥَ */
    public final boolean m9181() {
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
            return new C3730(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C5485();
        }
        if (i2 == 4) {
            return new C1341(zzi);
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
        synchronized (C5485.class) {
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
    public final String m9182() {
        return this.zze;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean m9183() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ void m9184(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean m9185() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final int m9186() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final boolean m9187() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final boolean m9188() {
        return this.zzg;
    }
}
