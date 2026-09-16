package p000;

/* JADX INFO: renamed from: ۥۨؒۗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2905 extends AbstractC5212 {
    private static final C2905 zzi;
    private static volatile InterfaceC4089 zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = "";
    private String zzg = "";

    static {
        C2905 c2905 = new C2905();
        zzi = c2905;
        AbstractC5212.m8820(C2905.class, c2905);
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static C4547 m5472() {
        return (C4547) zzi.m8826();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ void m5473(String str) {
        this.zzb |= 1;
        this.zze = str;
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
            return new C3730(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2905();
        }
        if (i2 == 4) {
            return new C4547(zzi);
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
        synchronized (C2905.class) {
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

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ void m5474() {
        this.zzb |= 2;
        this.zzf = true;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ void m5475(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ void m5476(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }
}
