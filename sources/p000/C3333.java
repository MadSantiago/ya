package p000;

import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: ۦؖؒٓٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3333 extends AbstractC0881 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f11153;

    public /* synthetic */ C3333(int i) {
        this.f11153 = i;
    }

    @Override // p000.AbstractC0881
    /* JADX INFO: renamed from: ۥۗ */
    public final Collection mo1875() {
        switch (this.f11153) {
            case 0:
                return Collections.singleton("blockquote");
            case 1:
                return Arrays.asList("ol", "ul");
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return Arrays.asList("s", "del");
            default:
                return Arrays.asList("u", "ins");
        }
    }

    @Override // p000.AbstractC0881
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1876(C1489 c1489, AbstractC3831 abstractC3831, AbstractC0072 abstractC0072) {
        switch (this.f11153) {
            case 0:
                if (abstractC0072.mo970()) {
                    AbstractC0881.m1874(c1489, abstractC3831, abstractC0072.mo967());
                }
                C2711 c2711 = (C2711) c1489.f5059;
                InterfaceC1652 interfaceC1652M5748 = ((C3121) c2711.f8983).m5748(C2623.class);
                if (interfaceC1652M5748 != null) {
                    C2658.m4964((C2658) c1489.f5058, interfaceC1652M5748.mo3440(c2711, (C5008) c1489.f5057), abstractC0072.f13683, abstractC0072.f13682);
                }
                break;
            case 1:
                C0220 c0220 = AbstractC4225.f14010;
                if (abstractC0072.mo970()) {
                    C0446 c0446Mo967 = abstractC0072.mo967();
                    boolean zEquals = "ol".equals((String) c0446Mo967.f13680);
                    boolean zEquals2 = "ul".equals((String) c0446Mo967.f13680);
                    if (zEquals || zEquals2) {
                        C2711 c2712 = (C2711) c1489.f5059;
                        C5008 c5008 = (C5008) c1489.f5057;
                        InterfaceC1652 interfaceC1652M5749 = ((C3121) c2712.f8983).m5748(C1011.class);
                        int i = 0;
                        C0446 c0446 = c0446Mo967;
                        while (true) {
                            c0446 = c0446.f1633;
                            if (c0446 == null) {
                                ArrayList arrayList = c0446Mo967.f1634;
                                int i2 = 1;
                                for (C0446 c0447 : arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList)) {
                                    AbstractC0881.m1874(c1489, abstractC3831, c0447);
                                    if (interfaceC1652M5749 != null && "li".equals((String) c0447.f13680)) {
                                        if (zEquals) {
                                            c5008.m8423(c0220, EnumC0424.f1535);
                                            c5008.m8423(AbstractC4225.f14020, Integer.valueOf(i2));
                                            i2++;
                                        } else {
                                            c5008.m8423(c0220, EnumC0424.f1536);
                                            c5008.m8423(AbstractC4225.f14011, Integer.valueOf(i));
                                        }
                                        C2658.m4964((C2658) c1489.f5058, interfaceC1652M5749.mo3440(c2712, c5008), c0447.f13683, c0447.f13682);
                                    }
                                }
                                break;
                            } else {
                                String str = (String) c0446.f13680;
                                if ("ul".equals(str) || "ol".equals(str)) {
                                    i++;
                                }
                            }
                        }
                    }
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                if (abstractC0072.mo970()) {
                    AbstractC0881.m1874(c1489, abstractC3831, abstractC0072.mo967());
                }
                C2658 c2658 = (C2658) c1489.f5058;
                C2711 c2713 = (C2711) c1489.f5059;
                InterfaceC1652 interfaceC1652M57410 = ((C3121) c2713.f8983).m5748(C1876.class);
                C2658.m4964(c2658, interfaceC1652M57410 == null ? null : interfaceC1652M57410.mo3440(c2713, (C5008) c1489.f5057), abstractC0072.f13683, abstractC0072.f13682);
                break;
            default:
                if (abstractC0072.mo970()) {
                    AbstractC0881.m1874(c1489, abstractC3831, abstractC0072.mo967());
                }
                C2658.m4964((C2658) c1489.f5058, new UnderlineSpan(), abstractC0072.f13683, abstractC0072.f13682);
                break;
        }
    }
}
