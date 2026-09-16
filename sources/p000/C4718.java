package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦٜۦؙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4718 implements InterfaceC3442 {

    /* JADX INFO: renamed from: ۥؓ */
    public boolean f15551;

    /* JADX INFO: renamed from: ۥؖ */
    public boolean f15552;

    /* JADX INFO: renamed from: ۥً */
    public int f15553;

    /* JADX INFO: renamed from: ۥَ */
    public InterfaceC3370 f15554;

    /* JADX INFO: renamed from: ۥْ */
    public MenuC4903 f15555;

    /* JADX INFO: renamed from: ۥٓ */
    public final LayoutInflater f15556;

    /* JADX INFO: renamed from: ۥٕ */
    public boolean f15557;

    /* JADX INFO: renamed from: ۥٙ */
    public boolean f15559;

    /* JADX INFO: renamed from: ۥۖ */
    public C2954 f15560;

    /* JADX INFO: renamed from: ۥۦ */
    public RunnableC4985 f15562;

    /* JADX INFO: renamed from: ۥۧ */
    public int f15563;

    /* JADX INFO: renamed from: ۦؖ */
    public C0911 f15564;

    /* JADX INFO: renamed from: ۦؗ */
    public C2736 f15565;

    /* JADX INFO: renamed from: ۦؙ */
    public C0911 f15566;

    /* JADX INFO: renamed from: ۦٕ */
    public Drawable f15568;

    /* JADX INFO: renamed from: ۦٚ */
    public int f15570;

    /* JADX INFO: renamed from: ۦۛ */
    public InterfaceC2122 f15571;

    /* JADX INFO: renamed from: ۦ۟ */
    public Context f15572;

    /* JADX INFO: renamed from: ۦۨ */
    public final Context f15573;

    /* JADX INFO: renamed from: ۥٖ */
    public final int f15558 = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: ۦٗ */
    public final int f15569 = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: ۥۙ */
    public final SparseBooleanArray f15561 = new SparseBooleanArray();

    /* JADX INFO: renamed from: ۦُ */
    public final C5086 f15567 = new C5086(3, this);

    public C4718(Context context) {
        this.f15573 = context;
        this.f15556 = LayoutInflater.from(context);
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo3726(C1092 c1092) {
        return false;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥُ */
    public final void mo4534(InterfaceC3370 interfaceC3370) {
        throw null;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo3728(C1092 c1092) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥۗ */
    public final View m8050(C1092 c1092, View view, ViewGroup viewGroup) {
        View actionView = c1092.getActionView();
        if (actionView == null || c1092.m2302()) {
            InterfaceC3902 interfaceC3902 = view instanceof InterfaceC3902 ? (InterfaceC3902) view : (InterfaceC3902) this.f15556.inflate(this.f15569, viewGroup, false);
            interfaceC3902.mo3(c1092);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC3902;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f15571);
            C2736 c2736 = this.f15565;
            if (c2736 == null) {
                c2736 = new C2736(this);
                this.f15565 = c2736;
            }
            actionMenuItemView.setPopupCallback(c2736);
            actionView = (View) interfaceC3902;
        }
        actionView.setVisibility(c1092.f3812 ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C2862)) {
            actionView.setLayoutParams(ActionMenuView.m28(layoutParams));
        }
        return actionView;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean m8051() {
        C0911 c0911 = this.f15566;
        return c0911 != null && c0911.m4342();
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo4535(MenuC4903 menuC4903, boolean z) {
        m8052();
        C0911 c0911 = this.f15564;
        if (c0911 != null && c0911.m4342()) {
            c0911.f7607.dismiss();
        }
        InterfaceC3370 interfaceC3370 = this.f15554;
        if (interfaceC3370 != null) {
            interfaceC3370.mo2765(menuC4903, z);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean m8052() {
        Object obj;
        RunnableC4985 runnableC4985 = this.f15562;
        if (runnableC4985 != null && (obj = this.f15571) != null) {
            ((View) obj).removeCallbacks(runnableC4985);
            this.f15562 = null;
            return true;
        }
        C0911 c0911 = this.f15566;
        if (c0911 == null) {
            return false;
        }
        if (c0911.m4342()) {
            c0911.f7607.dismiss();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final boolean m8053() {
        MenuC4903 menuC4903;
        boolean z = false;
        if (this.f15552 && !m8051() && (menuC4903 = this.f15555) != null && this.f15571 != null && this.f15562 == null) {
            menuC4903.m8308();
            if (!menuC4903.f16186.isEmpty()) {
                RunnableC4985 runnableC4985 = new RunnableC4985(1, this, new C0911(this, this.f15572, this.f15555, this.f15560), z);
                this.f15562 = runnableC4985;
                ((View) this.f15571).post(runnableC4985);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦِ */
    public final boolean mo4536(SubMenuC4103 subMenuC4103) {
        boolean z;
        if (subMenuC4103.hasVisibleItems()) {
            SubMenuC4103 subMenuC4104 = subMenuC4103;
            while (true) {
                MenuC4903 menuC4903 = subMenuC4104.f13690;
                if (menuC4903 == this.f15555) {
                    break;
                }
                subMenuC4104 = (SubMenuC4103) menuC4903;
            }
            C1092 c1092 = subMenuC4104.f13689;
            ViewGroup viewGroup = (ViewGroup) this.f15571;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof InterfaceC3902) && ((InterfaceC3902) childAt).getItemData() == c1092) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                int size = subMenuC4103.f16175.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = subMenuC4103.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C0911 c0911 = new C0911(this, this.f15572, subMenuC4103, view);
                this.f15564 = c0911;
                c0911.f7609 = z;
                AbstractC1875 abstractC1875 = c0911.f7607;
                if (abstractC1875 != null) {
                    abstractC1875.mo3736(z);
                }
                C0911 c0912 = this.f15564;
                if (!c0912.m4342()) {
                    if (c0912.f7600 == null) {
                        C1078.m2276("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    c0912.m4344(0, 0, false, false);
                }
                InterfaceC3370 interfaceC3370 = this.f15554;
                if (interfaceC3370 != null) {
                    interfaceC3370.mo2761(subMenuC4103);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo3733(Context context, MenuC4903 menuC4903) {
        this.f15572 = context;
        LayoutInflater.from(context);
        this.f15555 = menuC4903;
        Resources resources = context.getResources();
        if (!this.f15551) {
            this.f15552 = true;
        }
        int i = 2;
        this.f15563 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f15570 = i;
        int measuredWidth = this.f15563;
        if (this.f15552) {
            if (this.f15560 == null) {
                C2954 c2954 = new C2954(this, this.f15573);
                this.f15560 = c2954;
                if (this.f15559) {
                    c2954.setImageDrawable(this.f15568);
                    this.f15568 = null;
                    this.f15559 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f15560.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f15560.getMeasuredWidth();
        } else {
            this.f15560 = null;
        }
        this.f15553 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦۗ */
    public final boolean mo4537() {
        int size;
        ArrayList arrayListM8306;
        int i;
        boolean z;
        C4718 c4718 = this;
        MenuC4903 menuC4903 = c4718.f15555;
        if (menuC4903 != null) {
            arrayListM8306 = menuC4903.m8306();
            size = arrayListM8306.size();
        } else {
            size = 0;
            arrayListM8306 = null;
        }
        int i2 = c4718.f15570;
        int i3 = c4718.f15553;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c4718.f15571;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            C1092 c1092 = (C1092) arrayListM8306.get(i4);
            int i7 = c1092.f3819;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (c4718.f15557 && c1092.f3812) {
                i2 = 0;
            }
            i4++;
        }
        if (c4718.f15552 && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = c4718.f15561;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C1092 c1093 = (C1092) arrayListM8306.get(i9);
            int i11 = c1093.f3819;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = c1093.f3821;
            if (z3) {
                View viewM8050 = c4718.m8050(c1093, null, viewGroup);
                viewM8050.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM8050.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c1093.m2303(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewM8051 = c4718.m8050(c1093, null, viewGroup);
                        viewM8051.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewM8051.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            C1092 c1094 = (C1092) arrayListM8306.get(i13);
                            if (c1094.f3821 == i12) {
                                if ((c1094.f3829 & 32) == 32) {
                                    i8++;
                                }
                                c1094.m2303(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    c1093.m2303(z5);
                } else {
                    c1093.m2303(false);
                }
                i9++;
                i = 2;
                c4718 = this;
                z = true;
            }
            i9++;
            i = 2;
            c4718 = this;
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo4538() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f15571;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            MenuC4903 menuC4903 = this.f15555;
            if (menuC4903 != null) {
                menuC4903.m8308();
                ArrayList arrayListM8306 = this.f15555.m8306();
                int size = arrayListM8306.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C1092 c1092 = (C1092) arrayListM8306.get(i2);
                    if ((c1092.f3829 & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        C1092 itemData = childAt instanceof InterfaceC3902 ? ((InterfaceC3902) childAt).getItemData() : null;
                        View viewM8050 = m8050(c1092, childAt, viewGroup);
                        if (c1092 != itemData) {
                            viewM8050.setPressed(false);
                            viewM8050.jumpDrawablesToCurrentState();
                        }
                        if (viewM8050 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM8050.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM8050);
                            }
                            ((ViewGroup) this.f15571).addView(viewM8050, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f15560) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f15571).requestLayout();
        MenuC4903 menuC4904 = this.f15555;
        if (menuC4904 != null) {
            menuC4904.m8308();
            ArrayList arrayList2 = menuC4904.f16189;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC2187 actionProviderVisibilityListenerC2187 = ((C1092) arrayList2.get(i3)).f3809;
            }
        }
        MenuC4903 menuC4905 = this.f15555;
        if (menuC4905 != null) {
            menuC4905.m8308();
            arrayList = menuC4905.f16186;
        }
        if (this.f15552 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((C1092) arrayList.get(0)).f3812;
            } else if (size3 > 0) {
                z = true;
            }
        }
        C2954 c2954 = this.f15560;
        if (z) {
            if (c2954 == null) {
                c2954 = new C2954(this, this.f15573);
                this.f15560 = c2954;
            }
            ViewGroup viewGroup3 = (ViewGroup) c2954.getParent();
            if (viewGroup3 != this.f15571) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f15560);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f15571;
                C2954 c2955 = this.f15560;
                actionMenuView.getClass();
                C2862 c2862M29 = ActionMenuView.m29();
                c2862M29.f9572 = true;
                actionMenuView.addView(c2955, c2862M29);
            }
        } else if (c2954 != null) {
            Object parent = c2954.getParent();
            Object obj = this.f15571;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f15560);
            }
        }
        ((ActionMenuView) this.f15571).setOverflowReserved(this.f15552);
    }
}
