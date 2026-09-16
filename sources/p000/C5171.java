package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦُۚؔٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5171 extends AbstractC5212 {
    private static final C5171 zze;
    private static volatile InterfaceC4089 zzf;
    private InterfaceC5083 zzb = C3623.f12075;

    static {
        C5171 c5171 = new C5171();
        zze = c5171;
        AbstractC5212.m8820(C5171.class, c5171);
    }

    /* JADX INFO: renamed from: ۥَ */
    public static C5088 m8775() {
        return (C5088) zze.m8826();
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static C5171 m8776() {
        return zze;
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
            return new C3730(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", C3607.class});
        }
        if (i2 == 3) {
            return new C5171();
        }
        if (i2 == 4) {
            return new C5088(zze);
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
        synchronized (C5171.class) {
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
    public final List m8777() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m8778(ArrayList arrayList) {
        InterfaceC5083 interfaceC5083M4003 = this.zzb;
        if (!((AbstractC1864) interfaceC5083M4003).f6207) {
            interfaceC5083M4003 = AbstractC2049.m4003(interfaceC5083M4003);
            this.zzb = interfaceC5083M4003;
        }
        AbstractC0955.m1974(arrayList, interfaceC5083M4003);
    }
}
