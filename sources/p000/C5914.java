package p000;

/* JADX INFO: renamed from: ۦۣۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5914 extends AbstractC5212 {
    private static final C5914 zzg;
    private static volatile InterfaceC4089 zzh;
    private int zzb;
    private C4357 zze;
    private C5225 zzf;

    static {
        C5914 c5914 = new C5914();
        zzg = c5914;
        AbstractC5212.m8820(C5914.class, c5914);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static C5914 m9738(byte[] bArr, C2955 c2955) {
        return (C5914) AbstractC5212.m8818(zzg, bArr, c2955);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static C5196 m9739() {
        return (C5196) zzg.m8826();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final C5225 m9740() {
        C5225 c5225 = this.zzf;
        return c5225 == null ? C5225.m8857() : c5225;
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
            return new C3730(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C5914();
        }
        if (i2 == 4) {
            return new C5196(zzg);
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
        synchronized (C5914.class) {
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
    public final C4357 m9741() {
        C4357 c4357 = this.zze;
        return c4357 == null ? C4357.m7649() : c4357;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ void m9742(C4357 c4357) {
        this.zze = c4357;
        this.zzb |= 1;
    }
}
