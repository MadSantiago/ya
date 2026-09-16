package p000;

import android.view.View;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦِۢؔۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5532 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f18255;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f18256;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f18257;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f18258;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18259;

    public /* synthetic */ C5532(InterfaceC5731 interfaceC5731, C0767 c0767, InterfaceC2609 interfaceC2609, InterfaceC4448 interfaceC4448) {
        this.f18259 = 1;
        this.f18258 = interfaceC5731;
        this.f18256 = c0767;
        this.f18257 = interfaceC2609;
        this.f18255 = interfaceC4448;
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        C2750 c2750;
        InterfaceC0705 interfaceC0705Mo1571;
        Object c4923;
        Object objM3039;
        Object obj4;
        int i = this.f18259;
        C2358 c2358 = C2358.f7817;
        C4036 c4036 = C2850.f9517;
        Object obj5 = this.f18255;
        Object obj6 = this.f18257;
        Object obj7 = this.f18256;
        Object obj8 = this.f18258;
        switch (i) {
            case 0:
                C2750 c2751 = (C2750) obj8;
                InterfaceC0705 interfaceC0705 = (InterfaceC0705) obj7;
                InterfaceC5572 interfaceC5572 = (InterfaceC5572) obj6;
                InterfaceC4367 interfaceC4367 = (InterfaceC4367) obj5;
                InterfaceC0770 interfaceC0770 = (InterfaceC0770) obj;
                C5362 c5362 = (C5362) obj2;
                ((Integer) obj3).getClass();
                Object objM8999 = c5362.m8999();
                Object obj9 = objM8999;
                if (objM8999 == c4036) {
                    C0880 c0880 = new C0880(interfaceC0770, new C0681(interfaceC4367, 8));
                    c5362.m8987(c0880);
                    obj9 = c0880;
                }
                C0880 c0881 = (C0880) obj9;
                Object objM89910 = c5362.m8999();
                Object obj10 = objM89910;
                if (objM89910 == c4036) {
                    C4319 c4319 = new C4319(new C3369(c0881));
                    c5362.m8987(c4319);
                    obj10 = c4319;
                }
                C4319 c43110 = (C4319) obj10;
                if (c2751 != null) {
                    c5362.m8957(1743490539);
                    c5362.m8957(887527095);
                    Object obj11 = AbstractC2307.f7642;
                    if (obj11 != null) {
                        c5362.m8957(1345554384);
                    } else {
                        c5362.m8957(1345603457);
                        View view = (View) c5362.m8997(AbstractC4354.f14354);
                        boolean zM8963 = c5362.m8963(view);
                        Object objM89911 = c5362.m8999();
                        if (zM8963 || objM89911 == c4036) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            InterfaceC0762 viewOnAttachStateChangeListenerC5815 = tag instanceof InterfaceC0762 ? (InterfaceC0762) tag : null;
                            if (viewOnAttachStateChangeListenerC5815 == null) {
                                viewOnAttachStateChangeListenerC5815 = new ViewOnAttachStateChangeListenerC5815(view);
                                view.setTag(R.id.compose_prefetch_scheduler, viewOnAttachStateChangeListenerC5815);
                            }
                            objM89911 = viewOnAttachStateChangeListenerC5815;
                            c5362.m8987(objM89911);
                        }
                        obj11 = (InterfaceC0762) objM89911;
                    }
                    c5362.m9009(false);
                    Object obj12 = obj11;
                    c5362.m9009(false);
                    Object[] objArr = {c2751, c0881, c43110, obj12};
                    boolean zM8964 = c5362.m8963(c2751) | c5362.m8977(c0881) | c5362.m8977(c43110) | c5362.m8977(obj12);
                    Object objM89912 = c5362.m8999();
                    if (zM8964 || objM89912 == c4036) {
                        c2750 = c2751;
                        c4923 = new C4923(c2750, c0881, c43110, obj12, 1);
                        c5362.m8987(c4923);
                    } else {
                        c4923 = objM89912;
                        c2750 = c2751;
                    }
                    AbstractC3925.m7044(objArr, (InterfaceC4745) c4923, c5362);
                    c5362.m9009(false);
                } else {
                    c2750 = c2751;
                    c5362.m8957(1744076749);
                    c5362.m9009(false);
                }
                int i2 = AbstractC0412.f1500;
                if (c2750 != null && (interfaceC0705Mo1571 = interfaceC0705.mo1571(new C3427(c2750))) != null) {
                    interfaceC0705 = interfaceC0705Mo1571;
                }
                boolean zM8965 = c5362.m8963(c0881) | c5362.m8963(interfaceC5572);
                Object objM89913 = c5362.m8999();
                Object obj13 = objM89913;
                if (zM8965 || objM89913 == c4036) {
                    C4762 c4762 = new C4762(10, c0881, interfaceC5572);
                    c5362.m8987(c4762);
                    obj13 = c4762;
                }
                AbstractC0186.m414(c43110, interfaceC0705, (InterfaceC5731) obj13, c5362, 8);
                return c2358;
            case 1:
                InterfaceC5731 interfaceC5731 = (InterfaceC5731) obj8;
                C0767 c0767 = (C0767) obj7;
                InterfaceC2609 interfaceC2609 = (InterfaceC2609) obj6;
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) obj5;
                C2450 c2450 = (C2450) obj;
                C5362 c5363 = (C5362) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c5363.m8963(c2450) ? 4 : 2;
                }
                if (c5363.m9011(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str = (String) interfaceC5731.mo219(c5363, 0);
                    if (AbstractC0684.m1534(str)) {
                        AbstractC4690.m8035("Label must not be blank");
                    }
                    c0767.getClass();
                    AbstractC2133.f6994.mo1817(str, Boolean.TRUE, c2450, interfaceC2609, interfaceC4448, c5363, Integer.valueOf((iIntValue << 9) & 7168));
                } else {
                    c5363.m8982();
                }
                return c2358;
            default:
                C0547 c0547 = (C0547) obj8;
                C5837 c5837 = (C5837) obj7;
                C5745 c5745 = (C5745) obj6;
                InterfaceC4120 interfaceC4120 = (InterfaceC4120) obj5;
                InterfaceC0705 interfaceC0706 = (InterfaceC0705) obj;
                C5362 c5364 = (C5362) obj2;
                ((Integer) obj3).getClass();
                c5364.m8957(-84507373);
                boolean zBooleanValue = ((Boolean) c5364.m8997(AbstractC2853.f9550)).booleanValue();
                boolean zM9006 = c5364.m9006(zBooleanValue);
                Object objM89914 = c5364.m8999();
                Object obj14 = objM89914;
                if (zM9006 || objM89914 == c4036) {
                    C4521 c4521 = new C4521(zBooleanValue);
                    c5364.m8987(c4521);
                    obj14 = c4521;
                }
                C4521 c4522 = (C4521) obj14;
                boolean z = c0547.f1966 != 16;
                if (((Boolean) ((C3194) ((InterfaceC0930) c5364.m8997(AbstractC2853.f9551))).f10730.getValue()).booleanValue() && c5837.m9646() && C3346.m6107(c5745.f18943) && z) {
                    c5364.m8957(-707487962);
                    C1249 c1249 = c5745.f18944;
                    C3346 c3346 = new C3346(c5745.f18943);
                    boolean zM8977 = c5364.m8977(c4522);
                    Object objM89915 = c5364.m8999();
                    if (zM8977 || objM89915 == c4036) {
                        obj4 = objM89915;
                        C2718 c2718 = new C2718((Object) c4522, (InterfaceC0443) (false ? 1 : 0), 16);
                        c5364.m8987(c2718);
                        obj4 = c2718;
                    }
                    AbstractC3925.m7031(c1249, c3346, (InterfaceC5731) obj4, c5364);
                    boolean zM8978 = c5364.m8977(c4522) | c5364.m8977(interfaceC4120) | c5364.m8963(c5745) | c5364.m8977(c5837) | c5364.m8963(c0547);
                    Object objM89916 = c5364.m8999();
                    if (zM8978 || objM89916 == c4036) {
                        C0644 c0644 = new C0644(c4522, interfaceC4120, c5745, c5837, c0547);
                        c5364.m8987(c0644);
                        objM89916 = c0644;
                    }
                    objM3039 = AbstractC1434.m3039(interfaceC0706, (InterfaceC4745) objM89916);
                    c5364.m9009(false);
                } else {
                    c5364.m8957(-705473241);
                    c5364.m9009(false);
                    objM3039 = C4217.f13994;
                }
                c5364.m9009(false);
                return objM3039;
        }
    }

    public /* synthetic */ C5532(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f18259 = i;
        this.f18258 = obj;
        this.f18256 = obj2;
        this.f18257 = obj3;
        this.f18255 = obj4;
    }
}
