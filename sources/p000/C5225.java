package p000;

/* JADX INFO: renamed from: ۦٍۛؓۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5225 extends AbstractC5212 {
    private static final C5225 zzo;
    private static volatile InterfaceC4089 zzp;
    private int zzb;
    private boolean zzf;
    private InterfaceC5083 zzh;
    private InterfaceC5083 zzi;
    private InterfaceC3627 zzj;
    private C5712 zzk;
    private boolean zzl;
    private boolean zzm;
    private C4096 zzn;
    private AbstractC4314 zze = AbstractC4314.f14260;
    private String zzg = "";

    static {
        C5225 c5225 = new C5225();
        zzo = c5225;
        AbstractC5212.m8820(C5225.class, c5225);
    }

    public C5225() {
        C3623 c3623 = C3623.f12075;
        this.zzh = c3623;
        this.zzi = c3623;
        this.zzj = C2667.f8831;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static C5225 m8857() {
        return zzo;
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
            return new C3730(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C2068.f6819, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new C5225();
        }
        if (i2 == 4) {
            return new C0407(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzp;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C5225.class) {
            try {
                c4377 = zzp;
                if (c4377 == null) {
                    c4377 = new C4377(zzo);
                    zzp = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }
}
