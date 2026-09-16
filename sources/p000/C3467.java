package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* JADX INFO: renamed from: ۦؘؑۗۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3467 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f11501;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f11502;

    /* JADX INFO: renamed from: ۥّ */
    public final Object f11503;

    /* JADX INFO: renamed from: ۥۗ */
    public Object f11504;

    /* JADX INFO: renamed from: ۥۣ */
    public Object f11505;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f11506;

    public C3467(AbstractC2266 abstractC2266, Object obj, boolean z, InterfaceC0241 interfaceC0241, boolean z2) {
        this.f11503 = abstractC2266;
        this.f11501 = z;
        this.f11505 = interfaceC0241;
        this.f11506 = z2;
        this.f11504 = obj;
        this.f11502 = true;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public Object m6243() {
        if (this.f11501) {
            return null;
        }
        Object obj = this.f11504;
        if (obj != null) {
            return obj;
        }
        AbstractC5508.m9200("Unexpected form of a provided value");
        C1078.m2274();
        return null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m6244() {
        C2839 c2839 = (C2839) this.f11503;
        Drawable checkMarkDrawable = c2839.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f11501 || this.f11506) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f11501) {
                    drawableMutate.setTintList((ColorStateList) this.f11505);
                }
                if (this.f11506) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f11504);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c2839.getDrawableState());
                }
                c2839.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m6245() {
        CompoundButton compoundButton = (CompoundButton) this.f11503;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f11501 || this.f11506) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f11501) {
                    drawableMutate.setTintList((ColorStateList) this.f11505);
                }
                if (this.f11506) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f11504);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void m6246(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f11503;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC5618.f18523;
        C5460 c5460M9119 = C5460.m9119(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c5460M9119.f17999;
        AbstractC3608.m6435(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c5460M9119.f17999, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC4225.m7464(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AbstractC4225.m7464(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC4225.m7464(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(c5460M9119.m9120(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC3522.m6315(typedArray.getInt(3, -1), null));
            }
        } finally {
            c5460M9119.m9126();
        }
    }

    public /* synthetic */ C3467(TextView textView) {
        this.f11505 = null;
        this.f11504 = null;
        this.f11501 = false;
        this.f11506 = false;
        this.f11503 = textView;
    }
}
