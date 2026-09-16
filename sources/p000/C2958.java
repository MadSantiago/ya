package p000;

import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.util.List;

/* JADX INFO: renamed from: ۦؐؑؓۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2958 implements InterfaceC2059 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ AbstractC0097 f9918;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f9919;

    public /* synthetic */ C2958(AbstractC0097 abstractC0097, int i) {
        this.f9919 = i;
        this.f9918 = abstractC0097;
    }

    @Override // p000.InterfaceC2059
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1989(C1489 c1489, AbstractC3959 abstractC3959) {
        int i = this.f9919;
        AbstractC0097 abstractC0097 = this.f9918;
        switch (i) {
            case 0:
                ((C5777) abstractC0097).m9582(c1489, ((C2149) abstractC3959).f7053);
                break;
            case 1:
                ((C5777) abstractC0097).m9582(c1489, ((C3523) abstractC3959).f11668);
                break;
            default:
                C2711 c2711 = (C2711) c1489.f5059;
                String str = ((C1507) abstractC3959).f5120;
                C2658 c2658 = (C2658) c1489.f5058;
                c2658.f8818.append(str);
                List<C3071> list = ((C1783) abstractC0097).f5951;
                if (!list.isEmpty()) {
                    int iM3111 = c1489.m3111() - str.length();
                    for (C3071 c3071 : list) {
                        c3071.getClass();
                        InterfaceC1652 interfaceC1652M5748 = ((C3121) c2711.f8983).m5748(C4839.class);
                        if (interfaceC1652M5748 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                            if (Linkify.addLinks(spannableStringBuilder, c3071.f10319)) {
                                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                                if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                                    C5008 c5008 = (C5008) c1489.f5057;
                                    for (URLSpan uRLSpan : uRLSpanArr) {
                                        c5008.m8423(AbstractC4225.f14018, uRLSpan.getURL());
                                        C2658.m4964(c2658, interfaceC1652M5748.mo3440(c2711, c5008), spannableStringBuilder.getSpanStart(uRLSpan) + iM3111, spannableStringBuilder.getSpanEnd(uRLSpan) + iM3111);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}
