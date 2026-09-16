package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: ۦۥٗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5723 {

    /* JADX INFO: renamed from: ۥُ */
    public boolean f18835;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f18836;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5002 f18838;

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f18839;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3674 f18840;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f18841;

    /* JADX INFO: renamed from: ۦؚ */
    public InterfaceC4120 f18842;

    /* JADX INFO: renamed from: ۦٌ */
    public C2793 f18843;

    /* JADX INFO: renamed from: ۦِ */
    public C5745 f18844;

    /* JADX INFO: renamed from: ۦٛ */
    public boolean f18845;

    /* JADX INFO: renamed from: ۦۗ */
    public C3828 f18846;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f18847;

    /* JADX INFO: renamed from: ۦۚ */
    public C2793 f18848;

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f18834 = new Object();

    /* JADX INFO: renamed from: ۦۨ */
    public final CursorAnchorInfo.Builder f18850 = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: ۦ۟ */
    public final float[] f18849 = C0132.m293();

    /* JADX INFO: renamed from: ۥْ */
    public final Matrix f18837 = new Matrix();

    public C5723(C3674 c3674, C5002 c5002) {
        this.f18840 = c3674;
        this.f18838 = c5002;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01a9  */
    /* JADX INFO: renamed from: ۥۣ */
    public final void m9536() {
        C5002 c5002 = this.f18838;
        InputMethodManager inputMethodManagerM8400 = c5002.m8400();
        View view = (View) c5002.f16551;
        if (!inputMethodManagerM8400.isActive(view) || this.f18844 == null || this.f18842 == null || this.f18846 == null || this.f18843 == null || this.f18848 == null) {
            return;
        }
        float[] fArr = this.f18849;
        C0132.m294(fArr);
        InterfaceC2015 interfaceC2015 = (InterfaceC2015) this.f18840.f12279.f14244.getValue();
        if (interfaceC2015 != null) {
            if (!interfaceC2015.mo2807()) {
                interfaceC2015 = null;
            }
            if (interfaceC2015 != null) {
                interfaceC2015.mo2791(fArr);
            }
        }
        C2793 c2793 = this.f18848;
        C0132.m291(fArr, -c2793.f9343, -c2793.f9342);
        Matrix matrix = this.f18837;
        AbstractC0487.m1041(matrix, fArr);
        C5745 c5745 = this.f18844;
        InterfaceC4120 interfaceC4120 = this.f18842;
        C3828 c3828 = this.f18846;
        C2793 c2794 = this.f18843;
        C2793 c2795 = this.f18848;
        boolean z = this.f18836;
        boolean z2 = this.f18847;
        boolean z3 = this.f18839;
        boolean z4 = this.f18845;
        CursorAnchorInfo.Builder builder = this.f18850;
        builder.reset();
        builder.setMatrix(matrix);
        long j = c5745.f18943;
        C3346 c3346 = c5745.f18942;
        int iM6109 = C3346.m6109(j);
        builder.setSelectionRange(iM6109, C3346.m6108(c5745.f18943));
        if (z && iM6109 >= 0) {
            int iMo4319 = interfaceC4120.mo4319(iM6109);
            C2793 c2793M6824 = c3828.m6824(iMo4319);
            float fM7922 = AbstractC4554.m7922(c2793M6824.f9343, 0.0f, (int) (c3828.f12693 >> 32));
            boolean zM7172 = AbstractC4009.m7172(c2794, fM7922, c2793M6824.f9342);
            boolean zM7173 = AbstractC4009.m7172(c2794, fM7922, c2793M6824.f9344);
            boolean z5 = c3828.m6828(iMo4319) == 2;
            int i = (zM7172 || zM7173) ? 1 : 0;
            if (!zM7172 || !zM7173) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f = c2793M6824.f9342;
            float f2 = c2793M6824.f9344;
            builder.setInsertionMarkerLocation(fM7922, f, f2, f2, i);
        }
        if (z2) {
            int iM61010 = c3346 != null ? C3346.m6109(c3346.f11197) : -1;
            int iM6108 = c3346 != null ? C3346.m6108(c3346.f11197) : -1;
            if (iM61010 >= 0 && iM61010 < iM6108) {
                builder.setComposingText(iM61010, c5745.f18944.f4307.subSequence(iM61010, iM6108));
                int iMo43110 = interfaceC4120.mo4319(iM61010);
                int iMo43111 = interfaceC4120.mo4319(iM6108);
                float[] fArr2 = new float[(iMo43111 - iMo43110) * 4];
                c3828.f12696.m4334(AbstractC2765.m5145(iMo43110, iMo43111), fArr2);
                int i2 = iM61010;
                while (i2 < iM6108) {
                    int iMo43112 = interfaceC4120.mo4319(i2);
                    int i3 = (iMo43112 - iMo43110) * 4;
                    float f3 = fArr2[i3];
                    float f4 = fArr2[i3 + 1];
                    float f5 = fArr2[i3 + 2];
                    float f6 = fArr2[i3 + 3];
                    int i4 = iM6108;
                    int i5 = (c2794.f9343 < f5 ? 1 : 0) & (f3 < c2794.f9341 ? 1 : 0) & (c2794.f9342 < f6 ? 1 : 0) & (f4 < c2794.f9344 ? 1 : 0);
                    if (!AbstractC4009.m7172(c2794, f3, f4) || !AbstractC4009.m7172(c2794, f5, f6)) {
                        i5 |= 2;
                    }
                    int i6 = i5;
                    builder.addCharacterBounds(i2, f3, f4, f5, f6, c3828.m6828(iMo43112) == 2 ? i6 | 4 : i6);
                    i2++;
                    iM6108 = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            AbstractC2207.m4268(builder, c2795);
        }
        if (i7 >= 34 && z4 && !c2794.m5318()) {
            C2276 c2276 = c3828.f12696;
            int i8 = c2276.f7560 - 1;
            if (i8 < 0) {
                i8 = 0;
            }
            int iM7934 = AbstractC4554.m7934(c2276.m4330(c2794.f9342), 0, i8);
            int iM7935 = AbstractC4554.m7934(c2276.m4330(c2794.f9344), 0, i8);
            if (iM7934 <= iM7935) {
                while (true) {
                    builder.addVisibleLineBounds(c3828.m6825(iM7934), c2276.m4331(iM7934), c3828.m6833(iM7934), c2276.m4332(iM7934));
                    if (iM7934 == iM7935) {
                        break;
                    } else {
                        iM7934++;
                    }
                }
            }
        }
        c5002.m8400().updateCursorAnchorInfo(view, builder.build());
        this.f18835 = false;
    }
}
