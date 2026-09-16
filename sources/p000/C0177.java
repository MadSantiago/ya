package p000;

import androidx.work.impl.WorkDatabase;
import java.util.List;

/* JADX INFO: renamed from: ۥۣؑؒۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0177 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C3133 f662 = new C3133(4);

    /* JADX INFO: renamed from: ۥۣ */
    public final WorkDatabase f663;

    public C0177(WorkDatabase workDatabase) {
        this.f663 = workDatabase;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final List m375(String str) {
        return (List) AbstractC0487.m1075(this.f663, true, false, new C3203(20, str));
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m376(EnumC4972 enumC4972, String str) {
        ((Number) AbstractC0487.m1075(this.f663, false, true, new C1708(22, enumC4972, str))).intValue();
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m377(int i, String str) {
        AbstractC0487.m1075(this.f663, false, true, new C2224(i, 2, (Object) str));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C4142 m378(String str) {
        return (C4142) AbstractC0487.m1075(this.f663, true, false, new C3203(11, str));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final EnumC4972 m379(String str) {
        return (EnumC4972) AbstractC0487.m1075(this.f663, true, false, new C3203(12, str));
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m380(long j, String str) {
        ((Number) AbstractC0487.m1075(this.f663, false, true, new C2066(0, j, str))).intValue();
    }
}
