package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥًّ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2533 extends AbstractC5212 {
    private static final C2533 zzi;
    private static volatile InterfaceC4089 zzj;
    private int zzb;
    private InterfaceC5083 zze = C3623.f12075;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        C2533 c2533 = new C2533();
        zzi = c2533;
        AbstractC5212.m8820(C2533.class, c2533);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static C0231 m4747(C2533 c2533) {
        AbstractC0955 abstractC0955M8826 = zzi.m8826();
        abstractC0955M8826.m1980(c2533);
        return (C0231) abstractC0955M8826;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static C0231 m4748() {
        return (C0231) zzi.m8826();
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ void m4749(int i, C2523 c2523) {
        m4758();
        this.zze.set(i, c2523);
    }

    /* JADX INFO: renamed from: ۥً */
    public final void m4750(ArrayList arrayList) {
        m4758();
        AbstractC0955.m1974(arrayList, this.zze);
    }

    /* JADX INFO: renamed from: ۥَ */
    public final int m4751() {
        return this.zze.size();
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
            return new C3730(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", C2523.class, "zzf", "zzg", "zzh", C2068.f6826});
        }
        if (i2 == 3) {
            return new C2533();
        }
        if (i2 == 4) {
            return new C0231(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC4089 interfaceC4089 = zzj;
        if (interfaceC4089 != null) {
            return interfaceC4089;
        }
        synchronized (C2533.class) {
            try {
                c4377 = zzj;
                if (c4377 == null) {
                    c4377 = new C4377(zzi);
                    zzj = c4377;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4377;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final List m4752() {
        return this.zze;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final /* synthetic */ void m4753(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final C2523 m4754(int i) {
        return (C2523) this.zze.get(i);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean m4755() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final /* synthetic */ void m4756(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final /* synthetic */ void m4757(C2523 c2523) {
        m4758();
        this.zze.add(c2523);
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final void m4758() {
        InterfaceC5083 interfaceC5083 = this.zze;
        if (((AbstractC1864) interfaceC5083).f6207) {
            return;
        }
        this.zze = AbstractC2049.m4003(interfaceC5083);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final String m4759() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final boolean m4760() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m4761() {
        this.zze = C3623.f12075;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final String m4762() {
        return this.zzf;
    }
}
