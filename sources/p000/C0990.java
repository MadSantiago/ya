package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۥَؑٝؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C0990 implements InterfaceC0470 {

    /* JADX INFO: renamed from: ۥ٘ */
    public static final Method f3490;

    /* JADX INFO: renamed from: ۦۣ */
    public static final Method f3491;

    /* JADX INFO: renamed from: ۥؔ */
    public boolean f3493;

    /* JADX INFO: renamed from: ۥً */
    public View f3495;

    /* JADX INFO: renamed from: ۥْ */
    public C1391 f3497;

    /* JADX INFO: renamed from: ۥٕ */
    public AdapterView.OnItemSelectedListener f3499;

    /* JADX INFO: renamed from: ۥٖ */
    public int f3500;

    /* JADX INFO: renamed from: ۥٙ */
    public boolean f3501;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f3502;

    /* JADX INFO: renamed from: ۥۧ */
    public C4459 f3505;

    /* JADX INFO: renamed from: ۦؗ */
    public final Handler f3507;

    /* JADX INFO: renamed from: ۦٕ */
    public boolean f3510;

    /* JADX INFO: renamed from: ۦٖ */
    public Rect f3511;

    /* JADX INFO: renamed from: ۦٗ */
    public int f3512;

    /* JADX INFO: renamed from: ۦٚ */
    public AdapterView.OnItemClickListener f3513;

    /* JADX INFO: renamed from: ۦۜ */
    public final C2245 f3515;

    /* JADX INFO: renamed from: ۦ۟ */
    public ListAdapter f3516;

    /* JADX INFO: renamed from: ۦۨ */
    public final Context f3517;

    /* JADX INFO: renamed from: ۥٓ */
    public final int f3498 = -2;

    /* JADX INFO: renamed from: ۥَ */
    public int f3496 = -2;

    /* JADX INFO: renamed from: ۦۛ */
    public final int f3514 = 1002;

    /* JADX INFO: renamed from: ۥؖ */
    public int f3494 = 0;

    /* JADX INFO: renamed from: ۥؓ */
    public final int f3492 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۥۙ */
    public final RunnableC4307 f3503 = new RunnableC4307(this, 1);

    /* JADX INFO: renamed from: ۦؙ */
    public final ViewOnTouchListenerC2602 f3508 = new ViewOnTouchListenerC2602(this);

    /* JADX INFO: renamed from: ۦؖ */
    public final C5750 f3506 = new C5750(this);

    /* JADX INFO: renamed from: ۥۦ */
    public final RunnableC4307 f3504 = new RunnableC4307(this, 0);

    /* JADX INFO: renamed from: ۦُ */
    public final Rect f3509 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f3491 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3490 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C0990(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f3517 = context;
        this.f3507 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5618.f18533, i, 0);
        this.f3500 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f3512 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f3502 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C2245 c2245 = new C2245(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC5618.f18510, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c2245.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c2245.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC4225.m7464(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f3515 = c2245;
        c2245.setInputMethodMode(1);
    }

    @Override // p000.InterfaceC0470
    public final void dismiss() {
        C2245 c2245 = this.f3515;
        c2245.dismiss();
        c2245.setContentView(null);
        this.f3497 = null;
        this.f3507.removeCallbacks(this.f3503);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final int m2102() {
        return this.f3500;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final Drawable m2103() {
        return this.f3515.getBackground();
    }

    /* JADX INFO: renamed from: ۥْ */
    public void mo2104(ListAdapter listAdapter) {
        C4459 c4459 = this.f3505;
        if (c4459 == null) {
            this.f3505 = new C4459(this);
        } else {
            ListAdapter listAdapter2 = this.f3516;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c4459);
            }
        }
        this.f3516 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3505);
        }
        C1391 c1391 = this.f3497;
        if (c1391 != null) {
            c1391.setAdapter(this.f3516);
        }
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m2105(int i) {
        Drawable background = this.f3515.getBackground();
        if (background == null) {
            this.f3496 = i;
            return;
        }
        Rect rect = this.f3509;
        background.getPadding(rect);
        this.f3496 = rect.left + rect.right + i;
    }

    @Override // p000.InterfaceC0470
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo1018() {
        return this.f3515.isShowing();
    }

    @Override // p000.InterfaceC0470
    /* JADX INFO: renamed from: ۥۜ */
    public final C1391 mo1019() {
        return this.f3497;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public C1391 mo2106(Context context, boolean z) {
        return new C1391(context, z);
    }

    @Override // p000.InterfaceC0470
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1020() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        C1391 c1391;
        C1391 c1392 = this.f3497;
        Context context = this.f3517;
        C2245 c2245 = this.f3515;
        if (c1392 == null) {
            C1391 c1391Mo2106 = mo2106(context, !this.f3493);
            this.f3497 = c1391Mo2106;
            c1391Mo2106.setAdapter(this.f3516);
            this.f3497.setOnItemClickListener(this.f3513);
            this.f3497.setFocusable(true);
            this.f3497.setFocusableInTouchMode(true);
            this.f3497.setOnItemSelectedListener(new C3348(this));
            this.f3497.setOnScrollListener(this.f3506);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f3499;
            if (onItemSelectedListener != null) {
                this.f3497.setOnItemSelectedListener(onItemSelectedListener);
            }
            c2245.setContentView(this.f3497);
        }
        Drawable background = c2245.getBackground();
        Rect rect = this.f3509;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f3502) {
                this.f3512 = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM9542 = AbstractC5737.m9542(c2245, this.f3495, this.f3512, c2245.getInputMethodMode() == 2);
        int i3 = this.f3498;
        if (i3 == -1) {
            paddingBottom = iM9542 + i;
        } else {
            int i4 = this.f3496;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iM2953 = this.f3497.m2953(iMakeMeasureSpec, iM9542);
            paddingBottom = iM2953 + (iM2953 > 0 ? this.f3497.getPaddingBottom() + this.f3497.getPaddingTop() + i : 0);
        }
        boolean z = c2245.getInputMethodMode() == 2;
        c2245.setWindowLayoutType(this.f3514);
        if (c2245.isShowing()) {
            if (this.f3495.isAttachedToWindow()) {
                int width = this.f3496;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f3495.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.f3496;
                    if (z) {
                        c2245.setWidth(i5 == -1 ? -1 : 0);
                        c2245.setHeight(0);
                    } else {
                        c2245.setWidth(i5 == -1 ? -1 : 0);
                        c2245.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c2245.setOutsideTouchable(true);
                int i6 = width;
                View view = this.f3495;
                int i7 = this.f3500;
                int i8 = this.f3512;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                c2245.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.f3496;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f3495.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c2245.setWidth(width2);
        c2245.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3491;
            if (method != null) {
                try {
                    method.invoke(c2245, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC2078.m4022(c2245, true);
        }
        c2245.setOutsideTouchable(true);
        c2245.setTouchInterceptor(this.f3508);
        if (this.f3501) {
            c2245.setOverlapAnchor(this.f3510);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f3490;
            if (method2 != null) {
                try {
                    method2.invoke(c2245, this.f3511);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC2078.m4023(c2245, this.f3511);
        }
        c2245.showAsDropDown(this.f3495, this.f3500, this.f3512, this.f3494);
        this.f3497.setSelection(-1);
        if ((!this.f3493 || this.f3497.isInTouchMode()) && (c1391 = this.f3497) != null) {
            c1391.setListSelectionHidden(true);
            c1391.requestLayout();
        }
        if (this.f3493) {
            return;
        }
        this.f3507.post(this.f3504);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m2107(int i) {
        this.f3500 = i;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m2108(Drawable drawable) {
        this.f3515.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m2109(int i) {
        this.f3512 = i;
        this.f3502 = true;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final int m2110() {
        if (this.f3502) {
            return this.f3512;
        }
        return 0;
    }
}
