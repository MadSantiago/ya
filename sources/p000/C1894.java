package p000;

import androidx.work.impl.WorkDatabase;
import java.util.List;

/* JADX INFO: renamed from: ۥِٝؕۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1894 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C3133 f6277 = new C3133(0);

    /* JADX INFO: renamed from: ۥۣ */
    public final WorkDatabase f6278;

    public C1894(WorkDatabase workDatabase) {
        this.f6278 = workDatabase;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final List m3746(String str) {
        return (List) AbstractC0487.m1075(this.f6278, true, false, new C3203(3, str));
    }
}
