package p000;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: ۦٍؒۡۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3769 {
    /* JADX INFO: renamed from: ۥۜ */
    public static /* synthetic */ WindowInsetsAnimation.Bounds m6658(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static /* synthetic */ void m6662() {
    }

    /* JADX INFO: renamed from: ۦِ */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m6664(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static /* synthetic */ WindowInsetsAnimation m6668(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }
}
