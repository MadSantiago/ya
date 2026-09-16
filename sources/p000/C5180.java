package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ۦٍۚؕٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5180 extends AbstractC4134 {

    /* JADX INFO: renamed from: ۥّ */
    public static final C5180 f17132 = new C5180();

    /* JADX INFO: renamed from: ۥۜ */
    public static final String f17133;

    /* JADX INFO: renamed from: ۦٛ */
    public static final int f17134;

    /* JADX INFO: renamed from: ۦۙ */
    public static final String f17135;

    static {
        C4772 c4772 = EnumC1245.f4292;
        f17135 = c4772.f4298;
        f17133 = c4772.f4297;
        f17134 = c4772.f4296;
    }

    @Override // p000.AbstractC4134
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo482() {
        m7322(new C1797(3));
    }

    @Override // p000.AbstractC4134
    /* JADX INFO: renamed from: ۥۖ */
    public final C2351 mo483() {
        C2351 c2351 = new C2351(1);
        C0637 c0637 = new C0637();
        Class<List> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(List.class));
        c0637.m1445(clsM9037 != null ? clsM9037 : List.class);
        c2351.f7798 = c0637;
        return c2351;
    }

    @Override // p000.AbstractC4134, p000.AbstractC3003
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo221() {
        C4524.f14953.getClass();
        C1443 c1443M7845 = C4524.m7845();
        C1542 c1542 = AbstractC2539.f8452;
        Object obj = c1542.f5218;
        String str = c1542.f5219;
        boolean z = C1443.f4940;
        if (((Set) c1443M7845.m3068(obj, str)).contains(EnumC3528.f11697.f11701)) {
            return;
        }
        m7321();
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦؚ */
    public final String mo484() {
        return f17135;
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦِ */
    public final int mo222() {
        return f17134;
    }

    @Override // p000.AbstractC4134
    /* JADX INFO: renamed from: ۦٗ */
    public final C2351 mo485() {
        C2351 c2351 = new C2351(0);
        C2672 c2672 = new C2672();
        c2672.m4979(new C1797(4));
        c2351.f7798 = c2672;
        return c2351;
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦۗ */
    public final String mo223() {
        return f17133;
    }
}
