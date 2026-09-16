package p000;

import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: ۥۘؖؒ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2174 {
    /* JADX INFO: renamed from: ۥۗ */
    public static void m4225(EditorInfo editorInfo, boolean z) {
        editorInfo.setStylusHandwritingEnabled(z);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m4226(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }
}
