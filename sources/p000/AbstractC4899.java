package p000;

import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: ۦۖؒ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4899 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final long f16144 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: ۥۣ */
    public static final boolean m8239(AbstractC0006 abstractC0006) {
        ViewParent parent = AbstractC4489.m7803(abstractC0006).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
