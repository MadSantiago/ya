package p000;

/* JADX INFO: renamed from: ۥٞؑۥٖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1927 extends AbstractC5212 {
    private static final C1927 zzl;
    private static volatile InterfaceC4089 zzm;
    private int zzb;
    private String zze = "";
    private AbstractC4314 zzf = AbstractC4314.f14260;
    private String zzg = "";
    private InterfaceC5083 zzh;
    private InterfaceC5083 zzi;
    private boolean zzj;
    private long zzk;

    static {
        C1927 c1927 = new C1927();
        zzl = c1927;
        AbstractC5212.m8820(C1927.class, c1927);
    }

    public C1927() {
        C3623 c3623 = C3623.f12075;
        this.zzh = c3623;
        this.zzi = c3623;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static C4327 m3774() {
        return (C4327) zzl.m8826();
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ void m3775(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ void m3776(C4585 c4585) {
        c4585.getClass();
        this.zzb |= 2;
        this.zzf = c4585;
    }

    /* JADX INFO: renamed from: ۥً */
    public final void m3777(String str) {
        str.getClass();
        InterfaceC5083 interfaceC5083M4003 = this.zzi;
        if (!((AbstractC1864) interfaceC5083M4003).f6207) {
            interfaceC5083M4003 = AbstractC2049.m4003(interfaceC5083M4003);
            this.zzi = interfaceC5083M4003;
        }
        interfaceC5083M4003.add(str);
    }

    /* JADX INFO: renamed from: ۥَ */
    public final boolean m3778() {
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
            return new C3730(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", C2027.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C1927();
        }
        if (i2 == 4) {
            return new C4327(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzm;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C1927.class) {
            try {
                c4377 = zzm;
                if (c4377 == null) {
                    c4377 = new C4377(zzl);
                    zzm = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final String m3779() {
        return this.zze;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final /* synthetic */ void m3780(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final AbstractC4314 m3781() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ void m3782(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final long m3783() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m3784(C2027 c2027) {
        InterfaceC5083 interfaceC5083M4003 = this.zzh;
        if (!((AbstractC1864) interfaceC5083M4003).f6207) {
            interfaceC5083M4003 = AbstractC2049.m4003(interfaceC5083M4003);
            this.zzh = interfaceC5083M4003;
        }
        interfaceC5083M4003.add(c2027);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final String m3785() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final /* synthetic */ void m3786(boolean z) {
        this.zzb |= 8;
        this.zzj = z;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final InterfaceC5083 m3787() {
        return this.zzh;
    }
}
