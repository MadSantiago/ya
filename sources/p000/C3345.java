package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۦٜؖؓۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3345 extends AbstractC2577 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0822 f11192;

    /* JADX INFO: renamed from: ۥۗ */
    public final List f11193;

    /* JADX INFO: renamed from: ۥۣ */
    public final List f11194;

    static {
        Pattern pattern = C0822.f2914;
        f11192 = AbstractC5378.m9040("application/x-www-form-urlencoded");
    }

    public C3345(ArrayList arrayList, ArrayList arrayList2) {
        this.f11194 = AbstractC4031.m7213(arrayList);
        this.f11193 = AbstractC4031.m7213(arrayList2);
    }

    @Override // p000.AbstractC2577
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3258(InterfaceC2674 interfaceC2674) {
        m6106(interfaceC2674, false);
    }

    @Override // p000.AbstractC2577
    /* JADX INFO: renamed from: ۥۗ */
    public final C0822 mo3259() {
        return f11192;
    }

    @Override // p000.AbstractC2577
    /* JADX INFO: renamed from: ۥۣ */
    public final long mo3260() {
        return m6106(null, true);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final long m6106(InterfaceC2674 interfaceC2674, boolean z) {
        C1270 c1270 = z ? new C1270() : interfaceC2674.mo2685();
        List list = this.f11194;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c1270.m2680(38);
            }
            c1270.m2677((String) list.get(i));
            c1270.m2680(61);
            c1270.m2677((String) this.f11193.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = c1270.f4340;
        c1270.m2678();
        return j;
    }
}
