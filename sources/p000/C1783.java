package p000;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥٛؖۘؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1783 extends AbstractC0097 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f5948;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f5949;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f5950;

    /* JADX INFO: renamed from: ۦؑ */
    public final List f5951;

    public C1783(int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList(0);
        new ArrayList(0);
        this.f5950 = i;
        this.f5949 = i2;
        this.f5948 = z;
        this.f5951 = arrayList;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static void m3570(C1489 c1489, String str, String str2, AbstractC5360 abstractC5360) {
        c1489.m3102();
        int iM3111 = c1489.m3111();
        C2658 c2658 = (C2658) c1489.f5058;
        StringBuilder sb = c2658.f8818;
        sb.append((char) 160);
        sb.append('\n');
        ((C4369) ((C2711) c1489.f5059).f8980).getClass();
        c2658.m4966(sb.length(), str2);
        sb.append((CharSequence) str2);
        c1489.m3102();
        c2658.m4967((char) 160);
        ((C5008) c1489.f5057).m8423(AbstractC4225.f14019, str);
        c1489.m3149(abstractC5360, iM3111);
        c1489.m3142(abstractC5360);
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo3265(C2139 c2139) {
        if (c2139.getMovementMethod() == null) {
            c2139.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo3528(C5008 c5008) {
        C1635 c1635 = new C1635(1);
        c5008.m8422(C3157.class, new C1635(9));
        c5008.m8422(C3475.class, new C1635(3));
        c5008.m8422(C2623.class, new C1635(0));
        c5008.m8422(C4374.class, new C1635(2));
        c5008.m8422(C4456.class, c1635);
        c5008.m8422(C3811.class, c1635);
        c5008.m8422(C1011.class, new C1635(7));
        c5008.m8422(C1350.class, new C1635(4));
        c5008.m8422(C4839.class, new C1635(6));
        c5008.m8422(C3273.class, new C1635(10));
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo3266(C2139 c2139, SpannableStringBuilder spannableStringBuilder) {
        C5519[] c5519Arr = (C5519[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C5519.class);
        if (c5519Arr != null) {
            TextPaint paint = c2139.getPaint();
            for (C5519 c5519 : c5519Arr) {
                c5519.f18225 = (int) (paint.measureText(c5519.f18226) + 0.5f);
            }
        }
        C2512[] c2512Arr = (C2512[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C2512.class);
        if (c2512Arr != null) {
            for (C2512 c2512 : c2512Arr) {
                spannableStringBuilder.removeSpan(c2512);
            }
        }
        spannableStringBuilder.setSpan(new C2512(c2139), 0, spannableStringBuilder.length(), 18);
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۦِ */
    public final void mo3529(C5008 c5008) {
        c5008.m8424(C1507.class, new C2958(this, 2));
        c5008.m8424(C3157.class, C4172.f13893);
        c5008.m8424(C3475.class, C4172.f13891);
        c5008.m8424(C2623.class, C4172.f13889);
        c5008.m8424(C4374.class, C4172.f13886);
        c5008.m8424(C4456.class, new C4172(this, 10));
        c5008.m8424(C3811.class, new C4172(this, 11));
        c5008.m8424(C5141.class, new C1534());
        int i = 14;
        c5008.m8424(C3813.class, new C4172(i));
        c5008.m8424(C0674.class, new C4172(i));
        c5008.m8424(C1011.class, new C4172(this, 12));
        c5008.m8424(C3273.class, C4172.f13892);
        c5008.m8424(C1350.class, C4172.f13888);
        c5008.m8424(C1256.class, C4172.f13890);
        c5008.m8424(C1799.class, C4172.f13887);
        c5008.m8424(C3343.class, new C4172(this, 13));
        c5008.m8424(C4839.class, C4172.f13895);
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo3267(C5728 c5728) {
        c5728.f18881 = this.f5950;
        c5728.f18876 = this.f5948;
        int iM7470 = AbstractC4225.m7470(C1327.f4591);
        int i = this.f5949;
        if (i != iM7470) {
            c5728.f18873 = i;
        }
    }
}
