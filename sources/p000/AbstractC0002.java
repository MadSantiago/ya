package p000;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* JADX INFO: renamed from: ۥؐ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0002 {
    /* JADX INFO: renamed from: ۥؗ */
    public static void m170(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    /* JADX INFO: renamed from: ۥُ */
    public static int[] m171(C0739 c0739, RectF rectF, int i, final C4164 c4164) {
        SegmentFinder graphemeClusterSegmentFinder;
        if (i == 1) {
            graphemeClusterSegmentFinder = new C3675(new C2346(17, c0739.f2683.getText(), c0739.m1635()));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(c0739.f2683.getText(), c0739.f2686);
        }
        return c0739.f2683.getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: ۦٚؕٝٚ
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) c4164.mo219(rectF2, rectF3)).booleanValue();
            }
        });
    }

    /* JADX INFO: renamed from: ۥّ */
    public static int m172(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static float m173(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static boolean m174(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static AccessibilityNodeInfo.AccessibilityAction m175() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static CharSequence m176(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static void m177(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    /* JADX INFO: renamed from: ۦِ */
    public static void m178(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static boolean m179(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static void m180(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static int m181(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }
}
