package p000;

/* JADX INFO: renamed from: ۥۣٓؕؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1288 extends AbstractC5212 {
    private static final C1288 zzi;
    private static volatile InterfaceC4089 zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private InterfaceC5083 zzh = C3623.f12075;

    static {
        C1288 c1288 = new C1288();
        zzi = c1288;
        AbstractC5212.m8820(C1288.class, c1288);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static C1288 m2717() {
        return zzi;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final int m2718() {
        int i;
        switch (this.zze) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                i = 3;
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                i = 4;
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                i = 5;
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                i = 6;
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final boolean m2719() {
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
            return new C3730(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", C2068.f6821, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C1288();
        }
        if (i2 == 4) {
            return new C0407(zzi);
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
        synchronized (C1288.class) {
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

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean m2720() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final String m2721() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final InterfaceC5083 m2722() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final int m2723() {
        return this.zzh.size();
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final boolean m2724() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final boolean m2725() {
        return this.zzg;
    }
}
