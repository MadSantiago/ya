package p000;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: ۦٍؘْؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3781 extends AbstractC0881 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f12563;

    public C3781(C3223 c3223) {
        this.f12563 = 2;
    }

    @Override // p000.AbstractC0881
    /* JADX INFO: renamed from: ۥۗ */
    public final Collection mo1875() {
        switch (this.f12563) {
            case 0:
                return Arrays.asList("i", "em", "cite", "dfn");
            case 1:
                return Arrays.asList("h1", "h2", "h3", "h4", "h5", "h6");
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return Collections.singleton("img");
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return Collections.singleton("a");
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return Arrays.asList("b", "strong");
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return Collections.singleton("sub");
            default:
                return Collections.singleton("sup");
        }
    }

    @Override // p000.AbstractC0881
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1876(C1489 c1489, AbstractC3831 abstractC3831, AbstractC0072 abstractC0072) {
        int i;
        InterfaceC1652 interfaceC1652M5748;
        C5163 c5163M5943;
        C5163 c5163M5944;
        InterfaceC1652 interfaceC1652M5749;
        Object c1978;
        if (abstractC0072.mo970()) {
            AbstractC0881.m1874(c1489, abstractC3831, abstractC0072.mo967());
        }
        C2711 c2711 = (C2711) c1489.f5059;
        C5008 c5008 = (C5008) c1489.f5057;
        Object objMo3440 = null;
        switch (this.f12563) {
            case 0:
                InterfaceC1652 interfaceC1652M57410 = ((C3121) c2711.f8983).m5748(C3475.class);
                if (interfaceC1652M57410 != null) {
                    objMo3440 = interfaceC1652M57410.mo3440(c2711, c5008);
                }
                c1978 = objMo3440;
                break;
            case 1:
                InterfaceC1652 interfaceC1652M57411 = ((C3121) c2711.f8983).m5748(C1350.class);
                if (interfaceC1652M57411 != null) {
                    try {
                        i = Integer.parseInt(((String) abstractC0072.f13680).substring(1));
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                        i = 0;
                    }
                    if (i >= 1 && i <= 6) {
                        c5008.m8423(AbstractC4225.f14013, Integer.valueOf(i));
                        objMo3440 = interfaceC1652M57411.mo3440(c2711, c5008);
                    }
                }
                c1978 = objMo3440;
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                String str = (String) abstractC0072.mo968().get("src");
                if (!TextUtils.isEmpty(str) && (interfaceC1652M5748 = ((C3121) c2711.f8983).m5748(C5141.class)) != null) {
                    ((C4992) c2711.f8979).getClass();
                    Map mapMo968 = abstractC0072.mo968();
                    String str2 = (String) mapMo968.get("style");
                    if (TextUtils.isEmpty(str2)) {
                        c5163M5943 = null;
                        c5163M5944 = null;
                    } else {
                        C5739 c5739 = new C5739(new C4907(str2));
                        c5163M5943 = null;
                        c5163M5944 = null;
                        while (c5739.hasNext()) {
                            C2936 c2936 = (C2936) c5739.next();
                            String str3 = c2936.f9867;
                            if ("width".equals(str3)) {
                                c5163M5943 = C3223.m5943(c2936.f9866);
                            } else if ("height".equals(str3)) {
                                c5163M5944 = C3223.m5943(c2936.f9866);
                            }
                            if (c5163M5943 == null || c5163M5944 == null) {
                            }
                        }
                    }
                    if (c5163M5943 == null || c5163M5944 == null) {
                        if (c5163M5943 == null) {
                            c5163M5943 = C3223.m5943((String) mapMo968.get("width"));
                        }
                        if (c5163M5944 == null) {
                            c5163M5944 = C3223.m5943((String) mapMo968.get("height"));
                        }
                        if (c5163M5943 != null || c5163M5944 != null) {
                            objMo3440 = new C5913(c5163M5943, c5163M5944);
                        }
                    } else {
                        objMo3440 = new C5913(c5163M5943, c5163M5944);
                    }
                    c5008.m8423(AbstractC4593.f15162, str);
                    c5008.m8423(AbstractC4593.f15158, objMo3440);
                    c5008.m8423(AbstractC4593.f15157, Boolean.FALSE);
                    objMo3440 = interfaceC1652M5748.mo3440(c2711, c5008);
                }
                c1978 = objMo3440;
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                String str4 = (String) abstractC0072.mo968().get("href");
                if (!TextUtils.isEmpty(str4) && (interfaceC1652M5749 = ((C3121) c2711.f8983).m5748(C4839.class)) != null) {
                    c5008.m8423(AbstractC4225.f14018, str4);
                    objMo3440 = interfaceC1652M5749.mo3440(c2711, c5008);
                }
                c1978 = objMo3440;
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                InterfaceC1652 interfaceC1652M57412 = ((C3121) c2711.f8983).m5748(C3157.class);
                if (interfaceC1652M57412 != null) {
                    objMo3440 = interfaceC1652M57412.mo3440(c2711, c5008);
                }
                c1978 = objMo3440;
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                c1978 = new C1978(2);
                break;
            default:
                c1978 = new C1978(3);
                break;
        }
        if (c1978 != null) {
            C2658.m4964((C2658) c1489.f5058, c1978, abstractC0072.f13683, abstractC0072.f13682);
        }
    }

    public /* synthetic */ C3781(int i) {
        this.f12563 = i;
    }
}
