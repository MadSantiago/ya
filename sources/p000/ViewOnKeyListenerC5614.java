package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦِۣؖؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC5614 extends AbstractC1875 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ۥؔ */
    public PopupWindow.OnDismissListener f18475;

    /* JADX INFO: renamed from: ۥً */
    public View f18477;

    /* JADX INFO: renamed from: ۥَ */
    public final boolean f18478;

    /* JADX INFO: renamed from: ۥْ */
    public final int f18479;

    /* JADX INFO: renamed from: ۥٓ */
    public final int f18480;

    /* JADX INFO: renamed from: ۥٕ */
    public boolean f18481;

    /* JADX INFO: renamed from: ۥٖ */
    public final Handler f18482;

    /* JADX INFO: renamed from: ۥۙ */
    public boolean f18485;

    /* JADX INFO: renamed from: ۥۧ */
    public View f18487;

    /* JADX INFO: renamed from: ۦؖ */
    public int f18488;

    /* JADX INFO: renamed from: ۦؗ */
    public boolean f18489;

    /* JADX INFO: renamed from: ۦؙ */
    public int f18490;

    /* JADX INFO: renamed from: ۦُ */
    public InterfaceC3370 f18491;

    /* JADX INFO: renamed from: ۦٖ */
    public ViewTreeObserver f18493;

    /* JADX INFO: renamed from: ۦٚ */
    public int f18495;

    /* JADX INFO: renamed from: ۦۜ */
    public boolean f18497;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Context f18498;

    /* JADX INFO: renamed from: ۦٗ */
    public final ArrayList f18494 = new ArrayList();

    /* JADX INFO: renamed from: ۦۛ */
    public final ArrayList f18496 = new ArrayList();

    /* JADX INFO: renamed from: ۥۖ */
    public final ViewTreeObserverOnGlobalLayoutListenerC2902 f18484 = new ViewTreeObserverOnGlobalLayoutListenerC2902(2, this);

    /* JADX INFO: renamed from: ۦٕ */
    public final ViewOnAttachStateChangeListenerC3944 f18492 = new ViewOnAttachStateChangeListenerC3944(1, this);

    /* JADX INFO: renamed from: ۥٙ */
    public final C4228 f18483 = new C4228(10, this);

    /* JADX INFO: renamed from: ۥؖ */
    public int f18476 = 0;

    /* JADX INFO: renamed from: ۥؓ */
    public int f18474 = 0;

    /* JADX INFO: renamed from: ۥۦ */
    public boolean f18486 = false;

    public ViewOnKeyListenerC5614(Context context, View view, int i, boolean z) {
        this.f18498 = context;
        this.f18487 = view;
        this.f18480 = i;
        this.f18478 = z;
        this.f18495 = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f18479 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f18482 = new Handler();
    }

    @Override // p000.InterfaceC0470
    public final void dismiss() {
        ArrayList arrayList = this.f18496;
        int size = arrayList.size();
        if (size > 0) {
            C5298[] c5298Arr = (C5298[]) arrayList.toArray(new C5298[size]);
            for (int i = size - 1; i >= 0; i--) {
                C5298 c5298 = c5298Arr[i];
                if (c5298.f17450.f3515.isShowing()) {
                    c5298.f17450.dismiss();
                }
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C5298 c5298;
        ArrayList arrayList = this.f18496;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c5298 = null;
                break;
            }
            c5298 = (C5298) arrayList.get(i);
            if (!c5298.f17450.f3515.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c5298 != null) {
            c5298.f17449.m8297(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p000.AbstractC1875
    /* JADX INFO: renamed from: ۥَ */
    public final void mo3727(boolean z) {
        this.f18489 = z;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥُ */
    public final void mo4534(InterfaceC3370 interfaceC3370) {
        this.f18491 = interfaceC3370;
    }

    @Override // p000.AbstractC1875
    /* JADX INFO: renamed from: ۥْ */
    public final void mo3729(int i) {
        this.f18481 = true;
        this.f18490 = i;
    }

    @Override // p000.AbstractC1875
    /* JADX INFO: renamed from: ۥٓ */
    public final void mo3730(PopupWindow.OnDismissListener onDismissListener) {
        this.f18475 = onDismissListener;
    }

    @Override // p000.AbstractC1875
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo3731(int i) {
        this.f18485 = true;
        this.f18488 = i;
    }

    @Override // p000.InterfaceC0470
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo1018() {
        ArrayList arrayList = this.f18496;
        return arrayList.size() > 0 && ((C5298) arrayList.get(0)).f17450.f3515.isShowing();
    }

    @Override // p000.InterfaceC0470
    /* JADX INFO: renamed from: ۥۜ */
    public final C1391 mo1019() {
        ArrayList arrayList = this.f18496;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C5298) arrayList.get(arrayList.size() - 1)).f17450.f3497;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo4535(MenuC4903 menuC4903, boolean z) {
        ArrayList arrayList = this.f18496;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC4903 == ((C5298) arrayList.get(i)).f17449) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C5298) arrayList.get(i2)).f17449.m8297(false);
        }
        C5298 c5298 = (C5298) arrayList.remove(i);
        MenuC4903 menuC4904 = c5298.f17449;
        C4144 c4144 = c5298.f17450;
        C2245 c2245 = c4144.f3515;
        menuC4904.m8300(this);
        if (this.f18497) {
            AbstractC1737.m3544(c2245, null);
            c2245.setAnimationStyle(0);
        }
        c4144.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f18495 = ((C5298) arrayList.get(size2 - 1)).f17448;
        } else {
            this.f18495 = this.f18487.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C5298) arrayList.get(0)).f17449.m8297(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC3370 interfaceC3370 = this.f18491;
        if (interfaceC3370 != null) {
            interfaceC3370.mo2765(menuC4903, true);
        }
        ViewTreeObserver viewTreeObserver = this.f18493;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f18493.removeGlobalOnLayoutListener(this.f18484);
            }
            this.f18493 = null;
        }
        this.f18477.removeOnAttachStateChangeListener(this.f18492);
        this.f18475.onDismiss();
    }

    @Override // p000.InterfaceC0470
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1020() {
        if (mo1018()) {
            return;
        }
        ArrayList arrayList = this.f18494;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m9461((MenuC4903) it.next());
        }
        arrayList.clear();
        View view = this.f18487;
        this.f18477 = view;
        if (view != null) {
            boolean z = this.f18493 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f18493 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f18484);
            }
            this.f18477.addOnAttachStateChangeListener(this.f18492);
        }
    }

    @Override // p000.AbstractC1875
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo3732(MenuC4903 menuC4903) {
        menuC4903.m8303(this, this.f18498);
        if (mo1018()) {
            m9461(menuC4903);
        } else {
            this.f18494.add(menuC4903);
        }
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦِ */
    public final boolean mo4536(SubMenuC4103 subMenuC4103) {
        for (C5298 c5298 : this.f18496) {
            if (subMenuC4103 == c5298.f17449) {
                c5298.f17450.f3497.requestFocus();
                return true;
            }
        }
        if (!subMenuC4103.hasVisibleItems()) {
            return false;
        }
        mo3732(subMenuC4103);
        InterfaceC3370 interfaceC3370 = this.f18491;
        if (interfaceC3370 != null) {
            interfaceC3370.mo2761(subMenuC4103);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0168  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۦٗ */
    public final void m9461(MenuC4903 menuC4903) {
        boolean z;
        char c;
        View childAt;
        C5298 c5298;
        int i;
        int i2;
        MenuItem item;
        C0789 c0789;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f18498;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C0789 c07810 = new C0789(menuC4903, layoutInflaterFrom, this.f18478, R.layout.abc_cascading_menu_item_layout);
        if (!mo1018() && this.f18486) {
            c07810.f2839 = true;
        } else if (mo1018()) {
            int size = menuC4903.f16175.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = menuC4903.getItem(i3);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i3++;
            }
            c07810.f2839 = z;
        }
        int iM3725 = AbstractC1875.m3725(c07810, context, this.f18479);
        C4144 c4144 = new C4144(context, null, this.f18480, 0);
        c4144.f13804 = this.f18483;
        c4144.f3513 = this;
        C2245 c2245 = c4144.f3515;
        c2245.setOnDismissListener(this);
        c4144.f3495 = this.f18487;
        c4144.f3494 = this.f18474;
        c4144.f3493 = true;
        c2245.setFocusable(true);
        c2245.setInputMethodMode(2);
        c4144.mo2104(c07810);
        c4144.m2105(iM3725);
        c4144.f3494 = this.f18474;
        ArrayList arrayList = this.f18496;
        if (arrayList.size() > 0) {
            c5298 = (C5298) arrayList.get(arrayList.size() - 1);
            MenuC4903 menuC4904 = c5298.f17449;
            int size2 = menuC4904.f16175.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    item = null;
                    break;
                }
                item = menuC4904.getItem(i4);
                if (item.hasSubMenu() && menuC4903 == item.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (item == null) {
                c = 0;
                childAt = null;
            } else {
                C1391 c1391 = c5298.f17450.f3497;
                ListAdapter adapter = c1391.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0789 = (C0789) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0789 = (C0789) adapter;
                    headersCount = 0;
                }
                int count = c0789.getCount();
                int i5 = 0;
                c = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (item == c0789.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                childAt = (i5 != -1 && (firstVisiblePosition = (i5 + headersCount) - c1391.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c1391.getChildCount()) ? c1391.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c = 0;
            childAt = null;
            c5298 = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = C4144.f13803;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c] = Boolean.FALSE;
                        method.invoke(c2245, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                AbstractC1147.m2401(c2245, c);
            }
            AbstractC1737.m3545(c2245, null);
            C1391 c1392 = ((C5298) arrayList.get(arrayList.size() - 1)).f17450.f3497;
            int[] iArr = new int[2];
            c1392.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f18477.getWindowVisibleDisplayFrame(rect);
            if (this.f18495 == 1) {
                if (c1392.getWidth() + iArr[0] + iM3725 > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[0] - iM3725 < 0) {
                i = 1;
            } else {
                i = 0;
            }
            boolean z2 = i == 1;
            this.f18495 = i;
            c4144.f3495 = childAt;
            if ((this.f18474 & 5) != 5) {
                i2 = 0;
                iM3725 = z2 ? childAt.getWidth() : 0 - iM3725;
            } else if (z2) {
                i2 = 0;
            } else {
                i2 = 0;
                iM3725 = 0 - childAt.getWidth();
            }
            c4144.f3500 = iM3725;
            c4144.f3501 = true;
            c4144.f3510 = true;
            c4144.m2109(i2);
        } else {
            if (this.f18481) {
                c4144.f3500 = this.f18490;
            }
            if (this.f18485) {
                c4144.m2109(this.f18488);
            }
            Rect rect2 = this.f6224;
            c4144.f3511 = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new C5298(c4144, menuC4903, this.f18495));
        c4144.mo1020();
        C1391 c1393 = c4144.f3497;
        c1393.setOnKeyListener(this);
        if (c5298 == null && this.f18489 && menuC4903.f16185 != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1393, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC4903.f16185);
            c1393.addHeaderView(frameLayout, null, false);
            c4144.mo1020();
        }
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦۗ */
    public final boolean mo4537() {
        return false;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo4538() {
        Iterator it = this.f18496.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C5298) it.next()).f17450.f3497.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0789) adapter).notifyDataSetChanged();
        }
    }

    @Override // p000.AbstractC1875
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo3734(View view) {
        if (this.f18487 != view) {
            this.f18487 = view;
            this.f18474 = Gravity.getAbsoluteGravity(this.f18476, view.getLayoutDirection());
        }
    }

    @Override // p000.AbstractC1875
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo3735(int i) {
        if (this.f18476 != i) {
            this.f18476 = i;
            this.f18474 = Gravity.getAbsoluteGravity(i, this.f18487.getLayoutDirection());
        }
    }

    @Override // p000.AbstractC1875
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo3736(boolean z) {
        this.f18486 = z;
    }
}
