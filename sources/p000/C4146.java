package p000;

/* JADX INFO: renamed from: ۦٌؘٓۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4146 extends AbstractC5212 {
    private static final C4146 zzj;
    private static volatile InterfaceC4089 zzk;
    private int zzb;
    private int zzh;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";

    static {
        C4146 c4146 = new C4146();
        zzj = c4146;
        AbstractC5212.m8820(C4146.class, c4146);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static C4146 m7325() {
        return zzj;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final String m7326() {
        return this.zzi;
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
            return new C3730(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C4146();
        }
        if (i2 == 4) {
            return new C0407(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzk;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C4146.class) {
            try {
                c4377 = zzk;
                if (c4377 == null) {
                    c4377 = new C4377(zzj);
                    zzk = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final int m7327() {
        return this.zzh;
    }
}
