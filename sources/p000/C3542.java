package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦًؙّؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3542 extends AbstractC5212 {
    private static final C3542 zzm;
    private static volatile InterfaceC4089 zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private InterfaceC5083 zzg = C3623.f12075;
    private boolean zzh;
    private C2854 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        C3542 c3542 = new C3542();
        zzm = c3542;
        AbstractC5212.m8820(C3542.class, c3542);
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static C2227 m6328() {
        return (C2227) zzm.m8826();
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final boolean m6329() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final boolean m6330() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: ۥً */
    public final boolean m6331() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final int m6332() {
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
            return new C3730(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", C0529.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new C3542();
        }
        if (i2 == 4) {
            return new C2227(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzn;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C3542.class) {
            try {
                c4377 = zzn;
                if (c4377 == null) {
                    c4377 = new C4377(zzm);
                    zzn = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean m6333() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final /* synthetic */ void m6334(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final String m6335() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final C2854 m6336() {
        C2854 c2854 = this.zzi;
        return c2854 == null ? C2854.m5419() : c2854;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final C0529 m6337(int i) {
        return (C0529) this.zzg.get(i);
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final void m6338(int i, C0529 c0529) {
        InterfaceC5083 interfaceC5083M4003 = this.zzg;
        if (!((AbstractC1864) interfaceC5083M4003).f6207) {
            interfaceC5083M4003 = AbstractC2049.m4003(interfaceC5083M4003);
            this.zzg = interfaceC5083M4003;
        }
        interfaceC5083M4003.set(i, c0529);
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final boolean m6339() {
        return (this.zzb & 64) != 0;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final boolean m6340() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final List m6341() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final int m6342() {
        return this.zzg.size();
    }
}
