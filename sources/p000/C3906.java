package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦؘُْؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3906 extends AbstractC5212 {
    private static final C3906 zzh;
    private static volatile InterfaceC4089 zzi;
    private InterfaceC1269 zzb;
    private InterfaceC1269 zze;
    private InterfaceC5083 zzf;
    private InterfaceC5083 zzg;

    static {
        C3906 c3906 = new C3906();
        zzh = c3906;
        AbstractC5212.m8820(C3906.class, c3906);
    }

    public C3906() {
        C4416 c4416 = C4416.f14557;
        this.zzb = c4416;
        this.zze = c4416;
        C3623 c3623 = C3623.f12075;
        this.zzf = c3623;
        this.zzg = c3623;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public static C3906 m6978() {
        return zzh;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static C3418 m6979() {
        return (C3418) zzh.m8826();
    }

    /* JADX INFO: renamed from: ۥً */
    public final void m6980() {
        this.zzb = C4416.f14557;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final int m6981() {
        return ((C4416) this.zzb).size();
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
            return new C3730(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", C3574.class, "zzg", C3415.class});
        }
        if (i2 == 3) {
            return new C3906();
        }
        if (i2 == 4) {
            return new C3418(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzi;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C3906.class) {
            try {
                c4377 = zzi;
                if (c4377 == null) {
                    c4377 = new C4377(zzh);
                    zzi = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final List m6982() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final void m6983() {
        this.zze = C4416.f14557;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final List m6984() {
        return this.zze;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final int m6985() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final int m6986() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final void m6987(ArrayList arrayList) {
        InterfaceC5083 interfaceC5083M4003 = this.zzf;
        if (!((AbstractC1864) interfaceC5083M4003).f6207) {
            interfaceC5083M4003 = AbstractC2049.m4003(interfaceC5083M4003);
            this.zzf = interfaceC5083M4003;
        }
        AbstractC0955.m1974(arrayList, interfaceC5083M4003);
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final void m6988() {
        this.zzg = C3623.f12075;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m6989(Iterable iterable) {
        List list = this.zzb;
        boolean z = ((AbstractC1864) list).f6207;
        List list2 = list;
        if (!z) {
            C4416 c4416 = (C4416) list;
            int i = c4416.f14559;
            C4416 c4416Mo4971 = c4416.mo4971(i + i);
            this.zzb = c4416Mo4971;
            list2 = c4416Mo4971;
        }
        AbstractC0955.m1974(iterable, list2);
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final void m6990(Iterable iterable) {
        InterfaceC5083 interfaceC5083M4003 = this.zzg;
        if (!((AbstractC1864) interfaceC5083M4003).f6207) {
            interfaceC5083M4003 = AbstractC2049.m4003(interfaceC5083M4003);
            this.zzg = interfaceC5083M4003;
        }
        AbstractC0955.m1974(iterable, interfaceC5083M4003);
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final void m6991() {
        this.zzf = C3623.f12075;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final InterfaceC5083 m6992() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final int m6993() {
        return ((C4416) this.zze).size();
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m6994(List list) {
        List list2 = this.zze;
        boolean z = ((AbstractC1864) list2).f6207;
        List list3 = list2;
        if (!z) {
            C4416 c4416 = (C4416) list2;
            int i = c4416.f14559;
            C4416 c4416Mo4971 = c4416.mo4971(i + i);
            this.zze = c4416Mo4971;
            list3 = c4416Mo4971;
        }
        AbstractC0955.m1974(list, list3);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final InterfaceC5083 m6995() {
        return this.zzf;
    }
}
