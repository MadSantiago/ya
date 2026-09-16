package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥٝؖؓۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1900 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C0482 f6281;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2542 f6282;

    public C1900(C3129 c3129, AbstractC5746 abstractC5746) {
        this.f6282 = c3129.f10476;
        List listM5756 = C3129.m5756(4, c3129);
        this.f6281 = new C0482(listM5756.size());
        int size = listM5756.size();
        for (int i = 0; i < size; i++) {
            C3129 c31210 = (C3129) listM5756.get(i);
            if (abstractC5746.m9572(c31210.f10473)) {
                this.f6281.m1032(c31210.f10473);
            }
        }
    }
}
