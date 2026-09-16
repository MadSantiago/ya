package p000;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: renamed from: ۥؙؚِؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0761 implements InterfaceC0509 {

    /* JADX INFO: renamed from: ۥۗ */
    public ClipboardManager f2759;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f2760;

    public C0761(Context context) {
        this.f2760 = context;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final ClipboardManager m1656() {
        ClipboardManager clipboardManager = this.f2759;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        ClipboardManager clipboardManager2 = (ClipboardManager) this.f2760.getSystemService("clipboard");
        this.f2759 = clipboardManager2;
        return clipboardManager2;
    }
}
