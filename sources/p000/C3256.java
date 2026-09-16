package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦْٟؕؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3256 extends AbstractC5212 {
    private static final C3256 zzw;
    private static volatile InterfaceC4089 zzx;
    private int zzb;
    private long zze;
    private String zzf = "";
    private int zzg;
    private InterfaceC5083 zzh;
    private InterfaceC5083 zzi;
    private InterfaceC5083 zzj;
    private String zzk;
    private boolean zzl;
    private InterfaceC5083 zzm;
    private InterfaceC5083 zzn;
    private String zzo;
    private String zzp;
    private C1839 zzq;
    private C3506 zzr;
    private C4146 zzs;
    private C2407 zzt;
    private C2312 zzu;
    private InterfaceC3627 zzv;

    static {
        C3256 c3256 = new C3256();
        zzw = c3256;
        AbstractC5212.m8820(C3256.class, c3256);
    }

    public C3256() {
        C3623 c3623 = C3623.f12075;
        this.zzh = c3623;
        this.zzi = c3623;
        this.zzj = c3623;
        this.zzk = "";
        this.zzm = c3623;
        this.zzn = c3623;
        this.zzo = "";
        this.zzp = "";
        this.zzv = C2667.f8831;
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static C0337 m5983() {
        return (C0337) zzw.m8826();
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static C3256 m5984() {
        return zzw;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final int m5985() {
        return this.zzm.size();
    }

    /* JADX INFO: renamed from: ۥؔ */
    public final void m5986() {
        this.zzm = C3623.f12075;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final InterfaceC5083 m5987() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: ۥً */
    public final String m5988() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final long m5989() {
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
            return new C3730(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", C4987.class, "zzi", C5485.class, "zzj", C5462.class, "zzk", "zzl", "zzm", C5808.class, "zzn", C3484.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i2 == 3) {
            return new C3256();
        }
        if (i2 == 4) {
            return new C0337(zzw);
        }
        if (i2 == 5) {
            return zzw;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzx;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C3256.class) {
            try {
                c4377 = zzx;
                if (c4377 == null) {
                    c4377 = new C4377(zzw);
                    zzx = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean m5990() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final C1839 m5991() {
        C1839 c1839 = this.zzq;
        return c1839 == null ? C1839.m3614() : c1839;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean m5992() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final List m5993() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final int m5994() {
        return this.zzi.size();
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final boolean m5995() {
        return (this.zzb & 512) != 0;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final InterfaceC5083 m5996() {
        return this.zzn;
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final InterfaceC3627 m5997() {
        return this.zzv;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final C4146 m5998() {
        C4146 c4146 = this.zzs;
        return c4146 == null ? C4146.m7325() : c4146;
    }

    /* JADX INFO: renamed from: ۦُ */
    public final void m5999(int i, C5485 c5485) {
        InterfaceC5083 interfaceC5083M4003 = this.zzi;
        if (!((AbstractC1864) interfaceC5083M4003).f6207) {
            interfaceC5083M4003 = AbstractC2049.m4003(interfaceC5083M4003);
            this.zzi = interfaceC5083M4003;
        }
        interfaceC5083M4003.set(i, c5485);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final C5485 m6000(int i) {
        return (C5485) this.zzi.get(i);
    }

    /* JADX INFO: renamed from: ۦٖ */
    public final void m6001() {
        this.zzj = C3623.f12075;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final String m6002() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final boolean m6003() {
        return (this.zzb & 128) != 0;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final InterfaceC5083 m6004() {
        return this.zzh;
    }
}
