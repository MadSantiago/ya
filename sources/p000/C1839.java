package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥِٜؖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1839 extends AbstractC5212 {
    private static final C1839 zzj;
    private static volatile InterfaceC4089 zzk;
    private int zzb;
    private InterfaceC5083 zze;
    private InterfaceC5083 zzf;
    private InterfaceC5083 zzg;
    private boolean zzh;
    private InterfaceC5083 zzi;

    static {
        C1839 c1839 = new C1839();
        zzj = c1839;
        AbstractC5212.m8820(C1839.class, c1839);
    }

    public C1839() {
        C3623 c3623 = C3623.f12075;
        this.zze = c3623;
        this.zzf = c3623;
        this.zzg = c3623;
        this.zzi = c3623;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static C1839 m3614() {
        return zzj;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final List m3615() {
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
            return new C3730(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", C5569.class, "zzf", C5672.class, "zzg", C2858.class, "zzh", "zzi", C5569.class});
        }
        if (i2 == 3) {
            return new C1839();
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
        synchronized (C1839.class) {
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
    public final List m3616() {
        return this.zze;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final List m3617() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final InterfaceC5083 m3618() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final boolean m3619() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final boolean m3620() {
        return this.zzh;
    }
}
