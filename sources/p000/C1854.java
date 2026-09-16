package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥٜۡٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1854 extends AbstractC5212 {
    private static final C1854 zzk;
    private static volatile InterfaceC4089 zzl;
    private int zzb;
    private int zze;
    private InterfaceC5083 zzf = C3623.f12075;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        C1854 c1854 = new C1854();
        zzk = c1854;
        AbstractC5212.m8820(C1854.class, c1854);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final int m3668() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final String m3669() {
        return this.zzg;
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
            return new C3730(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", C2068.f6829, "zzf", C1854.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C1854();
        }
        if (i2 == 4) {
            return new C0407(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzl;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C1854.class) {
            try {
                c4377 = zzl;
                if (c4377 == null) {
                    c4377 = new C4377(zzk);
                    zzl = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final List m3670() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean m3671() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final double m3672() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean m3673() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final boolean m3674() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final String m3675() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final boolean m3676() {
        return (this.zzb & 8) != 0;
    }
}
