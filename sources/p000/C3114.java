package p000;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: renamed from: ۦؒؔۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3114 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C0177 f10440;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3654 f10441;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1489 f10442;

    static {
        C1984.m3875("WMFgUpdater");
    }

    public C3114(WorkDatabase workDatabase, C3654 c3654, C1489 c1489) {
        this.f10441 = c3654;
        this.f10442 = c1489;
        this.f10440 = workDatabase.mo103();
    }
}
