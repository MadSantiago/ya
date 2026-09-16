package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦؚۘؗٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5057 extends AbstractC5212 {
    private static final C5057 zzk;
    private static volatile InterfaceC4089 zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private InterfaceC5083 zzj = C3623.f12075;

    static {
        C5057 c5057 = new C5057();
        zzk = c5057;
        AbstractC5212.m8820(C5057.class, c5057);
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static C5330 m8583() {
        return (C5330) zzk.m8826();
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final double m8584() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: ۥؔ */
    public final void m8585(ArrayList arrayList) {
        InterfaceC5083 interfaceC5083M4003 = this.zzj;
        if (!((AbstractC1864) interfaceC5083M4003).f6207) {
            interfaceC5083M4003 = AbstractC2049.m4003(interfaceC5083M4003);
            this.zzj = interfaceC5083M4003;
        }
        AbstractC0955.m1974(arrayList, interfaceC5083M4003);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final boolean m8586() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: ۥً */
    public final int m8587() {
        return this.zzj.size();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final String m8588() {
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
            return new C3730(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C5057.class});
        }
        if (i2 == 3) {
            return new C5057();
        }
        if (i2 == 4) {
            return new C5330(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzl;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C5057.class) {
            try {
                c4377 = zzl;
                if (c4377 == null) {
                    c4377 = new C4377(zzk);
                    zzl = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean m8589() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final /* synthetic */ void m8590(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean m8591() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final float m8592() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final long m8593() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final /* synthetic */ void m8594(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final /* synthetic */ void m8595() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final InterfaceC5083 m8596() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final /* synthetic */ void m8597(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final /* synthetic */ void m8598(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final /* synthetic */ void m8599() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    /* JADX INFO: renamed from: ۦُ */
    public final /* synthetic */ void m8600() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final boolean m8601() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public final void m8602(C5057 c5057) {
        InterfaceC5083 interfaceC5083M4003 = this.zzj;
        if (!((AbstractC1864) interfaceC5083M4003).f6207) {
            interfaceC5083M4003 = AbstractC2049.m4003(interfaceC5083M4003);
            this.zzj = interfaceC5083M4003;
        }
        interfaceC5083M4003.add(c5057);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final String m8603() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final boolean m8604() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final void m8605() {
        this.zzj = C3623.f12075;
    }
}
