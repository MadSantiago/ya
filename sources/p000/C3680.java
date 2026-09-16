package p000;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: renamed from: ۦًؗٚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3680 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C3133 f12292 = new C3133(1);

    /* JADX INFO: renamed from: ۥۣ */
    public final WorkDatabase f12293;

    public C3680(WorkDatabase workDatabase) {
        this.f12293 = workDatabase;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Long m6540(String str) {
        return (Long) AbstractC0487.m1075(this.f12293, true, false, new C3203(6, str));
    }
}
