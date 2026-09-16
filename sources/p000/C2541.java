package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: ۥۡؑۤؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2541 {

    /* JADX INFO: renamed from: ۥُ */
    public boolean f8470;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f8471;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2808 f8474;

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f8475;

    /* JADX INFO: renamed from: ۥۣ */
    public final ViewTreeObserverOnGlobalLayoutListenerC0850 f8476;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f8477;

    /* JADX INFO: renamed from: ۦؚ */
    public InterfaceC4120 f8478;

    /* JADX INFO: renamed from: ۦِ */
    public C5745 f8480;

    /* JADX INFO: renamed from: ۦٛ */
    public boolean f8481;

    /* JADX INFO: renamed from: ۦۗ */
    public C3828 f8482;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f8483;

    /* JADX INFO: renamed from: ۦۚ */
    public C2793 f8484;

    /* JADX INFO: renamed from: ۦۨ */
    public C2793 f8486;

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f8469 = new Object();

    /* JADX INFO: renamed from: ۦٌ */
    public InterfaceC4745 f8479 = C1931.f6379;

    /* JADX INFO: renamed from: ۦ۟ */
    public final CursorAnchorInfo.Builder f8485 = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: ۥْ */
    public final float[] f8472 = C0132.m293();

    /* JADX INFO: renamed from: ۥٓ */
    public final Matrix f8473 = new Matrix();

    public C2541(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, C2808 c2808) {
        this.f8476 = viewTreeObserverOnGlobalLayoutListenerC0850;
        this.f8474 = c2808;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x017f  */
    /* JADX INFO: renamed from: ۥۣ */
    public final void m4770() {
        C2808 c2808 = this.f8474;
        InterfaceC5130 interfaceC5130 = (InterfaceC5130) c2808.f9376;
        InputMethodManager inputMethodManager = (InputMethodManager) interfaceC5130.getValue();
        View view = (View) c2808.f9378;
        if (inputMethodManager.isActive(view)) {
            InterfaceC4745 interfaceC4745 = this.f8479;
            float[] fArr = this.f8472;
            interfaceC4745.mo211(new C0132(fArr));
            this.f8476.m1795(fArr);
            Matrix matrix = this.f8473;
            AbstractC0487.m1041(matrix, fArr);
            C5745 c5745 = this.f8480;
            InterfaceC4120 interfaceC4120 = this.f8478;
            C3828 c3828 = this.f8482;
            C2793 c2793 = this.f8484;
            C2793 c2794 = this.f8486;
            boolean z = this.f8471;
            boolean z2 = this.f8483;
            boolean z3 = this.f8475;
            boolean z4 = this.f8481;
            CursorAnchorInfo.Builder builder = this.f8485;
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
                boolean zM1930 = AbstractC0949.m1930(c2793, fM7922, c2793M6824.f9342);
                boolean zM1931 = AbstractC0949.m1930(c2793, fM7922, c2793M6824.f9344);
                boolean z5 = c3828.m6828(iMo4319) == 2;
                int i = (zM1930 || zM1931) ? 1 : 0;
                if (!zM1930 || !zM1931) {
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
                        int i5 = (c2793.f9343 < f5 ? 1 : 0) & (f3 < c2793.f9341 ? 1 : 0) & (c2793.f9342 < f6 ? 1 : 0) & (f4 < c2793.f9344 ? 1 : 0);
                        if (!AbstractC0949.m1930(c2793, f3, f4) || !AbstractC0949.m1930(c2793, f5, f6)) {
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
                AbstractC2207.m4272(builder, c2794);
            }
            if (i7 >= 34 && z4 && !c2793.m5318()) {
                C2276 c2276 = c3828.f12696;
                int i8 = c2276.f7560 - 1;
                if (i8 < 0) {
                    i8 = 0;
                }
                int iM7934 = AbstractC4554.m7934(c2276.m4330(c2793.f9342), 0, i8);
                int iM7935 = AbstractC4554.m7934(c2276.m4330(c2793.f9344), 0, i8);
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
            ((InputMethodManager) interfaceC5130.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f8470 = false;
        }
    }
}
