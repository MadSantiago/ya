package p000;

/* JADX INFO: renamed from: ۦٍؕٗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3790 extends AbstractC5212 {
    private static final C3790 zzp;
    private static volatile InterfaceC4089 zzq;
    private int zzb;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private C3775 zzm;
    private C3775 zzn;
    private String zzo;

    static {
        C3790 c3790 = new C3790();
        zzp = c3790;
        AbstractC5212.m8820(C3790.class, c3790);
    }

    public C3790() {
        C3775 c3775 = C3775.f12547;
        this.zzm = c3775;
        this.zzn = c3775;
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzo = "";
    }

    /* JADX INFO: renamed from: ۥؙ */
    public static C3084 m6705() {
        return (C3084) zzp.m8826();
    }

    /* JADX INFO: renamed from: ۥۡ */
    public static C3790 m6706() {
        return zzp;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final C3775 m6707() {
        C3775 c3775 = this.zzm;
        if (c3775.f12548) {
            return c3775;
        }
        C3775 c3775M6679 = c3775.m6679();
        this.zzm = c3775M6679;
        return c3775M6679;
    }

    /* JADX INFO: renamed from: ۥؔ */
    public final boolean m6708() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ void m6709(long j) {
        this.zzb |= 128;
        this.zzl = j;
    }

    /* JADX INFO: renamed from: ۥؚ */
    public final String m6710() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: ۥً */
    public final /* synthetic */ void m6711(String str) {
        this.zzb |= 256;
        this.zzo = str;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ void m6712(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    /* JADX INFO: renamed from: ۥِ */
    public final /* synthetic */ void m6713(String str) {
        this.zzb |= 4;
        this.zzg = str;
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
            return new C3730(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", AbstractC0374.f1388, "zzn", AbstractC0984.f3478, "zzo"});
        }
        if (i2 == 3) {
            return new C3790();
        }
        if (i2 == 4) {
            return new C3084(zzp);
        }
        if (i2 == 5) {
            return zzp;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzq;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C3790.class) {
            try {
                c4377 = zzq;
                if (c4377 == null) {
                    c4377 = new C4377(zzp);
                    zzq = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ void m6714() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final boolean m6715() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ void m6716(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public final String m6717() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ void m6718() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }

    /* JADX INFO: renamed from: ۥٛ */
    public final boolean m6719() {
        return (this.zzb & 64) != 0;
    }

    /* JADX INFO: renamed from: ۥٝ */
    public final long m6720() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ void m6721() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final String m6722() {
        return this.zze;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m6723() {
        return (this.zzb & 256) != 0;
    }

    /* JADX INFO: renamed from: ۥۤ */
    public final String m6724() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: ۥۥ */
    public final /* synthetic */ void m6725() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final boolean m6726() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final C3775 m6727() {
        C3775 c3775 = this.zzn;
        if (c3775.f12548) {
            return c3775;
        }
        C3775 c3775M6679 = c3775.m6679();
        this.zzn = c3775M6679;
        return c3775M6679;
    }

    /* JADX INFO: renamed from: ۥۨ */
    public final /* synthetic */ void m6728(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: ۦؒ */
    public final boolean m6729() {
        return (this.zzb & 128) != 0;
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final String m6730() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final String m6731() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final boolean m6732() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: ۦُ */
    public final boolean m6733() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ void m6734(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public final long m6735() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ void m6736() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final /* synthetic */ void m6737() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ void m6738(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final String m6739() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public final /* synthetic */ void m6740() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final boolean m6741() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: ۦۧ */
    public final /* synthetic */ void m6742(String str) {
        this.zzb |= 1;
        this.zze = str;
    }
}
