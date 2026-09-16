package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦۡؔۙؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5462 extends AbstractC5212 {
    private static final C5462 zzj;
    private static volatile InterfaceC4089 zzk;
    private int zzb;
    private int zze;
    private InterfaceC5083 zzf;
    private InterfaceC5083 zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        C5462 c5462 = new C5462();
        zzj = c5462;
        AbstractC5212.m8820(C5462.class, c5462);
    }

    public C5462() {
        C3623 c3623 = C3623.f12075;
        this.zzf = c3623;
        this.zzg = c3623;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final void m9142(int i, C3542 c3542) {
        InterfaceC5083 interfaceC5083M4003 = this.zzg;
        if (!((AbstractC1864) interfaceC5083M4003).f6207) {
            interfaceC5083M4003 = AbstractC2049.m4003(interfaceC5083M4003);
            this.zzg = interfaceC5083M4003;
        }
        interfaceC5083M4003.set(i, c3542);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final void m9143(int i, C4630 c4630) {
        InterfaceC5083 interfaceC5083M4003 = this.zzf;
        if (!((AbstractC1864) interfaceC5083M4003).f6207) {
            interfaceC5083M4003 = AbstractC2049.m4003(interfaceC5083M4003);
            this.zzf = interfaceC5083M4003;
        }
        interfaceC5083M4003.set(i, c4630);
    }

    /* JADX INFO: renamed from: ۥَ */
    public final int m9144() {
        return this.zze;
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
            return new C3730(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", C4630.class, "zzg", C3542.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C5462();
        }
        if (i2 == 4) {
            return new C1352(zzj);
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
        synchronized (C5462.class) {
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
    public final boolean m9145() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final List m9146() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final C3542 m9147(int i) {
        return (C3542) this.zzg.get(i);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final InterfaceC5083 m9148() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final int m9149() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final int m9150() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final C4630 m9151(int i) {
        return (C4630) this.zzf.get(i);
    }
}
