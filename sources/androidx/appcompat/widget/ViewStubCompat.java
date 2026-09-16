package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p000.AbstractC5618;
import p000.C1078;
import p000.InterfaceC4347;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: ۥْ */
    public WeakReference f160;

    /* JADX INFO: renamed from: ۥٓ */
    public LayoutInflater f161;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f162;

    /* JADX INFO: renamed from: ۦۨ */
    public int f163;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f163 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5618.f18508, 0, 0);
        this.f162 = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f163 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f162;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f161;
    }

    public int getLayoutResource() {
        return this.f163;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f162 = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f161 = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f163 = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f160;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            } else {
                C1078.m2276("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m55();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final View m55() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            C1078.m2276("ViewStub must have a non-null ViewGroup viewParent");
            return null;
        }
        if (this.f163 == 0) {
            C1078.m2272("ViewStub must have a valid layoutResource");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f161;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f163, viewGroup, false);
        int i = this.f162;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f160 = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(InterfaceC4347 interfaceC4347) {
    }
}
