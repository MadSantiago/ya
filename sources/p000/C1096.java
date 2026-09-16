package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥِؓٔٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1096 {

    /* JADX INFO: renamed from: ۥؗ */
    public C3312 f3844;

    /* JADX INFO: renamed from: ۥَ */
    public boolean f3845;

    /* JADX INFO: renamed from: ۥُ */
    public int f3846;

    /* JADX INFO: renamed from: ۥّ */
    public int f3847;

    /* JADX INFO: renamed from: ۥۗ */
    public InterfaceC3388 f3851;

    /* JADX INFO: renamed from: ۥۜ */
    public int f3852;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0324 f3853;

    /* JADX INFO: renamed from: ۦؑ */
    public C5322 f3854;

    /* JADX INFO: renamed from: ۦؚ */
    public ColorStateList f3855;

    /* JADX INFO: renamed from: ۦٌ */
    public ColorStateList f3856;

    /* JADX INFO: renamed from: ۦِ */
    public int f3857;

    /* JADX INFO: renamed from: ۦٗ */
    public RippleDrawable f3858;

    /* JADX INFO: renamed from: ۦٛ */
    public int f3859;

    /* JADX INFO: renamed from: ۦۗ */
    public PorterDuff.Mode f3860;

    /* JADX INFO: renamed from: ۦۙ */
    public int f3861;

    /* JADX INFO: renamed from: ۦۚ */
    public ColorStateList f3862;

    /* JADX INFO: renamed from: ۦۛ */
    public int f3863;

    /* JADX INFO: renamed from: ۦۨ */
    public C3472 f3865;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f3864 = false;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f3848 = false;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f3849 = false;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f3850 = true;

    public C1096(C0324 c0324, InterfaceC3388 interfaceC3388) {
        this.f3853 = c0324;
        this.f3851 = interfaceC3388;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0125  */
    /* JADX WARN: Code duplicated, block: B:47:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x0131  */
    /* JADX WARN: Code duplicated, block: B:53:0x013d A[LOOP:0: B:48:0x012b->B:53:0x013d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0140 A[EDGE_INSN: B:54:0x0140->B:55:0x0141 BREAK  A[LOOP:0: B:48:0x012b->B:53:0x013d]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0139 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥؗ */
    public final void m2318() {
        FocusRingDrawable focusRingDrawable;
        LayerDrawable layerDrawable;
        Drawable drawable;
        C3472 c3472 = new C3472(this.f3851);
        C3312 c3312 = this.f3844;
        if (c3312 != null) {
            c3472.m6271(c3312);
        }
        C5322 c5322 = this.f3854;
        if (c5322 != null) {
            c3472.f11534 = c5322;
        }
        C0324 c0324 = this.f3853;
        Context context = c0324.getContext();
        c3472.f11547.f14831 = new C1104(context);
        c3472.m6276();
        c3472.setTintList(this.f3855);
        PorterDuff.Mode mode = this.f3860;
        if (mode != null) {
            c3472.setTintMode(mode);
        }
        float f = this.f3857;
        ColorStateList colorStateList = this.f3856;
        c3472.f11547.f14837 = f;
        c3472.invalidateSelf();
        C4488 c4488 = c3472.f11547;
        if (c4488.f14834 != colorStateList) {
            c4488.f14834 = colorStateList;
            c3472.onStateChange(c3472.getState());
        }
        C3472 c3473 = new C3472(this.f3851);
        C3312 c3313 = this.f3844;
        if (c3313 != null) {
            c3473.m6271(c3313);
        }
        int i = 0;
        c3473.setTint(0);
        float f2 = this.f3857;
        int iM4191 = this.f3864 ? AbstractC2164.m4191(c0324, R.attr.colorSurface) : 0;
        c3473.f11547.f14837 = f2;
        c3473.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM4191);
        C4488 c4489 = c3473.f11547;
        if (c4489.f14834 != colorStateListValueOf) {
            c4489.f14834 = colorStateListValueOf;
            c3473.onStateChange(c3473.getState());
        }
        C3472 c3474 = new C3472(this.f3851);
        this.f3865 = c3474;
        C3312 c3314 = this.f3844;
        if (c3314 != null) {
            c3474.m6271(c3314);
        }
        this.f3865.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC1087.m2296(this.f3862), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c3473, c3472}), this.f3846, this.f3861, this.f3847, this.f3852), this.f3865);
        this.f3858 = rippleDrawable;
        ColorDrawable colorDrawable = FocusRingDrawable.f326;
        if (AbstractC2776.m5219(context.getTheme(), R.attr.focusRingsEnabled, false)) {
            FocusRingDrawable focusRingDrawable2 = new FocusRingDrawable(context, FocusRingDrawable.f326);
            rippleDrawable.addLayer(focusRingDrawable2);
            focusRingDrawable2.setCallback(rippleDrawable);
        }
        c0324.setInternalBackground(this.f3858);
        C3472 c3472M2321 = m2321(false);
        if (c3472M2321 != null) {
            float f3 = this.f3863;
            C4488 c44810 = c3472M2321.f11547;
            if (c44810.f14836 != f3) {
                c44810.f14836 = f3;
                c3472M2321.m6276();
            }
            c3472M2321.setState(c0324.getDrawableState());
        }
        Drawable background = c0324.getBackground();
        if (!(background instanceof FocusRingDrawable)) {
            if (!(background instanceof DrawableWrapper)) {
                if (background instanceof LayerDrawable) {
                    focusRingDrawable = null;
                    break;
                }
                layerDrawable = (LayerDrawable) background;
                while (true) {
                    if (i < layerDrawable.getNumberOfLayers()) {
                        focusRingDrawable = null;
                        break;
                    }
                    drawable = layerDrawable.getDrawable(i);
                    if (drawable instanceof FocusRingDrawable) {
                        focusRingDrawable = (FocusRingDrawable) drawable;
                        break;
                    }
                    i++;
                }
            } else {
                Drawable drawable2 = ((DrawableWrapper) background).getDrawable();
                if (!(drawable2 instanceof FocusRingDrawable)) {
                    if (background instanceof LayerDrawable) {
                        focusRingDrawable = null;
                        break;
                    }
                    layerDrawable = (LayerDrawable) background;
                    while (true) {
                        if (i < layerDrawable.getNumberOfLayers()) {
                            focusRingDrawable = null;
                            break;
                        }
                        drawable = layerDrawable.getDrawable(i);
                        if (drawable instanceof FocusRingDrawable) {
                            focusRingDrawable = (FocusRingDrawable) drawable;
                            break;
                        }
                        i++;
                    }
                } else {
                    focusRingDrawable = (FocusRingDrawable) drawable2;
                }
            }
        } else {
            focusRingDrawable = (FocusRingDrawable) background;
        }
        if (focusRingDrawable != null) {
            focusRingDrawable.f339 = new WeakReference(c3472M2321);
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m2319() {
        C3472 c3472M2321 = m2321(false);
        C3472 c3472M2322 = m2321(true);
        if (c3472M2321 != null) {
            float f = this.f3857;
            ColorStateList colorStateList = this.f3856;
            c3472M2321.f11547.f14837 = f;
            c3472M2321.invalidateSelf();
            C4488 c4488 = c3472M2321.f11547;
            if (c4488.f14834 != colorStateList) {
                c4488.f14834 = colorStateList;
                c3472M2321.onStateChange(c3472M2321.getState());
            }
            if (c3472M2322 != null) {
                float f2 = this.f3857;
                int iM4191 = this.f3864 ? AbstractC2164.m4191(this.f3853, R.attr.colorSurface) : 0;
                c3472M2322.f11547.f14837 = f2;
                c3472M2322.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM4191);
                C4488 c4489 = c3472M2322.f11547;
                if (c4489.f14834 != colorStateListValueOf) {
                    c4489.f14834 = colorStateListValueOf;
                    c3472M2322.onStateChange(c3472M2322.getState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m2320(int i, int i2, int i3, int i4) {
        C0324 c0324 = this.f3853;
        int paddingStart = c0324.getPaddingStart();
        int paddingTop = c0324.getPaddingTop();
        int paddingEnd = c0324.getPaddingEnd();
        int paddingBottom = c0324.getPaddingBottom();
        int i5 = this.f3846;
        int i6 = this.f3861;
        int i7 = this.f3847;
        int i8 = this.f3852;
        this.f3846 = i;
        this.f3861 = i2;
        this.f3847 = i3;
        this.f3852 = i4;
        if (!this.f3848) {
            m2318();
        }
        c0324.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C3472 m2321(boolean z) {
        RippleDrawable rippleDrawable = this.f3858;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C3472) ((LayerDrawable) ((InsetDrawable) this.f3858.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX INFO: renamed from: ۦؑ */
    public final void m2322() {
        InterfaceC3863 interfaceC3863;
        C3472 c3472M2321 = m2321(false);
        if (c3472M2321 != null) {
            c3472M2321.m6273(this.f3851);
            C3312 c3312 = this.f3844;
            if (c3312 != null) {
                c3472M2321.m6271(c3312);
            }
        }
        C3472 c3472M2322 = m2321(true);
        if (c3472M2322 != null) {
            c3472M2322.m6273(this.f3851);
            C3312 c3313 = this.f3844;
            if (c3313 != null) {
                c3472M2322.m6271(c3313);
            }
        }
        RippleDrawable rippleDrawable = this.f3858;
        if (rippleDrawable != null) {
            Object objFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (objFindDrawableByLayerId instanceof InterfaceC3863) {
                interfaceC3863 = (InterfaceC3863) objFindDrawableByLayerId;
            } else {
                interfaceC3863 = null;
            }
        } else {
            interfaceC3863 = null;
        }
        if (interfaceC3863 != null) {
            boolean z = interfaceC3863 instanceof C3472;
            InterfaceC3388 interfaceC3388 = this.f3851;
            if (!z) {
                interfaceC3863.setShapeAppearanceModel(interfaceC3388.mo5482());
                return;
            }
            C3472 c3472 = (C3472) interfaceC3863;
            c3472.m6273(interfaceC3388);
            C3312 c3314 = this.f3844;
            if (c3314 != null) {
                c3472.m6271(c3314);
            }
        }
    }
}
