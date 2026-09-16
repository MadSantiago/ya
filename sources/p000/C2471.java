package p000;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: renamed from: ۥٜٜ۟ؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2471 implements InterfaceC1625 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C0761 f8246;

    public C2471(C0761 c0761) {
        this.f8246 = c0761;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4634(C4235 c4235) {
        C0761 c0761 = this.f8246;
        if (c4235 != null) {
            c0761.m1656().setPrimaryClip(c4235.f14038);
        } else if (Build.VERSION.SDK_INT >= 28) {
            c0761.m1656().clearPrimaryClip();
        } else {
            c0761.m1656().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
