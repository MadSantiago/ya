package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦٗؓٛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4357 extends AbstractC5212 {
    private static final InterfaceC3704 zzl = new C3485(21);
    private static final C4357 zzq;
    private static volatile InterfaceC4089 zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private InterfaceC5083 zzi;
    private InterfaceC5083 zzj;
    private InterfaceC3627 zzk;
    private C5712 zzm;
    private boolean zzn;
    private boolean zzo;
    private C4096 zzp;
    private AbstractC4314 zze = AbstractC4314.f14260;
    private String zzg = "";

    static {
        C4357 c4357 = new C4357();
        zzq = c4357;
        AbstractC5212.m8820(C4357.class, c4357);
    }

    public C4357() {
        C3623 c3623 = C3623.f12075;
        this.zzi = c3623;
        this.zzj = c3623;
        this.zzk = C2667.f8831;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static C5218 m7648() {
        return (C5218) zzq.m8826();
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static C4357 m7649() {
        return zzq;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final C5712 m7650() {
        C5712 c5712 = this.zzm;
        return c5712 == null ? C5712.m9528() : c5712;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final boolean m7651() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: ۥً */
    public final boolean m7652() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final AbstractC4314 m7653() {
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
            return new C3730(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C2068.f6819, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new C4357();
        }
        if (i2 == 4) {
            return new C5218(zzq);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzr;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C4357.class) {
            try {
                c4377 = zzr;
                if (c4377 == null) {
                    c4377 = new C4377(zzq);
                    zzr = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean m7654() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean m7655() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final List m7656() {
        return new C5202(this.zzk, zzl);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final InterfaceC5083 m7657() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final boolean m7658() {
        return this.zzn;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final /* synthetic */ void m7659(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final InterfaceC5083 m7660() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final String m7661() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final C4096 m7662() {
        C4096 c4096 = this.zzp;
        return c4096 == null ? C4096.m7280() : c4096;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final long m7663() {
        return this.zzh;
    }
}
