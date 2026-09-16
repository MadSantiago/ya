package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥۢۡۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2648 extends FrameLayout {

    /* JADX INFO: renamed from: ۥْ */
    public static final Object f8794 = new Object();

    /* JADX INFO: renamed from: ۦ۟ */
    public C2075 f8795;

    /* JADX INFO: renamed from: ۦۨ */
    public final ArrayList f8796;

    public C2648(Context context, List list) {
        super(context);
        this.f8796 = new ArrayList();
        setProtections(list);
    }

    private C1909 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof C1909) {
            return (C1909) tag;
        }
        C1909 c1909 = new C1909(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, c1909);
        return c1909;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f8794) {
            C2075 c2075 = this.f8795;
            int childCount = getChildCount() - (c2075 != null ? c2075.f6853.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4962();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4961();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof C1909) {
            C1909 c1909 = (C1909) tag;
            if (c1909.f6298.isEmpty()) {
                c1909.f6299.post(new RunnableC0029(21, c1909));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<C3931> list) {
        ArrayList arrayList = this.f8796;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            m4962();
            requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m4961() {
        C2075 c2075;
        if (this.f8795 != null) {
            removeViews(getChildCount() - this.f8795.f6853.size(), this.f8795.f6853.size());
            int size = this.f8795.f6853.size();
            int i = 0;
            while (true) {
                c2075 = this.f8795;
                if (i >= size) {
                    break;
                }
                ((C3931) c2075.f6853.get(i)).f13117.f10959 = null;
                i++;
            }
            ArrayList arrayList = c2075.f6853;
            if (!c2075.f6851) {
                c2075.f6851 = true;
                c2075.f6852.f6298.remove(c2075);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((C3931) arrayList.get(size2)).f13115 = null;
                }
                arrayList.clear();
            }
            this.f8795 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[LOOP:0: B:7:0x0028->B:27:0x00b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۣ */
    public final void m4962() {
        int i;
        int i2;
        int i3;
        FrameLayout.LayoutParams layoutParams;
        View view;
        C3369 c3369;
        ArrayList arrayList = this.f8796;
        if (arrayList.isEmpty()) {
            m4961();
            return;
        }
        C1909 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        m4961();
        this.f8795 = new C2075(orInstallSystemBarStateMonitor, arrayList);
        int childCount = getChildCount();
        int size = this.f8795.f6853.size();
        for (int i4 = 0; i4 < size; i4++) {
            C3931 c3931 = (C3931) this.f8795.f6853.get(i4);
            Context context = getContext();
            int i5 = i4 + childCount;
            C3264 c3264 = c3931.f13117;
            int i6 = c3931.f13119;
            int i7 = -1;
            if (i6 != 1) {
                if (i6 == 2) {
                    i3 = c3264.f10955;
                    i2 = 48;
                } else if (i6 == 4) {
                    i = c3264.f10957;
                    i2 = 5;
                } else if (i6 != 8) {
                    C1078.m2272(AbstractC5078.m8670(i6, "Unexpected side: "));
                    return;
                } else {
                    i3 = c3264.f10955;
                    i2 = 80;
                }
                layoutParams = new FrameLayout.LayoutParams(i7, i3, i2);
                C5364 c5364 = c3264.f10952;
                layoutParams.leftMargin = c5364.f17695;
                layoutParams.topMargin = c5364.f17694;
                layoutParams.rightMargin = c5364.f17693;
                layoutParams.bottomMargin = c5364.f17696;
                view = new View(context);
                view.setTag(f8794);
                view.setTranslationX(c3264.f10954);
                view.setTranslationY(c3264.f10960);
                view.setAlpha(c3264.f10956);
                view.setVisibility(c3264.f10958 ? 0 : 8);
                view.setBackground(c3264.f10953);
                c3369 = new C3369(28, layoutParams, view);
                if (c3264.f10959 == null) {
                    C1078.m2276("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                    return;
                } else {
                    c3264.f10959 = c3369;
                    addView(view, i5, layoutParams);
                }
            } else {
                i = c3264.f10957;
                i2 = 3;
            }
            i7 = i;
            i3 = -1;
            layoutParams = new FrameLayout.LayoutParams(i7, i3, i2);
            C5364 c5365 = c3264.f10952;
            layoutParams.leftMargin = c5365.f17695;
            layoutParams.topMargin = c5365.f17694;
            layoutParams.rightMargin = c5365.f17693;
            layoutParams.bottomMargin = c5365.f17696;
            view = new View(context);
            view.setTag(f8794);
            view.setTranslationX(c3264.f10954);
            view.setTranslationY(c3264.f10960);
            view.setAlpha(c3264.f10956);
            view.setVisibility(c3264.f10958 ? 0 : 8);
            view.setBackground(c3264.f10953);
            c3369 = new C3369(28, layoutParams, view);
            if (c3264.f10959 == null) {
                C1078.m2276("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                return;
            } else {
                c3264.f10959 = c3369;
                addView(view, i5, layoutParams);
            }
        }
    }
}
