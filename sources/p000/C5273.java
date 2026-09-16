package p000;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: ۦۜؒۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5273 extends View {

    /* JADX INFO: renamed from: ۥٖ */
    public static final int[] f17377 = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: ۦٗ */
    public static final int[] f17378 = new int[0];

    /* JADX INFO: renamed from: ۥَ */
    public C0101 f17379;

    /* JADX INFO: renamed from: ۥْ */
    public Long f17380;

    /* JADX INFO: renamed from: ۥٓ */
    public RunnableC0029 f17381;

    /* JADX INFO: renamed from: ۦ۟ */
    public Boolean f17382;

    /* JADX INFO: renamed from: ۦۨ */
    public C4641 f17383;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f17381;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f17380;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? f17377 : f17378;
            C4641 c4641 = this.f17383;
            if (c4641 != null) {
                c4641.setState(iArr);
            }
        } else {
            RunnableC0029 runnableC0029 = new RunnableC0029(14, this);
            this.f17381 = runnableC0029;
            postDelayed(runnableC0029, 50L);
        }
        this.f17380 = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(C5273 c5273) {
        C4641 c4641 = c5273.f17383;
        if (c4641 != null) {
            c4641.setState(f17378);
        }
        c5273.f17381 = null;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            m8908();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C0101 c0101 = this.f17379;
        if (c0101 != null) {
            c0101.mo449();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m8908() {
        this.f17379 = null;
        RunnableC0029 runnableC0029 = this.f17381;
        if (runnableC0029 != null) {
            removeCallbacks(runnableC0029);
            this.f17381.run();
        } else {
            C4641 c4641 = this.f17383;
            if (c4641 != null) {
                c4641.setState(f17378);
            }
        }
        C4641 c4642 = this.f17383;
        if (c4642 == null) {
            return;
        }
        c4642.setVisible(false, false);
        unscheduleDrawable(c4642);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m8909(int i, long j, long j2) {
        C4641 c4641 = this.f17383;
        if (c4641 == null) {
            return;
        }
        if (c4641.getRadius() != i) {
            c4641.setRadius(i);
        }
        float f = Build.VERSION.SDK_INT < 28 ? 0.2f : 0.1f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jM2826 = C1327.m2826(j2, f, 14);
        C1327 c1327 = c4641.f15315;
        if (!(c1327 == null ? false : C4462.m7744(c1327.f4595, jM2826))) {
            c4641.f15315 = new C1327(jM2826);
            c4641.setColor(ColorStateList.valueOf(AbstractC4225.m7470(jM2826)));
        }
        Rect rect = new Rect(0, 0, AbstractC2776.m5235(Float.intBitsToFloat((int) (j >> 32))), AbstractC2776.m5235(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c4641.setBounds(rect);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m8910(C3656 c3656, boolean z, long j, int i, long j2, C0101 c0101) {
        long j3 = c3656.f12247;
        if (this.f17383 == null || !Boolean.valueOf(z).equals(this.f17382)) {
            C4641 c4641 = new C4641(z);
            setBackground(c4641);
            this.f17383 = c4641;
            this.f17382 = Boolean.valueOf(z);
        }
        C4641 c4642 = this.f17383;
        this.f17379 = c0101;
        m8909(i, j, j2);
        if (z) {
            c4642.setHotspot(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)));
        } else {
            c4642.setHotspot(c4642.getBounds().centerX(), c4642.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m8911() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
