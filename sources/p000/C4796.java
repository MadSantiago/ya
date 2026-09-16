package p000;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦؘٞؕۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4796 implements InterfaceC3442 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Toolbar f15816;

    /* JADX INFO: renamed from: ۦ۟ */
    public C1092 f15817;

    /* JADX INFO: renamed from: ۦۨ */
    public MenuC4903 f15818;

    public C4796(Toolbar toolbar) {
        this.f15816 = toolbar;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo3726(C1092 c1092) {
        Toolbar toolbar = this.f15816;
        KeyEvent.Callback callback = toolbar.f133;
        if (callback instanceof InterfaceC0595) {
            ((C0900) ((InterfaceC0595) callback)).f3240.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f133);
        toolbar.removeView(toolbar.f153);
        toolbar.f133 = null;
        ArrayList arrayList = toolbar.f143;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f15817 = null;
        toolbar.requestLayout();
        c1092.f3812 = false;
        c1092.f3834.m8311(false);
        toolbar.m45();
        return true;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo3728(C1092 c1092) {
        Toolbar toolbar = this.f15816;
        toolbar.m39();
        ViewParent parent = toolbar.f153.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f153);
            }
            toolbar.addView(toolbar.f153);
        }
        View actionView = c1092.getActionView();
        toolbar.f133 = actionView;
        this.f15817 = c1092;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f133);
            }
            C1156 c1156M35 = Toolbar.m35();
            c1156M35.f4013 = (toolbar.f141 & 112) | 8388611;
            c1156M35.f4012 = 2;
            toolbar.f133.setLayoutParams(c1156M35);
            toolbar.addView(toolbar.f133);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C1156) childAt.getLayoutParams()).f4012 != 2 && childAt != toolbar.f159) {
                toolbar.removeViewAt(childCount);
                toolbar.f143.add(childAt);
            }
        }
        toolbar.requestLayout();
        c1092.f3812 = true;
        c1092.f3834.m8311(false);
        KeyEvent.Callback callback = toolbar.f133;
        if (callback instanceof InterfaceC0595) {
            ((C0900) ((InterfaceC0595) callback)).f3240.onActionViewExpanded();
        }
        toolbar.m45();
        return true;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦِ */
    public final boolean mo4536(SubMenuC4103 subMenuC4103) {
        return false;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo3733(Context context, MenuC4903 menuC4903) {
        C1092 c1092;
        MenuC4903 menuC4904 = this.f15818;
        if (menuC4904 != null && (c1092 = this.f15817) != null) {
            menuC4904.mo7307(c1092);
        }
        this.f15818 = menuC4903;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦۗ */
    public final boolean mo4537() {
        return false;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo4538() {
        if (this.f15817 != null) {
            MenuC4903 menuC4903 = this.f15818;
            if (menuC4903 != null) {
                int size = menuC4903.f16175.size();
                for (int i = 0; i < size; i++) {
                    if (this.f15818.getItem(i) == this.f15817) {
                        return;
                    }
                }
            }
            mo3726(this.f15817);
        }
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo4535(MenuC4903 menuC4903, boolean z) {
    }
}
