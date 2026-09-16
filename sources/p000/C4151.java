package p000;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۦٔؑؒؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4151 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C3564 f13832;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ String f13833;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ int f13834;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ long f13835;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5433 f13836;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4151(C5433 c5433, String str, int i, C3564 c3564, long j) {
        super(1);
        this.f13836 = c5433;
        this.f13833 = str;
        this.f13834 = i;
        this.f13832 = c3564;
        this.f13835 = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, android.widget.TextView, ۥۘؑٞ, ۦٍُؑۙ] */
    /* JADX WARN: Type inference failed for: r3v27, types: [ۦۤ] */
    /* JADX WARN: Type inference failed for: r4v19, types: [int] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v8, types: [ۦۤ] */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        ?? r1 = (C2139) obj;
        C3564 c3564 = this.f13832;
        long jM6359 = c3564.m6359();
        C0477 c0477 = c3564.f11802;
        C0553 c0553 = c3564.f11803;
        if (jM6359 == C1327.f4591) {
            jM6359 = this.f13835;
        }
        r1.setTextColor(AbstractC4225.m7470(jM6359));
        long j = c0553.f1987;
        C5827 c5827 = c0553.f1990;
        C1626 c1626 = c0553.f1984;
        AbstractC0903 abstractC0903 = c0553.f1986;
        r1.setTextSize(2, C5023.m8438(j));
        long j2 = c0477.f1731;
        if ((1095216660480L & j2) == 4294967296L) {
            AbstractC4554.m7905(r1, (int) TypedValue.applyDimension(2, C5023.m8438(j2), r1.getContext().getResources().getDisplayMetrics()));
        }
        if (AbstractC3831.m6874(c0553.f1992, C1690.f5636)) {
            r1.setPaintFlags(16);
        }
        int i = c0477.f1736;
        int i2 = 8388611;
        if (i != 1 && i != 5) {
            if (i == 2 || i == 6) {
                i2 = 8388613;
            } else if (i == 3) {
                i2 = 1;
            }
        }
        r1.setGravity(i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29 && i == 4) {
            r1.setJustificationMode(1);
        }
        int i4 = 0;
        if (abstractC0903 != null) {
            C1226 c1226M1931 = AbstractC0949.m1931(r1.getContext());
            C1626 c1627 = c1626 == null ? C1626.f5439 : c1626;
            int i5 = c5827 != null ? c5827.f19197 : 0;
            C2848 c2848 = c0553.f1985;
            r1.setTypeface((Typeface) c1226M1931.m2590(abstractC0903, c1627, i5, c2848 != null ? c2848.f9512 : 65535).f16042);
        }
        if (c5827 != null) {
            r1.setTypeface(r1.getTypeface(), c5827.f19197 != 1 ? 0 : 2);
        }
        if (c1626 != null) {
            if (i3 >= 28) {
                r1.setTypeface(Typeface.create(r1.getTypeface(), c1626.f5444, false));
            } else {
                r1.setTypeface(r1.getTypeface(), c1626.equals(C1626.f5442) ? true : c1626.equals(C1626.f5441) ? 1 : c1626.equals(C1626.f5438));
            }
        }
        C5433 c5433 = this.f13836;
        List list = c5433.f17925;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC0097) it.next()).getClass();
        }
        C1489 c1489 = c5433.f17927;
        String str = this.f13833;
        if (str == null) {
            C0178.m387("input must not be null");
            return null;
        }
        C1753 c1753 = new C1753((ArrayList) c1489.f5059, (C3223) c1489.f5058, (ArrayList) c1489.f5057);
        while (true) {
            int length = str.length();
            int i6 = i4;
            while (true) {
                if (i6 >= length) {
                    i6 = -1;
                    break;
                }
                char cCharAt = str.charAt(i6);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
                i6++;
            }
            if (i6 == -1) {
                break;
            }
            c1753.m3558(str.substring(i4, i6));
            int i7 = i6 + 1;
            i4 = (i7 < str.length() && str.charAt(i6) == '\r' && str.charAt(i7) == '\n') ? i6 + 2 : i7;
        }
        if (str.length() > 0 && (i4 == 0 || i4 < str.length())) {
            c1753.m3558(str.substring(i4));
        }
        c1753.m3552(c1753.f5841);
        C3369 c3369 = new C3369(1, c1753.f5839, c1753.f5836);
        c1753.f5837.getClass();
        C5049 c5049 = new C5049(c3369);
        Iterator it2 = c1753.f5842.iterator();
        while (it2.hasNext()) {
            ((AbstractC0027) it2.next()).mo3385(c5049);
        }
        C3401 c3401 = (C3401) c1753.f5835.f13056;
        Iterator it3 = ((ArrayList) c1489.f5056).iterator();
        while (it3.hasNext()) {
            ((C3172) it3.next()).getClass();
            new C2613().mo3104(c3401);
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            ((AbstractC0097) it4.next()).mo3527();
        }
        C3369 c33610 = c5433.f17926;
        C1489 c14810 = new C1489((C2711) c33610.f11254, new C5008(3), new C2658(), Collections.unmodifiableMap(((C5008) c33610.f11255).f16580), new C0373(28));
        c14810.mo3104(c3401);
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            ((AbstractC0097) it5.next()).mo9475(c14810);
        }
        C2658 c2658 = (C2658) c14810.f5058;
        SpannableStringBuilder c4694 = new C4694(c2658.f8818);
        for (C1992 c1992 : c2658.f8817) {
            c4694.setSpan(c1992.f6573, c1992.f6572, c1992.f6571, c1992.f6574);
        }
        if (TextUtils.isEmpty(c4694) && !TextUtils.isEmpty(str)) {
            c4694 = new SpannableStringBuilder(str);
        }
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            ((AbstractC0097) it6.next()).mo3266(r1, c4694);
        }
        r1.setText(c4694, TextView.BufferType.SPANNABLE);
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            ((AbstractC0097) it7.next()).mo3265(r1);
        }
        r1.setMaxLines(this.f13834);
        return C2358.f7817;
    }
}
