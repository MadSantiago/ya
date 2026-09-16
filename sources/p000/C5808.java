package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦۧؒؔؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5808 extends AbstractC5212 {
    private static final C5808 zzg;
    private static volatile InterfaceC4089 zzh;
    private int zzb;
    private InterfaceC5083 zze = C3623.f12075;
    private C3646 zzf;

    static {
        C5808 c5808 = new C5808();
        zzg = c5808;
        AbstractC5212.m8820(C5808.class, c5808);
    }

    /* JADX INFO: renamed from: ۥَ */
    public final C3646 m9622() {
        C3646 c3646 = this.zzf;
        return c3646 == null ? C3646.m6525() : c3646;
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
            return new C3730(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", C1854.class, "zzf"});
        }
        if (i2 == 3) {
            return new C5808();
        }
        if (i2 == 4) {
            return new C0407(zzg);
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
        synchronized (C5808.class) {
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
    public final List m9623() {
        return this.zze;
    }
}
