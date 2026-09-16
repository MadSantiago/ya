package p000;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: ۥٗؓۡٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1523 implements InterfaceC2509 {

    /* JADX INFO: renamed from: ۥۣ */
    public final ViewConfiguration f5165;

    public C1523(ViewConfiguration viewConfiguration) {
        this.f5165 = viewConfiguration;
    }

    @Override // p000.InterfaceC2509
    /* JADX INFO: renamed from: ۥؗ */
    public final long mo3252() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // p000.InterfaceC2509
    /* JADX INFO: renamed from: ۥُ */
    public final float mo3253() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f5165.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // p000.InterfaceC2509
    /* JADX INFO: renamed from: ۥّ */
    public final float mo3254() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f5165.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }

    @Override // p000.InterfaceC2509
    /* JADX INFO: renamed from: ۥۗ */
    public final long mo3255() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // p000.InterfaceC2509
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo3256() {
        return this.f5165.getScaledMaximumFlingVelocity();
    }

    @Override // p000.InterfaceC2509
    /* JADX INFO: renamed from: ۦؑ */
    public final float mo3257() {
        return this.f5165.getScaledTouchSlop();
    }
}
