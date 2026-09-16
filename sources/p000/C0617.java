package p000;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۥؗؖٙٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0617 extends AbstractC0054 implements InterfaceC3662 {

    /* JADX INFO: renamed from: ۥؓ */
    public boolean f2302;

    /* JADX INFO: renamed from: ۥؖ */
    public boolean f2303;

    /* JADX INFO: renamed from: ۥً */
    public boolean f2304;

    /* JADX INFO: renamed from: ۥٙ */
    public final C4852 f2305;

    /* JADX INFO: renamed from: ۥۧ */
    public boolean f2306;

    /* JADX INFO: renamed from: ۦٕ */
    public final Window f2307;

    public C0617(Context context, Window window) {
        super(context);
        this.f2307 = window;
        this.f2305 = AbstractC2774.m5183(AbstractC1950.f6443);
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        AbstractC5039.m8554(this, this);
        C0460.m977(this, new C5315(this, 1));
    }

    @Override // p000.AbstractC0054
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f2304;
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo1383(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1384(int i, C5362 c5362) {
        c5362.m8979(1735448596);
        int i2 = 4;
        int i3 = (c5362.m8977(this) ? 4 : 2) | i;
        if (c5362.m9011(i3 & 1, (i3 & 3) != 2)) {
            ((InterfaceC5731) this.f2305.getValue()).mo219(c5362, 0);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0046(this, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo1385(int i, int i2) {
        int iM8205;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.mo1385(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.f2307;
        if (mode != Integer.MIN_VALUE || this.f2303 || window.getAttributes().height != -2) {
            iM8205 = size2;
        } else if (this.f2302) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iM8205 = C4566.f15074.m7946(window);
            } else if (i3 < 32) {
                iM8205 = C4832.f15921.m8205(window);
            } else {
                iM8205 = size2;
            }
        } else {
            iM8205 = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iM8205 - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.f2302 || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.f2303) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // p000.InterfaceC3662
    /* JADX INFO: renamed from: ۦۙ */
    public final C2639 mo284(View view, C2639 c2639) {
        if (!this.f2302) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return c2639.f8768.mo2741(iMax, iMax2, iMax3, iMax4);
            }
        }
        return c2639;
    }
}
