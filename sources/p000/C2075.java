package p000;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥۖؖۥؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2075 {

    /* JADX INFO: renamed from: ۥؗ */
    public C5364 f6849;

    /* JADX INFO: renamed from: ۥُ */
    public int f6850;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f6851;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1909 f6852;

    /* JADX INFO: renamed from: ۥۣ */
    public final ArrayList f6853 = new ArrayList();

    /* JADX INFO: renamed from: ۦؑ */
    public C5364 f6854;

    public C2075(C1909 c1909, ArrayList arrayList) {
        C5364 c5364 = C5364.f17692;
        this.f6849 = c5364;
        this.f6854 = c5364;
        m4021(arrayList, false);
        m4021(arrayList, true);
        ArrayList arrayList2 = c1909.f6298;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            C5364 c5365 = c1909.f6296;
            C5364 c5366 = c1909.f6300;
            this.f6849 = c5365;
            this.f6854 = c5366;
            m4019();
            m4020(c1909.f6297);
        }
        this.f6852 = c1909;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m4019() {
        int i;
        C5364 c5364M9014;
        ArrayList arrayList = this.f6853;
        C5364 c5364 = C5364.f17692;
        C5364 c5364M9016 = c5364;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C3931 c3931 = (C3931) arrayList.get(size);
            C5364 c5365 = this.f6849;
            C5364 c5366 = this.f6854;
            c3931.f13114 = c5365;
            C3264 c3264 = c3931.f13117;
            c3931.f13120 = c5366;
            if (!c3264.f10952.equals(c5364M9016)) {
                c3264.f10952 = c5364M9016;
                C3369 c3369 = c3264.f10959;
                if (c3369 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c3369.f11255;
                    layoutParams.leftMargin = c5364M9016.f17695;
                    layoutParams.topMargin = c5364M9016.f17694;
                    layoutParams.rightMargin = c5364M9016.f17693;
                    layoutParams.bottomMargin = c5364M9016.f17696;
                    ((View) c3369.f11254).setLayoutParams(layoutParams);
                }
            }
            int i2 = c3931.f13119;
            if (i2 == 1) {
                i = c3931.f13114.f17695;
                int i3 = c3931.f13120.f17695;
                if (c3264.f10957 != i3) {
                    c3264.f10957 = i3;
                    C3369 c33610 = c3264.f10959;
                    if (c33610 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) c33610.f11255;
                        layoutParams2.width = i3;
                        ((View) c33610.f11254).setLayoutParams(layoutParams2);
                    }
                }
                c5364M9014 = C5364.m9014(i, 0, 0, 0);
            } else if (i2 == 2) {
                i = c3931.f13114.f17694;
                int i4 = c3931.f13120.f17694;
                if (c3264.f10955 != i4) {
                    c3264.f10955 = i4;
                    C3369 c33611 = c3264.f10959;
                    if (c33611 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) c33611.f11255;
                        layoutParams3.height = i4;
                        ((View) c33611.f11254).setLayoutParams(layoutParams3);
                    }
                }
                c5364M9014 = C5364.m9014(0, i, 0, 0);
            } else if (i2 == 4) {
                i = c3931.f13114.f17693;
                int i5 = c3931.f13120.f17693;
                if (c3264.f10957 != i5) {
                    c3264.f10957 = i5;
                    C3369 c33612 = c3264.f10959;
                    if (c33612 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) c33612.f11255;
                        layoutParams4.width = i5;
                        ((View) c33612.f11254).setLayoutParams(layoutParams4);
                    }
                }
                c5364M9014 = C5364.m9014(0, 0, i, 0);
            } else if (i2 != 8) {
                c5364M9014 = c5364;
                i = 0;
            } else {
                i = c3931.f13114.f17696;
                int i6 = c3931.f13120.f17696;
                if (c3264.f10955 != i6) {
                    c3264.f10955 = i6;
                    C3369 c33613 = c3264.f10959;
                    if (c33613 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) c33613.f11255;
                        layoutParams5.height = i6;
                        ((View) c33613.f11254).setLayoutParams(layoutParams5);
                    }
                }
                c5364M9014 = C5364.m9014(0, 0, 0, i);
            }
            boolean z = i > 0;
            if (c3264.f10958 != z) {
                c3264.f10958 = z;
                C3369 c33614 = c3264.f10959;
                if (c33614 != null) {
                    ((View) c33614.f11254).setVisibility(z ? 0 : 8);
                }
            }
            float f = 0.0f;
            c3931.m7063(i > 0 ? 1.0f : 0.0f);
            if (i > 0) {
                f = 1.0f;
            }
            c3931.m7062(f);
            c5364M9016 = C5364.m9016(c5364M9016, c5364M9014);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m4020(int i) {
        ArrayList arrayList = this.f6853;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C3931 c3931 = (C3931) arrayList.get(size);
            if (!c3931.f13121) {
                ColorDrawable colorDrawable = c3931.f13116;
                if (c3931.f13118 != i) {
                    c3931.f13118 = i;
                    colorDrawable.setColor(i);
                    C3264 c3264 = c3931.f13117;
                    c3264.f10953 = colorDrawable;
                    C3369 c3369 = c3264.f10959;
                    if (c3369 != null) {
                        ((View) c3369.f11254).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4021(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C3931 c3931 = (C3931) list.get(i);
            c3931.getClass();
            if (true == z) {
                C2075 c2075 = c3931.f13115;
                if (c2075 != null) {
                    throw new IllegalStateException(c3931 + " (" + (i + 1) + "/" + size + ") is already controlled by " + c2075 + " but is still added to " + this);
                }
                c3931.f13115 = this;
                this.f6853.add(c3931);
            }
        }
    }
}
