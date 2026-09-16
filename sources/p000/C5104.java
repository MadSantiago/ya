package p000;

/* JADX INFO: renamed from: ۦُۙؔٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5104 extends AbstractC5212 {
    private static final C5104 zzg;
    private static volatile InterfaceC4089 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        C5104 c5104 = new C5104();
        zzg = c5104;
        AbstractC5212.m8820(C5104.class, c5104);
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static C3640 m8734() {
        return (C3640) zzg.m8826();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ void m8735(int i) {
        this.zze = i - 2;
        this.zzb |= 1;
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
            return new C3730(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C5104();
        }
        if (i2 == 4) {
            return new C3640(zzg);
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
        synchronized (C5104.class) {
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

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ void m8736(int i) {
        if (i == 1) {
            C1078.m2272("Can't get the number of an unknown enum value.");
        } else {
            this.zzf = i - 2;
            this.zzb |= 2;
        }
    }
}
