package p000;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.EditorBoundsInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: ۦؘّۨؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5885 {
    /* JADX INFO: renamed from: ۥُ */
    public static /* synthetic */ BoringLayout m9695(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2, true);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static /* bridge */ /* synthetic */ OnBackInvokedCallback m9702(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m9705(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static /* synthetic */ EditorBoundsInfo.Builder m9712() {
        return new EditorBoundsInfo.Builder();
    }
}
