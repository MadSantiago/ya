package p000;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: ۦٜؗؕٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3425 extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: ۥۣ */
    public final C4228 f11390;

    public C3425(C4228 c4228) {
        this.f11390 = c4228;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f11390.mo1745(i, new C5817(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C5817 c5817Mo1746 = this.f11390.mo1746(i);
        if (c5817Mo1746 == null) {
            return null;
        }
        return c5817Mo1746.f19154;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C5817 c5817Mo1743 = this.f11390.mo1743(i);
        if (c5817Mo1743 == null) {
            return null;
        }
        return c5817Mo1743.f19154;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f11390.mo1744(i, i2, bundle);
    }
}
