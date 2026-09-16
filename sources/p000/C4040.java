package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: renamed from: ۦّؕۥٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4040 implements InterfaceC3388 {

    /* JADX INFO: renamed from: ۥؗ */
    public AbstractC4225 f13468;

    /* JADX INFO: renamed from: ۥُ */
    public InterfaceC3163 f13469;

    /* JADX INFO: renamed from: ۥّ */
    public InterfaceC3163 f13470;

    /* JADX INFO: renamed from: ۥۗ */
    public AbstractC4225 f13471;

    /* JADX INFO: renamed from: ۥۜ */
    public InterfaceC3163 f13472;

    /* JADX INFO: renamed from: ۥۣ */
    public AbstractC4225 f13473;

    /* JADX INFO: renamed from: ۦؑ */
    public AbstractC4225 f13474;

    /* JADX INFO: renamed from: ۦؚ */
    public C1298 f13475;

    /* JADX INFO: renamed from: ۦِ */
    public C1298 f13476;

    /* JADX INFO: renamed from: ۦٛ */
    public C1298 f13477;

    /* JADX INFO: renamed from: ۦۗ */
    public C1298 f13478;

    /* JADX INFO: renamed from: ۦۙ */
    public InterfaceC3163 f13479;

    /* JADX INFO: renamed from: ۥُ */
    public static C5892 m7236(Context context, AttributeSet attributeSet, int i, int i2) {
        C0074 c0074 = new C0074(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0980.f3458, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return m7237(contextThemeWrapper.obtainStyledAttributes(AbstractC0980.f3464), c0074);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static C5892 m7237(TypedArray typedArray, C0074 c0074) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            InterfaceC3163 interfaceC3163M7238 = m7238(typedArray, 5, c0074);
            InterfaceC3163 interfaceC3163M7239 = m7238(typedArray, 8, interfaceC3163M7238);
            InterfaceC3163 interfaceC3163M72310 = m7238(typedArray, 9, interfaceC3163M7238);
            InterfaceC3163 interfaceC3163M72311 = m7238(typedArray, 7, interfaceC3163M7238);
            InterfaceC3163 interfaceC3163M72312 = m7238(typedArray, 6, interfaceC3163M7238);
            C5892 c5892 = new C5892();
            c5892.f19433 = AbstractC5568.m9358(i2);
            c5892.f19429 = interfaceC3163M7239;
            c5892.f19431 = AbstractC5568.m9358(i3);
            c5892.f19430 = interfaceC3163M72310;
            c5892.f19428 = AbstractC5568.m9358(i4);
            c5892.f19439 = interfaceC3163M72311;
            c5892.f19434 = AbstractC5568.m9358(i5);
            c5892.f19432 = interfaceC3163M72312;
            return c5892;
        } finally {
            typedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static InterfaceC3163 m7238(TypedArray typedArray, int i, InterfaceC3163 interfaceC3163) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new C0074(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new C4939(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC3163;
    }

    public final String toString() {
        return "[" + this.f13469 + ", " + this.f13470 + ", " + this.f13479 + ", " + this.f13472 + "]";
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean m7239(RectF rectF) {
        boolean z = this.f13475.getClass().equals(C1298.class) && this.f13476.getClass().equals(C1298.class) && this.f13477.getClass().equals(C1298.class) && this.f13478.getClass().equals(C1298.class);
        float fMo5840 = this.f13469.mo5840(rectF);
        return z && ((this.f13470.mo5840(rectF) > fMo5840 ? 1 : (this.f13470.mo5840(rectF) == fMo5840 ? 0 : -1)) == 0 && (this.f13472.mo5840(rectF) > fMo5840 ? 1 : (this.f13472.mo5840(rectF) == fMo5840 ? 0 : -1)) == 0 && (this.f13479.mo5840(rectF) > fMo5840 ? 1 : (this.f13479.mo5840(rectF) == fMo5840 ? 0 : -1)) == 0) && (this.f13471 instanceof C4928) && (this.f13473 instanceof C4928) && (this.f13468 instanceof C4928) && (this.f13474 instanceof C4928);
    }

    @Override // p000.InterfaceC3388
    /* JADX INFO: renamed from: ۥۣ */
    public final C4040 mo5484(float f) {
        C5892 c5892M7240 = m7240();
        c5892M7240.f19429 = new C0074(f);
        c5892M7240.f19430 = new C0074(f);
        c5892M7240.f19439 = new C0074(f);
        c5892M7240.f19432 = new C0074(f);
        return c5892M7240.m9723();
    }

    @Override // p000.InterfaceC3388
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean mo5485() {
        return false;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final C5892 m7240() {
        C5892 c5892 = new C5892();
        c5892.f19433 = this.f13473;
        c5892.f19431 = this.f13471;
        c5892.f19428 = this.f13468;
        c5892.f19434 = this.f13474;
        c5892.f19429 = this.f13469;
        c5892.f19430 = this.f13470;
        c5892.f19439 = this.f13479;
        c5892.f19432 = this.f13472;
        c5892.f19437 = this.f13477;
        c5892.f19436 = this.f13476;
        c5892.f19438 = this.f13478;
        c5892.f19435 = this.f13475;
        return c5892;
    }

    @Override // p000.InterfaceC3388
    /* JADX INFO: renamed from: ۥؗ */
    public final C4040 mo5482() {
        return this;
    }

    @Override // p000.InterfaceC3388
    /* JADX INFO: renamed from: ۥۗ */
    public final C4040 mo5483(int[] iArr) {
        return this;
    }
}
