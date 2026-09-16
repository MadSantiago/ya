package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦۣؒؒۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5580 extends AbstractC5212 {
    private static final C5580 zzm;
    private static volatile InterfaceC4089 zzn;
    private int zzb;
    private InterfaceC5083 zze = C3623.f12075;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        C5580 c5580 = new C5580();
        zzm = c5580;
        AbstractC5212.m8820(C5580.class, c5580);
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static C4102 m9403() {
        return (C4102) zzm.m8826();
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final long m9404() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: ۥؔ */
    public final /* synthetic */ void m9405(int i) {
        m9408();
        this.zze.remove(i);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final boolean m9406() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: ۥً */
    public final int m9407() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m9408() {
        InterfaceC5083 interfaceC5083 = this.zze;
        if (((AbstractC1864) interfaceC5083).f6207) {
            return;
        }
        this.zze = AbstractC2049.m4003(interfaceC5083);
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
            return new C3730(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", C5057.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new C5580();
        }
        if (i2 == 4) {
            return new C4102(zzm);
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
        synchronized (C5580.class) {
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
    public final /* synthetic */ void m9409(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final long m9410() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final List m9411() {
        return this.zze;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public final /* synthetic */ void m9412(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final long m9413() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: ۥٛ */
    public final /* synthetic */ void m9414(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final String m9415() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final boolean m9416() {
        return (this.zzb & 64) != 0;
    }

    /* JADX INFO: renamed from: ۥۤ */
    public final /* synthetic */ void m9417(long j) {
        this.zzb |= 32;
        this.zzk = j;
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final /* synthetic */ void m9418(int i, C5057 c5057) {
        m9408();
        this.zze.set(i, c5057);
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final boolean m9419() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final /* synthetic */ void m9420(C5057 c5057) {
        c5057.getClass();
        m9408();
        this.zze.add(c5057);
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final long m9421() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: ۦُ */
    public final void m9422(Iterable iterable) {
        m9408();
        AbstractC0955.m1974(iterable, this.zze);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final boolean m9423() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public final void m9424() {
        this.zze = C3623.f12075;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final int m9425() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final boolean m9426() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final C5057 m9427(int i) {
        return (C5057) this.zze.get(i);
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final /* synthetic */ void m9428(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final /* synthetic */ void m9429(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }
}
