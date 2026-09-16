package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* JADX INFO: renamed from: ۥؙؔؕٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0399 extends ViewGroup {

    /* JADX INFO: renamed from: ۦ۟ */
    public final HashMap f1471;

    /* JADX INFO: renamed from: ۦۨ */
    public final HashMap f1472;

    public C0399(Context context) {
        super(context);
        setClipChildren(false);
        this.f1472 = new HashMap();
        this.f1471 = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AbstractC2535, C0605> getHolderToLayoutNode() {
        return this.f1472;
    }

    public final HashMap<C0605, AbstractC2535> getLayoutNodeToHolder() {
        return this.f1471;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (AbstractC2535 abstractC2535 : this.f1472.keySet()) {
            abstractC2535.layout(abstractC2535.getLeft(), abstractC2535.getTop(), abstractC2535.getRight(), abstractC2535.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            AbstractC3480.m6279("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            AbstractC3480.m6279("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (AbstractC2535 abstractC2535 : this.f1472.keySet()) {
            int i4 = abstractC2535.f8407;
            if (i4 != Integer.MIN_VALUE && (i3 = abstractC2535.f8409) != Integer.MIN_VALUE) {
                abstractC2535.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0605 c0605 = (C0605) this.f1472.get(childAt);
            if (childAt.isLayoutRequested() && c0605 != null) {
                C0605.m1312(c0605, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
