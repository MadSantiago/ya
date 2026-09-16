package p000;

/* JADX INFO: renamed from: ۦٍۣۡؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5437 extends AbstractC5212 {
    private static final C5437 zzh;
    private static volatile InterfaceC4089 zzi;
    private int zzb;
    private C5104 zzf;
    private String zze = "";
    private String zzg = "";

    static {
        C5437 c5437 = new C5437();
        zzh = c5437;
        AbstractC5212.m8820(C5437.class, c5437);
    }

    /* JADX INFO: renamed from: ۥَ */
    public static C5588 m9111() {
        return (C5588) zzh.m8826();
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
            return new C3730(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C5437();
        }
        if (i2 == 4) {
            return new C5588(zzh);
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
        synchronized (C5437.class) {
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
    public final String m9112() {
        return this.zze;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ void m9113(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ void m9114(C5104 c5104) {
        this.zzf = c5104;
        this.zzb |= 2;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ void m9115(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }
}
