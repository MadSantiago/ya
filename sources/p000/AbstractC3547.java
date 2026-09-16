package p000;

import android.app.Notification;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: ۦؙؔ۟ؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3547 {
    /* JADX INFO: renamed from: ۥؗ */
    public static CharSequence m6347(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    /* JADX INFO: renamed from: ۥُ */
    public static void m6348(Notification.Builder builder) {
        builder.setShortCriticalText(null);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static int m6349(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static int m6350(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static boolean m6351(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }
}
