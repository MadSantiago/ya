package p000;

/* JADX INFO: renamed from: ۥُؒؖؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0268 extends AbstractC5212 {
    private static final C0268 zzj;
    private static volatile InterfaceC4089 zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private AbstractC4314 zzf = AbstractC4314.f14260;
    private String zzg = "";
    private InterfaceC5083 zzi = C3623.f12075;

    static {
        C0268 c0268 = new C0268();
        zzj = c0268;
        AbstractC5212.m8820(C0268.class, c0268);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static C0268 m548() {
        return zzj;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static C1846 m549() {
        return (C1846) zzj.m8826();
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ void m550(AbstractC4314 abstractC4314) {
        abstractC4314.getClass();
        this.zzb |= 2;
        this.zzf = abstractC4314;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ void m551(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: ۥً */
    public final /* synthetic */ void m552(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final AbstractC4314 m553() {
        return this.zzf;
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
            return new C3730(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", C5161.class});
        }
        if (i2 == 3) {
            return new C0268();
        }
        if (i2 == 4) {
            return new C1846(zzj);
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
        synchronized (C0268.class) {
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
    public final String m555() {
        return this.zze;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final String m556() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final int m557() {
        return this.zzi.size();
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final /* synthetic */ void m558(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final long m559() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m560(C5161 c5161) {
        InterfaceC5083 interfaceC5083M4003 = this.zzi;
        if (!((AbstractC1864) interfaceC5083M4003).f6207) {
            interfaceC5083M4003 = AbstractC2049.m4003(interfaceC5083M4003);
            this.zzi = interfaceC5083M4003;
        }
        interfaceC5083M4003.add(c5161);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final InterfaceC5083 m561() {
        return this.zzi;
    }
}
