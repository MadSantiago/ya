package p000;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦَؚۚؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5189 extends FrameLayout {

    /* JADX INFO: renamed from: ۥْ */
    public View.OnApplyWindowInsetsListener f17170;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f17171;

    /* JADX INFO: renamed from: ۦ۟ */
    public final ArrayList f17172;

    /* JADX INFO: renamed from: ۦۨ */
    public final ArrayList f17173;

    public C5189(Context context, AttributeSet attributeSet, C2790 c2790) {
        super(context, attributeSet);
        this.f17173 = new ArrayList();
        this.f17172 = new ArrayList();
        this.f17171 = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1108.f3894, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308M5270 = c2790.m5270(id);
        if (classAttribute != null && abstractComponentCallbacksC0308M5270 == null) {
            if (id == -1) {
                C1078.m2276(AbstractC3761.m6629("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            C3698 c3698M5299 = c2790.m5299();
            context.getClassLoader();
            AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308M6561 = c3698M5299.m6561(classAttribute);
            abstractComponentCallbacksC0308M6561.f1146 = id;
            abstractComponentCallbacksC0308M6561.f1113 = id;
            abstractComponentCallbacksC0308M6561.f1150 = string;
            abstractComponentCallbacksC0308M6561.f1141 = c2790;
            C0827 c0827 = c2790.f9309;
            abstractComponentCallbacksC0308M6561.f1136 = c0827;
            abstractComponentCallbacksC0308M6561.f1139 = true;
            if ((c0827 == null ? null : c0827.f2927) != null) {
                abstractComponentCallbacksC0308M6561.f1139 = true;
            }
            C2177 c2177 = new C2177(c2790);
            c2177.f7201 = true;
            abstractComponentCallbacksC0308M6561.f1127 = this;
            abstractComponentCallbacksC0308M6561.f1148 = true;
            c2177.m4231(getId(), abstractComponentCallbacksC0308M6561, string);
            if (c2177.f7198) {
                C1078.m2276("This transaction is already being added to the back stack");
                throw null;
            }
            C2790 c2791 = c2177.f7187;
            if (c2791.f9309 != null && !c2791.f9318) {
                c2791.m5266(true);
                C2177 c2178 = c2791.f9312;
                if (c2178 != null) {
                    c2178.f7188 = false;
                    c2178.m4233();
                    if (C2790.m5261(3)) {
                        Log.d("FragmentManager", "Reversing mTransitioningOp " + c2791.f9312 + " as part of execSingleAction for action " + c2177);
                    }
                    c2791.f9312.m4230(false, false);
                    c2791.f9312.mo544(c2791.f9325, c2791.f9296);
                    Iterator it = c2791.f9312.f7191.iterator();
                    while (it.hasNext()) {
                        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = ((C4088) it.next()).f13652;
                        if (abstractComponentCallbacksC0308 != null) {
                            abstractComponentCallbacksC0308.f1112 = false;
                        }
                    }
                    c2791.f9312 = null;
                }
                c2177.mo544(c2791.f9325, c2791.f9296);
                c2791.f9310 = true;
                try {
                    c2791.m5281(c2791.f9325, c2791.f9296);
                    c2791.m5295();
                    c2791.m5297();
                    c2791.m5311();
                    ((HashMap) c2791.f9298.f5057).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    c2791.m5295();
                    throw th;
                }
            }
        }
        Iterator it2 = c2790.f9298.m3121().iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = ((C1239) it2.next()).f4258;
            getId();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0308 ? (AbstractComponentCallbacksC0308) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            C1078.m2277(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C2639 c2639M4953;
        C2639 c2639M4954 = C2639.m4953(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f17170;
        if (onApplyWindowInsetsListener != null) {
            c2639M4953 = C2639.m4953(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets), null);
        } else {
            WeakHashMap weakHashMap = AbstractC3608.f12013;
            WindowInsets windowInsetsM4955 = c2639M4954.m4955();
            if (windowInsetsM4955 != null && !windowInsetsM4955.equals(windowInsetsM4955)) {
                c2639M4954 = C2639.m4953(windowInsetsM4955, this);
            }
            c2639M4953 = c2639M4954;
        }
        if (!c2639M4953.f8768.mo6092()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                AbstractC3608.m6430(getChildAt(i), c2639M4953);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f17171) {
            Iterator it = this.f17173.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.f17171) {
            ArrayList arrayList = this.f17173;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        this.f17172.remove(view);
        if (this.f17173.remove(view)) {
            this.f17171 = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0308> F getFragment() {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308;
        AbstractActivityC2747 abstractActivityC2747;
        C2790 c2790M659;
        View view = this;
        while (true) {
            if (view == null) {
                abstractComponentCallbacksC0308 = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0308 = tag instanceof AbstractComponentCallbacksC0308 ? (AbstractComponentCallbacksC0308) tag : null;
            if (abstractComponentCallbacksC0308 != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0308 == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    abstractActivityC2747 = null;
                    break;
                }
                if (context instanceof AbstractActivityC2747) {
                    abstractActivityC2747 = (AbstractActivityC2747) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC2747 == null) {
                C5028.m8446(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            c2790M659 = ((C0827) abstractActivityC2747.f9089.f14025).f2925;
        } else {
            if (abstractComponentCallbacksC0308.f1136 == null || !abstractComponentCallbacksC0308.f1125) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0308 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            c2790M659 = abstractComponentCallbacksC0308.m659();
        }
        return (F) c2790M659.m5270(getId());
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            m8802(getChildAt(childCount));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        m8802(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        m8802(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        m8802(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m8802(getChildAt(i4));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m8802(getChildAt(i4));
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f17171 = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f17170 = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            this.f17172.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8802(View view) {
        if (this.f17172.contains(view)) {
            this.f17173.add(view);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }
}
