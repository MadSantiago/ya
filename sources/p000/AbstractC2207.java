package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.text.LineBreakConfig;
import android.os.Bundle;
import android.text.StaticLayout;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: ۥؙۙؒٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2207 {
    /* JADX INFO: renamed from: ۥؗ */
    public static String m4264(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final void m4265(C2453 c2453, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = c2453.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final void m4266(C2453 c2453, C4723 c4723) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (c4723 == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = c2453.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(c4723);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static Object m4267(String str, Bundle bundle) {
        return bundle.getParcelable(str, C2233.class);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final void m4268(CursorAnchorInfo.Builder builder, C2793 c2793) {
        builder.setEditorBoundsInfo(AbstractC5885.m9712().setEditorBounds(AbstractC4225.m7456(c2793)).setHandwritingBounds(AbstractC4225.m7456(c2793)).build());
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static PackageInfo m4269(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static boolean m4270(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final void m4271(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final void m4272(CursorAnchorInfo.Builder builder, C2793 c2793) {
        builder.setEditorBoundsInfo(AbstractC5885.m9712().setEditorBounds(AbstractC4225.m7456(c2793)).setHandwritingBounds(AbstractC4225.m7456(c2793)).build());
    }
}
