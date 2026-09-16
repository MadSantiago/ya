package p000;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;

/* JADX INFO: renamed from: ۦؘُۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3931 {

    /* JADX INFO: renamed from: ۥؗ */
    public C5364 f13114;

    /* JADX INFO: renamed from: ۥُ */
    public C2075 f13115;

    /* JADX INFO: renamed from: ۥّ */
    public final ColorDrawable f13116;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3264 f13117;

    /* JADX INFO: renamed from: ۥۜ */
    public int f13118;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f13119;

    /* JADX INFO: renamed from: ۦؑ */
    public C5364 f13120;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f13121;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public C3931(int i, int i2) {
        C3264 c3264 = new C3264();
        c3264.f10957 = -1;
        c3264.f10955 = -1;
        C5364 c5364 = C5364.f17692;
        c3264.f10952 = c5364;
        c3264.f10958 = false;
        c3264.f10953 = null;
        c3264.f10954 = 0.0f;
        c3264.f10960 = 0.0f;
        c3264.f10956 = 1.0f;
        this.f13117 = c3264;
        this.f13114 = c5364;
        this.f13120 = c5364;
        this.f13115 = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            C1078.m2272(AbstractC5078.m8670(i, "Unexpected side: "));
            throw null;
        }
        this.f13119 = i;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f13116 = colorDrawable;
        this.f13118 = 0;
        this.f13121 = true;
        if (i2 != 0) {
            this.f13118 = i2;
            colorDrawable.setColor(i2);
            c3264.f10953 = colorDrawable;
            C3369 c3369 = c3264.f10959;
            if (c3369 != null) {
                ((View) c3369.f11254).setBackground(colorDrawable);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m7062(float f) {
        float f2 = f * 1.0f;
        C3264 c3264 = this.f13117;
        int i = this.f13119;
        if (i == 1) {
            float f3 = (-(1.0f - f2)) * c3264.f10957;
            if (c3264.f10954 != f3) {
                c3264.f10954 = f3;
                C3369 c3369 = c3264.f10959;
                if (c3369 != null) {
                    ((View) c3369.f11254).setTranslationX(f3);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            float f4 = (-(1.0f - f2)) * c3264.f10955;
            if (c3264.f10960 != f4) {
                c3264.f10960 = f4;
                C3369 c33610 = c3264.f10959;
                if (c33610 != null) {
                    ((View) c33610.f11254).setTranslationY(f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            float f5 = (1.0f - f2) * c3264.f10957;
            if (c3264.f10954 != f5) {
                c3264.f10954 = f5;
                C3369 c33611 = c3264.f10959;
                if (c33611 != null) {
                    ((View) c33611.f11254).setTranslationX(f5);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 8) {
            return;
        }
        float f6 = (1.0f - f2) * c3264.f10955;
        if (c3264.f10960 != f6) {
            c3264.f10960 = f6;
            C3369 c33612 = c3264.f10959;
            if (c33612 != null) {
                ((View) c33612.f11254).setTranslationY(f6);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7063(float f) {
        float f2 = f * 1.0f;
        C3264 c3264 = this.f13117;
        if (c3264.f10956 != f2) {
            c3264.f10956 = f2;
            C3369 c3369 = c3264.f10959;
            if (c3369 != null) {
                ((View) c3369.f11254).setAlpha(f2);
            }
        }
    }
}
