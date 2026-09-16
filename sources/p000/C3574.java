package p000;

/* JADX INFO: renamed from: ۦؙؚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3574 extends AbstractC5212 {
    private static final C3574 zzg;
    private static volatile InterfaceC4089 zzh;
    private int zzb;
    private int zze;
    private long zzf;

    static {
        C3574 c3574 = new C3574();
        zzg = c3574;
        AbstractC5212.m8820(C3574.class, c3574);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static C2042 m6376() {
        return (C2042) zzg.m8826();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final int m6377() {
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
            return new C3730(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C3574();
        }
        if (i2 == 4) {
            return new C2042(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzh;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C3574.class) {
            try {
                c4377 = zzh;
                if (c4377 == null) {
                    c4377 = new C4377(zzg);
                    zzh = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean m6378() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean m6379() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ void m6380(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ void m6381(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final long m6382() {
        return this.zzf;
    }
}
