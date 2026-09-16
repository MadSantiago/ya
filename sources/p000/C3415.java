package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦٍؗؓۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3415 extends AbstractC5212 {
    private static final C3415 zzg;
    private static volatile InterfaceC4089 zzh;
    private int zzb;
    private int zze;
    private InterfaceC1269 zzf = C4416.f14557;

    static {
        C3415 c3415 = new C3415();
        zzg = c3415;
        AbstractC5212.m8820(C3415.class, c3415);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static C2009 m6185() {
        return (C2009) zzg.m8826();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final int m6186() {
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
            return new C3730(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C3415();
        }
        if (i2 == 4) {
            return new C2009(zzg);
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
        synchronized (C3415.class) {
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
    public final boolean m6187() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final List m6188() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final void m6189(List list) {
        List list2 = this.zzf;
        boolean z = ((AbstractC1864) list2).f6207;
        List list3 = list2;
        if (!z) {
            C4416 c4416 = (C4416) list2;
            int i = c4416.f14559;
            C4416 c4416Mo4971 = c4416.mo4971(i + i);
            this.zzf = c4416Mo4971;
            list3 = c4416Mo4971;
        }
        AbstractC0955.m1974(list, list3);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ void m6190(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final int m6191() {
        return ((C4416) this.zzf).size();
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final long m6192(int i) {
        return ((C4416) this.zzf).m7715(i);
    }
}
