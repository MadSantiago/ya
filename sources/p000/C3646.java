package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦًٌؒؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3646 extends AbstractC5212 {
    private static final C3646 zze;
    private static volatile InterfaceC4089 zzf;
    private InterfaceC5083 zzb = C3623.f12075;

    static {
        C3646 c3646 = new C3646();
        zze = c3646;
        AbstractC5212.m8820(C3646.class, c3646);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static C3646 m6525() {
        return zze;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final int m6526() {
        return this.zzb.size();
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
            return new C3730(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", C2260.class});
        }
        if (i2 == 3) {
            return new C3646();
        }
        if (i2 == 4) {
            return new C0407(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzf;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C3646.class) {
            try {
                c4377 = zzf;
                if (c4377 == null) {
                    c4377 = new C4377(zze);
                    zzf = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final List m6527() {
        return this.zzb;
    }
}
