package p000;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: ۥۥؓۖٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2734 {

    /* JADX INFO: renamed from: ۥُ */
    public C5837 f9049;

    /* JADX INFO: renamed from: ۥّ */
    public C3635 f9050;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5002 f9051;

    /* JADX INFO: renamed from: ۥۣ */
    public final View f9053;

    /* JADX INFO: renamed from: ۦؚ */
    public Rect f9055;

    /* JADX INFO: renamed from: ۦٌ */
    public final C5723 f9056;

    /* JADX INFO: renamed from: ۦۙ */
    public InterfaceC2509 f9060;

    /* JADX INFO: renamed from: ۥؗ */
    public InterfaceC4745 f9048 = new C4618(14);

    /* JADX INFO: renamed from: ۦؑ */
    public InterfaceC4745 f9054 = new C4618(15);

    /* JADX INFO: renamed from: ۥۜ */
    public C5745 f9052 = new C5745(C3346.f11196, "", 4);

    /* JADX INFO: renamed from: ۦٛ */
    public C2350 f9058 = C2350.f7790;

    /* JADX INFO: renamed from: ۦِ */
    public final ArrayList f9057 = new ArrayList();

    /* JADX INFO: renamed from: ۦۗ */
    public final InterfaceC5130 f9059 = AbstractC3933.m7095(3, new C0101(20, this));

    public C2734(View view, C3674 c3674, C5002 c5002) {
        this.f9053 = view;
        this.f9051 = c5002;
        this.f9056 = new C5723(c3674, c5002);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final InputConnectionC4504 m5090(EditorInfo editorInfo) {
        int i;
        int i2;
        C5745 c5745 = this.f9052;
        String str = c5745.f18944.f4307;
        long j = c5745.f18943;
        C2350 c2350 = this.f9058;
        int i3 = c2350.f7792;
        int i4 = c2350.f7796;
        boolean z = c2350.f7795;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                C1078.m2276("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        C5668 c5668 = c2350.f7793;
        if (AbstractC3831.m6874(c5668, C5668.f18644)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(AbstractC5573.m9402(c5668, 10));
            Iterator it = c5668.f18646.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0620) it.next()).f2309);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = 3;
        } else if (i4 == 5) {
            i2 = 17;
        } else if (i4 == 6) {
            i2 = 33;
        } else if (i4 == 7) {
            i2 = 129;
        } else if (i4 == 8) {
            i2 = 18;
        } else {
            if (i4 != 9) {
                C1078.m2276("Invalid Keyboard Type");
                return null;
            }
            i2 = 8194;
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 1) == 1) {
            i2 |= 131072;
            editorInfo.inputType = i2;
            if (c2350.f7792 == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((i2 & 1) == 1) {
            int i5 = c2350.f7794;
            if (i5 == 1) {
                i2 |= 4096;
                editorInfo.inputType = i2;
            } else if (i5 == 2) {
                i2 |= 8192;
                editorInfo.inputType = i2;
            } else if (i5 == 3) {
                i2 |= 16384;
                editorInfo.inputType = i2;
            }
            if (c2350.f7791) {
                editorInfo.inputType = 32768 | i2;
            }
        }
        int i6 = C3346.f11195;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        AbstractC0487.m1062(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!AbstractC2138.f7016 || i4 == 7 || i4 == 8) {
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC2174.m4225(editorInfo, false);
            }
            Bundle bundle = editorInfo.extras;
            if (bundle == null) {
                bundle = new Bundle();
                editorInfo.extras = bundle;
            }
            bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        } else {
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC2174.m4225(editorInfo, true);
            }
            Bundle bundle2 = editorInfo.extras;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                editorInfo.extras = bundle2;
            }
            bundle2.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            editorInfo.setSupportedHandwritingGestures(AbstractC2164.m4188(AbstractC1855.m3699(), AbstractC1855.m3686(), AbstractC1855.m3697(), AbstractC1855.m3696(), AbstractC1855.m3678(), AbstractC1855.m3677(), AbstractC1855.m3691()));
            editorInfo.setSupportedHandwritingGesturePreviews(AbstractC0246.m513(new Class[]{AbstractC1855.m3699(), AbstractC1855.m3686(), AbstractC1855.m3697(), AbstractC1855.m3696()}));
        }
        C3736 c3736 = AbstractC0831.f2935;
        InputConnectionC4504 inputConnectionC4504 = new InputConnectionC4504(this.f9052, new C5086(29, this), this.f9058.f7791, this.f9049, this.f9050, this.f9060);
        this.f9057.add(new WeakReference(inputConnectionC4504));
        return inputConnectionC4504;
    }
}
