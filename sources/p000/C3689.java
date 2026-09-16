package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: ۦًٔۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3689 extends Spinner {

    /* JADX INFO: renamed from: ۥۖ */
    public static final int[] f12309 = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: ۥَ */
    public final boolean f12310;

    /* JADX INFO: renamed from: ۥْ */
    public final C2727 f12311;

    /* JADX INFO: renamed from: ۥٓ */
    public SpinnerAdapter f12312;

    /* JADX INFO: renamed from: ۥٖ */
    public final InterfaceC1012 f12313;

    /* JADX INFO: renamed from: ۦٗ */
    public int f12314;

    /* JADX INFO: renamed from: ۦۛ */
    public final Rect f12315;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Context f12316;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2186 f12317;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public C3689(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, ru.bluecat.yandexmapspatcher.R.attr.spinnerStyle);
        this.f12315 = new Rect();
        AbstractC5216.m8834(this, getContext());
        int[] iArr = AbstractC5618.f18526;
        C5460 c5460M9119 = C5460.m9119(context, attributeSet, iArr, ru.bluecat.yandexmapspatcher.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) c5460M9119.f17999;
        this.f12317 = new C2186(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f12316 = new C5260(context, resourceId);
        } else {
            this.f12316 = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12309, ru.bluecat.yandexmapspatcher.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Throwable th) {
                    th = th;
                    typedArray2 = typedArrayObtainStyledAttributes;
                    if (typedArray2 != null) {
                        typedArray2.recycle();
                    }
                    throw th;
                }
            } catch (Exception e) {
                e = e;
                Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i != 0) {
                    DialogInterfaceOnClickListenerC2447 dialogInterfaceOnClickListenerC2447 = new DialogInterfaceOnClickListenerC2447(this);
                    this.f12313 = dialogInterfaceOnClickListenerC2447;
                    dialogInterfaceOnClickListenerC2447.f8148 = typedArray.getString(2);
                } else if (i == 1) {
                    C3337 c3337 = new C3337(this, this.f12316, attributeSet);
                    C5460 c5460M91110 = C5460.m9119(this.f12316, attributeSet, iArr, ru.bluecat.yandexmapspatcher.R.attr.spinnerStyle);
                    this.f12314 = ((TypedArray) c5460M91110.f17999).getLayoutDimension(3, -2);
                    c3337.m2108(c5460M91110.m9123(1));
                    c3337.f11163 = typedArray.getString(2);
                    c5460M91110.m9126();
                    this.f12313 = c3337;
                    this.f12311 = new C2727(this, this, c3337);
                }
                textArray = typedArray.getTextArray(0);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter.setDropDownViewResource(ru.bluecat.yandexmapspatcher.R.layout.support_simple_spinner_dropdown_item);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                c5460M9119.m9126();
                this.f12310 = true;
                spinnerAdapter = this.f12312;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f12312 = null;
                }
                this.f12317.m4251(attributeSet, ru.bluecat.yandexmapspatcher.R.attr.spinnerStyle);
            }
        } catch (Exception e2) {
            e = e2;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            DialogInterfaceOnClickListenerC2447 dialogInterfaceOnClickListenerC2448 = new DialogInterfaceOnClickListenerC2447(this);
            this.f12313 = dialogInterfaceOnClickListenerC2448;
            dialogInterfaceOnClickListenerC2448.f8148 = typedArray.getString(2);
        } else if (i == 1) {
            C3337 c3338 = new C3337(this, this.f12316, attributeSet);
            C5460 c5460M91111 = C5460.m9119(this.f12316, attributeSet, iArr, ru.bluecat.yandexmapspatcher.R.attr.spinnerStyle);
            this.f12314 = ((TypedArray) c5460M91111.f17999).getLayoutDimension(3, -2);
            c3338.m2108(c5460M91111.m9123(1));
            c3338.f11163 = typedArray.getString(2);
            c5460M91111.m9126();
            this.f12313 = c3338;
            this.f12311 = new C2727(this, this, c3338);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(ru.bluecat.yandexmapspatcher.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        c5460M9119.m9126();
        this.f12310 = true;
        spinnerAdapter = this.f12312;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f12312 = null;
        }
        this.f12317.m4251(attributeSet, ru.bluecat.yandexmapspatcher.R.attr.spinnerStyle);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2186 c2186 = this.f12317;
        if (c2186 != null) {
            c2186.m4253();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1012 interfaceC1012 = this.f12313;
        return interfaceC1012 != null ? interfaceC1012.mo2221() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1012 interfaceC1012 = this.f12313;
        return interfaceC1012 != null ? interfaceC1012.mo2231() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f12313 != null ? this.f12314 : super.getDropDownWidth();
    }

    public final InterfaceC1012 getInternalPopup() {
        return this.f12313;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1012 interfaceC1012 = this.f12313;
        return interfaceC1012 != null ? interfaceC1012.mo2222() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f12316;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1012 interfaceC1012 = this.f12313;
        return interfaceC1012 != null ? interfaceC1012.mo2230() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2186 c2186 = this.f12317;
        if (c2186 != null) {
            return c2186.m4252();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2186 c2186 = this.f12317;
        if (c2186 != null) {
            return c2186.m4254();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1012 interfaceC1012 = this.f12313;
        if (interfaceC1012 == null || !interfaceC1012.mo2223()) {
            return;
        }
        interfaceC1012.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f12313 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m6544(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C3244 c3244 = (C3244) parcelable;
        super.onRestoreInstanceState(c3244.getSuperState());
        if (!c3244.f10887 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC2902(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C3244 c3244 = new C3244(super.onSaveInstanceState());
        InterfaceC1012 interfaceC1012 = this.f12313;
        c3244.f10887 = interfaceC1012 != null && interfaceC1012.mo2223();
        return c3244;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2727 c2727 = this.f12311;
        if (c2727 == null || !c2727.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC1012 interfaceC1012 = this.f12313;
        if (interfaceC1012 == null) {
            return super.performClick();
        }
        if (interfaceC1012.mo2223()) {
            return true;
        }
        interfaceC1012.mo2229(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f12310) {
            this.f12312 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC1012 interfaceC1012 = this.f12313;
        if (interfaceC1012 != null) {
            Context context = this.f12316;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C5316 c5316 = new C5316();
            c5316.f17503 = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c5316.f17502 = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC5323.m8928((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC1012.mo2104(c5316);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2186 c2186 = this.f12317;
        if (c2186 != null) {
            c2186.m4258();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2186 c2186 = this.f12317;
        if (c2186 != null) {
            c2186.m4257(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC1012 interfaceC1012 = this.f12313;
        if (interfaceC1012 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC1012.mo2224(i);
            interfaceC1012.mo2225(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC1012 interfaceC1012 = this.f12313;
        if (interfaceC1012 != null) {
            interfaceC1012.mo2227(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f12313 != null) {
            this.f12314 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1012 interfaceC1012 = this.f12313;
        if (interfaceC1012 != null) {
            interfaceC1012.mo2226(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC4225.m7464(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1012 interfaceC1012 = this.f12313;
        if (interfaceC1012 != null) {
            interfaceC1012.mo2228(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2186 c2186 = this.f12317;
        if (c2186 != null) {
            c2186.m4244(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2186 c2186 = this.f12317;
        if (c2186 != null) {
            c2186.m4240(mode);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m6544(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f12315;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }
}
