package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۥۢؗٞۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2639 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2639 f8767;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3470 f8768;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f8767 = C1983.f6548;
        } else if (i >= 30) {
            f8767 = C3417.f11377;
        } else {
            f8767 = C3470.f11515;
        }
    }

    public C2639(C2639 c2639) {
        if (c2639 == null) {
            this.f8768 = new C3470(this);
            return;
        }
        C3470 c3470 = c2639.f8768;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (c3470 instanceof C5741)) {
            this.f8768 = new C5741(this, (C5741) c3470);
        } else if (i >= 34 && (c3470 instanceof C1983)) {
            this.f8768 = new C1983(this, (C1983) c3470);
        } else if (i >= 31 && (c3470 instanceof C3910)) {
            this.f8768 = new C3910(this, (C3910) c3470);
        } else if (i >= 30 && (c3470 instanceof C3417)) {
            this.f8768 = new C3417(this, (C3417) c3470);
        } else if (i >= 29 && (c3470 instanceof C1719)) {
            this.f8768 = new C1719(this, (C1719) c3470);
        } else if (i >= 28 && (c3470 instanceof C4722)) {
            this.f8768 = new C4722(this, (C4722) c3470);
        } else if (c3470 instanceof C3315) {
            this.f8768 = new C3315(this, (C3315) c3470);
        } else if (c3470 instanceof C1297) {
            this.f8768 = new C1297(this, (C1297) c3470);
        } else {
            this.f8768 = new C3470(this);
        }
        c3470.mo2738(this);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C2639 m4953(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        C2639 c2639 = new C2639(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC3608.f12013;
            C2639 c2639M8350 = AbstractC4969.m8350(view);
            C3470 c3470 = c2639.f8768;
            c3470.mo2743(c2639M8350);
            View rootView = view.getRootView();
            c3470.mo2746(rootView);
            c3470.mo2756(rootView);
            c3470.mo2740();
            c3470.mo2736(view.getWindowSystemUiVisibility());
        }
        return c2639;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C5364 m4954(C5364 c5364, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c5364.f17695 - i);
        int iMax2 = Math.max(0, c5364.f17694 - i2);
        int iMax3 = Math.max(0, c5364.f17693 - i3);
        int iMax4 = Math.max(0, c5364.f17696 - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c5364 : C5364.m9014(iMax, iMax2, iMax3, iMax4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2639) {
            return Objects.equals(this.f8768, ((C2639) obj).f8768);
        }
        return false;
    }

    public final int hashCode() {
        C3470 c3470 = this.f8768;
        if (c3470 == null) {
            return 0;
        }
        return c3470.hashCode();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final WindowInsets m4955() {
        C3470 c3470 = this.f8768;
        if (c3470 instanceof C1297) {
            return ((C1297) c3470).f4410;
        }
        return null;
    }

    public C2639(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f8768 = new C5741(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.f8768 = new C1983(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f8768 = new C3910(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f8768 = new C3417(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f8768 = new C1719(this, windowInsets);
        } else if (i >= 28) {
            this.f8768 = new C4722(this, windowInsets);
        } else {
            this.f8768 = new C3315(this, windowInsets);
        }
    }
}
